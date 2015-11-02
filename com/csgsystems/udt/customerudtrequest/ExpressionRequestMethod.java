/*
 * Generated code DO NOT EDIT
 * Generated file: ExpressionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExpressionRequestMethod implements UdtMethod {
  private String method = null;
  private ExpressionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExpressionCreate method */
  public static final ExpressionRequestMethod EXPRESSION_CREATE = new ExpressionRequestMethod("ExpressionCreate");
  /** Variable representing the ExpressionFind method */
  public static final ExpressionRequestMethod EXPRESSION_FIND = new ExpressionRequestMethod("ExpressionFind");
  /** Variable representing the ExpressionGet method */
  public static final ExpressionRequestMethod EXPRESSION_GET = new ExpressionRequestMethod("ExpressionGet");
  /** Variable representing the ExpressionUpdate method */
  public static final ExpressionRequestMethod EXPRESSION_UPDATE = new ExpressionRequestMethod("ExpressionUpdate");
}
