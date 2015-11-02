/*
 * Generated code DO NOT EDIT
 * Generated file: CsrGroupAmountRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CsrGroupAmountRequestMethod implements UdtMethod {
  private String method = null;
  private CsrGroupAmountRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CsrGroupAmountCreate method */
  public static final CsrGroupAmountRequestMethod CSR_GROUP_AMOUNT_CREATE = new CsrGroupAmountRequestMethod("CsrGroupAmountCreate");
  /** Variable representing the CsrGroupAmountDelete method */
  public static final CsrGroupAmountRequestMethod CSR_GROUP_AMOUNT_DELETE = new CsrGroupAmountRequestMethod("CsrGroupAmountDelete");
  /** Variable representing the CsrGroupAmountFind method */
  public static final CsrGroupAmountRequestMethod CSR_GROUP_AMOUNT_FIND = new CsrGroupAmountRequestMethod("CsrGroupAmountFind");
  /** Variable representing the CsrGroupAmountGet method */
  public static final CsrGroupAmountRequestMethod CSR_GROUP_AMOUNT_GET = new CsrGroupAmountRequestMethod("CsrGroupAmountGet");
  /** Variable representing the CsrGroupAmountUpdate method */
  public static final CsrGroupAmountRequestMethod CSR_GROUP_AMOUNT_UPDATE = new CsrGroupAmountRequestMethod("CsrGroupAmountUpdate");
}
