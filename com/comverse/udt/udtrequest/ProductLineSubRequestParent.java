/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductLineSubRequestParent.java
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
 * Abstract base class for all ProductLine related UdtSubRequestParents
 *
 */
public abstract class ProductLineSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ProductLineRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductLineRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProductLineSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductLineSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ProductLineSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProductLineSubRequestParent(String id, String method) {
    super(id, "ProductLine", method);
  }
}
