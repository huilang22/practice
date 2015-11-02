/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvElementRequestMethod implements UdtMethod {
  private String method = null;
  private InvElementRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvElementAssign method */
  public static final InvElementRequestMethod INV_ELEMENT_ASSIGN = new InvElementRequestMethod("InvElementAssign");
  /** Variable representing the InvElementAuto method */
  public static final InvElementRequestMethod INV_ELEMENT_AUTO = new InvElementRequestMethod("InvElementAuto");
  /** Variable representing the InvElementAutoAssign method */
  public static final InvElementRequestMethod INV_ELEMENT_AUTO_ASSIGN = new InvElementRequestMethod("InvElementAutoAssign");
  /** Variable representing the InvElementAutoCont method */
  public static final InvElementRequestMethod INV_ELEMENT_AUTO_CONT = new InvElementRequestMethod("InvElementAutoCont");
  /** Variable representing the InvElementAutoReserve method */
  public static final InvElementRequestMethod INV_ELEMENT_AUTO_RESERVE = new InvElementRequestMethod("InvElementAutoReserve");
  /** Variable representing the InvElementBulkCreate method */
  public static final InvElementRequestMethod INV_ELEMENT_BULK_CREATE = new InvElementRequestMethod("InvElementBulkCreate");
  /** Variable representing the InvElementBulkFind method */
  public static final InvElementRequestMethod INV_ELEMENT_BULK_FIND = new InvElementRequestMethod("InvElementBulkFind");
  /** Variable representing the InvElementCreate method */
  public static final InvElementRequestMethod INV_ELEMENT_CREATE = new InvElementRequestMethod("InvElementCreate");
  /** Variable representing the InvElementExecuteAction method */
  public static final InvElementRequestMethod INV_ELEMENT_EXECUTE_ACTION = new InvElementRequestMethod("InvElementExecuteAction");
  /** Variable representing the InvElementExtendedDataFind method */
  public static final InvElementRequestMethod INV_ELEMENT_EXTENDED_DATA_FIND = new InvElementRequestMethod("InvElementExtendedDataFind");
  /** Variable representing the InvElementFind method */
  public static final InvElementRequestMethod INV_ELEMENT_FIND = new InvElementRequestMethod("InvElementFind");
  /** Variable representing the InvElementFindByServiceOrder method */
  public static final InvElementRequestMethod INV_ELEMENT_FIND_BY_SERVICE_ORDER = new InvElementRequestMethod("InvElementFindByServiceOrder");
  /** Variable representing the InvElementFindPendingExtendedData method */
  public static final InvElementRequestMethod INV_ELEMENT_FIND_PENDING_EXTENDED_DATA = new InvElementRequestMethod("InvElementFindPendingExtendedData");
  /** Variable representing the InvElementFindWithExtendedData method */
  public static final InvElementRequestMethod INV_ELEMENT_FIND_WITH_EXTENDED_DATA = new InvElementRequestMethod("InvElementFindWithExtendedData");
  /** Variable representing the InvElementGet method */
  public static final InvElementRequestMethod INV_ELEMENT_GET = new InvElementRequestMethod("InvElementGet");
  /** Variable representing the InvElementReserve method */
  public static final InvElementRequestMethod INV_ELEMENT_RESERVE = new InvElementRequestMethod("InvElementReserve");
  /** Variable representing the InvElementReturn method */
  public static final InvElementRequestMethod INV_ELEMENT_RETURN = new InvElementRequestMethod("InvElementReturn");
  /** Variable representing the InvElementSwap method */
  public static final InvElementRequestMethod INV_ELEMENT_SWAP = new InvElementRequestMethod("InvElementSwap");
  /** Variable representing the InvElementTransfer method */
  public static final InvElementRequestMethod INV_ELEMENT_TRANSFER = new InvElementRequestMethod("InvElementTransfer");
  /** Variable representing the InvElementTransferReserve method */
  public static final InvElementRequestMethod INV_ELEMENT_TRANSFER_RESERVE = new InvElementRequestMethod("InvElementTransferReserve");
  /** Variable representing the InvElementTxnUpdate method */
  public static final InvElementRequestMethod INV_ELEMENT_TXN_UPDATE = new InvElementRequestMethod("InvElementTxnUpdate");
  /** Variable representing the InvElementUnAssign method */
  public static final InvElementRequestMethod INV_ELEMENT_UN_ASSIGN = new InvElementRequestMethod("InvElementUnAssign");
  /** Variable representing the InvElementUnReserve method */
  public static final InvElementRequestMethod INV_ELEMENT_UN_RESERVE = new InvElementRequestMethod("InvElementUnReserve");
  /** Variable representing the InvElementUpdate method */
  public static final InvElementRequestMethod INV_ELEMENT_UPDATE = new InvElementRequestMethod("InvElementUpdate");
  /** Variable representing the InvElementViewCancel method */
  public static final InvElementRequestMethod INV_ELEMENT_VIEW_CANCEL = new InvElementRequestMethod("InvElementViewCancel");
  /** Variable representing the InvElementViewComplete method */
  public static final InvElementRequestMethod INV_ELEMENT_VIEW_COMPLETE = new InvElementRequestMethod("InvElementViewComplete");
  /** Variable representing the InvElementViewUpdate method */
  public static final InvElementRequestMethod INV_ELEMENT_VIEW_UPDATE = new InvElementRequestMethod("InvElementViewUpdate");
  /** Variable representing the InvElementViewUpdateCheck method */
  public static final InvElementRequestMethod INV_ELEMENT_VIEW_UPDATE_CHECK = new InvElementRequestMethod("InvElementViewUpdateCheck");
  /** Variable representing the InvTransitionSP method */
  public static final InvElementRequestMethod INV_TRANSITION_S_P = new InvElementRequestMethod("InvTransitionSP");
}
