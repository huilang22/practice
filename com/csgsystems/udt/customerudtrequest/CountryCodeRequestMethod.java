/*
 * Generated code DO NOT EDIT
 * Generated file: CountryCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CountryCodeRequestMethod implements UdtMethod {
  private String method = null;
  private CountryCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CountryCodeCreate method */
  public static final CountryCodeRequestMethod COUNTRY_CODE_CREATE = new CountryCodeRequestMethod("CountryCodeCreate");
  /** Variable representing the CountryCodeDelete method */
  public static final CountryCodeRequestMethod COUNTRY_CODE_DELETE = new CountryCodeRequestMethod("CountryCodeDelete");
  /** Variable representing the CountryCodeFind method */
  public static final CountryCodeRequestMethod COUNTRY_CODE_FIND = new CountryCodeRequestMethod("CountryCodeFind");
  /** Variable representing the CountryCodeGet method */
  public static final CountryCodeRequestMethod COUNTRY_CODE_GET = new CountryCodeRequestMethod("CountryCodeGet");
  /** Variable representing the CountryCodeUpdate method */
  public static final CountryCodeRequestMethod COUNTRY_CODE_UPDATE = new CountryCodeRequestMethod("CountryCodeUpdate");
}
