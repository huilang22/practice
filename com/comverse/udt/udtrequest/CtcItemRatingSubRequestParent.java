/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingSubRequestParent.java
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
 * Abstract base class for all CtcItemRating related UdtSubRequestParents
 *
 */
public abstract class CtcItemRatingSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcItemRatingRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcItemRatingRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcItemRatingSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcItemRatingSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcItemRatingSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcItemRatingSubRequestParent(String id, String method) {
    super(id, "CtcItemRating", method);
  }
}
