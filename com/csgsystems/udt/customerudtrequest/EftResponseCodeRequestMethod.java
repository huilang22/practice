/*
 * Generated code DO NOT EDIT
 * Generated file: EftResponseCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EftResponseCodeRequestMethod implements UdtMethod {
  private String method = null;
  private EftResponseCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EftResponseCodeCreate method */
  public static final EftResponseCodeRequestMethod EFT_RESPONSE_CODE_CREATE = new EftResponseCodeRequestMethod("EftResponseCodeCreate");
  /** Variable representing the EftResponseCodeDelete method */
  public static final EftResponseCodeRequestMethod EFT_RESPONSE_CODE_DELETE = new EftResponseCodeRequestMethod("EftResponseCodeDelete");
  /** Variable representing the EftResponseCodeFind method */
  public static final EftResponseCodeRequestMethod EFT_RESPONSE_CODE_FIND = new EftResponseCodeRequestMethod("EftResponseCodeFind");
  /** Variable representing the EftResponseCodeGet method */
  public static final EftResponseCodeRequestMethod EFT_RESPONSE_CODE_GET = new EftResponseCodeRequestMethod("EftResponseCodeGet");
  /** Variable representing the EftResponseCodeUpdate method */
  public static final EftResponseCodeRequestMethod EFT_RESPONSE_CODE_UPDATE = new EftResponseCodeRequestMethod("EftResponseCodeUpdate");
}
