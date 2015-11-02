/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdRelationalConstraintRequestMethod implements UdtMethod {
  private String method = null;
  private BsdRelationalConstraintRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdRelationalConstraintActionFind method */
  public static final BsdRelationalConstraintRequestMethod BSD_RELATIONAL_CONSTRAINT_ACTION_FIND = new BsdRelationalConstraintRequestMethod("BsdRelationalConstraintActionFind");
  /** Variable representing the BsdRelationalConstraintCreate method */
  public static final BsdRelationalConstraintRequestMethod BSD_RELATIONAL_CONSTRAINT_CREATE = new BsdRelationalConstraintRequestMethod("BsdRelationalConstraintCreate");
  /** Variable representing the BsdRelationalConstraintDelete method */
  public static final BsdRelationalConstraintRequestMethod BSD_RELATIONAL_CONSTRAINT_DELETE = new BsdRelationalConstraintRequestMethod("BsdRelationalConstraintDelete");
  /** Variable representing the BsdRelationalConstraintDeleteAll method */
  public static final BsdRelationalConstraintRequestMethod BSD_RELATIONAL_CONSTRAINT_DELETE_ALL = new BsdRelationalConstraintRequestMethod("BsdRelationalConstraintDeleteAll");
  /** Variable representing the BsdRelationalConstraintFind method */
  public static final BsdRelationalConstraintRequestMethod BSD_RELATIONAL_CONSTRAINT_FIND = new BsdRelationalConstraintRequestMethod("BsdRelationalConstraintFind");
  /** Variable representing the BsdRelationalConstraintGet method */
  public static final BsdRelationalConstraintRequestMethod BSD_RELATIONAL_CONSTRAINT_GET = new BsdRelationalConstraintRequestMethod("BsdRelationalConstraintGet");
  /** Variable representing the BsdRelationalConstraintSequenceGet method */
  public static final BsdRelationalConstraintRequestMethod BSD_RELATIONAL_CONSTRAINT_SEQUENCE_GET = new BsdRelationalConstraintRequestMethod("BsdRelationalConstraintSequenceGet");
  /** Variable representing the BsdRelationalConstraintUpdate method */
  public static final BsdRelationalConstraintRequestMethod BSD_RELATIONAL_CONSTRAINT_UPDATE = new BsdRelationalConstraintRequestMethod("BsdRelationalConstraintUpdate");
}
