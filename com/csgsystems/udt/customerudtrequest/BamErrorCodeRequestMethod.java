/*
 * Generated code DO NOT EDIT
 * Generated file: BamErrorCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BamErrorCodeRequestMethod implements UdtMethod {
  private String method = null;
  private BamErrorCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BamErrorCodeCreate method */
  public static final BamErrorCodeRequestMethod BAM_ERROR_CODE_CREATE = new BamErrorCodeRequestMethod("BamErrorCodeCreate");
  /** Variable representing the BamErrorCodeDelete method */
  public static final BamErrorCodeRequestMethod BAM_ERROR_CODE_DELETE = new BamErrorCodeRequestMethod("BamErrorCodeDelete");
  /** Variable representing the BamErrorCodeFind method */
  public static final BamErrorCodeRequestMethod BAM_ERROR_CODE_FIND = new BamErrorCodeRequestMethod("BamErrorCodeFind");
  /** Variable representing the BamErrorCodeGet method */
  public static final BamErrorCodeRequestMethod BAM_ERROR_CODE_GET = new BamErrorCodeRequestMethod("BamErrorCodeGet");
  /** Variable representing the BamErrorCodeUpdate method */
  public static final BamErrorCodeRequestMethod BAM_ERROR_CODE_UPDATE = new BamErrorCodeRequestMethod("BamErrorCodeUpdate");
}
