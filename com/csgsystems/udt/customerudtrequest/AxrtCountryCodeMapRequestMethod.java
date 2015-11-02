/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtCountryCodeMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AxrtCountryCodeMapRequestMethod implements UdtMethod {
  private String method = null;
  private AxrtCountryCodeMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AxrtCountryCodeMapGet method */
  public static final AxrtCountryCodeMapRequestMethod AXRT_COUNTRY_CODE_MAP_GET = new AxrtCountryCodeMapRequestMethod("AxrtCountryCodeMapGet");
}
