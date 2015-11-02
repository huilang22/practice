/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlSubRequestParent.java
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
 * Abstract base class for all CtcItemUrl related UdtSubRequestParents
 *
 */
public abstract class CtcItemUrlSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcItemUrlRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcItemUrlRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcItemUrlSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcItemUrlSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcItemUrlSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcItemUrlSubRequestParent(String id, String method) {
    super(id, "CtcItemUrl", method);
  }
}
