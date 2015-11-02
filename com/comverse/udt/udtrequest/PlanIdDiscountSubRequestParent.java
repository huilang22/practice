/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountSubRequestParent.java
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
 * Abstract base class for all PlanIdDiscount related UdtSubRequestParents
 *
 */
public abstract class PlanIdDiscountSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PlanIdDiscountRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PlanIdDiscountRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PlanIdDiscountSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PlanIdDiscountSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PlanIdDiscountSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PlanIdDiscountSubRequestParent(String id, String method) {
    super(id, "PlanIdDiscount", method);
  }
}
