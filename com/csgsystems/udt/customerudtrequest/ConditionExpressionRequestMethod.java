/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ConditionExpressionRequestMethod implements UdtMethod {
  private String method = null;
  private ConditionExpressionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ConditionExpressionCreate method */
  public static final ConditionExpressionRequestMethod CONDITION_EXPRESSION_CREATE = new ConditionExpressionRequestMethod("ConditionExpressionCreate");
  /** Variable representing the ConditionExpressionFind method */
  public static final ConditionExpressionRequestMethod CONDITION_EXPRESSION_FIND = new ConditionExpressionRequestMethod("ConditionExpressionFind");
  /** Variable representing the ConditionExpressionGet method */
  public static final ConditionExpressionRequestMethod CONDITION_EXPRESSION_GET = new ConditionExpressionRequestMethod("ConditionExpressionGet");
  /** Variable representing the ConditionExpressionUpdate method */
  public static final ConditionExpressionRequestMethod CONDITION_EXPRESSION_UPDATE = new ConditionExpressionRequestMethod("ConditionExpressionUpdate");
}
