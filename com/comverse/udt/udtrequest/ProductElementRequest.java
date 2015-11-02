/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ProductElement related UdtRequests
 *
 */

public abstract class ProductElementRequest extends UdtRequest {

/**
 *
 * Constructor for ProductElementRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ProductElementRequest(String id, String method) {
    super(id, "ProductElement", method);
  }
}
