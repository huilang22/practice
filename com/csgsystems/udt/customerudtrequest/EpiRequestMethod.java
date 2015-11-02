/*
 * Generated code DO NOT EDIT
 * Generated file: EpiRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EpiRequestMethod implements UdtMethod {
  private String method = null;
  private EpiRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EpiCreate method */
  public static final EpiRequestMethod EPI_CREATE = new EpiRequestMethod("EpiCreate");
  /** Variable representing the EpiDelete method */
  public static final EpiRequestMethod EPI_DELETE = new EpiRequestMethod("EpiDelete");
  /** Variable representing the EpiFind method */
  public static final EpiRequestMethod EPI_FIND = new EpiRequestMethod("EpiFind");
  /** Variable representing the EpiGet method */
  public static final EpiRequestMethod EPI_GET = new EpiRequestMethod("EpiGet");
  /** Variable representing the EpiUpdate method */
  public static final EpiRequestMethod EPI_UPDATE = new EpiRequestMethod("EpiUpdate");
}
