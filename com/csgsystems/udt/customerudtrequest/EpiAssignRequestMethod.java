/*
 * Generated code DO NOT EDIT
 * Generated file: EpiAssignRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EpiAssignRequestMethod implements UdtMethod {
  private String method = null;
  private EpiAssignRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EpiAssignCreate method */
  public static final EpiAssignRequestMethod EPI_ASSIGN_CREATE = new EpiAssignRequestMethod("EpiAssignCreate");
  /** Variable representing the EpiAssignDelete method */
  public static final EpiAssignRequestMethod EPI_ASSIGN_DELETE = new EpiAssignRequestMethod("EpiAssignDelete");
  /** Variable representing the EpiAssignFind method */
  public static final EpiAssignRequestMethod EPI_ASSIGN_FIND = new EpiAssignRequestMethod("EpiAssignFind");
  /** Variable representing the EpiAssignGet method */
  public static final EpiAssignRequestMethod EPI_ASSIGN_GET = new EpiAssignRequestMethod("EpiAssignGet");
  /** Variable representing the EpiAssignUpdate method */
  public static final EpiAssignRequestMethod EPI_ASSIGN_UPDATE = new EpiAssignRequestMethod("EpiAssignUpdate");
}
