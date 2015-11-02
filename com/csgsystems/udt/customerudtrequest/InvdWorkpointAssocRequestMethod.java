/*
 * Generated code DO NOT EDIT
 * Generated file: InvdWorkpointAssocRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvdWorkpointAssocRequestMethod implements UdtMethod {
  private String method = null;
  private InvdWorkpointAssocRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvdWorkpointAssocCreate method */
  public static final InvdWorkpointAssocRequestMethod INVD_WORKPOINT_ASSOC_CREATE = new InvdWorkpointAssocRequestMethod("InvdWorkpointAssocCreate");
  /** Variable representing the InvdWorkpointAssocFind method */
  public static final InvdWorkpointAssocRequestMethod INVD_WORKPOINT_ASSOC_FIND = new InvdWorkpointAssocRequestMethod("InvdWorkpointAssocFind");
  /** Variable representing the InvdWorkpointAssocGet method */
  public static final InvdWorkpointAssocRequestMethod INVD_WORKPOINT_ASSOC_GET = new InvdWorkpointAssocRequestMethod("InvdWorkpointAssocGet");
  /** Variable representing the InvdWorkpointAssocUpdate method */
  public static final InvdWorkpointAssocRequestMethod INVD_WORKPOINT_ASSOC_UPDATE = new InvdWorkpointAssocRequestMethod("InvdWorkpointAssocUpdate");
}
