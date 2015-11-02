/*
 * Generated code DO NOT EDIT
 * Generated file: DepositTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DepositTypeRequestMethod implements UdtMethod {
  private String method = null;
  private DepositTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DepositTypeCreate method */
  public static final DepositTypeRequestMethod DEPOSIT_TYPE_CREATE = new DepositTypeRequestMethod("DepositTypeCreate");
  /** Variable representing the DepositTypeDelete method */
  public static final DepositTypeRequestMethod DEPOSIT_TYPE_DELETE = new DepositTypeRequestMethod("DepositTypeDelete");
  /** Variable representing the DepositTypeFind method */
  public static final DepositTypeRequestMethod DEPOSIT_TYPE_FIND = new DepositTypeRequestMethod("DepositTypeFind");
  /** Variable representing the DepositTypeGet method */
  public static final DepositTypeRequestMethod DEPOSIT_TYPE_GET = new DepositTypeRequestMethod("DepositTypeGet");
  /** Variable representing the DepositTypeUpdate method */
  public static final DepositTypeRequestMethod DEPOSIT_TYPE_UPDATE = new DepositTypeRequestMethod("DepositTypeUpdate");
}
