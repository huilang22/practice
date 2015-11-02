/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectChargeDetailRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProjectChargeDetailRequestMethod implements UdtMethod {
  private String method = null;
  private ProjectChargeDetailRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProjectChargeDetailFind method */
  public static final ProjectChargeDetailRequestMethod PROJECT_CHARGE_DETAIL_FIND = new ProjectChargeDetailRequestMethod("ProjectChargeDetailFind");
  /** Variable representing the ProjectChargeDetailGet method */
  public static final ProjectChargeDetailRequestMethod PROJECT_CHARGE_DETAIL_GET = new ProjectChargeDetailRequestMethod("ProjectChargeDetailGet");
  /** Variable representing the ProjectChargeDetailUpdate method */
  public static final ProjectChargeDetailRequestMethod PROJECT_CHARGE_DETAIL_UPDATE = new ProjectChargeDetailRequestMethod("ProjectChargeDetailUpdate");
}
