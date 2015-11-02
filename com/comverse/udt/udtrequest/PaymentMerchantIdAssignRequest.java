/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentMerchantIdAssignRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PaymentMerchantIdAssign related UdtRequests
 *
 */

public abstract class PaymentMerchantIdAssignRequest extends UdtRequest {

/**
 *
 * Constructor for PaymentMerchantIdAssignRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PaymentMerchantIdAssignRequest(String id, String method) {
    super(id, "PaymentMerchantIdAssign", method);
  }
}
