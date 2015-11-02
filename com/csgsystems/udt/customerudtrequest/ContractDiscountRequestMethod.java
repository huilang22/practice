/*
 * Generated code DO NOT EDIT
 * Generated file: ContractDiscountRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ContractDiscountRequestMethod implements UdtMethod {
  private String method = null;
  private ContractDiscountRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ContractDiscountFind method */
  public static final ContractDiscountRequestMethod CONTRACT_DISCOUNT_FIND = new ContractDiscountRequestMethod("ContractDiscountFind");
  /** Variable representing the ContractDiscountGet method */
  public static final ContractDiscountRequestMethod CONTRACT_DISCOUNT_GET = new ContractDiscountRequestMethod("ContractDiscountGet");
}
