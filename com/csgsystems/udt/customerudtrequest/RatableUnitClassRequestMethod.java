/*
 * Generated code DO NOT EDIT
 * Generated file: RatableUnitClassRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RatableUnitClassRequestMethod implements UdtMethod {
  private String method = null;
  private RatableUnitClassRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RatableUnitClassCreate method */
  public static final RatableUnitClassRequestMethod RATABLE_UNIT_CLASS_CREATE = new RatableUnitClassRequestMethod("RatableUnitClassCreate");
  /** Variable representing the RatableUnitClassDelete method */
  public static final RatableUnitClassRequestMethod RATABLE_UNIT_CLASS_DELETE = new RatableUnitClassRequestMethod("RatableUnitClassDelete");
  /** Variable representing the RatableUnitClassFind method */
  public static final RatableUnitClassRequestMethod RATABLE_UNIT_CLASS_FIND = new RatableUnitClassRequestMethod("RatableUnitClassFind");
  /** Variable representing the RatableUnitClassGet method */
  public static final RatableUnitClassRequestMethod RATABLE_UNIT_CLASS_GET = new RatableUnitClassRequestMethod("RatableUnitClassGet");
  /** Variable representing the RatableUnitClassUpdate method */
  public static final RatableUnitClassRequestMethod RATABLE_UNIT_CLASS_UPDATE = new RatableUnitClassRequestMethod("RatableUnitClassUpdate");
}
