/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AxrtPayment related UdtRequests
 *
 */

public abstract class AxrtPaymentRequest extends UdtRequest {

/**
 *
 * Constructor for AxrtPaymentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AxrtPaymentRequest(String id, String method) {
    super(id, "AxrtPayment", method);
  }
}
