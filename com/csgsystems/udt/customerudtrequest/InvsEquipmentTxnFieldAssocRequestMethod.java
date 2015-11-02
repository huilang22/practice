/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentTxnFieldAssocRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsEquipmentTxnFieldAssocRequestMethod implements UdtMethod {
  private String method = null;
  private InvsEquipmentTxnFieldAssocRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsEquipmentTxnFieldAssocCreate method */
  public static final InvsEquipmentTxnFieldAssocRequestMethod INVS_EQUIPMENT_TXN_FIELD_ASSOC_CREATE = new InvsEquipmentTxnFieldAssocRequestMethod("InvsEquipmentTxnFieldAssocCreate");
  /** Variable representing the InvsEquipmentTxnFieldAssocDelete method */
  public static final InvsEquipmentTxnFieldAssocRequestMethod INVS_EQUIPMENT_TXN_FIELD_ASSOC_DELETE = new InvsEquipmentTxnFieldAssocRequestMethod("InvsEquipmentTxnFieldAssocDelete");
  /** Variable representing the InvsEquipmentTxnFieldAssocFind method */
  public static final InvsEquipmentTxnFieldAssocRequestMethod INVS_EQUIPMENT_TXN_FIELD_ASSOC_FIND = new InvsEquipmentTxnFieldAssocRequestMethod("InvsEquipmentTxnFieldAssocFind");
  /** Variable representing the InvsEquipmentTxnFieldAssocGet method */
  public static final InvsEquipmentTxnFieldAssocRequestMethod INVS_EQUIPMENT_TXN_FIELD_ASSOC_GET = new InvsEquipmentTxnFieldAssocRequestMethod("InvsEquipmentTxnFieldAssocGet");
  /** Variable representing the InvsEquipmentTxnFieldAssocUpdate method */
  public static final InvsEquipmentTxnFieldAssocRequestMethod INVS_EQUIPMENT_TXN_FIELD_ASSOC_UPDATE = new InvsEquipmentTxnFieldAssocRequestMethod("InvsEquipmentTxnFieldAssocUpdate");
}
