/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RateCurrency related UdtRequests
 *
 */

public abstract class RateCurrencyRequest extends UdtRequest {

/**
 *
 * Constructor for RateCurrencyRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RateCurrencyRequest(String id, String method) {
    super(id, "RateCurrency", method);
  }
}
