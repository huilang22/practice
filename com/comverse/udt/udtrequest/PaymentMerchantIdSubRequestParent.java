/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdSubRequestParent.java
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
 * Abstract base class for all PaymentMerchantId related UdtSubRequestParents
 *
 */
public abstract class PaymentMerchantIdSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PaymentMerchantIdRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PaymentMerchantIdRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PaymentMerchantIdSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PaymentMerchantIdSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PaymentMerchantIdSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PaymentMerchantIdSubRequestParent(String id, String method) {
    super(id, "PaymentMerchantId", method);
  }
}
