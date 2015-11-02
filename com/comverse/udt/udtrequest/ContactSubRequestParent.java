/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactSubRequestParent.java
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
 * Abstract base class for all Contact related UdtSubRequestParents
 *
 */
public abstract class ContactSubRequestParent extends UdtSubRequestParent {

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
 * Adds SelfRequest based on ContactRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ContactRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ContactSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ContactSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }

/**
 *
 * Adds a RefundRequest sub request
 * @param subRequest RefundRequest
 *
 */
    public void addContactRefundSubRequest(RefundRequest subRequest) {
      addSubRequest(subRequest, "Contact_Refund_Ref");
    }
/**
 *
 * Adds a RefundRequest sub request
 * @param subRequest RefundRequest
 *
 */
    public void addContactRefundSubRequest(RefundSubRequestParent subRequest) {
      addSubRequest(subRequest, "Contact_Refund_Ref");
    }

/**
 *
 * Constructor for ContactSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ContactSubRequestParent(String id, String method) {
    super(id, "Contact", method);
  }
}
