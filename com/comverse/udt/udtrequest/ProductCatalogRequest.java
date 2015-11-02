/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductCatalogRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ProductCatalog related UdtRequests
 *
 */

public abstract class ProductCatalogRequest extends UdtRequest {

/**
 *
 * Constructor for ProductCatalogRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ProductCatalogRequest(String id, String method) {
    super(id, "ProductCatalog", method);
  }
}
