/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ProductChargeMap related UdtRequests
 *
 */

public abstract class ProductChargeMapRequest extends UdtRequest {

/**
 *
 * Constructor for ProductChargeMapRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ProductChargeMapRequest(String id, String method) {
    super(id, "ProductChargeMap", method);
  }
}
