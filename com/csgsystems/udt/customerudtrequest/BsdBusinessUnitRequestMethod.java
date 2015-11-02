/*
 * Generated code DO NOT EDIT
 * Generated file: BsdBusinessUnitRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdBusinessUnitRequestMethod implements UdtMethod {
  private String method = null;
  private BsdBusinessUnitRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdBusinessUnitCreate method */
  public static final BsdBusinessUnitRequestMethod BSD_BUSINESS_UNIT_CREATE = new BsdBusinessUnitRequestMethod("BsdBusinessUnitCreate");
  /** Variable representing the BsdBusinessUnitDelete method */
  public static final BsdBusinessUnitRequestMethod BSD_BUSINESS_UNIT_DELETE = new BsdBusinessUnitRequestMethod("BsdBusinessUnitDelete");
  /** Variable representing the BsdBusinessUnitDeleteAll method */
  public static final BsdBusinessUnitRequestMethod BSD_BUSINESS_UNIT_DELETE_ALL = new BsdBusinessUnitRequestMethod("BsdBusinessUnitDeleteAll");
  /** Variable representing the BsdBusinessUnitFind method */
  public static final BsdBusinessUnitRequestMethod BSD_BUSINESS_UNIT_FIND = new BsdBusinessUnitRequestMethod("BsdBusinessUnitFind");
  /** Variable representing the BsdBusinessUnitGet method */
  public static final BsdBusinessUnitRequestMethod BSD_BUSINESS_UNIT_GET = new BsdBusinessUnitRequestMethod("BsdBusinessUnitGet");
  /** Variable representing the BsdBusinessUnitSequenceGet method */
  public static final BsdBusinessUnitRequestMethod BSD_BUSINESS_UNIT_SEQUENCE_GET = new BsdBusinessUnitRequestMethod("BsdBusinessUnitSequenceGet");
  /** Variable representing the BsdBusinessUnitUpdate method */
  public static final BsdBusinessUnitRequestMethod BSD_BUSINESS_UNIT_UPDATE = new BsdBusinessUnitRequestMethod("BsdBusinessUnitUpdate");
}
