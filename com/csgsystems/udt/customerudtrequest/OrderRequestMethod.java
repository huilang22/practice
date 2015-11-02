/*
 * Generated code DO NOT EDIT
 * Generated file: OrderRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderRequestMethod implements UdtMethod {
  private String method = null;
  private OrderRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderCancel method */
  public static final OrderRequestMethod ORDER_CANCEL = new OrderRequestMethod("OrderCancel");
  /** Variable representing the OrderCommit method */
  public static final OrderRequestMethod ORDER_COMMIT = new OrderRequestMethod("OrderCommit");
  /** Variable representing the OrderCreate method */
  public static final OrderRequestMethod ORDER_CREATE = new OrderRequestMethod("OrderCreate");
  /** Variable representing the OrderExtendedDataFind method */
  public static final OrderRequestMethod ORDER_EXTENDED_DATA_FIND = new OrderRequestMethod("OrderExtendedDataFind");
  /** Variable representing the OrderFind method */
  public static final OrderRequestMethod ORDER_FIND = new OrderRequestMethod("OrderFind");
  /** Variable representing the OrderFindWithExtendedData method */
  public static final OrderRequestMethod ORDER_FIND_WITH_EXTENDED_DATA = new OrderRequestMethod("OrderFindWithExtendedData");
  /** Variable representing the OrderGet method */
  public static final OrderRequestMethod ORDER_GET = new OrderRequestMethod("OrderGet");
  /** Variable representing the OrderGetDetail method */
  public static final OrderRequestMethod ORDER_GET_DETAIL = new OrderRequestMethod("OrderGetDetail");
  /** Variable representing the OrderLock method */
  public static final OrderRequestMethod ORDER_LOCK = new OrderRequestMethod("OrderLock");
  /** Variable representing the OrderPriceQuote method */
  public static final OrderRequestMethod ORDER_PRICE_QUOTE = new OrderRequestMethod("OrderPriceQuote");
  /** Variable representing the OrderUnlock method */
  public static final OrderRequestMethod ORDER_UNLOCK = new OrderRequestMethod("OrderUnlock");
  /** Variable representing the OrderUpdate method */
  public static final OrderRequestMethod ORDER_UPDATE = new OrderRequestMethod("OrderUpdate");
}
