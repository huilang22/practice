/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipTxnPreconditionsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsEquipTxnPreconditionsRequestMethod implements UdtMethod {
  private String method = null;
  private InvsEquipTxnPreconditionsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsEquipTxnPreconditionsCreate method */
  public static final InvsEquipTxnPreconditionsRequestMethod INVS_EQUIP_TXN_PRECONDITIONS_CREATE = new InvsEquipTxnPreconditionsRequestMethod("InvsEquipTxnPreconditionsCreate");
  /** Variable representing the InvsEquipTxnPreconditionsDelete method */
  public static final InvsEquipTxnPreconditionsRequestMethod INVS_EQUIP_TXN_PRECONDITIONS_DELETE = new InvsEquipTxnPreconditionsRequestMethod("InvsEquipTxnPreconditionsDelete");
  /** Variable representing the InvsEquipTxnPreconditionsFind method */
  public static final InvsEquipTxnPreconditionsRequestMethod INVS_EQUIP_TXN_PRECONDITIONS_FIND = new InvsEquipTxnPreconditionsRequestMethod("InvsEquipTxnPreconditionsFind");
  /** Variable representing the InvsEquipTxnPreconditionsGet method */
  public static final InvsEquipTxnPreconditionsRequestMethod INVS_EQUIP_TXN_PRECONDITIONS_GET = new InvsEquipTxnPreconditionsRequestMethod("InvsEquipTxnPreconditionsGet");
  /** Variable representing the InvsEquipTxnPreconditionsUpdate method */
  public static final InvsEquipTxnPreconditionsRequestMethod INVS_EQUIP_TXN_PRECONDITIONS_UPDATE = new InvsEquipTxnPreconditionsRequestMethod("InvsEquipTxnPreconditionsUpdate");
}
