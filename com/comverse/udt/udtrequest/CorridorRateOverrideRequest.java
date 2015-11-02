/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateOverrideRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CorridorRateOverride related UdtRequests
 *
 */

public abstract class CorridorRateOverrideRequest extends UdtRequest {

/**
 *
 * Adds a  CorridorPlanSubRequestParent as an InputRequest
 * @param inputRequest CorridorPlanSubRequestParent to add as InputRequest
 *
 */
    public void addCorridorPlanCorridorRateOverrideInputRequest(CorridorPlanSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CorridorPlan_CorridorRateOverride_Ref");
      irList.add(inReq);
    }
/**
 *
 * Adds a  CorridorRateBandOverrideSubRequestParent as an InputRequest
 * @param inputRequest CorridorRateBandOverrideSubRequestParent to add as InputRequest
 *
 */
    public void addCorridorRateBandOverrideCorridorRateOverrideInputRequest(CorridorRateBandOverrideSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CorridorRateBandOverride_CorridorRateOverride_Ref");
      irList.add(inReq);
    }
/**
 *
 * Constructor for CorridorRateOverrideRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CorridorRateOverrideRequest(String id, String method) {
    super(id, "CorridorRateOverride", method);
  }
}
