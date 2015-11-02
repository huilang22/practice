/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferCategorySubRequestParent.java
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
 * Abstract base class for all CtcOfferCategory related UdtSubRequestParents
 *
 */
public abstract class CtcOfferCategorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcOfferCategoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOfferCategoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcOfferCategorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcOfferCategorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcOfferCategorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcOfferCategorySubRequestParent(String id, String method) {
    super(id, "CtcOfferCategory", method);
  }
}
