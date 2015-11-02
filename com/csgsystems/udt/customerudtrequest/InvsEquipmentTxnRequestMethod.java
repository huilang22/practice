/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentTxnRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsEquipmentTxnRequestMethod implements UdtMethod {
  private String method = null;
  private InvsEquipmentTxnRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsEquipmentTxnCreate method */
  public static final InvsEquipmentTxnRequestMethod INVS_EQUIPMENT_TXN_CREATE = new InvsEquipmentTxnRequestMethod("InvsEquipmentTxnCreate");
  /** Variable representing the InvsEquipmentTxnDelete method */
  public static final InvsEquipmentTxnRequestMethod INVS_EQUIPMENT_TXN_DELETE = new InvsEquipmentTxnRequestMethod("InvsEquipmentTxnDelete");
  /** Variable representing the InvsEquipmentTxnFind method */
  public static final InvsEquipmentTxnRequestMethod INVS_EQUIPMENT_TXN_FIND = new InvsEquipmentTxnRequestMethod("InvsEquipmentTxnFind");
  /** Variable representing the InvsEquipmentTxnGet method */
  public static final InvsEquipmentTxnRequestMethod INVS_EQUIPMENT_TXN_GET = new InvsEquipmentTxnRequestMethod("InvsEquipmentTxnGet");
  /** Variable representing the InvsEquipmentTxnUpdate method */
  public static final InvsEquipmentTxnRequestMethod INVS_EQUIPMENT_TXN_UPDATE = new InvsEquipmentTxnRequestMethod("InvsEquipmentTxnUpdate");
}
