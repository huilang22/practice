/*
 * Generated code DO NOT EDIT
 * Generated file: EftTransactionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EftTransactionRequestMethod implements UdtMethod {
  private String method = null;
  private EftTransactionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EftTransactionFind method */
  public static final EftTransactionRequestMethod EFT_TRANSACTION_FIND = new EftTransactionRequestMethod("EftTransactionFind");
  /** Variable representing the EftTransactionGet method */
  public static final EftTransactionRequestMethod EFT_TRANSACTION_GET = new EftTransactionRequestMethod("EftTransactionGet");
  /** Variable representing the EftTransactionHold method */
  public static final EftTransactionRequestMethod EFT_TRANSACTION_HOLD = new EftTransactionRequestMethod("EftTransactionHold");
  /** Variable representing the EftTransactionRelease method */
  public static final EftTransactionRequestMethod EFT_TRANSACTION_RELEASE = new EftTransactionRequestMethod("EftTransactionRelease");
  /** Variable representing the EftTransactionUpdate method */
  public static final EftTransactionRequestMethod EFT_TRANSACTION_UPDATE = new EftTransactionRequestMethod("EftTransactionUpdate");
  /** Variable representing the EftTransactionUpdateFromAccount method */
  public static final EftTransactionRequestMethod EFT_TRANSACTION_UPDATE_FROM_ACCOUNT = new EftTransactionRequestMethod("EftTransactionUpdateFromAccount");
}
