/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentActionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsEquipmentActionRequestMethod implements UdtMethod {
  private String method = null;
  private InvsEquipmentActionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsEquipmentActionBaseFind method */
  public static final InvsEquipmentActionRequestMethod INVS_EQUIPMENT_ACTION_BASE_FIND = new InvsEquipmentActionRequestMethod("InvsEquipmentActionBaseFind");
  /** Variable representing the InvsEquipmentActionCreate method */
  public static final InvsEquipmentActionRequestMethod INVS_EQUIPMENT_ACTION_CREATE = new InvsEquipmentActionRequestMethod("InvsEquipmentActionCreate");
  /** Variable representing the InvsEquipmentActionDelete method */
  public static final InvsEquipmentActionRequestMethod INVS_EQUIPMENT_ACTION_DELETE = new InvsEquipmentActionRequestMethod("InvsEquipmentActionDelete");
  /** Variable representing the InvsEquipmentActionFind method */
  public static final InvsEquipmentActionRequestMethod INVS_EQUIPMENT_ACTION_FIND = new InvsEquipmentActionRequestMethod("InvsEquipmentActionFind");
  /** Variable representing the InvsEquipmentActionGet method */
  public static final InvsEquipmentActionRequestMethod INVS_EQUIPMENT_ACTION_GET = new InvsEquipmentActionRequestMethod("InvsEquipmentActionGet");
  /** Variable representing the InvsEquipmentActionUpdate method */
  public static final InvsEquipmentActionRequestMethod INVS_EQUIPMENT_ACTION_UPDATE = new InvsEquipmentActionRequestMethod("InvsEquipmentActionUpdate");
}
