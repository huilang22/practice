/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentCondRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsEquipmentCondRequestMethod implements UdtMethod {
  private String method = null;
  private InvsEquipmentCondRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsEquipmentCondCreate method */
  public static final InvsEquipmentCondRequestMethod INVS_EQUIPMENT_COND_CREATE = new InvsEquipmentCondRequestMethod("InvsEquipmentCondCreate");
  /** Variable representing the InvsEquipmentCondDelete method */
  public static final InvsEquipmentCondRequestMethod INVS_EQUIPMENT_COND_DELETE = new InvsEquipmentCondRequestMethod("InvsEquipmentCondDelete");
  /** Variable representing the InvsEquipmentCondFind method */
  public static final InvsEquipmentCondRequestMethod INVS_EQUIPMENT_COND_FIND = new InvsEquipmentCondRequestMethod("InvsEquipmentCondFind");
  /** Variable representing the InvsEquipmentCondGet method */
  public static final InvsEquipmentCondRequestMethod INVS_EQUIPMENT_COND_GET = new InvsEquipmentCondRequestMethod("InvsEquipmentCondGet");
  /** Variable representing the InvsEquipmentCondUpdate method */
  public static final InvsEquipmentCondRequestMethod INVS_EQUIPMENT_COND_UPDATE = new InvsEquipmentCondRequestMethod("InvsEquipmentCondUpdate");
}
