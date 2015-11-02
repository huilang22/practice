/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocFindNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceAddressAssocFindNoOpRequest Udt Request/Response
 *
 */
public class ServiceAddressAssocFindNoOpRequest extends ServiceAddressAssocRequest {
/**
 *
 * Constructor to create a   ServiceAddressAssocFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServiceAddressAssocFindNoOpRequest(String id, ServiceAddressAssocObjectDataList noOpIn) {
    super(id, "ServiceAddressAssocFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ServiceAddressAssocObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceAddressAssoc", noOpIn);
      }
      addInput("ServiceAddressAssoc", mapList);
    }
  }
/**
 *
 * Retrieves the ServiceAddressAssocObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceAddressAssocObjectDataList getOutput() {
    return ServiceAddressAssocObjectHelper.fromMapList(outputMap, "ServiceAddressAssocList");
  }
}
