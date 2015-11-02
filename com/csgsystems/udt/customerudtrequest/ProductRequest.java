/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRequest.java
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
public final class ProductRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductRequest (String request, ProductRequestMethod method) {
    initialize(request, "Product", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvElementRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvElementRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRateKeyRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRateKeyRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRateOverrideRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRateOverrideRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, ProductRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, ProductRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAccountCurrencyCodeForCurrencyDerive(Integer data) {
    if (data != null) {
      addInput("AccountCurrencyCode", data);
    }
  }
  public void setBServiceCountryCodeForCurrencyDerive(Integer data) {
    if (data != null) {
      addInput("BServiceCountryCode", data);
    }
  }
  public void setBillCountryCodeForCurrencyDerive(Integer data) {
    if (data != null) {
      addInput("BillCountryCode", data);
    }
  }
  public void setCustCountryCodeForCurrencyDerive(Integer data) {
    if (data != null) {
      addInput("CustCountryCode", data);
    }
  }
  public void setServiceCountryCodeForCurrencyDerive(Integer data) {
    if (data != null) {
      addInput("ServiceCountryCode", data);
    }
  }
  public void setServiceCurrencyCodeForCurrencyDerive(Integer data) {
    if (data != null) {
      addInput("ServiceCurrencyCode", data);
    }
  }
  public void setSubtypeCodeForCurrencyDerive(Integer data) {
    if (data != null) {
      addInput("SubtypeCode", data);
    }
  }
  public void setTypeCodeForCurrencyDerive(Integer data) {
    if (data != null) {
      addInput("TypeCode", data);
    }
  }
  public void setProductForProductAlternateGet(ProductObjectBaseData data) {
    if (data != null) {
      addInput("Product", ProductObjectBaseHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public void setBillingAccountInternalIdForProductBillToReevaluate(Integer data) {
    if (data != null) {
      addInput("BillingAccountInternalId", data);
    }
  }
  public void setEffectiveDateForProductBillToReevaluate(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setOpenItemIdForProductBillToReevaluate(Integer data) {
    if (data != null) {
      addInput("OpenItemId", data);
    }
  }
  public void setProductForProductBillToReevaluate(ProductObjectBaseKeyData data) {
    if (data != null) {
      addInput("Product", ProductObjectBaseKeyHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public void setReevaluationDateForProductBillToReevaluate(Date data) {
    if (data != null) {
      addInput("ReevaluationDate", data);
    }
  }
  public void setProductForProductCreate(ProductObjectBaseData data) {
    if (data != null) {
      addInput("Product", ProductObjectBaseHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public void setProductForProductDisconnectValidate(ProductObjectData data) {
    if (data != null) {
      addInput("Product", ProductObjectHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public void setProductForProductExtendedDataFind(ProductObjectBaseKeyData data) {
    if (data != null) {
      addInput("Product", ProductObjectBaseKeyHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public void setProductForProductExternalFind(ProductObjectFilter data) {
    if (data != null) {
      addInput("Product", ProductObjectHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public void setProductForProductFindByServiceOrder(ProductObjectBaseFilter data) {
    if (data != null) {
      addInput("Product", ProductObjectBaseHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public void setServiceOrderIdForProductFindByServiceOrder(String data) {
    if (data != null) {
      addInput("ServiceOrderId", data);
    }
  }
  public void setProductForProductFind(ProductObjectBaseFilter data) {
    if (data != null) {
      addInput("Product", ProductObjectBaseHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public void setProductForProductFindWithExtendedData(ProductObjectFilter data) {
    if (data != null) {
      addInput("Product", ProductObjectHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public void setProductForProductGet(ProductObjectBaseKeyData data) {
    if (data != null) {
      addInput("Product", ProductObjectBaseKeyHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public void setProductForProductUpdate(ProductObjectBaseData data) {
    if (data != null) {
      addInput("Product", ProductObjectBaseHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public void setEffectiveDtForProductUpdateValidate(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  public void setProductForProductUpdateValidate(ProductObjectData data) {
    if (data != null) {
      addInput("Product", ProductObjectHelper.toMap(data, new HashMap(), "Product").get("Product"));
    }
  }
  public Integer getIntegerCurrencyCodeFromCurrencyDerive() {
    return (Integer)outputMap.get("CurrencyCode");
  }
  public ProductObjectBaseData getProductObjectBaseDataProductFromProductAlternateGet() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
  public ProductObjectBaseData getProductObjectBaseDataProductFromProductBillToReevaluate() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
  public ProductObjectBaseData getProductObjectBaseDataProductFromProductCreate() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
  public ProductEDObjectDataList getProductEDObjectDataProductExtendedDataFromProductExtendedDataFind() {
    return ProductEDObjectHelper.fromMapList(outputMap, "ProductExtendedDataList");
  }
  public ProductObjectDataList getProductObjectDataProductFromProductExternalFind() {
    return ProductObjectHelper.fromMapList(outputMap, "ProductList");
  }
  public ProductObjectBaseDataList getProductObjectBaseDataProductFromProductFindByServiceOrder() {
    return ProductObjectBaseHelper.fromMapList(outputMap, "ProductList");
  }
  public ProductObjectBaseDataList getProductObjectBaseDataProductFromProductFind() {
    return ProductObjectBaseHelper.fromMapList(outputMap, "ProductList");
  }
  public ProductObjectDataList getProductObjectDataProductFromProductFindWithExtendedData() {
    return ProductObjectHelper.fromMapList(outputMap, "ProductList");
  }
  public ProductObjectBaseData getProductObjectBaseDataProductFromProductGet() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
  public ProductObjectBaseData getProductObjectBaseDataProductFromProductUpdate() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
  /**
   @deprecated
   */
  public void setAccountCurrencyCode(Integer data) {
    if (data != null) {
      addInput("AccountCurrencyCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setBServiceCountryCode(Integer data) {
    if (data != null) {
      addInput("BServiceCountryCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setBillCountryCode(Integer data) {
    if (data != null) {
      addInput("BillCountryCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setBillingAccountInternalId(Integer data) {
    if (data != null) {
      addInput("BillingAccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setCustCountryCode(Integer data) {
    if (data != null) {
      addInput("CustCountryCode", data);
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
  public void setEffectiveDt(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  /**
   @deprecated
   */
  public void setOpenItemId(Integer data) {
    if (data != null) {
      addInput("OpenItemId", data);
    }
  }
  /**
   @deprecated
   */
  public ProductEDObjectDataList getProductEDObjectDataList() {
    return ProductEDObjectHelper.fromMapList(outputMap, "ProductList");
  }
  /**
   @deprecated
   */
  public void setProductObjectFilter(ProductObjectFilter data) {
    if (data != null) {
      addInput("Product", ProductObjectHelper.toMap(data, new HashMap()).get("ProductObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProductObjectData(ProductObjectData data) {
    if (data != null) {
      addInput("Product", ProductObjectHelper.toMap(data, new HashMap()).get("ProductObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductObjectDataList getProductObjectDataList() {
    return ProductObjectHelper.fromMapList(outputMap, "ProductList");
  }
  /**
   @deprecated
   */
  public void setProductObjectBaseFilter(ProductObjectBaseFilter data) {
    if (data != null) {
      addInput("Product", ProductObjectBaseHelper.toMap(data, new HashMap()).get("ProductObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setProductObjectBaseData(ProductObjectBaseData data) {
    if (data != null) {
      addInput("Product", ProductObjectBaseHelper.toMap(data, new HashMap()).get("ProductObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setProductObjectBaseKeyData(ProductObjectBaseKeyData data) {
    if (data != null) {
      addInput("Product", ProductObjectBaseKeyHelper.toMap(data, new HashMap()).get("ProductObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public ProductObjectBaseDataList getProductObjectBaseDataList() {
    return ProductObjectBaseHelper.fromMapList(outputMap, "ProductList");
  }
  /**
   @deprecated
   */
  public Map  getProductObjectBaseExtendedData() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product").extendedData;
  }
  
  /**
   @deprecated
   */
  public ProductObjectBaseData getProductObjectBaseData() {
    return ProductObjectBaseHelper.fromMap(outputMap, "Product");
  }
  /**
   @deprecated
   */
  public void setReevaluationDate(Date data) {
    if (data != null) {
      addInput("ReevaluationDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceCountryCode(Integer data) {
    if (data != null) {
      addInput("ServiceCountryCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceCurrencyCode(Integer data) {
    if (data != null) {
      addInput("ServiceCurrencyCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderId(String data) {
    if (data != null) {
      addInput("ServiceOrderId", data);
    }
  }
  /**
   @deprecated
   */
  public void setSubtypeCode(Integer data) {
    if (data != null) {
      addInput("SubtypeCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setTypeCode(Integer data) {
    if (data != null) {
      addInput("TypeCode", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getCurrencyCode() {
    return (Integer)outputMap.get("CurrencyCode");
  }
}
