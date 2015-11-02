/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdAttributeConstraintRequestMethod implements UdtMethod {
  private String method = null;
  private BsdAttributeConstraintRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdAttributeConstraintActionFind method */
  public static final BsdAttributeConstraintRequestMethod BSD_ATTRIBUTE_CONSTRAINT_ACTION_FIND = new BsdAttributeConstraintRequestMethod("BsdAttributeConstraintActionFind");
  /** Variable representing the BsdAttributeConstraintCreate method */
  public static final BsdAttributeConstraintRequestMethod BSD_ATTRIBUTE_CONSTRAINT_CREATE = new BsdAttributeConstraintRequestMethod("BsdAttributeConstraintCreate");
  /** Variable representing the BsdAttributeConstraintDelete method */
  public static final BsdAttributeConstraintRequestMethod BSD_ATTRIBUTE_CONSTRAINT_DELETE = new BsdAttributeConstraintRequestMethod("BsdAttributeConstraintDelete");
  /** Variable representing the BsdAttributeConstraintDeleteAll method */
  public static final BsdAttributeConstraintRequestMethod BSD_ATTRIBUTE_CONSTRAINT_DELETE_ALL = new BsdAttributeConstraintRequestMethod("BsdAttributeConstraintDeleteAll");
  /** Variable representing the BsdAttributeConstraintFind method */
  public static final BsdAttributeConstraintRequestMethod BSD_ATTRIBUTE_CONSTRAINT_FIND = new BsdAttributeConstraintRequestMethod("BsdAttributeConstraintFind");
  /** Variable representing the BsdAttributeConstraintGet method */
  public static final BsdAttributeConstraintRequestMethod BSD_ATTRIBUTE_CONSTRAINT_GET = new BsdAttributeConstraintRequestMethod("BsdAttributeConstraintGet");
  /** Variable representing the BsdAttributeConstraintSequenceGet method */
  public static final BsdAttributeConstraintRequestMethod BSD_ATTRIBUTE_CONSTRAINT_SEQUENCE_GET = new BsdAttributeConstraintRequestMethod("BsdAttributeConstraintSequenceGet");
  /** Variable representing the BsdAttributeConstraintUpdate method */
  public static final BsdAttributeConstraintRequestMethod BSD_ATTRIBUTE_CONSTRAINT_UPDATE = new BsdAttributeConstraintRequestMethod("BsdAttributeConstraintUpdate");
}
