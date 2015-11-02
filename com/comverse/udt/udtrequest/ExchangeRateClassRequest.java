/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExchangeRateClassRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ExchangeRateClass related UdtRequests
 *
 */

public abstract class ExchangeRateClassRequest extends UdtRequest {

/**
 *
 * Constructor for ExchangeRateClassRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ExchangeRateClassRequest(String id, String method) {
    super(id, "ExchangeRateClass", method);
  }
}
