/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdRelationalConstraintTypeRequestMethod implements UdtMethod {
  private String method = null;
  private BsdRelationalConstraintTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdRelationalConstraintTypeCreate method */
  public static final BsdRelationalConstraintTypeRequestMethod BSD_RELATIONAL_CONSTRAINT_TYPE_CREATE = new BsdRelationalConstraintTypeRequestMethod("BsdRelationalConstraintTypeCreate");
  /** Variable representing the BsdRelationalConstraintTypeDelete method */
  public static final BsdRelationalConstraintTypeRequestMethod BSD_RELATIONAL_CONSTRAINT_TYPE_DELETE = new BsdRelationalConstraintTypeRequestMethod("BsdRelationalConstraintTypeDelete");
  /** Variable representing the BsdRelationalConstraintTypeDeleteAll method */
  public static final BsdRelationalConstraintTypeRequestMethod BSD_RELATIONAL_CONSTRAINT_TYPE_DELETE_ALL = new BsdRelationalConstraintTypeRequestMethod("BsdRelationalConstraintTypeDeleteAll");
  /** Variable representing the BsdRelationalConstraintTypeFind method */
  public static final BsdRelationalConstraintTypeRequestMethod BSD_RELATIONAL_CONSTRAINT_TYPE_FIND = new BsdRelationalConstraintTypeRequestMethod("BsdRelationalConstraintTypeFind");
  /** Variable representing the BsdRelationalConstraintTypeGet method */
  public static final BsdRelationalConstraintTypeRequestMethod BSD_RELATIONAL_CONSTRAINT_TYPE_GET = new BsdRelationalConstraintTypeRequestMethod("BsdRelationalConstraintTypeGet");
  /** Variable representing the BsdRelationalConstraintTypeSequenceGet method */
  public static final BsdRelationalConstraintTypeRequestMethod BSD_RELATIONAL_CONSTRAINT_TYPE_SEQUENCE_GET = new BsdRelationalConstraintTypeRequestMethod("BsdRelationalConstraintTypeSequenceGet");
  /** Variable representing the BsdRelationalConstraintTypeUpdate method */
  public static final BsdRelationalConstraintTypeRequestMethod BSD_RELATIONAL_CONSTRAINT_TYPE_UPDATE = new BsdRelationalConstraintTypeRequestMethod("BsdRelationalConstraintTypeUpdate");
}
