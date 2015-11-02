/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanSubRequestParent.java
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
 * Abstract base class for all CorridorPlan related UdtSubRequestParents
 *
 */
public abstract class CorridorPlanSubRequestParent extends UdtSubRequestParent {

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
 * Adds SelfRequest based on CorridorPlanRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CorridorPlanRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CorridorPlanSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CorridorPlanSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a CorridorRateOverrideRequest sub request
 * @param subRequest CorridorRateOverrideRequest
 *
 */
    public void addCorridorPlanCorridorRateOverrideSubRequest(CorridorRateOverrideRequest subRequest) {
      addSubRequest(subRequest, "CorridorPlan_CorridorRateOverride_Ref");
    }
/**
 *
 * Adds a CorridorRateOverrideRequest sub request
 * @param subRequest CorridorRateOverrideRequest
 *
 */
    public void addCorridorPlanCorridorRateOverrideSubRequest(CorridorRateOverrideSubRequestParent subRequest) {
      addSubRequest(subRequest, "CorridorPlan_CorridorRateOverride_Ref");
    }

/**
 *
 * Constructor for CorridorPlanSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CorridorPlanSubRequestParent(String id, String method) {
    super(id, "CorridorPlan", method);
  }
}
