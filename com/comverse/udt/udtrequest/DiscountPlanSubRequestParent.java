/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountPlanSubRequestParent.java
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
 * Abstract base class for all DiscountPlan related UdtSubRequestParents
 *
 */
public abstract class DiscountPlanSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DiscountPlanRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscountPlanRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DiscountPlanSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscountPlanSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DiscountPlanSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DiscountPlanSubRequestParent(String id, String method) {
    super(id, "DiscountPlan", method);
  }
}
