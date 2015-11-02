/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdRequest.java
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
public final class PaymentMerchantIdRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PaymentMerchantIdRequest (String request, PaymentMerchantIdRequestMethod method) {
    initialize(request, "PaymentMerchantId", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PaymentMerchantIdRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPaymentMerchantIdForPaymentMerchantIdCreate(PaymentMerchantIdObjectData data) {
    if (data != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(data, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }
  public void setPaymentMerchantIdForPaymentMerchantIdDelete(PaymentMerchantIdObjectKeyData data) {
    if (data != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectKeyHelper.toMap(data, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }
  public void setPaymentMerchantIdForPaymentMerchantIdFind(PaymentMerchantIdObjectFilter data) {
    if (data != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(data, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }
  public void setPaymentMerchantIdForPaymentMerchantIdGet(PaymentMerchantIdObjectKeyData data) {
    if (data != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectKeyHelper.toMap(data, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }
  public void setPaymentMerchantIdForPaymentMerchantIdUpdate(PaymentMerchantIdObjectData data) {
    if (data != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(data, new HashMap(), "PaymentMerchantId").get("PaymentMerchantId"));
    }
  }
  public PaymentMerchantIdObjectData getPaymentMerchantIdObjectDataPaymentMerchantIdFromPaymentMerchantIdCreate() {
    return PaymentMerchantIdObjectHelper.fromMap(outputMap, "PaymentMerchantId");
  }
  public PaymentMerchantIdObjectData getPaymentMerchantIdObjectDataPaymentMerchantIdFromPaymentMerchantIdDelete() {
    return PaymentMerchantIdObjectHelper.fromMap(outputMap, "PaymentMerchantId");
  }
  public PaymentMerchantIdObjectDataList getPaymentMerchantIdObjectDataPaymentMerchantIdFromPaymentMerchantIdFind() {
    return PaymentMerchantIdObjectHelper.fromMapList(outputMap, "PaymentMerchantIdList");
  }
  public PaymentMerchantIdObjectData getPaymentMerchantIdObjectDataPaymentMerchantIdFromPaymentMerchantIdGet() {
    return PaymentMerchantIdObjectHelper.fromMap(outputMap, "PaymentMerchantId");
  }
  public PaymentMerchantIdObjectData getPaymentMerchantIdObjectDataPaymentMerchantIdFromPaymentMerchantIdUpdate() {
    return PaymentMerchantIdObjectHelper.fromMap(outputMap, "PaymentMerchantId");
  }
  /**
   @deprecated
   */
  public void setPaymentMerchantIdObjectFilter(PaymentMerchantIdObjectFilter data) {
    if (data != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(data, new HashMap()).get("PaymentMerchantIdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentMerchantIdObjectData(PaymentMerchantIdObjectData data) {
    if (data != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectHelper.toMap(data, new HashMap()).get("PaymentMerchantIdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentMerchantIdObjectKeyData(PaymentMerchantIdObjectKeyData data) {
    if (data != null) {
      addInput("PaymentMerchantId", PaymentMerchantIdObjectKeyHelper.toMap(data, new HashMap()).get("PaymentMerchantIdObject"));
    }
  }
  /**
   @deprecated
   */
  public PaymentMerchantIdObjectDataList getPaymentMerchantIdObjectDataList() {
    return PaymentMerchantIdObjectHelper.fromMapList(outputMap, "PaymentMerchantIdList");
  }
  /**
   @deprecated
   */
  public PaymentMerchantIdObjectData getPaymentMerchantIdObjectData() {
    return PaymentMerchantIdObjectHelper.fromMap(outputMap, "PaymentMerchantId");
  }
}
