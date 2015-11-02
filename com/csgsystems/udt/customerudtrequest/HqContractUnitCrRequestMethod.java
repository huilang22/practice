/*
 * Generated code DO NOT EDIT
 * Generated file: HqContractUnitCrRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class HqContractUnitCrRequestMethod implements UdtMethod {
  private String method = null;
  private HqContractUnitCrRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HqContractUnitCrCreate method */
  public static final HqContractUnitCrRequestMethod HQ_CONTRACT_UNIT_CR_CREATE = new HqContractUnitCrRequestMethod("HqContractUnitCrCreate");
  /** Variable representing the HqContractUnitCrDelete method */
  public static final HqContractUnitCrRequestMethod HQ_CONTRACT_UNIT_CR_DELETE = new HqContractUnitCrRequestMethod("HqContractUnitCrDelete");
  /** Variable representing the HqContractUnitCrFind method */
  public static final HqContractUnitCrRequestMethod HQ_CONTRACT_UNIT_CR_FIND = new HqContractUnitCrRequestMethod("HqContractUnitCrFind");
  /** Variable representing the HqContractUnitCrGet method */
  public static final HqContractUnitCrRequestMethod HQ_CONTRACT_UNIT_CR_GET = new HqContractUnitCrRequestMethod("HqContractUnitCrGet");
  /** Variable representing the HqContractUnitCrUpdate method */
  public static final HqContractUnitCrRequestMethod HQ_CONTRACT_UNIT_CR_UPDATE = new HqContractUnitCrRequestMethod("HqContractUnitCrUpdate");
}
