/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountSubRequestParent.java
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
 * Abstract base class for all RateDiscount related UdtSubRequestParents
 *
 */
public abstract class RateDiscountSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RateDiscountRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateDiscountRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RateDiscountSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RateDiscountSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RateDiscountSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RateDiscountSubRequestParent(String id, String method) {
    super(id, "RateDiscount", method);
  }
}
