/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationConstraintRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdApplicationConstraintRequestMethod implements UdtMethod {
  private String method = null;
  private BsdApplicationConstraintRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdApplicationConstraintCreate method */
  public static final BsdApplicationConstraintRequestMethod BSD_APPLICATION_CONSTRAINT_CREATE = new BsdApplicationConstraintRequestMethod("BsdApplicationConstraintCreate");
  /** Variable representing the BsdApplicationConstraintDelete method */
  public static final BsdApplicationConstraintRequestMethod BSD_APPLICATION_CONSTRAINT_DELETE = new BsdApplicationConstraintRequestMethod("BsdApplicationConstraintDelete");
  /** Variable representing the BsdApplicationConstraintDeleteAll method */
  public static final BsdApplicationConstraintRequestMethod BSD_APPLICATION_CONSTRAINT_DELETE_ALL = new BsdApplicationConstraintRequestMethod("BsdApplicationConstraintDeleteAll");
  /** Variable representing the BsdApplicationConstraintFind method */
  public static final BsdApplicationConstraintRequestMethod BSD_APPLICATION_CONSTRAINT_FIND = new BsdApplicationConstraintRequestMethod("BsdApplicationConstraintFind");
  /** Variable representing the BsdApplicationConstraintGet method */
  public static final BsdApplicationConstraintRequestMethod BSD_APPLICATION_CONSTRAINT_GET = new BsdApplicationConstraintRequestMethod("BsdApplicationConstraintGet");
}
