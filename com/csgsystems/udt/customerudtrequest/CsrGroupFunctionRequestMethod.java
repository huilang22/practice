/*
 * Generated code DO NOT EDIT
 * Generated file: CsrGroupFunctionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CsrGroupFunctionRequestMethod implements UdtMethod {
  private String method = null;
  private CsrGroupFunctionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CsrGroupFunctionCreate method */
  public static final CsrGroupFunctionRequestMethod CSR_GROUP_FUNCTION_CREATE = new CsrGroupFunctionRequestMethod("CsrGroupFunctionCreate");
  /** Variable representing the CsrGroupFunctionDelete method */
  public static final CsrGroupFunctionRequestMethod CSR_GROUP_FUNCTION_DELETE = new CsrGroupFunctionRequestMethod("CsrGroupFunctionDelete");
  /** Variable representing the CsrGroupFunctionFind method */
  public static final CsrGroupFunctionRequestMethod CSR_GROUP_FUNCTION_FIND = new CsrGroupFunctionRequestMethod("CsrGroupFunctionFind");
  /** Variable representing the CsrGroupFunctionGet method */
  public static final CsrGroupFunctionRequestMethod CSR_GROUP_FUNCTION_GET = new CsrGroupFunctionRequestMethod("CsrGroupFunctionGet");
  /** Variable representing the CsrGroupFunctionUpdate method */
  public static final CsrGroupFunctionRequestMethod CSR_GROUP_FUNCTION_UPDATE = new CsrGroupFunctionRequestMethod("CsrGroupFunctionUpdate");
}
