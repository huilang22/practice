/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingReasonSubRequestParent.java
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
 * Abstract base class for all CtcItemRatingReason related UdtSubRequestParents
 *
 */
public abstract class CtcItemRatingReasonSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcItemRatingReasonRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcItemRatingReasonRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcItemRatingReasonSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcItemRatingReasonSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcItemRatingReasonSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcItemRatingReasonSubRequestParent(String id, String method) {
    super(id, "CtcItemRatingReason", method);
  }
}
