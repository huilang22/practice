/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationAttributeConstraintRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdApplicationAttributeConstraintRequestMethod implements UdtMethod {
  private String method = null;
  private BsdApplicationAttributeConstraintRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdApplicationAttributeConstraintActionFind method */
  public static final BsdApplicationAttributeConstraintRequestMethod BSD_APPLICATION_ATTRIBUTE_CONSTRAINT_ACTION_FIND = new BsdApplicationAttributeConstraintRequestMethod("BsdApplicationAttributeConstraintActionFind");
  /** Variable representing the BsdApplicationAttributeConstraintFind method */
  public static final BsdApplicationAttributeConstraintRequestMethod BSD_APPLICATION_ATTRIBUTE_CONSTRAINT_FIND = new BsdApplicationAttributeConstraintRequestMethod("BsdApplicationAttributeConstraintFind");
  /** Variable representing the BsdApplicationAttributeConstraintGet method */
  public static final BsdApplicationAttributeConstraintRequestMethod BSD_APPLICATION_ATTRIBUTE_CONSTRAINT_GET = new BsdApplicationAttributeConstraintRequestMethod("BsdApplicationAttributeConstraintGet");
}
