/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CustomerIdEquipMapRequestMethod implements UdtMethod {
  private String method = null;
  private CustomerIdEquipMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CustomerIdEquipMapCreate method */
  public static final CustomerIdEquipMapRequestMethod CUSTOMER_ID_EQUIP_MAP_CREATE = new CustomerIdEquipMapRequestMethod("CustomerIdEquipMapCreate");
  /** Variable representing the CustomerIdEquipMapDefaultCreate method */
  public static final CustomerIdEquipMapRequestMethod CUSTOMER_ID_EQUIP_MAP_DEFAULT_CREATE = new CustomerIdEquipMapRequestMethod("CustomerIdEquipMapDefaultCreate");
  /** Variable representing the CustomerIdEquipMapDelete method */
  public static final CustomerIdEquipMapRequestMethod CUSTOMER_ID_EQUIP_MAP_DELETE = new CustomerIdEquipMapRequestMethod("CustomerIdEquipMapDelete");
  /** Variable representing the CustomerIdEquipMapDeleteList method */
  public static final CustomerIdEquipMapRequestMethod CUSTOMER_ID_EQUIP_MAP_DELETE_LIST = new CustomerIdEquipMapRequestMethod("CustomerIdEquipMapDeleteList");
  /** Variable representing the CustomerIdEquipMapDisconnectValidate method */
  public static final CustomerIdEquipMapRequestMethod CUSTOMER_ID_EQUIP_MAP_DISCONNECT_VALIDATE = new CustomerIdEquipMapRequestMethod("CustomerIdEquipMapDisconnectValidate");
  /** Variable representing the CustomerIdEquipMapFind method */
  public static final CustomerIdEquipMapRequestMethod CUSTOMER_ID_EQUIP_MAP_FIND = new CustomerIdEquipMapRequestMethod("CustomerIdEquipMapFind");
  /** Variable representing the CustomerIdEquipMapFindPending method */
  public static final CustomerIdEquipMapRequestMethod CUSTOMER_ID_EQUIP_MAP_FIND_PENDING = new CustomerIdEquipMapRequestMethod("CustomerIdEquipMapFindPending");
  /** Variable representing the CustomerIdEquipMapGet method */
  public static final CustomerIdEquipMapRequestMethod CUSTOMER_ID_EQUIP_MAP_GET = new CustomerIdEquipMapRequestMethod("CustomerIdEquipMapGet");
  /** Variable representing the CustomerIdEquipMapIsUnique method */
  public static final CustomerIdEquipMapRequestMethod CUSTOMER_ID_EQUIP_MAP_IS_UNIQUE = new CustomerIdEquipMapRequestMethod("CustomerIdEquipMapIsUnique");
  /** Variable representing the CustomerIdEquipMapUpdate method */
  public static final CustomerIdEquipMapRequestMethod CUSTOMER_ID_EQUIP_MAP_UPDATE = new CustomerIdEquipMapRequestMethod("CustomerIdEquipMapUpdate");
  /** Variable representing the CustomerIdEquipMapUpdateValidate method */
  public static final CustomerIdEquipMapRequestMethod CUSTOMER_ID_EQUIP_MAP_UPDATE_VALIDATE = new CustomerIdEquipMapRequestMethod("CustomerIdEquipMapUpdateValidate");
}
