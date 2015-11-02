/*
 * Generated code DO NOT EDIT
 * Generated file: ContractUnitCreditRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ContractUnitCreditRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ContractUnitCreditRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the ContractUnitCredit_CustomerContract_Ref relationship */
  public static final ContractUnitCreditRequestRelationship CONTRACT_UNIT_CREDIT__CUSTOMER_CONTRACT__REF = new ContractUnitCreditRequestRelationship("ContractUnitCredit_CustomerContract_Ref");
  /** Variable representing the ContractUnitCredit_OrderedContract_Ref relationship */
  public static final ContractUnitCreditRequestRelationship CONTRACT_UNIT_CREDIT__ORDERED_CONTRACT__REF = new ContractUnitCreditRequestRelationship("ContractUnitCredit_OrderedContract_Ref");
}
