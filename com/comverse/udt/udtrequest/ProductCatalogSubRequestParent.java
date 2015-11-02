/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductCatalogSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ProductCatalog related UdtSubRequestParents
 *
 */
public abstract class ProductCatalogSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ProductCatalogRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductCatalogRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProductCatalogSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductCatalogSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ProductCatalogSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProductCatalogSubRequestParent(String id, String method) {
    super(id, "ProductCatalog", method);
  }
}
