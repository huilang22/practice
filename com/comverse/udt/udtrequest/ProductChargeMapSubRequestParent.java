/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductChargeMapSubRequestParent.java
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
 * Abstract base class for all ProductChargeMap related UdtSubRequestParents
 *
 */
public abstract class ProductChargeMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ProductChargeMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductChargeMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProductChargeMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProductChargeMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ProductChargeMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProductChargeMapSubRequestParent(String id, String method) {
    super(id, "ProductChargeMap", method);
  }
}
