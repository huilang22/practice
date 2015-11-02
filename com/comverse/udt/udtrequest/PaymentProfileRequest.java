/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PaymentProfile related UdtRequests
 *
 */

public abstract class PaymentProfileRequest extends UdtRequest {

/**
 *
 * Constructor for PaymentProfileRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PaymentProfileRequest(String id, String method) {
    super(id, "PaymentProfile", method);
  }
}
