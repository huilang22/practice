/*
 * HashMapUdtTranslator.java
 *
 * Created on October 17, 2002, 11:26 AM
 */

package com.csgsystems.udt.xlate.hashmap;

import com.csgsystems.udt.xlate.UdtInput;
import com.csgsystems.udt.xlate.UdtOutput;
import com.csgsystems.udt.xlate.UdtTranslator;
import com.csgsystems.udt.xlate.UdtTranslationException;

import com.csgsystems.udt.UdtRootRequest;
import com.csgsystems.udt.UdtRequest;
import com.csgsystems.udt.DynamicRelationship;
import com.csgsystems.udt.InputRequest;
import com.csgsystems.udt.Request;
import com.csgsystems.udt.SubRequestData;
import com.csgsystems.udt.SubRequestWrapper;

import com.csgsystems.aruba.connection.BSDMSessionContext;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.StringTokenizer;

//import com.csgsystems.powercare.utilities.Logger;

/**
 * Translates an UDT into HashMapInput and HashMapOutput
 * 
 * @author Mark Brahler
 */
public class HashMapUdtTranslator implements UdtTranslator {

    /**
     * No argument constructor
     */
    public HashMapUdtTranslator() {
    }

    /**
     * Translates an UDT into UdtOutput
     * 
     * @param request UdtRootRequest to be translated
     * @return UdtInput to be used for calls
     * @exception UdtTranslationException
     *                   thrown if translation fails
     */
    public UdtOutput translate(UdtRootRequest request) throws UdtTranslationException {
        if (request != null) {

            Collection requests = request.getRequests();

            if (requests != null && requests.size() > 0) {
                Iterator iter = requests.iterator();
                UdtRequest udtRequest = null;
                HashMap rootMap = new HashMap();
                Map[] requestListMapArray = new HashMap[requests.size()];
                int position = 0;
                while (iter.hasNext()) {
                    udtRequest = (UdtRequest)iter.next();
                    if (udtRequest != null) {
                        requestListMapArray[position] = new HashMap();
                        requestListMapArray[position] = getMapFromUdtRequest(udtRequest);
                    } else {
                        //Logger.error(this.getClass(), "translate", "The udt request was null");
                    }
                    position++;
                }

                HashMapOutput output = new HashMapOutput();
                if (request.isEnforceSubRequestRelationshipIsSet()) {
                   rootMap.put("EnforceSubRequestRelationships", new Boolean(request.getEnforceSubRequestRelationship()));
                }

                rootMap.put("RequestList", requestListMapArray);
                output.setHashMap(rootMap);
                return output;
            } else {
                //Logger.error(this.getClass(), "translate", "The root request did not contain any UdtRequests");
                return null;
            }
        } else {
            //Logger.error(this.getClass(), "translate", "The request passed in was null");
            return null;
        }
    }

    /**
     * Retrieves a map for any given UdtRequest
     * 
     * @param request The UdtRequest to translate into a map
     * @return Map representation of UdtRequest
     */
    private Map getMapFromUdtRequest(UdtRequest request) {
        Map map = initMapSetup(request);
        setupSubRequests(map, request);
        setupDynamicRelationships(map, request);
        return map;
    }

    /**
     * Prepares some common information in the map
     * 
     * @param request UdtRequest to map
     * @return Initial Map of UdtRequest
     */
    private Map initMapSetup(UdtRequest request) {
        Map map = new HashMap();
        map.put("#NAME", request.getObjectName());
        map.put("RequestId", request.getRequestId());

        List irList = request.getInputRequestsList();
        Map irMap = request.getInputRequestMap();

        if (irList != null || irMap != null) {
          int count = 0;
          if (irMap != null) count++;
          if (irList != null) {
            int listCount = irList.size();
            count += listCount;
          }
          Map[] inputRequestArray = new HashMap[count];
          int pos = 0;
          if (irMap != null) {
            inputRequestArray[pos] = irMap;
            pos++;
          }
          if (irList != null) {
            for (Iterator iter = irList.iterator(); iter.hasNext();) {
              inputRequestArray[pos] = (Map)iter.next();
              pos++;
            }
          }
          map.put("InputRequestList", inputRequestArray);
        }

        map.put(request.getMethodName(), request.getInputMap());
        return map;
    }

    /**
     * Maps out any subrequests for a given UdtRequest
     * 
     * @param map     UdtRequest Map
     * @param request UdtRequest itself
     */
    private void setupSubRequests (Map map, UdtRequest request) {
        Collection subRequests = request.getSubRequests();
        if (subRequests != null && subRequests.size() > 0) {
            Iterator iter = subRequests.iterator();
            SubRequestWrapper reqWrapper = null;
            Request req = null;
            Map[] subRequestListMapArray = new HashMap[subRequests.size()];
            int position = 0;
            SubRequestData data = null;
            Collection dynamics = null;
            Iterator dynIter = null;
            DynamicRelationship dynamic = null;

            while (iter.hasNext()) {
                reqWrapper = (SubRequestWrapper)iter.next();
                req = reqWrapper.getRequest();
                subRequestListMapArray[position] = new HashMap();
                if (request != null) {
                    if (req instanceof InputRequest) {
                        InputRequest inputRequest = (InputRequest)req;
                        Map inputRequestMap = new HashMap();
                        inputRequestMap.put("RequestId", inputRequest.getRequestId());
                        inputRequestMap.put("RelationshipId", inputRequest.getRelationshipId());
                        subRequestListMapArray[position].put("InputRequest", inputRequestMap);
                    } else if (req instanceof UdtRequest) {
                        UdtRequest udtRequest = (UdtRequest)req;

                        data = reqWrapper.getSubRequestData();
                        subRequestListMapArray[position] = getMapFromUdtRequest(udtRequest);
                        subRequestListMapArray[position].put("RelationshipId", data.getName());
                        dynamics = data.getDynamicRelationships();
                        if (dynamics != null) {
                            dynIter = dynamics.iterator();
                            while (dynIter.hasNext()) {
                                dynamic = (DynamicRelationship) dynIter.next();
                                setupDynamicRelationships(subRequestListMapArray[position], udtRequest, dynamic);
                            }
                        }
                    } else {
                        //Logger.error(this.getClass(), "setupSubRequests", "SubRequest was not a known type, was "+req.getClass().getName());
                    }
                } else {
                    //Logger.error(this.getClass(), "setupSubRequests", "SubRequest was null");
                }
                position++;
            }
            map.put("SubRequest", subRequestListMapArray);
        }
    }
    
