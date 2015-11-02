/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRelationalConstraintRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdApplicationRelationalConstraintRequestMethod implements UdtMethod {
  private String method = null;
  private BsdApplicationRelationalConstraintRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdApplicationRelationalConstraintActionFind method */
  public static final BsdApplicationRelationalConstraintRequestMethod BSD_APPLICATION_RELATIONAL_CONSTRAINT_ACTION_FIND = new BsdApplicationRelationalConstraintRequestMethod("BsdApplicationRelationalConstraintActionFind");
  /** Variable representing the BsdApplicationRelationalConstraintFind method */
  public static final BsdApplicationRelationalConstraintRequestMethod BSD_APPLICATION_RELATIONAL_CONSTRAINT_FIND = new BsdApplicationRelationalConstraintRequestMethod("BsdApplicationRelationalConstraintFind");
  /** Variable representing the BsdApplicationRelationalConstraintGet method */
  public static final BsdApplicationRelationalConstraintRequestMethod BSD_APPLICATION_RELATIONAL_CONSTRAINT_GET = new BsdApplicationRelationalConstraintRequestMethod("BsdApplicationRelationalConstraintGet");
}
