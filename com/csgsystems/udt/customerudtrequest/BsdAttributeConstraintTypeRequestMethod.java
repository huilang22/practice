/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdAttributeConstraintTypeRequestMethod implements UdtMethod {
  private String method = null;
  private BsdAttributeConstraintTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdAttributeConstraintTypeCreate method */
  public static final BsdAttributeConstraintTypeRequestMethod BSD_ATTRIBUTE_CONSTRAINT_TYPE_CREATE = new BsdAttributeConstraintTypeRequestMethod("BsdAttributeConstraintTypeCreate");
  /** Variable representing the BsdAttributeConstraintTypeDelete method */
  public static final BsdAttributeConstraintTypeRequestMethod BSD_ATTRIBUTE_CONSTRAINT_TYPE_DELETE = new BsdAttributeConstraintTypeRequestMethod("BsdAttributeConstraintTypeDelete");
  /** Variable representing the BsdAttributeConstraintTypeDeleteAll method */
  public static final BsdAttributeConstraintTypeRequestMethod BSD_ATTRIBUTE_CONSTRAINT_TYPE_DELETE_ALL = new BsdAttributeConstraintTypeRequestMethod("BsdAttributeConstraintTypeDeleteAll");
  /** Variable representing the BsdAttributeConstraintTypeFind method */
  public static final BsdAttributeConstraintTypeRequestMethod BSD_ATTRIBUTE_CONSTRAINT_TYPE_FIND = new BsdAttributeConstraintTypeRequestMethod("BsdAttributeConstraintTypeFind");
  /** Variable representing the BsdAttributeConstraintTypeGet method */
  public static final BsdAttributeConstraintTypeRequestMethod BSD_ATTRIBUTE_CONSTRAINT_TYPE_GET = new BsdAttributeConstraintTypeRequestMethod("BsdAttributeConstraintTypeGet");
  /** Variable representing the BsdAttributeConstraintTypeSequenceGet method */
  public static final BsdAttributeConstraintTypeRequestMethod BSD_ATTRIBUTE_CONSTRAINT_TYPE_SEQUENCE_GET = new BsdAttributeConstraintTypeRequestMethod("BsdAttributeConstraintTypeSequenceGet");
  /** Variable representing the BsdAttributeConstraintTypeUpdate method */
  public static final BsdAttributeConstraintTypeRequestMethod BSD_ATTRIBUTE_CONSTRAINT_TYPE_UPDATE = new BsdAttributeConstraintTypeRequestMethod("BsdAttributeConstraintTypeUpdate");
}
