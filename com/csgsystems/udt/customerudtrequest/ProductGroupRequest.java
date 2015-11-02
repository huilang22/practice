/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupRequest.java
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
public final class ProductGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductGroupRequest (String request, ProductGroupRequestMethod method) {
    initialize(request, "ProductGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setProductGroupForProductGroupCreate(ProductGroupObjectData data) {
    if (data != null) {
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(data, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }
  public void setProductGroupForProductGroupDelete(ProductGroupObjectKeyData data) {
    if (data != null) {
      addInput("ProductGroup", ProductGroupObjectKeyHelper.toMap(data, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }
  public void setProductGroupForProductGroupFind(ProductGroupObjectFilter data) {
    if (data != null) {
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(data, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }
  public void setProductGroupForProductGroupGet(ProductGroupObjectKeyData data) {
    if (data != null) {
      addInput("ProductGroup", ProductGroupObjectKeyHelper.toMap(data, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }
  public void setProductGroupForProductGroupUpdate(ProductGroupObjectData data) {
    if (data != null) {
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(data, new HashMap(), "ProductGroup").get("ProductGroup"));
    }
  }
  public ProductGroupObjectData getProductGroupObjectDataProductGroupFromProductGroupCreate() {
    return ProductGroupObjectHelper.fromMap(outputMap, "ProductGroup");
  }
  public ProductGroupObjectDataList getProductGroupObjectDataProductGroupFromProductGroupFind() {
    return ProductGroupObjectHelper.fromMapList(outputMap, "ProductGroupList");
  }
  public ProductGroupObjectData getProductGroupObjectDataProductGroupFromProductGroupGet() {
    return ProductGroupObjectHelper.fromMap(outputMap, "ProductGroup");
  }
  public ProductGroupObjectData getProductGroupObjectDataProductGroupFromProductGroupUpdate() {
    return ProductGroupObjectHelper.fromMap(outputMap, "ProductGroup");
  }
  /**
   @deprecated
   */
  public void setProductGroupObjectFilter(ProductGroupObjectFilter data) {
    if (data != null) {
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(data, new HashMap()).get("ProductGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductGroupObjectData(ProductGroupObjectData data) {
    if (data != null) {
      addInput("ProductGroup", ProductGroupObjectHelper.toMap(data, new HashMap()).get("ProductGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductGroupObjectKeyData(ProductGroupObjectKeyData data) {
    if (data != null) {
      addInput("ProductGroup", ProductGroupObjectKeyHelper.toMap(data, new HashMap()).get("ProductGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductGroupObjectDataList getProductGroupObjectDataList() {
    return ProductGroupObjectHelper.fromMapList(outputMap, "ProductGroupList");
  }
  /**
   @deprecated
   */
  public ProductGroupObjectData getProductGroupObjectData() {
    return ProductGroupObjectHelper.fromMap(outputMap, "ProductGroup");
  }
}
