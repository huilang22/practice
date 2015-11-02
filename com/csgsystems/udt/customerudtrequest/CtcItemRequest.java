/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemRequest.java
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
public final class CtcItemRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcItemRequest (String request, CtcItemRequestMethod method) {
    initialize(request, "CtcItem", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcItemRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcItemForCtcItemCreate(CtcItemObjectData data) {
    if (data != null) {
      addInput("CtcItem", CtcItemObjectHelper.toMap(data, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }
  public void setCtcItemForCtcItemDelete(CtcItemObjectKeyData data) {
    if (data != null) {
      addInput("CtcItem", CtcItemObjectKeyHelper.toMap(data, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }
  public void setCtcItemForCtcItemFind(CtcItemObjectFilter data) {
    if (data != null) {
      addInput("CtcItem", CtcItemObjectHelper.toMap(data, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }
  public void setCtcItemForCtcItemGet(CtcItemObjectKeyData data) {
    if (data != null) {
      addInput("CtcItem", CtcItemObjectKeyHelper.toMap(data, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }
  public void setCtcItemForCtcItemUpdate(CtcItemObjectData data) {
    if (data != null) {
      addInput("CtcItem", CtcItemObjectHelper.toMap(data, new HashMap(), "CtcItem").get("CtcItem"));
    }
  }
  public CtcItemObjectData getCtcItemObjectDataCtcItemFromCtcItemCreate() {
    return CtcItemObjectHelper.fromMap(outputMap, "CtcItem");
  }
  public CtcItemObjectData getCtcItemObjectDataCtcItemFromCtcItemDelete() {
    return CtcItemObjectHelper.fromMap(outputMap, "CtcItem");
  }
  public CtcItemObjectDataList getCtcItemObjectDataCtcItemFromCtcItemFind() {
    return CtcItemObjectHelper.fromMapList(outputMap, "CtcItemList");
  }
  public CtcItemObjectData getCtcItemObjectDataCtcItemFromCtcItemGet() {
    return CtcItemObjectHelper.fromMap(outputMap, "CtcItem");
  }
  public CtcItemObjectData getCtcItemObjectDataCtcItemFromCtcItemUpdate() {
    return CtcItemObjectHelper.fromMap(outputMap, "CtcItem");
  }
  /**
   @deprecated
   */
  public void setCtcItemObjectFilter(CtcItemObjectFilter data) {
    if (data != null) {
      addInput("CtcItem", CtcItemObjectHelper.toMap(data, new HashMap()).get("CtcItemObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemObjectData(CtcItemObjectData data) {
    if (data != null) {
      addInput("CtcItem", CtcItemObjectHelper.toMap(data, new HashMap()).get("CtcItemObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemObjectKeyData(CtcItemObjectKeyData data) {
    if (data != null) {
      addInput("CtcItem", CtcItemObjectKeyHelper.toMap(data, new HashMap()).get("CtcItemObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcItemObjectDataList getCtcItemObjectDataList() {
    return CtcItemObjectHelper.fromMapList(outputMap, "CtcItemList");
  }
  /**
   @deprecated
   */
  public CtcItemObjectData getCtcItemObjectData() {
    return CtcItemObjectHelper.fromMap(outputMap, "CtcItem");
  }
}
