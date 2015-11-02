/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseContactsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ClearingHouseContactsRequestMethod implements UdtMethod {
  private String method = null;
  private ClearingHouseContactsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ClearingHouseContactsFind method */
  public static final ClearingHouseContactsRequestMethod CLEARING_HOUSE_CONTACTS_FIND = new ClearingHouseContactsRequestMethod("ClearingHouseContactsFind");
  /** Variable representing the ClearingHouseContactsFindCount method */
  public static final ClearingHouseContactsRequestMethod CLEARING_HOUSE_CONTACTS_FIND_COUNT = new ClearingHouseContactsRequestMethod("ClearingHouseContactsFindCount");
}
