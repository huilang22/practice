/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupProductRequest.java
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
public final class HqGroupProductRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public HqGroupProductRequest (String request, HqGroupProductRequestMethod method) {
    initialize(request, "HqGroupProduct", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (HqGroupProductRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setHqGroupProductForHqGroupProductCreate(HqGroupProductObjectData data) {
    if (data != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(data, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }
  public void setHqGroupProductForHqGroupProductDelete(HqGroupProductObjectData data) {
    if (data != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(data, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }
  public void setHqGroupProductForHqGroupProductDeleteList(HqGroupProductObjectFilter data) {
    if (data != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(data, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }
  public void setProductViewIdForHqGroupProductDelete(Integer data) {
    if (data != null) {
      addInput("ProductViewId", data);
    }
  }
  public void setHqGroupProductForHqGroupProductFind(HqGroupProductObjectFilter data) {
    if (data != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(data, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }
  public void setHqGroupProductForHqGroupProductGet(HqGroupProductObjectData data) {
    if (data != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(data, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }
  public void setHqGroupProductForHqGroupProductUpdate(HqGroupProductObjectData data) {
    if (data != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(data, new HashMap(), "HqGroupProduct").get("HqGroupProduct"));
    }
  }
  public HqGroupProductObjectData getHqGroupProductObjectDataHqGroupProductFromHqGroupProductCreate() {
    return HqGroupProductObjectHelper.fromMap(outputMap, "HqGroupProduct");
  }
  public HqGroupProductObjectData getHqGroupProductObjectDataHqGroupProductFromHqGroupProductDelete() {
    return HqGroupProductObjectHelper.fromMap(outputMap, "HqGroupProduct");
  }
  public HqGroupProductObjectDataList getHqGroupProductObjectDataHqGroupProductFromHqGroupProductFind() {
    return HqGroupProductObjectHelper.fromMapList(outputMap, "HqGroupProductList");
  }
  public HqGroupProductObjectData getHqGroupProductObjectDataHqGroupProductFromHqGroupProductGet() {
    return HqGroupProductObjectHelper.fromMap(outputMap, "HqGroupProduct");
  }
  public HqGroupProductObjectData getHqGroupProductObjectDataHqGroupProductFromHqGroupProductUpdate() {
    return HqGroupProductObjectHelper.fromMap(outputMap, "HqGroupProduct");
  }
  /**
   @deprecated
   */
  public void setHqGroupProductObjectFilter(HqGroupProductObjectFilter data) {
    if (data != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(data, new HashMap()).get("HqGroupProductObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupProductObjectData(HqGroupProductObjectData data) {
    if (data != null) {
      addInput("HqGroupProduct", HqGroupProductObjectHelper.toMap(data, new HashMap()).get("HqGroupProductObject"));
    }
  }
  /**
   @deprecated
   */
  public HqGroupProductObjectDataList getHqGroupProductObjectDataList() {
    return HqGroupProductObjectHelper.fromMapList(outputMap, "HqGroupProductList");
  }
  /**
   @deprecated
   */
  public HqGroupProductObjectData getHqGroupProductObjectData() {
    return HqGroupProductObjectHelper.fromMap(outputMap, "HqGroupProduct");
  }
  /**
   @deprecated
   */
  public void setProductViewId(Integer data) {
    if (data != null) {
      addInput("ProductViewId", data);
    }
  }
}
