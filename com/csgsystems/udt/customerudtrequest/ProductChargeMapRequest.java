/*
 * Generated code DO NOT EDIT
 * Generated file: ProductChargeMapRequest.java
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
public final class ProductChargeMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductChargeMapRequest (String request, ProductChargeMapRequestMethod method) {
    initialize(request, "ProductChargeMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductChargeMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setProductChargeMapForProductChargeMapCreate(ProductChargeMapObjectData data) {
    if (data != null) {
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(data, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }
  public void setProductChargeMapForProductChargeMapFind(ProductChargeMapObjectFilter data) {
    if (data != null) {
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(data, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }
  public void setProductChargeMapForProductChargeMapGet(ProductChargeMapObjectKeyData data) {
    if (data != null) {
      addInput("ProductChargeMap", ProductChargeMapObjectKeyHelper.toMap(data, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }
  public void setProductChargeMapForProductChargeMapUpdate(ProductChargeMapObjectData data) {
    if (data != null) {
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(data, new HashMap(), "ProductChargeMap").get("ProductChargeMap"));
    }
  }
  public ProductChargeMapObjectData getProductChargeMapObjectDataProductChargeMapFromProductChargeMapCreate() {
    return ProductChargeMapObjectHelper.fromMap(outputMap, "ProductChargeMap");
  }
  public ProductChargeMapObjectDataList getProductChargeMapObjectDataProductChargeMapFromProductChargeMapFind() {
    return ProductChargeMapObjectHelper.fromMapList(outputMap, "ProductChargeMapList");
  }
  public ProductChargeMapObjectData getProductChargeMapObjectDataProductChargeMapFromProductChargeMapGet() {
    return ProductChargeMapObjectHelper.fromMap(outputMap, "ProductChargeMap");
  }
  public ProductChargeMapObjectData getProductChargeMapObjectDataProductChargeMapFromProductChargeMapUpdate() {
    return ProductChargeMapObjectHelper.fromMap(outputMap, "ProductChargeMap");
  }
  /**
   @deprecated
   */
  public void setProductChargeMapObjectFilter(ProductChargeMapObjectFilter data) {
    if (data != null) {
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(data, new HashMap()).get("ProductChargeMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductChargeMapObjectData(ProductChargeMapObjectData data) {
    if (data != null) {
      addInput("ProductChargeMap", ProductChargeMapObjectHelper.toMap(data, new HashMap()).get("ProductChargeMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductChargeMapObjectKeyData(ProductChargeMapObjectKeyData data) {
    if (data != null) {
      addInput("ProductChargeMap", ProductChargeMapObjectKeyHelper.toMap(data, new HashMap()).get("ProductChargeMapObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductChargeMapObjectDataList getProductChargeMapObjectDataList() {
    return ProductChargeMapObjectHelper.fromMapList(outputMap, "ProductChargeMapList");
  }
  /**
   @deprecated
   */
  public ProductChargeMapObjectData getProductChargeMapObjectData() {
    return ProductChargeMapObjectHelper.fromMap(outputMap, "ProductChargeMap");
  }
}
