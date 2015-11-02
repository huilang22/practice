/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionGrpRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ConditionGrpRequestMethod implements UdtMethod {
  private String method = null;
  private ConditionGrpRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ConditionGrpCreate method */
  public static final ConditionGrpRequestMethod CONDITION_GRP_CREATE = new ConditionGrpRequestMethod("ConditionGrpCreate");
  /** Variable representing the ConditionGrpFind method */
  public static final ConditionGrpRequestMethod CONDITION_GRP_FIND = new ConditionGrpRequestMethod("ConditionGrpFind");
  /** Variable representing the ConditionGrpGet method */
  public static final ConditionGrpRequestMethod CONDITION_GRP_GET = new ConditionGrpRequestMethod("ConditionGrpGet");
  /** Variable representing the ConditionGrpUpdate method */
  public static final ConditionGrpRequestMethod CONDITION_GRP_UPDATE = new ConditionGrpRequestMethod("ConditionGrpUpdate");
}
