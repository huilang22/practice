/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionSubRequestParent.java
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
 * Abstract base class for all ConditionExpression related UdtSubRequestParents
 *
 */
public abstract class ConditionExpressionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ConditionExpressionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ConditionExpressionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ConditionExpressionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ConditionExpressionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ConditionExpressionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ConditionExpressionSubRequestParent(String id, String method) {
    super(id, "ConditionExpression", method);
  }
}
