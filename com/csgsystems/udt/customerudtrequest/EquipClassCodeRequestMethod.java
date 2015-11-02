/*
 * Generated code DO NOT EDIT
 * Generated file: EquipClassCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EquipClassCodeRequestMethod implements UdtMethod {
  private String method = null;
  private EquipClassCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EquipClassCodeCreate method */
  public static final EquipClassCodeRequestMethod EQUIP_CLASS_CODE_CREATE = new EquipClassCodeRequestMethod("EquipClassCodeCreate");
  /** Variable representing the EquipClassCodeDelete method */
  public static final EquipClassCodeRequestMethod EQUIP_CLASS_CODE_DELETE = new EquipClassCodeRequestMethod("EquipClassCodeDelete");
  /** Variable representing the EquipClassCodeFind method */
  public static final EquipClassCodeRequestMethod EQUIP_CLASS_CODE_FIND = new EquipClassCodeRequestMethod("EquipClassCodeFind");
  /** Variable representing the EquipClassCodeGet method */
  public static final EquipClassCodeRequestMethod EQUIP_CLASS_CODE_GET = new EquipClassCodeRequestMethod("EquipClassCodeGet");
  /** Variable representing the EquipClassCodeUpdate method */
  public static final EquipClassCodeRequestMethod EQUIP_CLASS_CODE_UPDATE = new EquipClassCodeRequestMethod("EquipClassCodeUpdate");
}
