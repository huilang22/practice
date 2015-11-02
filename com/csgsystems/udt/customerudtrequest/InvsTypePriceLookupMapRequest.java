/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypePriceLookupMapRequest.java
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
public final class InvsTypePriceLookupMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsTypePriceLookupMapRequest (String request, InvsTypePriceLookupMapRequestMethod method) {
    initialize(request, "InvsTypePriceLookupMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsTypePriceLookupMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsTypePriceLookupMapForInvsTypePriceLookupMapCreate(InvsTypePriceLookupMapObjectData data) {
    if (data != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(data, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }
  public void setInvsTypePriceLookupMapForInvsTypePriceLookupMapDelete(InvsTypePriceLookupMapObjectKeyData data) {
    if (data != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectKeyHelper.toMap(data, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }
  public void setInvsTypePriceLookupMapForInvsTypePriceLookupMapFind(InvsTypePriceLookupMapObjectFilter data) {
    if (data != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(data, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }
  public void setInvsTypePriceLookupMapForInvsTypePriceLookupMapGet(InvsTypePriceLookupMapObjectKeyData data) {
    if (data != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectKeyHelper.toMap(data, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }
  public void setInvsTypePriceLookupMapForInvsTypePriceLookupMapUpdate(InvsTypePriceLookupMapObjectData data) {
    if (data != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(data, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }
  public InvsTypePriceLookupMapObjectData getInvsTypePriceLookupMapObjectDataInvsTypePriceLookupMapFromInvsTypePriceLookupMapCreate() {
    return InvsTypePriceLookupMapObjectHelper.fromMap(outputMap, "InvsTypePriceLookupMap");
  }
  public InvsTypePriceLookupMapObjectData getInvsTypePriceLookupMapObjectDataInvsTypePriceLookupMapFromInvsTypePriceLookupMapDelete() {
    return InvsTypePriceLookupMapObjectHelper.fromMap(outputMap, "InvsTypePriceLookupMap");
  }
  public InvsTypePriceLookupMapObjectDataList getInvsTypePriceLookupMapObjectDataInvsTypePriceLookupMapFromInvsTypePriceLookupMapFind() {
    return InvsTypePriceLookupMapObjectHelper.fromMapList(outputMap, "InvsTypePriceLookupMapList");
  }
  public InvsTypePriceLookupMapObjectData getInvsTypePriceLookupMapObjectDataInvsTypePriceLookupMapFromInvsTypePriceLookupMapGet() {
    return InvsTypePriceLookupMapObjectHelper.fromMap(outputMap, "InvsTypePriceLookupMap");
  }
  public InvsTypePriceLookupMapObjectData getInvsTypePriceLookupMapObjectDataInvsTypePriceLookupMapFromInvsTypePriceLookupMapUpdate() {
    return InvsTypePriceLookupMapObjectHelper.fromMap(outputMap, "InvsTypePriceLookupMap");
  }
  /**
   @deprecated
   */
  public void setInvsTypePriceLookupMapObjectFilter(InvsTypePriceLookupMapObjectFilter data) {
    if (data != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(data, new HashMap()).get("InvsTypePriceLookupMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsTypePriceLookupMapObjectData(InvsTypePriceLookupMapObjectData data) {
    if (data != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(data, new HashMap()).get("InvsTypePriceLookupMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsTypePriceLookupMapObjectKeyData(InvsTypePriceLookupMapObjectKeyData data) {
    if (data != null) {
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectKeyHelper.toMap(data, new HashMap()).get("InvsTypePriceLookupMapObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsTypePriceLookupMapObjectDataList getInvsTypePriceLookupMapObjectDataList() {
    return InvsTypePriceLookupMapObjectHelper.fromMapList(outputMap, "InvsTypePriceLookupMapList");
  }
  /**
   @deprecated
   */
  public InvsTypePriceLookupMapObjectData getInvsTypePriceLookupMapObjectData() {
    return InvsTypePriceLookupMapObjectHelper.fromMap(outputMap, "InvsTypePriceLookupMap");
  }
}
