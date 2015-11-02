/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Contact related UdtRequests
 *
 */

public abstract class ContactRequest extends UdtRequest {

/**
 *
 * Adds a  RefundSubRequestParent as an InputRequest
 * @param inputRequest RefundSubRequestParent to add as InputRequest
 *
 */
    public void addRefundContactInputRequest(RefundSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "Refund_Contact_Ref");
      irList.add(inReq);
    }
/**
 *
 * Constructor for ContactRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ContactRequest(String id, String method) {
    super(id, "Contact", method);
  }
}
