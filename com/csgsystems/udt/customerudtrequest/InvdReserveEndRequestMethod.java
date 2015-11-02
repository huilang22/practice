/*
 * Generated code DO NOT EDIT
 * Generated file: InvdReserveEndRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvdReserveEndRequestMethod implements UdtMethod {
  private String method = null;
  private InvdReserveEndRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvReserveHandlingSP method */
  public static final InvdReserveEndRequestMethod INV_RESERVE_HANDLING_S_P = new InvdReserveEndRequestMethod("InvReserveHandlingSP");
  /** Variable representing the InvdReserveEndCreate method */
  public static final InvdReserveEndRequestMethod INVD_RESERVE_END_CREATE = new InvdReserveEndRequestMethod("InvdReserveEndCreate");
  /** Variable representing the InvdReserveEndDelete method */
  public static final InvdReserveEndRequestMethod INVD_RESERVE_END_DELETE = new InvdReserveEndRequestMethod("InvdReserveEndDelete");
  /** Variable representing the InvdReserveEndFind method */
  public static final InvdReserveEndRequestMethod INVD_RESERVE_END_FIND = new InvdReserveEndRequestMethod("InvdReserveEndFind");
  /** Variable representing the InvdReserveEndGet method */
  public static final InvdReserveEndRequestMethod INVD_RESERVE_END_GET = new InvdReserveEndRequestMethod("InvdReserveEndGet");
  /** Variable representing the InvdReserveEndUpdate method */
  public static final InvdReserveEndRequestMethod INVD_RESERVE_END_UPDATE = new InvdReserveEndRequestMethod("InvdReserveEndUpdate");
}
