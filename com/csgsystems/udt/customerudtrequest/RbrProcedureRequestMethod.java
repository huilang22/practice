/*
 * Generated code DO NOT EDIT
 * Generated file: RbrProcedureRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrProcedureRequestMethod implements UdtMethod {
  private String method = null;
  private RbrProcedureRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrProcedureCreate method */
  public static final RbrProcedureRequestMethod RBR_PROCEDURE_CREATE = new RbrProcedureRequestMethod("RbrProcedureCreate");
  /** Variable representing the RbrProcedureDelete method */
  public static final RbrProcedureRequestMethod RBR_PROCEDURE_DELETE = new RbrProcedureRequestMethod("RbrProcedureDelete");
  /** Variable representing the RbrProcedureFind method */
  public static final RbrProcedureRequestMethod RBR_PROCEDURE_FIND = new RbrProcedureRequestMethod("RbrProcedureFind");
  /** Variable representing the RbrProcedureGet method */
  public static final RbrProcedureRequestMethod RBR_PROCEDURE_GET = new RbrProcedureRequestMethod("RbrProcedureGet");
  /** Variable representing the RbrProcedureUpdate method */
  public static final RbrProcedureRequestMethod RBR_PROCEDURE_UPDATE = new RbrProcedureRequestMethod("RbrProcedureUpdate");
}
