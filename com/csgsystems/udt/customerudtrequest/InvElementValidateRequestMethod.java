/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementValidateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvElementValidateRequestMethod implements UdtMethod {
  private String method = null;
  private InvElementValidateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvElementValidateSwapValidate method */
  public static final InvElementValidateRequestMethod INV_ELEMENT_VALIDATE_SWAP_VALIDATE = new InvElementValidateRequestMethod("InvElementValidateSwapValidate");
  /** Variable representing the InvElementValidateUnAssignValidate method */
  public static final InvElementValidateRequestMethod INV_ELEMENT_VALIDATE_UN_ASSIGN_VALIDATE = new InvElementValidateRequestMethod("InvElementValidateUnAssignValidate");
}
