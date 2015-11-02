/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsVendorRequestMethod implements UdtMethod {
  private String method = null;
  private InvsVendorRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsVendorCreate method */
  public static final InvsVendorRequestMethod INVS_VENDOR_CREATE = new InvsVendorRequestMethod("InvsVendorCreate");
  /** Variable representing the InvsVendorFind method */
  public static final InvsVendorRequestMethod INVS_VENDOR_FIND = new InvsVendorRequestMethod("InvsVendorFind");
  /** Variable representing the InvsVendorGet method */
  public static final InvsVendorRequestMethod INVS_VENDOR_GET = new InvsVendorRequestMethod("InvsVendorGet");
  /** Variable representing the InvsVendorUpdate method */
  public static final InvsVendorRequestMethod INVS_VENDOR_UPDATE = new InvsVendorRequestMethod("InvsVendorUpdate");
}
