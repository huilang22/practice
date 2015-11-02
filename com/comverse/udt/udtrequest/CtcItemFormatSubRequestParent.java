/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFormatSubRequestParent.java
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
 * Abstract base class for all CtcItemFormat related UdtSubRequestParents
 *
 */
public abstract class CtcItemFormatSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcItemFormatRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcItemFormatRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcItemFormatSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcItemFormatSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcItemFormatSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcItemFormatSubRequestParent(String id, String method) {
    super(id, "CtcItemFormat", method);
  }
}
