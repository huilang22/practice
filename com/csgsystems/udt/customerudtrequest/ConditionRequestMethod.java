/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ConditionRequestMethod implements UdtMethod {
  private String method = null;
  private ConditionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ConditionCreate method */
  public static final ConditionRequestMethod CONDITION_CREATE = new ConditionRequestMethod("ConditionCreate");
  /** Variable representing the ConditionFind method */
  public static final ConditionRequestMethod CONDITION_FIND = new ConditionRequestMethod("ConditionFind");
  /** Variable representing the ConditionGet method */
  public static final ConditionRequestMethod CONDITION_GET = new ConditionRequestMethod("ConditionGet");
  /** Variable representing the ConditionUpdate method */
  public static final ConditionRequestMethod CONDITION_UPDATE = new ConditionRequestMethod("ConditionUpdate");
}
