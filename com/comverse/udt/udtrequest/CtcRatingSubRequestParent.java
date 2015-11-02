/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingSubRequestParent.java
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
 * Abstract base class for all CtcRating related UdtSubRequestParents
 *
 */
public abstract class CtcRatingSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcRatingRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcRatingRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcRatingSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcRatingSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcRatingSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcRatingSubRequestParent(String id, String method) {
    super(id, "CtcRating", method);
  }
}
