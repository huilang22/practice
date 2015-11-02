/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrepaymentDistributionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PrepaymentDistribution related UdtRequests
 *
 */

public abstract class PrepaymentDistributionRequest extends UdtRequest {

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
 * Constructor for PrepaymentDistributionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PrepaymentDistributionRequest(String id, String method) {
    super(id, "PrepaymentDistribution", method);
  }
}
