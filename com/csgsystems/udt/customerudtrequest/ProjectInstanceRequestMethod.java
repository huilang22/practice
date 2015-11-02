/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectInstanceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProjectInstanceRequestMethod implements UdtMethod {
  private String method = null;
  private ProjectInstanceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProjectInstanceCreate method */
  public static final ProjectInstanceRequestMethod PROJECT_INSTANCE_CREATE = new ProjectInstanceRequestMethod("ProjectInstanceCreate");
  /** Variable representing the ProjectInstanceExtendedDataFind method */
  public static final ProjectInstanceRequestMethod PROJECT_INSTANCE_EXTENDED_DATA_FIND = new ProjectInstanceRequestMethod("ProjectInstanceExtendedDataFind");
  /** Variable representing the ProjectInstanceFind method */
  public static final ProjectInstanceRequestMethod PROJECT_INSTANCE_FIND = new ProjectInstanceRequestMethod("ProjectInstanceFind");
  /** Variable representing the ProjectInstanceGet method */
  public static final ProjectInstanceRequestMethod PROJECT_INSTANCE_GET = new ProjectInstanceRequestMethod("ProjectInstanceGet");
  /** Variable representing the ProjectInstanceUpdate method */
  public static final ProjectInstanceRequestMethod PROJECT_INSTANCE_UPDATE = new ProjectInstanceRequestMethod("ProjectInstanceUpdate");
}
