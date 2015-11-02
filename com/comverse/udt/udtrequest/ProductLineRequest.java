/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ProductLine related UdtRequests
 *
 */

public abstract class ProductLineRequest extends UdtRequest {

/**
 *
 * Constructor for ProductLineRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ProductLineRequest(String id, String method) {
    super(id, "ProductLine", method);
  }
}
