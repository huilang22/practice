/*
 * Generated code DO NOT EDIT
 * Generated file: RTUnitCreditBalanceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RTUnitCreditBalanceRequestMethod implements UdtMethod {
  private String method = null;
  private RTUnitCreditBalanceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HierarchyRTUnitCreditBalanceQuery method */
  public static final RTUnitCreditBalanceRequestMethod HIERARCHY_R_T_UNIT_CREDIT_BALANCE_QUERY = new RTUnitCreditBalanceRequestMethod("HierarchyRTUnitCreditBalanceQuery");
  /** Variable representing the RTUnitCreditBalanceQuery method */
  public static final RTUnitCreditBalanceRequestMethod R_T_UNIT_CREDIT_BALANCE_QUERY = new RTUnitCreditBalanceRequestMethod("RTUnitCreditBalanceQuery");
}
