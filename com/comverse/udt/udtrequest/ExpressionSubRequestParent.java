/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExpressionSubRequestParent.java
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
 * Abstract base class for all Expression related UdtSubRequestParents
 *
 */
public abstract class ExpressionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExpressionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExpressionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExpressionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExpressionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExpressionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExpressionSubRequestParent(String id, String method) {
    super(id, "Expression", method);
  }
}
