/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGrpSubRequestParent.java
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
 * Abstract base class for all ConditionExpressionGrp related UdtSubRequestParents
 *
 */
public abstract class ConditionExpressionGrpSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ConditionExpressionGrpRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ConditionExpressionGrpRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ConditionExpressionGrpSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ConditionExpressionGrpSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ConditionExpressionGrpSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ConditionExpressionGrpSubRequestParent(String id, String method) {
    super(id, "ConditionExpressionGrp", method);
  }
}