    private void setupDynamicRelationships(Map map, UdtRequest udtRequest) {
        Collection dynamics = udtRequest.getDynamicRelationships();
        if (dynamics != null) {
            Iterator dynIter = dynamics.iterator();
            DynamicRelationship dynamic = null;
            while (dynIter.hasNext()) {
                dynamic = (DynamicRelationship) dynIter.next();
                setupDynamicRelationships(map, udtRequest, dynamic);
            }
        }
    }

    /**
     * Defines any dynamic relationships in the Map for hte UdtReuqest
     * 
     * @param map     Map to which dynamic relationships need to be added
     * @param request UdtRequest with DynamicRelationships
     * @param relationship
     *                DynamicRealtionships to add to map
     */
    private void setupDynamicRelationships(Map inMap, UdtRequest request, DynamicRelationship relationship) {
        if (inMap != null && request != null && relationship != null) {
            Map methodMap = (Map)inMap.get(request.getMethodName());
            StringTokenizer tok = new StringTokenizer(relationship.getTo(), "/");
            int count = tok.countTokens();
            String key = null;
            Map map = null;
            //if (count > 1) {
                map = methodMap;
                for (int i = 0; i < (count - 1); i++) {
                    key = tok.nextToken();
                    if (map.containsKey(key)) {
                        map = (Map)map.get(key);
                    } else {
                        Map tempmap = new HashMap();
                        map.put(key, tempmap);
                        map = tempmap;
                    }
                }
                Map newMap = new HashMap();
                newMap.put("Ref", relationship.getFrom());
                map.put(tok.nextToken(), newMap);
           // } else {
            //    Map newMap = new HashMap();
             //   newMap.put("Ref", relationship.getFrom());
              //  methodMap.put(tok.nextToken(), newMap);
           // }
        } else {
            //Logger.error(this.getClass(), "setupDynamicRelationships", "Required fields were null");
        }
    }

    /** Translates from UdtInput to an UdtRootRequest
     * @return UdtRootRequest from input
     * @param request UdtRequest to translate
     * @param input Input to Udt
     * @throws UdtTranslationException thrown if translation fails
     */
    public UdtRootRequest translate(UdtInput input, UdtRootRequest request) throws UdtTranslationException {
        if (input != null && request != null) {
            HashMapInput hashMapInput = (HashMapInput) input;
            Map inputMap = hashMapInput.getHashMap();
            Map[] rootResponses = HashMapUtility.convertArray((Object[])inputMap.get("UDTResponseList"));
            Collection requests = request.getRequests();
            if (rootResponses != null && rootResponses.length > 0 && requests != null && requests.size() > 0) {
                Iterator iter = null;
                UdtRequest udtRequest = null;
                Map rootResponse = null;
                String requestId = null;
                for (int i = 0; i < rootResponses.length; i++) {
                    rootResponse = rootResponses[i];
                    requestId = (String)rootResponse.get("RequestId");
                    iter = requests.iterator();
                    while (iter.hasNext()) {
                        udtRequest = (UdtRequest)iter.next();
                        if (udtRequest.getRequestId().equals(requestId)) {
                            populateRequestOutput(udtRequest, rootResponse);
                            break;
                        }
                    }
                }
            }
        } else {
            //Logger.error(this.getClass(), "translate", "Required fields were null");
        }
        return request;
    }

    /**
     * Sets the output information on the UdtRequest
     * 
     * @param request UdtRequest to set output data
     * @param map     Output data to set
     */
    private void populateRequestOutput(UdtRequest request, Map map) {
        request.setOutputMap(new HashMap(map));
        Object obj = map.get("SubResponse");
        if (obj != null) {
            Map[] subResponses = HashMapUtility.convertArray((Object[])obj);
            Collection subRequests = request.getSubRequests();
            if (subResponses != null && subResponses.length > 0 &&
                subRequests != null && subRequests.size() > 0) {
                Iterator iter = null;
                UdtRequest subRequest = null;
                String requestId = null;
                Map subResponse = null;
                for (int i = 0; i < subResponses.length; i++) {
                    subResponse = subResponses[i];
                    requestId = (String)subResponse.get("RequestId");
                    iter = subRequests.iterator();
                    SubRequestWrapper reqWrapper = null;
                    Object checkObj = null;
                    while (iter.hasNext()) {
                        reqWrapper = (SubRequestWrapper)iter.next();
                        checkObj = reqWrapper.getRequest();
                        if (checkObj instanceof UdtRequest) {
                            subRequest = (UdtRequest)checkObj;
                            if (subRequest.getRequestId().equals(requestId)) {
                                populateRequestOutput(subRequest, subResponse);
                                break;
                            }
                        }
                    }
                }
            } else {
                //Logger.error(this.getClass(), "populateRequestOutput", "There were no subrequests or no subresponses");
            }
        }
    }
}
