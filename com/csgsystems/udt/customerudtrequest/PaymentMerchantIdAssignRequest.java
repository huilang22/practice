/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentMerchantIdAssignRequest.java
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
public final class PaymentMerchantIdAssignRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PaymentMerchantIdAssignRequest (String request, PaymentMerchantIdAssignRequestMethod method) {
    initialize(request, "PaymentMerchantIdAssign", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PaymentMerchantIdAssignRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPaymentMerchantIdAssignForPaymentMerchantIdAssignCreate(PaymentMerchantIdAssignObjectData data) {
    if (data != null) {
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(data, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }
  public void setPaymentMerchantIdAssignForPaymentMerchantIdAssignFind(PaymentMerchantIdAssignObjectFilter data) {
    if (data != null) {
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(data, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }
  public void setPaymentMerchantIdAssignForPaymentMerchantIdAssignGet(PaymentMerchantIdAssignObjectKeyData data) {
    if (data != null) {
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectKeyHelper.toMap(data, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }
  public void setPaymentMerchantIdAssignForPaymentMerchantIdAssignUpdate(PaymentMerchantIdAssignObjectData data) {
    if (data != null) {
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(data, new HashMap(), "PaymentMerchantIdAssign").get("PaymentMerchantIdAssign"));
    }
  }
  public PaymentMerchantIdAssignObjectData getPaymentMerchantIdAssignObjectDataPaymentMerchantIdAssignFromPaymentMerchantIdAssignCreate() {
    return PaymentMerchantIdAssignObjectHelper.fromMap(outputMap, "PaymentMerchantIdAssign");
  }
  public PaymentMerchantIdAssignObjectDataList getPaymentMerchantIdAssignObjectDataPaymentMerchantIdAssignFromPaymentMerchantIdAssignFind() {
    return PaymentMerchantIdAssignObjectHelper.fromMapList(outputMap, "PaymentMerchantIdAssignList");
  }
  public PaymentMerchantIdAssignObjectData getPaymentMerchantIdAssignObjectDataPaymentMerchantIdAssignFromPaymentMerchantIdAssignGet() {
    return PaymentMerchantIdAssignObjectHelper.fromMap(outputMap, "PaymentMerchantIdAssign");
  }
  public PaymentMerchantIdAssignObjectData getPaymentMerchantIdAssignObjectDataPaymentMerchantIdAssignFromPaymentMerchantIdAssignUpdate() {
    return PaymentMerchantIdAssignObjectHelper.fromMap(outputMap, "PaymentMerchantIdAssign");
  }
  /**
   @deprecated
   */
  public void setPaymentMerchantIdAssignObjectFilter(PaymentMerchantIdAssignObjectFilter data) {
    if (data != null) {
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(data, new HashMap()).get("PaymentMerchantIdAssignObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentMerchantIdAssignObjectData(PaymentMerchantIdAssignObjectData data) {
    if (data != null) {
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectHelper.toMap(data, new HashMap()).get("PaymentMerchantIdAssignObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentMerchantIdAssignObjectKeyData(PaymentMerchantIdAssignObjectKeyData data) {
    if (data != null) {
      addInput("PaymentMerchantIdAssign", PaymentMerchantIdAssignObjectKeyHelper.toMap(data, new HashMap()).get("PaymentMerchantIdAssignObject"));
    }
  }
  /**
   @deprecated
   */
  public PaymentMerchantIdAssignObjectDataList getPaymentMerchantIdAssignObjectDataList() {
    return PaymentMerchantIdAssignObjectHelper.fromMapList(outputMap, "PaymentMerchantIdAssignList");
  }
  /**
   @deprecated
   */
  public PaymentMerchantIdAssignObjectData getPaymentMerchantIdAssignObjectData() {
    return PaymentMerchantIdAssignObjectHelper.fromMap(outputMap, "PaymentMerchantIdAssign");
  }
}
