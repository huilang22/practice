/*
 * Generated code DO NOT EDIT
 * Generated file: ExchangeRateClassRequest.java
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
public final class ExchangeRateClassRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExchangeRateClassRequest (String request, ExchangeRateClassRequestMethod method) {
    initialize(request, "ExchangeRateClass", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExchangeRateClassRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExchangeRateClassForExchangeRateClassCreate(ExchangeRateClassObjectData data) {
    if (data != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(data, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }
  public void setExchangeRateClassForExchangeRateClassDelete(ExchangeRateClassObjectKeyData data) {
    if (data != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectKeyHelper.toMap(data, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }
  public void setExchangeRateClassForExchangeRateClassFind(ExchangeRateClassObjectFilter data) {
    if (data != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(data, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }
  public void setExchangeRateClassForExchangeRateClassGet(ExchangeRateClassObjectKeyData data) {
    if (data != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectKeyHelper.toMap(data, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }
  public void setExchangeRateClassForExchangeRateClassUpdate(ExchangeRateClassObjectData data) {
    if (data != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(data, new HashMap(), "ExchangeRateClass").get("ExchangeRateClass"));
    }
  }
  public ExchangeRateClassObjectData getExchangeRateClassObjectDataExchangeRateClassFromExchangeRateClassCreate() {
    return ExchangeRateClassObjectHelper.fromMap(outputMap, "ExchangeRateClass");
  }
  public ExchangeRateClassObjectData getExchangeRateClassObjectDataExchangeRateClassFromExchangeRateClassDelete() {
    return ExchangeRateClassObjectHelper.fromMap(outputMap, "ExchangeRateClass");
  }
  public ExchangeRateClassObjectDataList getExchangeRateClassObjectDataExchangeRateClassFromExchangeRateClassFind() {
    return ExchangeRateClassObjectHelper.fromMapList(outputMap, "ExchangeRateClassList");
  }
  public ExchangeRateClassObjectData getExchangeRateClassObjectDataExchangeRateClassFromExchangeRateClassGet() {
    return ExchangeRateClassObjectHelper.fromMap(outputMap, "ExchangeRateClass");
  }
  public ExchangeRateClassObjectData getExchangeRateClassObjectDataExchangeRateClassFromExchangeRateClassUpdate() {
    return ExchangeRateClassObjectHelper.fromMap(outputMap, "ExchangeRateClass");
  }
  /**
   @deprecated
   */
  public void setExchangeRateClassObjectFilter(ExchangeRateClassObjectFilter data) {
    if (data != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(data, new HashMap()).get("ExchangeRateClassObject"));
    }
  }
  /**
   @deprecated
   */
  public void setExchangeRateClassObjectData(ExchangeRateClassObjectData data) {
    if (data != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectHelper.toMap(data, new HashMap()).get("ExchangeRateClassObject"));
    }
  }
  /**
   @deprecated
   */
  public void setExchangeRateClassObjectKeyData(ExchangeRateClassObjectKeyData data) {
    if (data != null) {
      addInput("ExchangeRateClass", ExchangeRateClassObjectKeyHelper.toMap(data, new HashMap()).get("ExchangeRateClassObject"));
    }
  }
  /**
   @deprecated
   */
  public ExchangeRateClassObjectDataList getExchangeRateClassObjectDataList() {
    return ExchangeRateClassObjectHelper.fromMapList(outputMap, "ExchangeRateClassList");
  }
  /**
   @deprecated
   */
  public ExchangeRateClassObjectData getExchangeRateClassObjectData() {
    return ExchangeRateClassObjectHelper.fromMap(outputMap, "ExchangeRateClass");
  }
}
