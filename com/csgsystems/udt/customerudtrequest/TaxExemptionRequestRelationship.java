/*
 * Generated code DO NOT EDIT
 * Generated file: TaxExemptionRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class TaxExemptionRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private TaxExemptionRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the TaxExemption_Account_Ref relationship */
  public static final TaxExemptionRequestRelationship TAX_EXEMPTION__ACCOUNT__REF = new TaxExemptionRequestRelationship("TaxExemption_Account_Ref");
  /** Variable representing the TaxExemption_OrderedAccount_Ref relationship */
  public static final TaxExemptionRequestRelationship TAX_EXEMPTION__ORDERED_ACCOUNT__REF = new TaxExemptionRequestRelationship("TaxExemption_OrderedAccount_Ref");
}
