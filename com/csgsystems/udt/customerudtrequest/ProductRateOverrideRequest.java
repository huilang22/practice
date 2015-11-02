/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateOverrideRequest.java
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
public final class ProductRateOverrideRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductRateOverrideRequest (String request, ProductRateOverrideRequestMethod method) {
    initialize(request, "ProductRateOverride", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductRateOverrideRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, ProductRateOverrideRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, ProductRateOverrideRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, ProductRateOverrideRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, ProductRateOverrideRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setProductRateOverrideForProductRateOverrideCreate(ProductRateOverrideObjectData data) {
    if (data != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(data, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }
  public void setInactiveDateForProductRateOverrideDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setInactiveDateForProductRateOverrideDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setProductRateOverrideFilterForProductRateOverrideDeleteList(ProductRateOverrideObjectFilter data) {
    if (data != null) {
      addInput("ProductRateOverrideFilter", ProductRateOverrideObjectHelper.toMap(data, new HashMap(), "ProductRateOverrideFilter").get("ProductRateOverrideFilter"));
    }
  }
  public void setProductRateOverrideForProductRateOverrideDelete(ProductRateOverrideObjectKeyData data) {
    if (data != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectKeyHelper.toMap(data, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }
  public void setProductRateOverrideForProductRateOverrideFind(ProductRateOverrideObjectFilter data) {
    if (data != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(data, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }
  public void setProductRateOverrideForProductRateOverrideGet(ProductRateOverrideObjectKeyData data) {
    if (data != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectKeyHelper.toMap(data, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }
  public void setProductRateOverrideForProductRateOverrideUpdate(ProductRateOverrideObjectData data) {
    if (data != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(data, new HashMap(), "ProductRateOverride").get("ProductRateOverride"));
    }
  }
  public ProductRateOverrideObjectData getProductRateOverrideObjectDataProductRateOverrideFromProductRateOverrideCreate() {
    return ProductRateOverrideObjectHelper.fromMap(outputMap, "ProductRateOverride");
  }
  public ProductRateOverrideObjectDataList getProductRateOverrideObjectDataProductRateOverrideFromProductRateOverrideFind() {
    return ProductRateOverrideObjectHelper.fromMapList(outputMap, "ProductRateOverrideList");
  }
  public ProductRateOverrideObjectData getProductRateOverrideObjectDataProductRateOverrideFromProductRateOverrideGet() {
    return ProductRateOverrideObjectHelper.fromMap(outputMap, "ProductRateOverride");
  }
  public ProductRateOverrideObjectData getProductRateOverrideObjectDataProductRateOverrideFromProductRateOverrideUpdate() {
    return ProductRateOverrideObjectHelper.fromMap(outputMap, "ProductRateOverride");
  }
  /**
   @deprecated
   */
  public void setInactiveDate(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setProductRateOverrideObjectFilter(ProductRateOverrideObjectFilter data) {
    if (data != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(data, new HashMap()).get("ProductRateOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductRateOverrideObjectData(ProductRateOverrideObjectData data) {
    if (data != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectHelper.toMap(data, new HashMap()).get("ProductRateOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductRateOverrideObjectKeyData(ProductRateOverrideObjectKeyData data) {
    if (data != null) {
      addInput("ProductRateOverride", ProductRateOverrideObjectKeyHelper.toMap(data, new HashMap()).get("ProductRateOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductRateOverrideObjectDataList getProductRateOverrideObjectDataList() {
    return ProductRateOverrideObjectHelper.fromMapList(outputMap, "ProductRateOverrideList");
  }
  /**
   @deprecated
   */
  public ProductRateOverrideObjectData getProductRateOverrideObjectData() {
    return ProductRateOverrideObjectHelper.fromMap(outputMap, "ProductRateOverride");
  }
}
