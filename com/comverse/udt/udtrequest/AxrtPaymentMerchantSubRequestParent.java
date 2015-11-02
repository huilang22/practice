/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentMerchantSubRequestParent.java
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
 * Abstract base class for all AxrtPaymentMerchant related UdtSubRequestParents
 *
 */
public abstract class AxrtPaymentMerchantSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AxrtPaymentMerchantRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AxrtPaymentMerchantRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AxrtPaymentMerchantSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AxrtPaymentMerchantSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AxrtPaymentMerchantSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AxrtPaymentMerchantSubRequestParent(String id, String method) {
    super(id, "AxrtPaymentMerchant", method);
  }
}
