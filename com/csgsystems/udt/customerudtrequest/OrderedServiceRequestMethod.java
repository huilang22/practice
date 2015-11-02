/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedServiceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedServiceRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedServiceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedServiceCreate method */
  public static final OrderedServiceRequestMethod ORDERED_SERVICE_CREATE = new OrderedServiceRequestMethod("OrderedServiceCreate");
  /** Variable representing the OrderedServiceDisconnect method */
  public static final OrderedServiceRequestMethod ORDERED_SERVICE_DISCONNECT = new OrderedServiceRequestMethod("OrderedServiceDisconnect");
  /** Variable representing the OrderedServiceMove method */
  public static final OrderedServiceRequestMethod ORDERED_SERVICE_MOVE = new OrderedServiceRequestMethod("OrderedServiceMove");
  /** Variable representing the OrderedServiceResume method */
  public static final OrderedServiceRequestMethod ORDERED_SERVICE_RESUME = new OrderedServiceRequestMethod("OrderedServiceResume");
  /** Variable representing the OrderedServiceSuspend method */
  public static final OrderedServiceRequestMethod ORDERED_SERVICE_SUSPEND = new OrderedServiceRequestMethod("OrderedServiceSuspend");
  /** Variable representing the OrderedServiceTransfer method */
  public static final OrderedServiceRequestMethod ORDERED_SERVICE_TRANSFER = new OrderedServiceRequestMethod("OrderedServiceTransfer");
  /** Variable representing the OrderedServiceUpdate method */
  public static final OrderedServiceRequestMethod ORDERED_SERVICE_UPDATE = new OrderedServiceRequestMethod("OrderedServiceUpdate");
}
