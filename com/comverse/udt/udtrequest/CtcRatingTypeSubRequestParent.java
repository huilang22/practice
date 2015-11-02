/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeSubRequestParent.java
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
 * Abstract base class for all CtcRatingType related UdtSubRequestParents
 *
 */
public abstract class CtcRatingTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcRatingTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcRatingTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcRatingTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcRatingTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcRatingTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcRatingTypeSubRequestParent(String id, String method) {
    super(id, "CtcRatingType", method);
  }
}
