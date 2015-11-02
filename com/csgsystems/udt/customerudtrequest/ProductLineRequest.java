/*
 * Generated code DO NOT EDIT
 * Generated file: ProductLineRequest.java
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
public final class ProductLineRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductLineRequest (String request, ProductLineRequestMethod method) {
    initialize(request, "ProductLine", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductLineRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setProductLineForProductLineCreate(ProductLineObjectData data) {
    if (data != null) {
      addInput("ProductLine", ProductLineObjectHelper.toMap(data, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }
  public void setProductLineForProductLineDelete(ProductLineObjectKeyData data) {
    if (data != null) {
      addInput("ProductLine", ProductLineObjectKeyHelper.toMap(data, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }
  public void setProductLineForProductLineFind(ProductLineObjectFilter data) {
    if (data != null) {
      addInput("ProductLine", ProductLineObjectHelper.toMap(data, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }
  public void setProductLineForProductLineGet(ProductLineObjectKeyData data) {
    if (data != null) {
      addInput("ProductLine", ProductLineObjectKeyHelper.toMap(data, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }
  public void setProductLineForProductLineUpdate(ProductLineObjectData data) {
    if (data != null) {
      addInput("ProductLine", ProductLineObjectHelper.toMap(data, new HashMap(), "ProductLine").get("ProductLine"));
    }
  }
  public ProductLineObjectData getProductLineObjectDataProductLineFromProductLineCreate() {
    return ProductLineObjectHelper.fromMap(outputMap, "ProductLine");
  }
  public ProductLineObjectDataList getProductLineObjectDataProductLineFromProductLineFind() {
    return ProductLineObjectHelper.fromMapList(outputMap, "ProductLineList");
  }
  public ProductLineObjectData getProductLineObjectDataProductLineFromProductLineGet() {
    return ProductLineObjectHelper.fromMap(outputMap, "ProductLine");
  }
  public ProductLineObjectData getProductLineObjectDataProductLineFromProductLineUpdate() {
    return ProductLineObjectHelper.fromMap(outputMap, "ProductLine");
  }
  /**
   @deprecated
   */
  public void setProductLineObjectFilter(ProductLineObjectFilter data) {
    if (data != null) {
      addInput("ProductLine", ProductLineObjectHelper.toMap(data, new HashMap()).get("ProductLineObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductLineObjectData(ProductLineObjectData data) {
    if (data != null) {
      addInput("ProductLine", ProductLineObjectHelper.toMap(data, new HashMap()).get("ProductLineObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductLineObjectKeyData(ProductLineObjectKeyData data) {
    if (data != null) {
      addInput("ProductLine", ProductLineObjectKeyHelper.toMap(data, new HashMap()).get("ProductLineObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductLineObjectDataList getProductLineObjectDataList() {
    return ProductLineObjectHelper.fromMapList(outputMap, "ProductLineList");
  }
  /**
   @deprecated
   */
  public ProductLineObjectData getProductLineObjectData() {
    return ProductLineObjectHelper.fromMap(outputMap, "ProductLine");
  }
}
