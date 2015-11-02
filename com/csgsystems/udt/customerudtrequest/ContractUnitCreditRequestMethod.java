/*
 * Generated code DO NOT EDIT
 * Generated file: ContractUnitCreditRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ContractUnitCreditRequestMethod implements UdtMethod {
  private String method = null;
  private ContractUnitCreditRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ContractUnitCreditConfigGet method */
  public static final ContractUnitCreditRequestMethod CONTRACT_UNIT_CREDIT_CONFIG_GET = new ContractUnitCreditRequestMethod("ContractUnitCreditConfigGet");
  /** Variable representing the ContractUnitCreditCreate method */
  public static final ContractUnitCreditRequestMethod CONTRACT_UNIT_CREDIT_CREATE = new ContractUnitCreditRequestMethod("ContractUnitCreditCreate");
  /** Variable representing the ContractUnitCreditFind method */
  public static final ContractUnitCreditRequestMethod CONTRACT_UNIT_CREDIT_FIND = new ContractUnitCreditRequestMethod("ContractUnitCreditFind");
  /** Variable representing the ContractUnitCreditGet method */
  public static final ContractUnitCreditRequestMethod CONTRACT_UNIT_CREDIT_GET = new ContractUnitCreditRequestMethod("ContractUnitCreditGet");
  /** Variable representing the ContractUnitCreditUpdate method */
  public static final ContractUnitCreditRequestMethod CONTRACT_UNIT_CREDIT_UPDATE = new ContractUnitCreditRequestMethod("ContractUnitCreditUpdate");
}
