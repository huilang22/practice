/*
 * Generated code DO NOT EDIT
 * Generated file: SvcAddrInvServiceabilityRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SvcAddrInvServiceabilityRequestMethod implements UdtMethod {
  private String method = null;
  private SvcAddrInvServiceabilityRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceAddressInventoryServiceabilityValidate method */
  public static final SvcAddrInvServiceabilityRequestMethod SERVICE_ADDRESS_INVENTORY_SERVICEABILITY_VALIDATE = new SvcAddrInvServiceabilityRequestMethod("ServiceAddressInventoryServiceabilityValidate");
}
