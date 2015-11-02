/*
 * Generated code DO NOT EDIT
 * Generated file: StoredProcedureRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class StoredProcedureRequestMethod implements UdtMethod {
  private String method = null;
  private StoredProcedureRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the StoredProcedureCall method */
  public static final StoredProcedureRequestMethod STORED_PROCEDURE_CALL = new StoredProcedureRequestMethod("StoredProcedureCall");
}
