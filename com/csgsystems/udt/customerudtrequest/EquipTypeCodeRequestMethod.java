/*
 * Generated code DO NOT EDIT
 * Generated file: EquipTypeCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EquipTypeCodeRequestMethod implements UdtMethod {
  private String method = null;
  private EquipTypeCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EquipTypeCodeCreate method */
  public static final EquipTypeCodeRequestMethod EQUIP_TYPE_CODE_CREATE = new EquipTypeCodeRequestMethod("EquipTypeCodeCreate");
  /** Variable representing the EquipTypeCodeDelete method */
  public static final EquipTypeCodeRequestMethod EQUIP_TYPE_CODE_DELETE = new EquipTypeCodeRequestMethod("EquipTypeCodeDelete");
  /** Variable representing the EquipTypeCodeFind method */
  public static final EquipTypeCodeRequestMethod EQUIP_TYPE_CODE_FIND = new EquipTypeCodeRequestMethod("EquipTypeCodeFind");
  /** Variable representing the EquipTypeCodeGet method */
  public static final EquipTypeCodeRequestMethod EQUIP_TYPE_CODE_GET = new EquipTypeCodeRequestMethod("EquipTypeCodeGet");
  /** Variable representing the EquipTypeCodeUpdate method */
  public static final EquipTypeCodeRequestMethod EQUIP_TYPE_CODE_UPDATE = new EquipTypeCodeRequestMethod("EquipTypeCodeUpdate");
}
