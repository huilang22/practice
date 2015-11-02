/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvdMainRequestMethod implements UdtMethod {
  private String method = null;
  private InvdMainRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvdMainCreate method */
  public static final InvdMainRequestMethod INVD_MAIN_CREATE = new InvdMainRequestMethod("InvdMainCreate");
  /** Variable representing the InvdMainExtendedDataFind method */
  public static final InvdMainRequestMethod INVD_MAIN_EXTENDED_DATA_FIND = new InvdMainRequestMethod("InvdMainExtendedDataFind");
  /** Variable representing the InvdMainFind method */
  public static final InvdMainRequestMethod INVD_MAIN_FIND = new InvdMainRequestMethod("InvdMainFind");
  /** Variable representing the InvdMainGet method */
  public static final InvdMainRequestMethod INVD_MAIN_GET = new InvdMainRequestMethod("InvdMainGet");
  /** Variable representing the InvdMainGetCount method */
  public static final InvdMainRequestMethod INVD_MAIN_GET_COUNT = new InvdMainRequestMethod("InvdMainGetCount");
  /** Variable representing the InvdMainUpdate method */
  public static final InvdMainRequestMethod INVD_MAIN_UPDATE = new InvdMainRequestMethod("InvdMainUpdate");
}
