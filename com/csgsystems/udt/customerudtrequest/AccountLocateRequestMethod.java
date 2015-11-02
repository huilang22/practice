/*
 * Generated code DO NOT EDIT
 * Generated file: AccountLocateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountLocateRequestMethod implements UdtMethod {
  private String method = null;
  private AccountLocateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountLocateFind method */
  public static final AccountLocateRequestMethod ACCOUNT_LOCATE_FIND = new AccountLocateRequestMethod("AccountLocateFind");
  /** Variable representing the AccountLocateFindByAccountExtendeddata method */
  public static final AccountLocateRequestMethod ACCOUNT_LOCATE_FIND_BY_ACCOUNT_EXTENDEDDATA = new AccountLocateRequestMethod("AccountLocateFindByAccountExtendeddata");
  /** Variable representing the AccountLocateFindByAddressId method */
  public static final AccountLocateRequestMethod ACCOUNT_LOCATE_FIND_BY_ADDRESS_ID = new AccountLocateRequestMethod("AccountLocateFindByAddressId");
  /** Variable representing the AccountLocateFindByOrderNumber method */
  public static final AccountLocateRequestMethod ACCOUNT_LOCATE_FIND_BY_ORDER_NUMBER = new AccountLocateRequestMethod("AccountLocateFindByOrderNumber");
  /** Variable representing the AccountLocateFindByServiceExtendeddata method */
  public static final AccountLocateRequestMethod ACCOUNT_LOCATE_FIND_BY_SERVICE_EXTENDEDDATA = new AccountLocateRequestMethod("AccountLocateFindByServiceExtendeddata");
  /** Variable representing the AccountLocateFindByServiceId method */
  public static final AccountLocateRequestMethod ACCOUNT_LOCATE_FIND_BY_SERVICE_ID = new AccountLocateRequestMethod("AccountLocateFindByServiceId");
  /** Variable representing the AccountLocateGet method */
  public static final AccountLocateRequestMethod ACCOUNT_LOCATE_GET = new AccountLocateRequestMethod("AccountLocateGet");
  /** Variable representing the AccountLocateListByServiceId method */
  public static final AccountLocateRequestMethod ACCOUNT_LOCATE_LIST_BY_SERVICE_ID = new AccountLocateRequestMethod("AccountLocateListByServiceId");
}
