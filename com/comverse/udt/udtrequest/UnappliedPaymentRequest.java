/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnappliedPaymentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UnappliedPayment related UdtRequests
 *
 */

public abstract class UnappliedPaymentRequest extends UdtRequest {

/**
 *
 * Constructor for UnappliedPaymentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UnappliedPaymentRequest(String id, String method) {
    super(id, "UnappliedPayment", method);
  }
}
