/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateOverrideSubRequestParent.java
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
 * Abstract base class for all CorridorRateOverride related UdtSubRequestParents
 *
 */
public abstract class CorridorRateOverrideSubRequestParent extends UdtSubRequestParent {

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
 * Adds SelfRequest based on CorridorRateOverrideRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CorridorRateOverrideRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CorridorRateOverrideSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CorridorRateOverrideSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a CorridorPlanRequest sub request
 * @param subRequest CorridorPlanRequest
 *
 */
    public void addCorridorRateOverrideCorridorPlanSubRequest(CorridorPlanRequest subRequest) {
      addSubRequest(subRequest, "CorridorRateOverride_CorridorPlan_Ref");
    }
/**
 *
 * Adds a CorridorPlanRequest sub request
 * @param subRequest CorridorPlanRequest
 *
 */
    public void addCorridorRateOverrideCorridorPlanSubRequest(CorridorPlanSubRequestParent subRequest) {
      addSubRequest(subRequest, "CorridorRateOverride_CorridorPlan_Ref");
    }
/**
 *
 * Adds a CorridorRateBandOverrideRequest sub request
 * @param subRequest CorridorRateBandOverrideRequest
 *
 */
    public void addCorridorRateOverrideCorridorRateBandOverrideSubRequest(CorridorRateBandOverrideRequest subRequest) {
      addSubRequest(subRequest, "CorridorRateOverride_CorridorRateBandOverride_Ref");
    }
/**
 *
 * Adds a CorridorRateBandOverrideRequest sub request
 * @param subRequest CorridorRateBandOverrideRequest
 *
 */
    public void addCorridorRateOverrideCorridorRateBandOverrideSubRequest(CorridorRateBandOverrideSubRequestParent subRequest) {
      addSubRequest(subRequest, "CorridorRateOverride_CorridorRateBandOverride_Ref");
    }

/**
 *
 * Constructor for CorridorRateOverrideSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CorridorRateOverrideSubRequestParent(String id, String method) {
    super(id, "CorridorRateOverride", method);
  }
}
