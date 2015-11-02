/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintConditionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdAttributeConstraintConditionRequestMethod implements UdtMethod {
  private String method = null;
  private BsdAttributeConstraintConditionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdAttributeConstraintConditionActionFind method */
  public static final BsdAttributeConstraintConditionRequestMethod BSD_ATTRIBUTE_CONSTRAINT_CONDITION_ACTION_FIND = new BsdAttributeConstraintConditionRequestMethod("BsdAttributeConstraintConditionActionFind");
  /** Variable representing the BsdAttributeConstraintConditionCreate method */
  public static final BsdAttributeConstraintConditionRequestMethod BSD_ATTRIBUTE_CONSTRAINT_CONDITION_CREATE = new BsdAttributeConstraintConditionRequestMethod("BsdAttributeConstraintConditionCreate");
  /** Variable representing the BsdAttributeConstraintConditionDelete method */
  public static final BsdAttributeConstraintConditionRequestMethod BSD_ATTRIBUTE_CONSTRAINT_CONDITION_DELETE = new BsdAttributeConstraintConditionRequestMethod("BsdAttributeConstraintConditionDelete");
  /** Variable representing the BsdAttributeConstraintConditionDeleteAll method */
  public static final BsdAttributeConstraintConditionRequestMethod BSD_ATTRIBUTE_CONSTRAINT_CONDITION_DELETE_ALL = new BsdAttributeConstraintConditionRequestMethod("BsdAttributeConstraintConditionDeleteAll");
  /** Variable representing the BsdAttributeConstraintConditionFind method */
  public static final BsdAttributeConstraintConditionRequestMethod BSD_ATTRIBUTE_CONSTRAINT_CONDITION_FIND = new BsdAttributeConstraintConditionRequestMethod("BsdAttributeConstraintConditionFind");
  /** Variable representing the BsdAttributeConstraintConditionGet method */
  public static final BsdAttributeConstraintConditionRequestMethod BSD_ATTRIBUTE_CONSTRAINT_CONDITION_GET = new BsdAttributeConstraintConditionRequestMethod("BsdAttributeConstraintConditionGet");
  /** Variable representing the BsdAttributeConstraintConditionSequenceGet method */
  public static final BsdAttributeConstraintConditionRequestMethod BSD_ATTRIBUTE_CONSTRAINT_CONDITION_SEQUENCE_GET = new BsdAttributeConstraintConditionRequestMethod("BsdAttributeConstraintConditionSequenceGet");
  /** Variable representing the BsdAttributeConstraintConditionUpdate method */
  public static final BsdAttributeConstraintConditionRequestMethod BSD_ATTRIBUTE_CONSTRAINT_CONDITION_UPDATE = new BsdAttributeConstraintConditionRequestMethod("BsdAttributeConstraintConditionUpdate");
}
