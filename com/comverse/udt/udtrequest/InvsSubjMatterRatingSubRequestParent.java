/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSubjMatterRatingSubRequestParent.java
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
 * Abstract base class for all InvsSubjMatterRating related UdtSubRequestParents
 *
 */
public abstract class InvsSubjMatterRatingSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsSubjMatterRatingRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSubjMatterRatingRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsSubjMatterRatingSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSubjMatterRatingSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsSubjMatterRatingSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsSubjMatterRatingSubRequestParent(String id, String method) {
    super(id, "InvsSubjMatterRating", method);
  }
}
