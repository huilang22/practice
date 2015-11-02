/*
 * Generated code DO NOT EDIT
 * Generated file: ContractTypeValidateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ContractTypeValidateRequestMethod implements UdtMethod {
  private String method = null;
  private ContractTypeValidateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ContractTypeValidateCreate method */
  public static final ContractTypeValidateRequestMethod CONTRACT_TYPE_VALIDATE_CREATE = new ContractTypeValidateRequestMethod("ContractTypeValidateCreate");
}
