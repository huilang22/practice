/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionGrpRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ConditionExpressionGrpRequestMethod implements UdtMethod {
  private String method = null;
  private ConditionExpressionGrpRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ConditionExpressionGrpCreate method */
  public static final ConditionExpressionGrpRequestMethod CONDITION_EXPRESSION_GRP_CREATE = new ConditionExpressionGrpRequestMethod("ConditionExpressionGrpCreate");
  /** Variable representing the ConditionExpressionGrpFind method */
  public static final ConditionExpressionGrpRequestMethod CONDITION_EXPRESSION_GRP_FIND = new ConditionExpressionGrpRequestMethod("ConditionExpressionGrpFind");
  /** Variable representing the ConditionExpressionGrpGet method */
  public static final ConditionExpressionGrpRequestMethod CONDITION_EXPRESSION_GRP_GET = new ConditionExpressionGrpRequestMethod("ConditionExpressionGrpGet");
  /** Variable representing the ConditionExpressionGrpUpdate method */
  public static final ConditionExpressionGrpRequestMethod CONDITION_EXPRESSION_GRP_UPDATE = new ConditionExpressionGrpRequestMethod("ConditionExpressionGrpUpdate");
}
