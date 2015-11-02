/*
 * Generated code DO NOT EDIT
 * Generated file: TransferReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TransferReasonRequestMethod implements UdtMethod {
  private String method = null;
  private TransferReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TransferReasonCreate method */
  public static final TransferReasonRequestMethod TRANSFER_REASON_CREATE = new TransferReasonRequestMethod("TransferReasonCreate");
  /** Variable representing the TransferReasonDelete method */
  public static final TransferReasonRequestMethod TRANSFER_REASON_DELETE = new TransferReasonRequestMethod("TransferReasonDelete");
  /** Variable representing the TransferReasonFind method */
  public static final TransferReasonRequestMethod TRANSFER_REASON_FIND = new TransferReasonRequestMethod("TransferReasonFind");
  /** Variable representing the TransferReasonGet method */
  public static final TransferReasonRequestMethod TRANSFER_REASON_GET = new TransferReasonRequestMethod("TransferReasonGet");
  /** Variable representing the TransferReasonUpdate method */
  public static final TransferReasonRequestMethod TRANSFER_REASON_UPDATE = new TransferReasonRequestMethod("TransferReasonUpdate");
}
