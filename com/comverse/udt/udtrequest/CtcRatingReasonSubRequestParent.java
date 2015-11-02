/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonSubRequestParent.java
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
 * Abstract base class for all CtcRatingReason related UdtSubRequestParents
 *
 */
public abstract class CtcRatingReasonSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcRatingReasonRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcRatingReasonRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcRatingReasonSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcRatingReasonSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcRatingReasonSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcRatingReasonSubRequestParent(String id, String method) {
    super(id, "CtcRatingReason", method);
  }
}
