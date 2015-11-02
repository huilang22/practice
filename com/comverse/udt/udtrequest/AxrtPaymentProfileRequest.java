/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentProfileRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AxrtPaymentProfile related UdtRequests
 *
 */

public abstract class AxrtPaymentProfileRequest extends UdtRequest {

/**
 *
 * Constructor for AxrtPaymentProfileRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AxrtPaymentProfileRequest(String id, String method) {
    super(id, "AxrtPaymentProfile", method);
  }
}
