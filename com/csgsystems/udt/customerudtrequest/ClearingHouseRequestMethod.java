/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ClearingHouseRequestMethod implements UdtMethod {
  private String method = null;
  private ClearingHouseRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ClearingHouseCreate method */
  public static final ClearingHouseRequestMethod CLEARING_HOUSE_CREATE = new ClearingHouseRequestMethod("ClearingHouseCreate");
  /** Variable representing the ClearingHouseDelete method */
  public static final ClearingHouseRequestMethod CLEARING_HOUSE_DELETE = new ClearingHouseRequestMethod("ClearingHouseDelete");
  /** Variable representing the ClearingHouseFind method */
  public static final ClearingHouseRequestMethod CLEARING_HOUSE_FIND = new ClearingHouseRequestMethod("ClearingHouseFind");
  /** Variable representing the ClearingHouseGet method */
  public static final ClearingHouseRequestMethod CLEARING_HOUSE_GET = new ClearingHouseRequestMethod("ClearingHouseGet");
  /** Variable representing the ClearingHouseUpdate method */
  public static final ClearingHouseRequestMethod CLEARING_HOUSE_UPDATE = new ClearingHouseRequestMethod("ClearingHouseUpdate");
}
