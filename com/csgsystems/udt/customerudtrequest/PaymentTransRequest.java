/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentTransRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.bp.data.*;
public final class PaymentTransRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PaymentTransRequest (String request, PaymentTransRequestMethod method) {
    initialize(request, "PaymentTrans", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PaymentTransRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPaymentTransForPaymentTransFind(PaymentTransObjectFilter data) {
    if (data != null) {
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(data, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }
  public void setPaymentTransForPaymentTransGet(PaymentTransObjectKeyData data) {
    if (data != null) {
      addInput("PaymentTrans", PaymentTransObjectKeyHelper.toMap(data, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }
  public void setPaymentTransForPaymentTransUpdate(PaymentTransObjectData data) {
    if (data != null) {
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(data, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }
  public PaymentTransObjectDataList getPaymentTransObjectDataPaymentTransFromPaymentTransFind() {
    return PaymentTransObjectHelper.fromMapList(outputMap, "PaymentTransList");
  }
  public PaymentTransObjectData getPaymentTransObjectDataPaymentTransFromPaymentTransGet() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
  public PaymentTransObjectData getPaymentTransObjectDataPaymentTransFromPaymentTransUpdate() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
  /**
   @deprecated
   */
  public void setPaymentTransObjectFilter(PaymentTransObjectFilter data) {
    if (data != null) {
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(data, new HashMap()).get("PaymentTransObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentTransObjectData(PaymentTransObjectData data) {
    if (data != null) {
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(data, new HashMap()).get("PaymentTransObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentTransObjectKeyData(PaymentTransObjectKeyData data) {
    if (data != null) {
      addInput("PaymentTrans", PaymentTransObjectKeyHelper.toMap(data, new HashMap()).get("PaymentTransObject"));
    }
  }
  /**
   @deprecated
   */
  public PaymentTransObjectDataList getPaymentTransObjectDataList() {
    return PaymentTransObjectHelper.fromMapList(outputMap, "PaymentTransList");
  }
  /**
   @deprecated
   */
  public PaymentTransObjectData getPaymentTransObjectData() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
}
