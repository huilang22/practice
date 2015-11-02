/*
 * Generated code DO NOT EDIT
 * Generated file: RbrDecisionTreeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrDecisionTreeRequestMethod implements UdtMethod {
  private String method = null;
  private RbrDecisionTreeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrDecisionTreeCreate method */
  public static final RbrDecisionTreeRequestMethod RBR_DECISION_TREE_CREATE = new RbrDecisionTreeRequestMethod("RbrDecisionTreeCreate");
  /** Variable representing the RbrDecisionTreeDelete method */
  public static final RbrDecisionTreeRequestMethod RBR_DECISION_TREE_DELETE = new RbrDecisionTreeRequestMethod("RbrDecisionTreeDelete");
  /** Variable representing the RbrDecisionTreeFind method */
  public static final RbrDecisionTreeRequestMethod RBR_DECISION_TREE_FIND = new RbrDecisionTreeRequestMethod("RbrDecisionTreeFind");
  /** Variable representing the RbrDecisionTreeGet method */
  public static final RbrDecisionTreeRequestMethod RBR_DECISION_TREE_GET = new RbrDecisionTreeRequestMethod("RbrDecisionTreeGet");
  /** Variable representing the RbrDecisionTreeUpdate method */
  public static final RbrDecisionTreeRequestMethod RBR_DECISION_TREE_UPDATE = new RbrDecisionTreeRequestMethod("RbrDecisionTreeUpdate");
}
