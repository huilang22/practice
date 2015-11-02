/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemExtendedDataRequest.java
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

import com.csgsystems.ctc.data.*;
public final class CtcItemExtendedDataRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcItemExtendedDataRequest (String request, CtcItemExtendedDataRequestMethod method) {
    initialize(request, "CtcItemExtendedData", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcItemExtendedDataRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcItemExtendedDataForCtcItemExtendedDataCreate(CtcItemExtendedDataObjectData data) {
    if (data != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(data, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }
  public void setCtcItemExtendedDataForCtcItemExtendedDataDelete(CtcItemExtendedDataObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectKeyHelper.toMap(data, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }
  public void setCtcItemExtendedDataForCtcItemExtendedDataFind(CtcItemExtendedDataObjectFilter data) {
    if (data != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(data, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }
  public void setCtcItemExtendedDataForCtcItemExtendedDataGet(CtcItemExtendedDataObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectKeyHelper.toMap(data, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }
  public void setCtcItemExtendedDataForCtcItemExtendedDataUpdate(CtcItemExtendedDataObjectData data) {
    if (data != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(data, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }
  public CtcItemExtendedDataObjectData getCtcItemExtendedDataObjectDataCtcItemExtendedDataFromCtcItemExtendedDataCreate() {
    return CtcItemExtendedDataObjectHelper.fromMap(outputMap, "CtcItemExtendedData");
  }
  public CtcItemExtendedDataObjectData getCtcItemExtendedDataObjectDataCtcItemExtendedDataFromCtcItemExtendedDataDelete() {
    return CtcItemExtendedDataObjectHelper.fromMap(outputMap, "CtcItemExtendedData");
  }
  public CtcItemExtendedDataObjectDataList getCtcItemExtendedDataObjectDataCtcItemExtendedDataFromCtcItemExtendedDataFind() {
    return CtcItemExtendedDataObjectHelper.fromMapList(outputMap, "CtcItemExtendedDataList");
  }
  public CtcItemExtendedDataObjectData getCtcItemExtendedDataObjectDataCtcItemExtendedDataFromCtcItemExtendedDataGet() {
    return CtcItemExtendedDataObjectHelper.fromMap(outputMap, "CtcItemExtendedData");
  }
  public CtcItemExtendedDataObjectData getCtcItemExtendedDataObjectDataCtcItemExtendedDataFromCtcItemExtendedDataUpdate() {
    return CtcItemExtendedDataObjectHelper.fromMap(outputMap, "CtcItemExtendedData");
  }
  /**
   @deprecated
   */
  public void setCtcItemExtendedDataObjectFilter(CtcItemExtendedDataObjectFilter data) {
    if (data != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(data, new HashMap()).get("CtcItemExtendedDataObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemExtendedDataObjectData(CtcItemExtendedDataObjectData data) {
    if (data != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(data, new HashMap()).get("CtcItemExtendedDataObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemExtendedDataObjectKeyData(CtcItemExtendedDataObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectKeyHelper.toMap(data, new HashMap()).get("CtcItemExtendedDataObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcItemExtendedDataObjectDataList getCtcItemExtendedDataObjectDataList() {
    return CtcItemExtendedDataObjectHelper.fromMapList(outputMap, "CtcItemExtendedDataList");
  }
  /**
   @deprecated
   */
  public CtcItemExtendedDataObjectData getCtcItemExtendedDataObjectData() {
    return CtcItemExtendedDataObjectHelper.fromMap(outputMap, "CtcItemExtendedData");
  }
}
