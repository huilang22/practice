/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTransRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PaymentTrans related UdtRequests
 *
 */

public abstract class PaymentTransRequest extends UdtRequest {

/**
 *
 * Constructor for PaymentTransRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PaymentTransRequest(String id, String method) {
    super(id, "PaymentTrans", method);
  }
}
