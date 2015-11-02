/*
 * Generated code DO NOT EDIT
 * Generated file: UnappliedPaymentRequest.java
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
public final class UnappliedPaymentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UnappliedPaymentRequest (String request, UnappliedPaymentRequestMethod method) {
    initialize(request, "UnappliedPayment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UnappliedPaymentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUnappliedPaymentForUnappliedPaymentFind(UnappliedPaymentObjectFilter data) {
    if (data != null) {
      addInput("UnappliedPayment", UnappliedPaymentObjectHelper.toMap(data, new HashMap(), "UnappliedPayment").get("UnappliedPayment"));
    }
  }
  public void setUnappliedPaymentForUnappliedPaymentGet(UnappliedPaymentObjectKeyData data) {
    if (data != null) {
      addInput("UnappliedPayment", UnappliedPaymentObjectKeyHelper.toMap(data, new HashMap(), "UnappliedPayment").get("UnappliedPayment"));
    }
  }
  public void setUnappliedPaymentForUnappliedPaymentUpdate(UnappliedPaymentObjectData data) {
    if (data != null) {
      addInput("UnappliedPayment", UnappliedPaymentObjectHelper.toMap(data, new HashMap(), "UnappliedPayment").get("UnappliedPayment"));
    }
  }
  public UnappliedPaymentObjectDataList getUnappliedPaymentObjectDataUnappliedPaymentFromUnappliedPaymentFind() {
    return UnappliedPaymentObjectHelper.fromMapList(outputMap, "UnappliedPaymentList");
  }
  public UnappliedPaymentObjectData getUnappliedPaymentObjectDataUnappliedPaymentFromUnappliedPaymentGet() {
    return UnappliedPaymentObjectHelper.fromMap(outputMap, "UnappliedPayment");
  }
  public UnappliedPaymentObjectData getUnappliedPaymentObjectDataUnappliedPaymentFromUnappliedPaymentUpdate() {
    return UnappliedPaymentObjectHelper.fromMap(outputMap, "UnappliedPayment");
  }
  /**
   @deprecated
   */
  public void setUnappliedPaymentObjectFilter(UnappliedPaymentObjectFilter data) {
    if (data != null) {
      addInput("UnappliedPayment", UnappliedPaymentObjectHelper.toMap(data, new HashMap()).get("UnappliedPaymentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnappliedPaymentObjectData(UnappliedPaymentObjectData data) {
    if (data != null) {
      addInput("UnappliedPayment", UnappliedPaymentObjectHelper.toMap(data, new HashMap()).get("UnappliedPaymentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnappliedPaymentObjectKeyData(UnappliedPaymentObjectKeyData data) {
    if (data != null) {
      addInput("UnappliedPayment", UnappliedPaymentObjectKeyHelper.toMap(data, new HashMap()).get("UnappliedPaymentObject"));
    }
  }
  /**
   @deprecated
   */
  public UnappliedPaymentObjectDataList getUnappliedPaymentObjectDataList() {
    return UnappliedPaymentObjectHelper.fromMapList(outputMap, "UnappliedPaymentList");
  }
  /**
   @deprecated
   */
  public UnappliedPaymentObjectData getUnappliedPaymentObjectData() {
    return UnappliedPaymentObjectHelper.fromMap(outputMap, "UnappliedPayment");
  }
}
