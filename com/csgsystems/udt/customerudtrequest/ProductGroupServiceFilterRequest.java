/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupServiceFilterRequest.java
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
public final class ProductGroupServiceFilterRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductGroupServiceFilterRequest (String request, ProductGroupServiceFilterRequestMethod method) {
    initialize(request, "ProductGroupServiceFilter", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductGroupServiceFilterRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setProductGroupServiceFilterForProductGroupServiceFilterCreate(PGSFObjectData data) {
    if (data != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(data, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }
  public void setProductGroupServiceFilterForProductGroupServiceFilterDelete(PGSFObjectKeyData data) {
    if (data != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectKeyHelper.toMap(data, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }
  public void setProductGroupServiceFilterForProductGroupServiceFilterFind(PGSFObjectFilter data) {
    if (data != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(data, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }
  public void setProductGroupServiceFilterForProductGroupServiceFilterGet(PGSFObjectKeyData data) {
    if (data != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectKeyHelper.toMap(data, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }
  public void setProductGroupServiceFilterForProductGroupServiceFilterUpdate(PGSFObjectData data) {
    if (data != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(data, new HashMap(), "ProductGroupServiceFilter").get("ProductGroupServiceFilter"));
    }
  }
  public PGSFObjectData getPGSFObjectDataProductGroupServiceFilterFromProductGroupServiceFilterCreate() {
    return PGSFObjectHelper.fromMap(outputMap, "ProductGroupServiceFilter");
  }
  public PGSFObjectData getPGSFObjectDataProductGroupServiceFilterFromProductGroupServiceFilterDelete() {
    return PGSFObjectHelper.fromMap(outputMap, "ProductGroupServiceFilter");
  }
  public PGSFObjectDataList getPGSFObjectDataProductGroupServiceFilterFromProductGroupServiceFilterFind() {
    return PGSFObjectHelper.fromMapList(outputMap, "ProductGroupServiceFilterList");
  }
  public PGSFObjectData getPGSFObjectDataProductGroupServiceFilterFromProductGroupServiceFilterGet() {
    return PGSFObjectHelper.fromMap(outputMap, "ProductGroupServiceFilter");
  }
  public PGSFObjectData getPGSFObjectDataProductGroupServiceFilterFromProductGroupServiceFilterUpdate() {
    return PGSFObjectHelper.fromMap(outputMap, "ProductGroupServiceFilter");
  }
  /**
   @deprecated
   */
  public void setPGSFObjectFilter(PGSFObjectFilter data) {
    if (data != null) {
      addInput("PGSF", PGSFObjectHelper.toMap(data, new HashMap()).get("PGSFObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPGSFObjectData(PGSFObjectData data) {
    if (data != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectHelper.toMap(data, new HashMap()).get("PGSFObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPGSFObjectKeyData(PGSFObjectKeyData data) {
    if (data != null) {
      addInput("ProductGroupServiceFilter", PGSFObjectKeyHelper.toMap(data, new HashMap()).get("PGSFObject"));
    }
  }
  /**
   @deprecated
   */
  public PGSFObjectDataList getPGSFObjectDataList() {
    return PGSFObjectHelper.fromMapList(outputMap, "PGSFList");
  }
  /**
   @deprecated
   */
  public PGSFObjectData getPGSFObjectData() {
    return PGSFObjectHelper.fromMap(outputMap, "ProductGroupServiceFilter");
  }
}
