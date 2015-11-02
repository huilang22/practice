/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentTypeRequest.java
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
public final class PaymentTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PaymentTypeRequest (String request, PaymentTypeRequestMethod method) {
    initialize(request, "PaymentType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PaymentTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPaymentTypeForPaymentTypeFind(PaymentTypeObjectFilter data) {
    if (data != null) {
      addInput("PaymentType", PaymentTypeObjectHelper.toMap(data, new HashMap(), "PaymentType").get("PaymentType"));
    }
  }
  public void setPaymentTypeForPaymentTypeGet(PaymentTypeObjectKeyData data) {
    if (data != null) {
      addInput("PaymentType", PaymentTypeObjectKeyHelper.toMap(data, new HashMap(), "PaymentType").get("PaymentType"));
    }
  }
  public PaymentTypeObjectDataList getPaymentTypeObjectDataPaymentTypeFromPaymentTypeFind() {
    return PaymentTypeObjectHelper.fromMapList(outputMap, "PaymentTypeList");
  }
  public PaymentTypeObjectData getPaymentTypeObjectDataPaymentTypeFromPaymentTypeGet() {
    return PaymentTypeObjectHelper.fromMap(outputMap, "PaymentType");
  }
  /**
   @deprecated
   */
  public void setPaymentTypeObjectFilter(PaymentTypeObjectFilter data) {
    if (data != null) {
      addInput("PaymentType", PaymentTypeObjectHelper.toMap(data, new HashMap()).get("PaymentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentTypeObjectKeyData(PaymentTypeObjectKeyData data) {
    if (data != null) {
      addInput("PaymentType", PaymentTypeObjectKeyHelper.toMap(data, new HashMap()).get("PaymentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public PaymentTypeObjectDataList getPaymentTypeObjectDataList() {
    return PaymentTypeObjectHelper.fromMapList(outputMap, "PaymentTypeList");
  }
  /**
   @deprecated
   */
  public PaymentTypeObjectData getPaymentTypeObjectData() {
    return PaymentTypeObjectHelper.fromMap(outputMap, "PaymentType");
  }
}
