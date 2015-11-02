/*
 * Generated code DO NOT EDIT
 * Generated file: ContractTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ContractTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ContractTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ContractTypeCreate method */
  public static final ContractTypeRequestMethod CONTRACT_TYPE_CREATE = new ContractTypeRequestMethod("ContractTypeCreate");
  /** Variable representing the ContractTypeFind method */
  public static final ContractTypeRequestMethod CONTRACT_TYPE_FIND = new ContractTypeRequestMethod("ContractTypeFind");
  /** Variable representing the ContractTypeFindByAccount method */
  public static final ContractTypeRequestMethod CONTRACT_TYPE_FIND_BY_ACCOUNT = new ContractTypeRequestMethod("ContractTypeFindByAccount");
  /** Variable representing the ContractTypeFindByService method */
  public static final ContractTypeRequestMethod CONTRACT_TYPE_FIND_BY_SERVICE = new ContractTypeRequestMethod("ContractTypeFindByService");
  /** Variable representing the ContractTypeGet method */
  public static final ContractTypeRequestMethod CONTRACT_TYPE_GET = new ContractTypeRequestMethod("ContractTypeGet");
  /** Variable representing the ContractTypePrice method */
  public static final ContractTypeRequestMethod CONTRACT_TYPE_PRICE = new ContractTypeRequestMethod("ContractTypePrice");
  /** Variable representing the ContractTypeUpdate method */
  public static final ContractTypeRequestMethod CONTRACT_TYPE_UPDATE = new ContractTypeRequestMethod("ContractTypeUpdate");
}
