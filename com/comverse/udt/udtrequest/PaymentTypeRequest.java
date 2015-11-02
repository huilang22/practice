/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PaymentType related UdtRequests
 *
 */

public abstract class PaymentTypeRequest extends UdtRequest {

/**
 *
 * Constructor for PaymentTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PaymentTypeRequest(String id, String method) {
    super(id, "PaymentType", method);
  }
}
