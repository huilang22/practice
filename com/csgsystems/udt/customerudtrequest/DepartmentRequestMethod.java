/*
 * Generated code DO NOT EDIT
 * Generated file: DepartmentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DepartmentRequestMethod implements UdtMethod {
  private String method = null;
  private DepartmentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DepartmentCreate method */
  public static final DepartmentRequestMethod DEPARTMENT_CREATE = new DepartmentRequestMethod("DepartmentCreate");
  /** Variable representing the DepartmentFind method */
  public static final DepartmentRequestMethod DEPARTMENT_FIND = new DepartmentRequestMethod("DepartmentFind");
  /** Variable representing the DepartmentGet method */
  public static final DepartmentRequestMethod DEPARTMENT_GET = new DepartmentRequestMethod("DepartmentGet");
  /** Variable representing the DepartmentUpdate method */
  public static final DepartmentRequestMethod DEPARTMENT_UPDATE = new DepartmentRequestMethod("DepartmentUpdate");
}
