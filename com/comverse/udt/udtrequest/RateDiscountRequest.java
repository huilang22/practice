/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RateDiscount related UdtRequests
 *
 */

public abstract class RateDiscountRequest extends UdtRequest {

/**
 *
 * Constructor for RateDiscountRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RateDiscountRequest(String id, String method) {
    super(id, "RateDiscount", method);
  }
}
