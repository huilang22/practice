/*
 * Generated code DO NOT EDIT
 * Generated file: SvcAddrServiceabilityRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SvcAddrServiceabilityRequestMethod implements UdtMethod {
  private String method = null;
  private SvcAddrServiceabilityRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceAddressComponentServiceabilityValidate method */
  public static final SvcAddrServiceabilityRequestMethod SERVICE_ADDRESS_COMPONENT_SERVICEABILITY_VALIDATE = new SvcAddrServiceabilityRequestMethod("ServiceAddressComponentServiceabilityValidate");
  /** Variable representing the ServiceAddressProductServiceabilityValidate method */
  public static final SvcAddrServiceabilityRequestMethod SERVICE_ADDRESS_PRODUCT_SERVICEABILITY_VALIDATE = new SvcAddrServiceabilityRequestMethod("ServiceAddressProductServiceabilityValidate");
  /** Variable representing the ServiceAddressServiceServiceabilityValidate method */
  public static final SvcAddrServiceabilityRequestMethod SERVICE_ADDRESS_SERVICE_SERVICEABILITY_VALIDATE = new SvcAddrServiceabilityRequestMethod("ServiceAddressServiceServiceabilityValidate");
  /** Variable representing the ServiceAddressServiceabilityValidate method */
  public static final SvcAddrServiceabilityRequestMethod SERVICE_ADDRESS_SERVICEABILITY_VALIDATE = new SvcAddrServiceabilityRequestMethod("ServiceAddressServiceabilityValidate");
}
