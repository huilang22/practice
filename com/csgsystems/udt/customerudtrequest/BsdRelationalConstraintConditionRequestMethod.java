/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintConditionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdRelationalConstraintConditionRequestMethod implements UdtMethod {
  private String method = null;
  private BsdRelationalConstraintConditionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdRelationalConstraintConditionActionFind method */
  public static final BsdRelationalConstraintConditionRequestMethod BSD_RELATIONAL_CONSTRAINT_CONDITION_ACTION_FIND = new BsdRelationalConstraintConditionRequestMethod("BsdRelationalConstraintConditionActionFind");
  /** Variable representing the BsdRelationalConstraintConditionCreate method */
  public static final BsdRelationalConstraintConditionRequestMethod BSD_RELATIONAL_CONSTRAINT_CONDITION_CREATE = new BsdRelationalConstraintConditionRequestMethod("BsdRelationalConstraintConditionCreate");
  /** Variable representing the BsdRelationalConstraintConditionDelete method */
  public static final BsdRelationalConstraintConditionRequestMethod BSD_RELATIONAL_CONSTRAINT_CONDITION_DELETE = new BsdRelationalConstraintConditionRequestMethod("BsdRelationalConstraintConditionDelete");
  /** Variable representing the BsdRelationalConstraintConditionDeleteAll method */
  public static final BsdRelationalConstraintConditionRequestMethod BSD_RELATIONAL_CONSTRAINT_CONDITION_DELETE_ALL = new BsdRelationalConstraintConditionRequestMethod("BsdRelationalConstraintConditionDeleteAll");
  /** Variable representing the BsdRelationalConstraintConditionFind method */
  public static final BsdRelationalConstraintConditionRequestMethod BSD_RELATIONAL_CONSTRAINT_CONDITION_FIND = new BsdRelationalConstraintConditionRequestMethod("BsdRelationalConstraintConditionFind");
  /** Variable representing the BsdRelationalConstraintConditionGet method */
  public static final BsdRelationalConstraintConditionRequestMethod BSD_RELATIONAL_CONSTRAINT_CONDITION_GET = new BsdRelationalConstraintConditionRequestMethod("BsdRelationalConstraintConditionGet");
  /** Variable representing the BsdRelationalConstraintConditionSequenceGet method */
  public static final BsdRelationalConstraintConditionRequestMethod BSD_RELATIONAL_CONSTRAINT_CONDITION_SEQUENCE_GET = new BsdRelationalConstraintConditionRequestMethod("BsdRelationalConstraintConditionSequenceGet");
  /** Variable representing the BsdRelationalConstraintConditionUpdate method */
  public static final BsdRelationalConstraintConditionRequestMethod BSD_RELATIONAL_CONSTRAINT_CONDITION_UPDATE = new BsdRelationalConstraintConditionRequestMethod("BsdRelationalConstraintConditionUpdate");
}
