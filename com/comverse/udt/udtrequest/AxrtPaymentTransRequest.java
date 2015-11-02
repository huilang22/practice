/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtPaymentTransRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AxrtPaymentTrans related UdtRequests
 *
 */

public abstract class AxrtPaymentTransRequest extends UdtRequest {

/**
 *
 * Constructor for AxrtPaymentTransRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AxrtPaymentTransRequest(String id, String method) {
    super(id, "AxrtPaymentTrans", method);
  }
}
