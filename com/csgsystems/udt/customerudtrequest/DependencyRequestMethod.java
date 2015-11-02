/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DependencyRequestMethod implements UdtMethod {
  private String method = null;
  private DependencyRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DependencyCheck method */
  public static final DependencyRequestMethod DEPENDENCY_CHECK = new DependencyRequestMethod("DependencyCheck");
  /** Variable representing the DependencyCreate method */
  public static final DependencyRequestMethod DEPENDENCY_CREATE = new DependencyRequestMethod("DependencyCreate");
  /** Variable representing the DependencyFind method */
  public static final DependencyRequestMethod DEPENDENCY_FIND = new DependencyRequestMethod("DependencyFind");
  /** Variable representing the DependencyGet method */
  public static final DependencyRequestMethod DEPENDENCY_GET = new DependencyRequestMethod("DependencyGet");
  /** Variable representing the DependencyRetrieve method */
  public static final DependencyRequestMethod DEPENDENCY_RETRIEVE = new DependencyRequestMethod("DependencyRetrieve");
  /** Variable representing the DependencyUpdate method */
  public static final DependencyRequestMethod DEPENDENCY_UPDATE = new DependencyRequestMethod("DependencyUpdate");
}
