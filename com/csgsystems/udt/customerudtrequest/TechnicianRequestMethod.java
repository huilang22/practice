/*
 * Generated code DO NOT EDIT
 * Generated file: TechnicianRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TechnicianRequestMethod implements UdtMethod {
  private String method = null;
  private TechnicianRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TechnicianCreate method */
  public static final TechnicianRequestMethod TECHNICIAN_CREATE = new TechnicianRequestMethod("TechnicianCreate");
  /** Variable representing the TechnicianFind method */
  public static final TechnicianRequestMethod TECHNICIAN_FIND = new TechnicianRequestMethod("TechnicianFind");
  /** Variable representing the TechnicianGet method */
  public static final TechnicianRequestMethod TECHNICIAN_GET = new TechnicianRequestMethod("TechnicianGet");
  /** Variable representing the TechnicianUpdate method */
  public static final TechnicianRequestMethod TECHNICIAN_UPDATE = new TechnicianRequestMethod("TechnicianUpdate");
}
