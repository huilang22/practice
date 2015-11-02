/*
 * Generated code DO NOT EDIT
 * Generated file: InvsCountryCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsCountryCodeRequestMethod implements UdtMethod {
  private String method = null;
  private InvsCountryCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsCountryCodeFind method */
  public static final InvsCountryCodeRequestMethod INVS_COUNTRY_CODE_FIND = new InvsCountryCodeRequestMethod("InvsCountryCodeFind");
  /** Variable representing the InvsCountryCodeGet method */
  public static final InvsCountryCodeRequestMethod INVS_COUNTRY_CODE_GET = new InvsCountryCodeRequestMethod("InvsCountryCodeGet");
}
