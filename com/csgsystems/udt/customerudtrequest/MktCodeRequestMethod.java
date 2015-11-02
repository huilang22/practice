/*
 * Generated code DO NOT EDIT
 * Generated file: MktCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class MktCodeRequestMethod implements UdtMethod {
  private String method = null;
  private MktCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the MktCodeCreate method */
  public static final MktCodeRequestMethod MKT_CODE_CREATE = new MktCodeRequestMethod("MktCodeCreate");
  /** Variable representing the MktCodeDelete method */
  public static final MktCodeRequestMethod MKT_CODE_DELETE = new MktCodeRequestMethod("MktCodeDelete");
  /** Variable representing the MktCodeFind method */
  public static final MktCodeRequestMethod MKT_CODE_FIND = new MktCodeRequestMethod("MktCodeFind");
  /** Variable representing the MktCodeGet method */
  public static final MktCodeRequestMethod MKT_CODE_GET = new MktCodeRequestMethod("MktCodeGet");
  /** Variable representing the MktCodeUpdate method */
  public static final MktCodeRequestMethod MKT_CODE_UPDATE = new MktCodeRequestMethod("MktCodeUpdate");
}
