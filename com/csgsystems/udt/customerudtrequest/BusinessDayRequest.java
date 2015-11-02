/*
 * Generated code DO NOT EDIT
 * Generated file: BusinessDayRequest.java
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

import com.csgsystems.cf.data.*;
public final class BusinessDayRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BusinessDayRequest (String request, BusinessDayRequestMethod method) {
    initialize(request, "BusinessDay", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BusinessDayRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBusinessDayForBusinessDayCreate(BusinessDayObjectData data) {
    if (data != null) {
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(data, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }
  public void setBusinessDayForBusinessDayDelete(BusinessDayObjectKeyData data) {
    if (data != null) {
      addInput("BusinessDay", BusinessDayObjectKeyHelper.toMap(data, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }
  public void setBusinessDayForBusinessDayFind(BusinessDayObjectFilter data) {
    if (data != null) {
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(data, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }
  public void setBusinessDayForBusinessDayGet(BusinessDayObjectKeyData data) {
    if (data != null) {
      addInput("BusinessDay", BusinessDayObjectKeyHelper.toMap(data, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }
  public void setBusinessDayForBusinessDayUpdate(BusinessDayObjectData data) {
    if (data != null) {
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(data, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }
  public BusinessDayObjectData getBusinessDayObjectDataBusinessDayFromBusinessDayCreate() {
    return BusinessDayObjectHelper.fromMap(outputMap, "BusinessDay");
  }
  public BusinessDayObjectData getBusinessDayObjectDataBusinessDayFromBusinessDayDelete() {
    return BusinessDayObjectHelper.fromMap(outputMap, "BusinessDay");
  }
  public BusinessDayObjectDataList getBusinessDayObjectDataBusinessDayFromBusinessDayFind() {
    return BusinessDayObjectHelper.fromMapList(outputMap, "BusinessDayList");
  }
  public BusinessDayObjectData getBusinessDayObjectDataBusinessDayFromBusinessDayGet() {
    return BusinessDayObjectHelper.fromMap(outputMap, "BusinessDay");
  }
  public BusinessDayObjectData getBusinessDayObjectDataBusinessDayFromBusinessDayUpdate() {
    return BusinessDayObjectHelper.fromMap(outputMap, "BusinessDay");
  }
  /**
   @deprecated
   */
  public void setBusinessDayObjectFilter(BusinessDayObjectFilter data) {
    if (data != null) {
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(data, new HashMap()).get("BusinessDayObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBusinessDayObjectData(BusinessDayObjectData data) {
    if (data != null) {
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(data, new HashMap()).get("BusinessDayObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBusinessDayObjectKeyData(BusinessDayObjectKeyData data) {
    if (data != null) {
      addInput("BusinessDay", BusinessDayObjectKeyHelper.toMap(data, new HashMap()).get("BusinessDayObject"));
    }
  }
  /**
   @deprecated
   */
  public BusinessDayObjectDataList getBusinessDayObjectDataList() {
    return BusinessDayObjectHelper.fromMapList(outputMap, "BusinessDayList");
  }
  /**
   @deprecated
   */
  public BusinessDayObjectData getBusinessDayObjectData() {
    return BusinessDayObjectHelper.fromMap(outputMap, "BusinessDay");
  }
}
