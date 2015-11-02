/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferExtendedDataRequest.java
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
public final class CtcOfferExtendedDataRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcOfferExtendedDataRequest (String request, CtcOfferExtendedDataRequestMethod method) {
    initialize(request, "CtcOfferExtendedData", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcOfferExtendedDataRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcOfferExtendedDataForCtcOfferExtendedDataCreate(CtcOfferExtendedDataObjectData data) {
    if (data != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(data, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }
  public void setCtcOfferExtendedDataForCtcOfferExtendedDataDelete(CtcOfferExtendedDataObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectKeyHelper.toMap(data, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }
  public void setCtcOfferExtendedDataForCtcOfferExtendedDataFind(CtcOfferExtendedDataObjectFilter data) {
    if (data != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(data, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }
  public void setCtcOfferExtendedDataForCtcOfferExtendedDataGet(CtcOfferExtendedDataObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectKeyHelper.toMap(data, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }
  public void setCtcOfferExtendedDataForCtcOfferExtendedDataUpdate(CtcOfferExtendedDataObjectData data) {
    if (data != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(data, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }
  public CtcOfferExtendedDataObjectData getCtcOfferExtendedDataObjectDataCtcOfferExtendedDataFromCtcOfferExtendedDataCreate() {
    return CtcOfferExtendedDataObjectHelper.fromMap(outputMap, "CtcOfferExtendedData");
  }
  public CtcOfferExtendedDataObjectData getCtcOfferExtendedDataObjectDataCtcOfferExtendedDataFromCtcOfferExtendedDataDelete() {
    return CtcOfferExtendedDataObjectHelper.fromMap(outputMap, "CtcOfferExtendedData");
  }
  public CtcOfferExtendedDataObjectDataList getCtcOfferExtendedDataObjectDataCtcOfferExtendedDataFromCtcOfferExtendedDataFind() {
    return CtcOfferExtendedDataObjectHelper.fromMapList(outputMap, "CtcOfferExtendedDataList");
  }
  public CtcOfferExtendedDataObjectData getCtcOfferExtendedDataObjectDataCtcOfferExtendedDataFromCtcOfferExtendedDataGet() {
    return CtcOfferExtendedDataObjectHelper.fromMap(outputMap, "CtcOfferExtendedData");
  }
  public CtcOfferExtendedDataObjectData getCtcOfferExtendedDataObjectDataCtcOfferExtendedDataFromCtcOfferExtendedDataUpdate() {
    return CtcOfferExtendedDataObjectHelper.fromMap(outputMap, "CtcOfferExtendedData");
  }
  /**
   @deprecated
   */
  public void setCtcOfferExtendedDataObjectFilter(CtcOfferExtendedDataObjectFilter data) {
    if (data != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(data, new HashMap()).get("CtcOfferExtendedDataObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOfferExtendedDataObjectData(CtcOfferExtendedDataObjectData data) {
    if (data != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(data, new HashMap()).get("CtcOfferExtendedDataObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOfferExtendedDataObjectKeyData(CtcOfferExtendedDataObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectKeyHelper.toMap(data, new HashMap()).get("CtcOfferExtendedDataObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcOfferExtendedDataObjectDataList getCtcOfferExtendedDataObjectDataList() {
    return CtcOfferExtendedDataObjectHelper.fromMapList(outputMap, "CtcOfferExtendedDataList");
  }
  /**
   @deprecated
   */
  public CtcOfferExtendedDataObjectData getCtcOfferExtendedDataObjectData() {
    return CtcOfferExtendedDataObjectHelper.fromMap(outputMap, "CtcOfferExtendedData");
  }
}
