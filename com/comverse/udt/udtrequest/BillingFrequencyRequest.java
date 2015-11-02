/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencyRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillingFrequency related UdtRequests
 *
 */

public abstract class BillingFrequencyRequest extends UdtRequest {

/**
 *
 * Constructor for BillingFrequencyRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BillingFrequencyRequest(String id, String method) {
    super(id, "BillingFrequency", method);
  }
}
