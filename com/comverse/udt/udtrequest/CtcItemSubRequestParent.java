/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemSubRequestParent.java
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
 * Abstract base class for all CtcItem related UdtSubRequestParents
 *
 */
public abstract class CtcItemSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcItemRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcItemRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcItemSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcItemSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcItemSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcItemSubRequestParent(String id, String method) {
    super(id, "CtcItem", method);
  }
}
