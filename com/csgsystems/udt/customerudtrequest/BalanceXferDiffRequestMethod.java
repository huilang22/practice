/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceXferDiffRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BalanceXferDiffRequestMethod implements UdtMethod {
  private String method = null;
  private BalanceXferDiffRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BalanceXferDiffCreate method */
  public static final BalanceXferDiffRequestMethod BALANCE_XFER_DIFF_CREATE = new BalanceXferDiffRequestMethod("BalanceXferDiffCreate");
  /** Variable representing the BalanceXferDiffDelete method */
  public static final BalanceXferDiffRequestMethod BALANCE_XFER_DIFF_DELETE = new BalanceXferDiffRequestMethod("BalanceXferDiffDelete");
  /** Variable representing the BalanceXferDiffFind method */
  public static final BalanceXferDiffRequestMethod BALANCE_XFER_DIFF_FIND = new BalanceXferDiffRequestMethod("BalanceXferDiffFind");
  /** Variable representing the BalanceXferDiffGet method */
  public static final BalanceXferDiffRequestMethod BALANCE_XFER_DIFF_GET = new BalanceXferDiffRequestMethod("BalanceXferDiffGet");
  /** Variable representing the BalanceXferDiffUpdate method */
  public static final BalanceXferDiffRequestMethod BALANCE_XFER_DIFF_UPDATE = new BalanceXferDiffRequestMethod("BalanceXferDiffUpdate");
}
