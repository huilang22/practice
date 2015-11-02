/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorRefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsVendorRefRequestMethod implements UdtMethod {
  private String method = null;
  private InvsVendorRefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsVendorRefCreate method */
  public static final InvsVendorRefRequestMethod INVS_VENDOR_REF_CREATE = new InvsVendorRefRequestMethod("InvsVendorRefCreate");
  /** Variable representing the InvsVendorRefFind method */
  public static final InvsVendorRefRequestMethod INVS_VENDOR_REF_FIND = new InvsVendorRefRequestMethod("InvsVendorRefFind");
  /** Variable representing the InvsVendorRefGet method */
  public static final InvsVendorRefRequestMethod INVS_VENDOR_REF_GET = new InvsVendorRefRequestMethod("InvsVendorRefGet");
  /** Variable representing the InvsVendorRefUpdate method */
  public static final InvsVendorRefRequestMethod INVS_VENDOR_REF_UPDATE = new InvsVendorRefRequestMethod("InvsVendorRefUpdate");
}
