/*
 * Generated code DO NOT EDIT
 * Generated file: DepositRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DepositRequestMethod implements UdtMethod {
  private String method = null;
  private DepositRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DepositCreate method */
  public static final DepositRequestMethod DEPOSIT_CREATE = new DepositRequestMethod("DepositCreate");
  /** Variable representing the DepositFind method */
  public static final DepositRequestMethod DEPOSIT_FIND = new DepositRequestMethod("DepositFind");
  /** Variable representing the DepositGet method */
  public static final DepositRequestMethod DEPOSIT_GET = new DepositRequestMethod("DepositGet");
  /** Variable representing the DepositReturn method */
  public static final DepositRequestMethod DEPOSIT_RETURN = new DepositRequestMethod("DepositReturn");
}
