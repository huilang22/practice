/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PaymentRequestMethod implements UdtMethod {
  private String method = null;
  private PaymentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PaymentAllocate method */
  public static final PaymentRequestMethod PAYMENT_ALLOCATE = new PaymentRequestMethod("PaymentAllocate");
  /** Variable representing the PaymentAmountConvert method */
  public static final PaymentRequestMethod PAYMENT_AMOUNT_CONVERT = new PaymentRequestMethod("PaymentAmountConvert");
  /** Variable representing the PaymentCancelPending method */
  public static final PaymentRequestMethod PAYMENT_CANCEL_PENDING = new PaymentRequestMethod("PaymentCancelPending");
  /** Variable representing the PaymentCompletePending method */
  public static final PaymentRequestMethod PAYMENT_COMPLETE_PENDING = new PaymentRequestMethod("PaymentCompletePending");
  /** Variable representing the PaymentCount method */
  public static final PaymentRequestMethod PAYMENT_COUNT = new PaymentRequestMethod("PaymentCount");
  /** Variable representing the PaymentCreate method */
  public static final PaymentRequestMethod PAYMENT_CREATE = new PaymentRequestMethod("PaymentCreate");
  /** Variable representing the PaymentCreatePending method */
  public static final PaymentRequestMethod PAYMENT_CREATE_PENDING = new PaymentRequestMethod("PaymentCreatePending");
  /** Variable representing the PaymentCredit method */
  public static final PaymentRequestMethod PAYMENT_CREDIT = new PaymentRequestMethod("PaymentCredit");
  /** Variable representing the PaymentDebitAssumed method */
  public static final PaymentRequestMethod PAYMENT_DEBIT_ASSUMED = new PaymentRequestMethod("PaymentDebitAssumed");
  /** Variable representing the PaymentDelete method */
  public static final PaymentRequestMethod PAYMENT_DELETE = new PaymentRequestMethod("PaymentDelete");
  /** Variable representing the PaymentFind method */
  public static final PaymentRequestMethod PAYMENT_FIND = new PaymentRequestMethod("PaymentFind");
  /** Variable representing the PaymentFindCount method */
  public static final PaymentRequestMethod PAYMENT_FIND_COUNT = new PaymentRequestMethod("PaymentFindCount");
  /** Variable representing the PaymentGet method */
  public static final PaymentRequestMethod PAYMENT_GET = new PaymentRequestMethod("PaymentGet");
  /** Variable representing the PaymentNoBackoutFind method */
  public static final PaymentRequestMethod PAYMENT_NO_BACKOUT_FIND = new PaymentRequestMethod("PaymentNoBackoutFind");
  /** Variable representing the PaymentReverse method */
  public static final PaymentRequestMethod PAYMENT_REVERSE = new PaymentRequestMethod("PaymentReverse");
  /** Variable representing the PaymentTransfer method */
  public static final PaymentRequestMethod PAYMENT_TRANSFER = new PaymentRequestMethod("PaymentTransfer");
  /** Variable representing the PaymentUpdate method */
  public static final PaymentRequestMethod PAYMENT_UPDATE = new PaymentRequestMethod("PaymentUpdate");
  /** Variable representing the PaymentValidate method */
  public static final PaymentRequestMethod PAYMENT_VALIDATE = new PaymentRequestMethod("PaymentValidate");
}
