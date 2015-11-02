/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateBandOverrideSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CorridorRateBandOverride related UdtSubRequestParents
 *
 */
public abstract class CorridorRateBandOverrideSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  CorridorRateOverrideSubRequestParent as an InputRequest
 * @param inputRequest CorridorRateOverrideSubRequestParent to add as InputRequest
 *
 */
    public void addCorridorRateOverrideCorridorRateBandOverrideInputRequest(CorridorRateOverrideSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CorridorRateOverride_CorridorRateBandOverride_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on CorridorRateBandOverrideRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CorridorRateBandOverrideRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CorridorRateBandOverrideSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CorridorRateBandOverrideSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a CorridorRateOverrideRequest sub request
 * @param subRequest CorridorRateOverrideRequest
 *
 */
    public void addCorridorRateBandOverrideCorridorRateOverrideSubRequest(CorridorRateOverrideRequest subRequest) {
      addSubRequest(subRequest, "CorridorRateBandOverride_CorridorRateOverride_Ref");
    }
/**
 *
 * Adds a CorridorRateOverrideRequest sub request
 * @param subRequest CorridorRateOverrideRequest
 *
 */
    public void addCorridorRateBandOverrideCorridorRateOverrideSubRequest(CorridorRateOverrideSubRequestParent subRequest) {
      addSubRequest(subRequest, "CorridorRateBandOverride_CorridorRateOverride_Ref");
    }

/**
 *
 * Constructor for CorridorRateBandOverrideSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CorridorRateBandOverrideSubRequestParent(String id, String method) {
    super(id, "CorridorRateBandOverride", method);
  }
}
