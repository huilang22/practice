/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentDistributionSubRequestParent.java
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
 * Abstract base class for all PrepaymentDistribution related UdtSubRequestParents
 *
 */
public abstract class PrepaymentDistributionSubRequestParent extends UdtSubRequestParent {

/**
 *
 * Adds a  PrepaymentSubRequestParent as an InputRequest
 * @param inputRequest PrepaymentSubRequestParent to add as InputRequest
 *
 */
    public void addPrepaymentPrepaymentDistributionInputRequest(PrepaymentSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Prepayment_PrepaymentDistribution_Ref");
      irList.add(inReq);
    }

/**
 *
 * Adds SelfRequest based on PrepaymentDistributionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PrepaymentDistributionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PrepaymentDistributionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PrepaymentDistributionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addPrepaymentDistributionPrepaymentSubRequest(PrepaymentRequest subRequest) {
      addSubRequest(subRequest, "PrepaymentDistribution_Prepayment_Ref");
    }
/**
 *
 * Adds a PrepaymentRequest sub request
 * @param subRequest PrepaymentRequest
 *
 */
    public void addPrepaymentDistributionPrepaymentSubRequest(PrepaymentSubRequestParent subRequest) {
      addSubRequest(subRequest, "PrepaymentDistribution_Prepayment_Ref");
    }

/**
 *
 * Constructor for PrepaymentDistributionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PrepaymentDistributionSubRequestParent(String id, String method) {
    super(id, "PrepaymentDistribution", method);
  }
}
