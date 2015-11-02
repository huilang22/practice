/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DependencyTypeRequestMethod implements UdtMethod {
  private String method = null;
  private DependencyTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DependencyTypeCreate method */
  public static final DependencyTypeRequestMethod DEPENDENCY_TYPE_CREATE = new DependencyTypeRequestMethod("DependencyTypeCreate");
  /** Variable representing the DependencyTypeFind method */
  public static final DependencyTypeRequestMethod DEPENDENCY_TYPE_FIND = new DependencyTypeRequestMethod("DependencyTypeFind");
  /** Variable representing the DependencyTypeGet method */
  public static final DependencyTypeRequestMethod DEPENDENCY_TYPE_GET = new DependencyTypeRequestMethod("DependencyTypeGet");
  /** Variable representing the DependencyTypeUpdate method */
  public static final DependencyTypeRequestMethod DEPENDENCY_TYPE_UPDATE = new DependencyTypeRequestMethod("DependencyTypeUpdate");
}
