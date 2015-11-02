/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ProductGroup related UdtRequests
 *
 */

public abstract class ProductGroupRequest extends UdtRequest {

/**
 *
 * Constructor for ProductGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ProductGroupRequest(String id, String method) {
    super(id, "ProductGroup", method);
  }
}
