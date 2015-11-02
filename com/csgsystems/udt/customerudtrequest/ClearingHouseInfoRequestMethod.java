/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseInfoRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ClearingHouseInfoRequestMethod implements UdtMethod {
  private String method = null;
  private ClearingHouseInfoRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ClearingHouseInfoFind method */
  public static final ClearingHouseInfoRequestMethod CLEARING_HOUSE_INFO_FIND = new ClearingHouseInfoRequestMethod("ClearingHouseInfoFind");
  /** Variable representing the ClearingHouseInfoGet method */
  public static final ClearingHouseInfoRequestMethod CLEARING_HOUSE_INFO_GET = new ClearingHouseInfoRequestMethod("ClearingHouseInfoGet");
}
