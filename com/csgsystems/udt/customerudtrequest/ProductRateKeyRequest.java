/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateKeyRequest.java
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
public final class ProductRateKeyRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductRateKeyRequest (String request, ProductRateKeyRequestMethod method) {
    initialize(request, "ProductRateKey", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductRateKeyRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, ProductRateKeyRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, ProductRateKeyRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, ProductRateKeyRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, ProductRateKeyRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setProductRateKeyForProductRateKeyCreate(ProductRateKeyObjectData data) {
    if (data != null) {
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(data, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }
  public void setInactiveDateForProductRateKeyDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setInactiveDateForProductRateKeyDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setProductRateKeyFilterForProductRateKeyDeleteList(ProductRateKeyObjectFilter data) {
    if (data != null) {
      addInput("ProductRateKeyFilter", ProductRateKeyObjectHelper.toMap(data, new HashMap(), "ProductRateKeyFilter").get("ProductRateKeyFilter"));
    }
  }
  public void setProductRateKeyForProductRateKeyDelete(ProductRateKeyObjectKeyData data) {
    if (data != null) {
      addInput("ProductRateKey", ProductRateKeyObjectKeyHelper.toMap(data, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }
  public void setProductRateKeyForProductRateKeyFind(ProductRateKeyObjectFilter data) {
    if (data != null) {
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(data, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }
  public void setProductRateKeyForProductRateKeyGet(ProductRateKeyObjectKeyData data) {
    if (data != null) {
      addInput("ProductRateKey", ProductRateKeyObjectKeyHelper.toMap(data, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }
  public void setActiveDateForProductRateKeyJurisdictionDerive(Date data) {
    if (data != null) {
      addInput("ActiveDate", data);
    }
  }
  public void setElementIdForProductRateKeyJurisdictionDerive(Integer data) {
    if (data != null) {
      addInput("ElementId", data);
    }
  }
  public void setOriginLocCodeForProductRateKeyJurisdictionDerive(Integer data) {
    if (data != null) {
      addInput("OriginLocCode", data);
    }
  }
  public void setTargetLocCodeForProductRateKeyJurisdictionDerive(Integer data) {
    if (data != null) {
      addInput("TargetLocCode", data);
    }
  }
  public void setProductRateKeyForProductRateKeyUpdate(ProductRateKeyObjectData data) {
    if (data != null) {
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(data, new HashMap(), "ProductRateKey").get("ProductRateKey"));
    }
  }
  public ProductRateKeyObjectData getProductRateKeyObjectDataProductRateKeyFromProductRateKeyCreate() {
    return ProductRateKeyObjectHelper.fromMap(outputMap, "ProductRateKey");
  }
  public ProductRateKeyObjectDataList getProductRateKeyObjectDataProductRateKeyFromProductRateKeyFind() {
    return ProductRateKeyObjectHelper.fromMapList(outputMap, "ProductRateKeyList");
  }
  public ProductRateKeyObjectData getProductRateKeyObjectDataProductRateKeyFromProductRateKeyGet() {
    return ProductRateKeyObjectHelper.fromMap(outputMap, "ProductRateKey");
  }
  public Integer getIntegerJurisdictionCodeFromProductRateKeyJurisdictionDerive() {
    return (Integer)outputMap.get("JurisdictionCode");
  }
  public ProductRateKeyObjectData getProductRateKeyObjectDataProductRateKeyFromProductRateKeyUpdate() {
    return ProductRateKeyObjectHelper.fromMap(outputMap, "ProductRateKey");
  }
  /**
   @deprecated
   */
  public void setActiveDate(Date data) {
    if (data != null) {
      addInput("ActiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setElementId(Integer data) {
    if (data != null) {
      addInput("ElementId", data);
    }
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
  public Integer getJurisdictionCode() {
    return (Integer)outputMap.get("JurisdictionCode");
  }
  /**
   @deprecated
   */
  public void setOriginLocCode(Integer data) {
    if (data != null) {
      addInput("OriginLocCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setProductRateKeyObjectFilter(ProductRateKeyObjectFilter data) {
    if (data != null) {
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(data, new HashMap()).get("ProductRateKeyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductRateKeyObjectData(ProductRateKeyObjectData data) {
    if (data != null) {
      addInput("ProductRateKey", ProductRateKeyObjectHelper.toMap(data, new HashMap()).get("ProductRateKeyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductRateKeyObjectKeyData(ProductRateKeyObjectKeyData data) {
    if (data != null) {
      addInput("ProductRateKey", ProductRateKeyObjectKeyHelper.toMap(data, new HashMap()).get("ProductRateKeyObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductRateKeyObjectDataList getProductRateKeyObjectDataList() {
    return ProductRateKeyObjectHelper.fromMapList(outputMap, "ProductRateKeyList");
  }
  /**
   @deprecated
   */
  public ProductRateKeyObjectData getProductRateKeyObjectData() {
    return ProductRateKeyObjectHelper.fromMap(outputMap, "ProductRateKey");
  }
  /**
   @deprecated
   */
  public void setTargetLocCode(Integer data) {
    if (data != null) {
      addInput("TargetLocCode", data);
    }
  }
}
