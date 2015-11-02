/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class UnbilledUsageRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private UnbilledUsageRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the UnbilledUsage_Account_Ref relationship */
  public static final UnbilledUsageRequestRelationship UNBILLED_USAGE__ACCOUNT__REF = new UnbilledUsageRequestRelationship("UnbilledUsage_Account_Ref");
  /** Variable representing the UnbilledUsage_Adjustment_Ref relationship */
  public static final UnbilledUsageRequestRelationship UNBILLED_USAGE__ADJUSTMENT__REF = new UnbilledUsageRequestRelationship("UnbilledUsage_Adjustment_Ref");
  /** Variable representing the UnbilledUsage_OrderedAccount_Ref relationship */
  public static final UnbilledUsageRequestRelationship UNBILLED_USAGE__ORDERED_ACCOUNT__REF = new UnbilledUsageRequestRelationship("UnbilledUsage_OrderedAccount_Ref");
}
