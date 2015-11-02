/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductGroupServiceFilterSubRequestParent.java
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
 * Abstract base class for all ProductGroupServiceFilter related UdtSubRequestParents
 *
 */
public abstract class ProductGroupServiceFilterSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ProductGroupServiceFilterRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductGroupServiceFilterRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProductGroupServiceFilterSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductGroupServiceFilterSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ProductGroupServiceFilterSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProductGroupServiceFilterSubRequestParent(String id, String method) {
    super(id, "ProductGroupServiceFilter", method);
  }
}
