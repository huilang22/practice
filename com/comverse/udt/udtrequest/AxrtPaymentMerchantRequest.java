/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentMerchantRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AxrtPaymentMerchant related UdtRequests
 *
 */

public abstract class AxrtPaymentMerchantRequest extends UdtRequest {

/**
 *
 * Constructor for AxrtPaymentMerchantRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AxrtPaymentMerchantRequest(String id, String method) {
    super(id, "AxrtPaymentMerchant", method);
  }
}
