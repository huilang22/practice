/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementSubRequestParent.java
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
 * Abstract base class for all ProductElement related UdtSubRequestParents
 *
 */
public abstract class ProductElementSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ProductElementRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductElementRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProductElementSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductElementSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ProductElementSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProductElementSubRequestParent(String id, String method) {
    super(id, "ProductElement", method);
  }
}
