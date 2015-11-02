/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipTxnPostconditionsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsEquipTxnPostconditionsRequestMethod implements UdtMethod {
  private String method = null;
  private InvsEquipTxnPostconditionsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsEquipTxnPostconditionsCreate method */
  public static final InvsEquipTxnPostconditionsRequestMethod INVS_EQUIP_TXN_POSTCONDITIONS_CREATE = new InvsEquipTxnPostconditionsRequestMethod("InvsEquipTxnPostconditionsCreate");
  /** Variable representing the InvsEquipTxnPostconditionsDelete method */
  public static final InvsEquipTxnPostconditionsRequestMethod INVS_EQUIP_TXN_POSTCONDITIONS_DELETE = new InvsEquipTxnPostconditionsRequestMethod("InvsEquipTxnPostconditionsDelete");
  /** Variable representing the InvsEquipTxnPostconditionsFind method */
  public static final InvsEquipTxnPostconditionsRequestMethod INVS_EQUIP_TXN_POSTCONDITIONS_FIND = new InvsEquipTxnPostconditionsRequestMethod("InvsEquipTxnPostconditionsFind");
  /** Variable representing the InvsEquipTxnPostconditionsGet method */
  public static final InvsEquipTxnPostconditionsRequestMethod INVS_EQUIP_TXN_POSTCONDITIONS_GET = new InvsEquipTxnPostconditionsRequestMethod("InvsEquipTxnPostconditionsGet");
  /** Variable representing the InvsEquipTxnPostconditionsUpdate method */
  public static final InvsEquipTxnPostconditionsRequestMethod INVS_EQUIP_TXN_POSTCONDITIONS_UPDATE = new InvsEquipTxnPostconditionsRequestMethod("InvsEquipTxnPostconditionsUpdate");
}
