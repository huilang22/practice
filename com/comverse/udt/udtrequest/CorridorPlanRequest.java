/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CorridorPlan related UdtRequests
 *
 */

public abstract class CorridorPlanRequest extends UdtRequest {

/**
 *
 * Adds a  CorridorRateOverrideSubRequestParent as an InputRequest
 * @param inputRequest CorridorRateOverrideSubRequestParent to add as InputRequest
 *
 */
    public void addCorridorRateOverrideCorridorPlanInputRequest(CorridorRateOverrideSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CorridorRateOverride_CorridorPlan_Ref");
      irList.add(inReq);
    }
/**
 *
 * Constructor for CorridorPlanRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CorridorPlanRequest(String id, String method) {
    super(id, "CorridorPlan", method);
  }
}
