/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceLineItemRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BalanceLineItemRequestMethod implements UdtMethod {
  private String method = null;
  private BalanceLineItemRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BalanceLineItemAmountGet method */
  public static final BalanceLineItemRequestMethod BALANCE_LINE_ITEM_AMOUNT_GET = new BalanceLineItemRequestMethod("BalanceLineItemAmountGet");
  /** Variable representing the BalanceLineItemByAccountCount method */
  public static final BalanceLineItemRequestMethod BALANCE_LINE_ITEM_BY_ACCOUNT_COUNT = new BalanceLineItemRequestMethod("BalanceLineItemByAccountCount");
  /** Variable representing the BalanceLineItemByAccountFind method */
  public static final BalanceLineItemRequestMethod BALANCE_LINE_ITEM_BY_ACCOUNT_FIND = new BalanceLineItemRequestMethod("BalanceLineItemByAccountFind");
  /** Variable representing the BalanceLineItemFind method */
  public static final BalanceLineItemRequestMethod BALANCE_LINE_ITEM_FIND = new BalanceLineItemRequestMethod("BalanceLineItemFind");
  /** Variable representing the BalanceLineItemFindCount method */
  public static final BalanceLineItemRequestMethod BALANCE_LINE_ITEM_FIND_COUNT = new BalanceLineItemRequestMethod("BalanceLineItemFindCount");
  /** Variable representing the BalanceLineItemGet method */
  public static final BalanceLineItemRequestMethod BALANCE_LINE_ITEM_GET = new BalanceLineItemRequestMethod("BalanceLineItemGet");
}
