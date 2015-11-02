/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedContractRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OrderedContractRequestMethod implements UdtMethod {
  private String method = null;
  private OrderedContractRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OrderedContractCreate method */
  public static final OrderedContractRequestMethod ORDERED_CONTRACT_CREATE = new OrderedContractRequestMethod("OrderedContractCreate");
  /** Variable representing the OrderedContractDisconnect method */
  public static final OrderedContractRequestMethod ORDERED_CONTRACT_DISCONNECT = new OrderedContractRequestMethod("OrderedContractDisconnect");
  /** Variable representing the OrderedContractUpdate method */
  public static final OrderedContractRequestMethod ORDERED_CONTRACT_UPDATE = new OrderedContractRequestMethod("OrderedContractUpdate");
}
