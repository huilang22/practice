/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileSubRequestParent.java
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
 * Abstract base class for all PaymentProfile related UdtSubRequestParents
 *
 */
public abstract class PaymentProfileSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PaymentProfileRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PaymentProfileRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PaymentProfileSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PaymentProfileSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PaymentProfileSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PaymentProfileSubRequestParent(String id, String method) {
    super(id, "PaymentProfile", method);
  }
}
