/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupSubRequestParent.java
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
 * Abstract base class for all ProductGroup related UdtSubRequestParents
 *
 */
public abstract class ProductGroupSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ProductGroupRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductGroupRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProductGroupSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductGroupSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ProductGroupSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProductGroupSubRequestParent(String id, String method) {
    super(id, "ProductGroup", method);
  }
}
