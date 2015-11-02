/*
 * Generated code DO NOT EDIT
 * Generated file: SvcInventoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SvcInventoryRequestMethod implements UdtMethod {
  private String method = null;
  private SvcInventoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SvcInvElementFind method */
  public static final SvcInventoryRequestMethod SVC_INV_ELEMENT_FIND = new SvcInventoryRequestMethod("SvcInvElementFind");
}
