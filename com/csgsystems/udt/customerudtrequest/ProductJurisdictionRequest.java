/*
 * Generated code DO NOT EDIT
 * Generated file: ProductJurisdictionRequest.java
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
public final class ProductJurisdictionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductJurisdictionRequest (String request, ProductJurisdictionRequestMethod method) {
    initialize(request, "ProductJurisdiction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductJurisdictionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setProductJurisdictionForProductJurisdictionCreate(ProductJurisdictionObjectData data) {
    if (data != null) {
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(data, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }
  public void setProductJurisdictionForProductJurisdictionFind(ProductJurisdictionObjectFilter data) {
    if (data != null) {
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(data, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }
  public void setProductJurisdictionForProductJurisdictionGet(ProductJurisdictionObjectKeyData data) {
    if (data != null) {
      addInput("ProductJurisdiction", ProductJurisdictionObjectKeyHelper.toMap(data, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }
  public void setProductJurisdictionForProductJurisdictionUpdate(ProductJurisdictionObjectData data) {
    if (data != null) {
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(data, new HashMap(), "ProductJurisdiction").get("ProductJurisdiction"));
    }
  }
  public void setProductJurisdictionUpdateFilterForProductJurisdictionUpdate(ProductJurisdictionObjectFilter data) {
    if (data != null) {
      addInput("ProductJurisdictionUpdateFilter", ProductJurisdictionObjectHelper.toMap(data, new HashMap(), "ProductJurisdictionUpdateFilter").get("ProductJurisdictionUpdateFilter"));
    }
  }
  public void setProductJurisdictionUpdateGetForProductJurisdictionUpdate(ProductJurisdictionObjectData data) {
    if (data != null) {
      addInput("ProductJurisdictionUpdateGet", ProductJurisdictionObjectHelper.toMap(data, new HashMap(), "ProductJurisdictionUpdateGet").get("ProductJurisdictionUpdateGet"));
    }
  }
  public ProductJurisdictionObjectData getProductJurisdictionObjectDataProductJurisdictionFromProductJurisdictionCreate() {
    return ProductJurisdictionObjectHelper.fromMap(outputMap, "ProductJurisdiction");
  }
  public ProductJurisdictionObjectDataList getProductJurisdictionObjectDataProductJurisdictionFromProductJurisdictionFind() {
    return ProductJurisdictionObjectHelper.fromMapList(outputMap, "ProductJurisdictionList");
  }
  public ProductJurisdictionObjectData getProductJurisdictionObjectDataProductJurisdictionFromProductJurisdictionGet() {
    return ProductJurisdictionObjectHelper.fromMap(outputMap, "ProductJurisdiction");
  }
  public ProductJurisdictionObjectData getProductJurisdictionObjectDataProductJurisdictionFromProductJurisdictionUpdate() {
    return ProductJurisdictionObjectHelper.fromMap(outputMap, "ProductJurisdiction");
  }
  /**
   @deprecated
   */
  public void setProductJurisdictionObjectFilter(ProductJurisdictionObjectFilter data) {
    if (data != null) {
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(data, new HashMap()).get("ProductJurisdictionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductJurisdictionObjectData(ProductJurisdictionObjectData data) {
    if (data != null) {
      addInput("ProductJurisdiction", ProductJurisdictionObjectHelper.toMap(data, new HashMap()).get("ProductJurisdictionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductJurisdictionObjectKeyData(ProductJurisdictionObjectKeyData data) {
    if (data != null) {
      addInput("ProductJurisdiction", ProductJurisdictionObjectKeyHelper.toMap(data, new HashMap()).get("ProductJurisdictionObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductJurisdictionObjectDataList getProductJurisdictionObjectDataList() {
    return ProductJurisdictionObjectHelper.fromMapList(outputMap, "ProductJurisdictionList");
  }
  /**
   @deprecated
   */
  public ProductJurisdictionObjectData getProductJurisdictionObjectData() {
    return ProductJurisdictionObjectHelper.fromMap(outputMap, "ProductJurisdiction");
  }
}
