/*
 * Generated code DO NOT EDIT
 * Generated file: BillModeOverrideRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BillModeOverrideRequestMethod implements UdtMethod {
  private String method = null;
  private BillModeOverrideRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BillModeOverrideCreate method */
  public static final BillModeOverrideRequestMethod BILL_MODE_OVERRIDE_CREATE = new BillModeOverrideRequestMethod("BillModeOverrideCreate");
  /** Variable representing the BillModeOverrideDelete method */
  public static final BillModeOverrideRequestMethod BILL_MODE_OVERRIDE_DELETE = new BillModeOverrideRequestMethod("BillModeOverrideDelete");
  /** Variable representing the BillModeOverrideFind method */
  public static final BillModeOverrideRequestMethod BILL_MODE_OVERRIDE_FIND = new BillModeOverrideRequestMethod("BillModeOverrideFind");
  /** Variable representing the BillModeOverrideGet method */
  public static final BillModeOverrideRequestMethod BILL_MODE_OVERRIDE_GET = new BillModeOverrideRequestMethod("BillModeOverrideGet");
  /** Variable representing the BillModeOverrideUpdate method */
  public static final BillModeOverrideRequestMethod BILL_MODE_OVERRIDE_UPDATE = new BillModeOverrideRequestMethod("BillModeOverrideUpdate");
}
