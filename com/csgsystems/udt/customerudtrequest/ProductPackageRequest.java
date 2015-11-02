/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageRequest.java
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

import com.csgsystems.om.data.*;
public final class ProductPackageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductPackageRequest (String request, ProductPackageRequestMethod method) {
    initialize(request, "ProductPackage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductPackageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, ProductPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, ProductPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentRequest request, ProductPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentRequest request, ProductPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, ProductPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, ProductPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, ProductPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, ProductPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, ProductPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, ProductPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, ProductPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, ProductPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setProductPackageForProductPackageActivate(ProductPackageObjectKeyData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setComponentIdForProductPackageActiveComponentCount(Integer data) {
    if (data != null) {
      addInput("ComponentId", data);
    }
  }
  public void setEffectiveDateForProductPackageActiveComponentCount(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setProductPackageForProductPackageActiveComponentCount(ProductPackageObjectKeyData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setProductPackageForProductPackageCancel(ProductPackageObjectData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setProductPackageForProductPackageCreate(ProductPackageObjectData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setInactiveDateForProductPackageDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setInactiveDateForProductPackageDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setProductPackageForProductPackageDeleteList(ProductPackageObjectFilter data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setProductPackageForProductPackageDelete(ProductPackageObjectKeyData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setProductPackageForProductPackageDisconnectValidate(ProductPackageObjectData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setProductPackageForProductPackageFindPendingByComponent(ProductPackageJoinItemObjectFilter data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageJoinItemObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setProductPackageForProductPackageFindPendingByPackage(ProductPackageJoinItemObjectFilter data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageJoinItemObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setProductPackageForProductPackageFind(ProductPackageObjectFilter data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setProductPackageForProductPackageGet(ProductPackageObjectKeyData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setProductPackageForProductPackageOverridesFind(ProductPackageObjectFilter data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setProductPackageForProductPackageOwnerFind(ProductPackageOwnerObjectFilter data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageOwnerObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setProductPackageForProductPackageUpdate(ProductPackageObjectData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public ProductPackageObjectData getProductPackageObjectDataProductPackageFromProductPackageActivate() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
  public Integer getIntegerActiveCountFromProductPackageActiveComponentCount() {
    return (Integer)outputMap.get("ActiveCount");
  }
  public ProductPackageObjectData getProductPackageObjectDataProductPackageFromProductPackageCreate() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
  public ProductPackageObjectDataList getProductPackageObjectDataProductPackageFromProductPackageDeleteList() {
    return ProductPackageObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
  public ProductPackageObjectData getProductPackageObjectDataProductPackageFromProductPackageDelete() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
  public ProductPackageServiceOrderObjectDataList getProductPackageServiceOrderObjectDataProductPackageFromProductPackageFindPendingByComponent() {
    return ProductPackageServiceOrderObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
  public ProductPackageServiceOrderObjectDataList getProductPackageServiceOrderObjectDataProductPackageFromProductPackageFindPendingByPackage() {
    return ProductPackageServiceOrderObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
  public ProductPackageObjectDataList getProductPackageObjectDataProductPackageFromProductPackageFind() {
    return ProductPackageObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
  public ProductPackageObjectData getProductPackageObjectDataProductPackageFromProductPackageGet() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
  public ProductPackageObjectDataList getProductPackageObjectDataProductPackageFromProductPackageOverridesFind() {
    return ProductPackageObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
  public ProductPackageObjectDataList getProductPackageObjectDataProductPackageFromProductPackageOwnerFind() {
    return ProductPackageObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
  public ProductPackageObjectData getProductPackageObjectDataProductPackageFromProductPackageUpdate() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
  /**
   @deprecated
   */
  public Integer getActiveCount() {
    return (Integer)outputMap.get("ActiveCount");
  }
  /**
   @deprecated
   */
  public void setComponentId(Integer data) {
    if (data != null) {
      addInput("ComponentId", data);
    }
  }
  /**
   @deprecated
   */
  public void setEffectiveDate(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
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
  public void setProductPackageJoinItemObjectFilter(ProductPackageJoinItemObjectFilter data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageJoinItemObjectHelper.toMap(data, new HashMap()).get("ProductPackageJoinItemObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductPackageObjectFilter(ProductPackageObjectFilter data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(data, new HashMap()).get("ProductPackageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductPackageObjectData(ProductPackageObjectData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(data, new HashMap()).get("ProductPackageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductPackageObjectKeyData(ProductPackageObjectKeyData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(data, new HashMap()).get("ProductPackageObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductPackageObjectDataList getProductPackageObjectDataList() {
    return ProductPackageObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
  /**
   @deprecated
   */
  public ProductPackageObjectData getProductPackageObjectData() {
    return ProductPackageObjectHelper.fromMap(outputMap, "ProductPackage");
  }
  /**
   @deprecated
   */
  public void setProductPackageOwnerObjectFilter(ProductPackageOwnerObjectFilter data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageOwnerObjectHelper.toMap(data, new HashMap()).get("ProductPackageOwnerObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductPackageServiceOrderObjectDataList getProductPackageServiceOrderObjectDataList() {
    return ProductPackageServiceOrderObjectHelper.fromMapList(outputMap, "ProductPackageList");
  }
}
