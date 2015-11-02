/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractRequest.java
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
public final class CustomerContractRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CustomerContractRequest (String request, CustomerContractRequestMethod method) {
    initialize(request, "CustomerContract", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CustomerContractRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountHqContractRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountHqContractRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ContractUnitCreditRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ContractUnitCreditRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NrcRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NrcRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OverrideDiscountRateRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OverrideDiscountRateRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OverrideUsageCreditRateRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OverrideUsageCreditRateRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, CustomerContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, CustomerContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAccountInternalIdForAccountDisconnectChargeAccountAmountGet(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setEffectiveDateForAccountDisconnectChargeAccountAmountGet(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setAccountInternalIdForAccountDisconnectChargeAmountGet(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setEffectiveDateForAccountDisconnectChargeAmountGet(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setAccountInternalIdForAccountDisconnectChargeServiceAmountGet(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setEffectiveDateForAccountDisconnectChargeServiceAmountGet(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setCompInstIdForComponentDisconnectChargeAmountGet(Integer data) {
    if (data != null) {
      addInput("CompInstId", data);
    }
  }
  public void setCompInstIdServForComponentDisconnectChargeAmountGet(Integer data) {
    if (data != null) {
      addInput("CompInstIdServ", data);
    }
  }
  public void setDisconnectDateForComponentDisconnectChargeAmountGet(Date data) {
    if (data != null) {
      addInput("DisconnectDate", data);
    }
  }
  public void setCustomerContractForCustomerContractAlternateGet(CustomerContractObjectBaseData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCustomerContractForCustomerContractCreate(CustomerContractObjectBaseData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCustomerContractForCustomerContractCreateInternal(CustomerContractObjectBaseData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCCDCeaseDateForCustomerContractDelete(Date data) {
    if (data != null) {
      addInput("CCDCeaseDate", data);
    }
  }
  public void setCustomerContractForCustomerContractDelete(CustomerContractObjectBaseKeyData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseKeyHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCustomerContractForCustomerContractDeleteList(CustomerContractObjectBaseFilter data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setWaiveCommitmentChargeForCustomerContractDelete(Integer data) {
    if (data != null) {
      addInput("WaiveCommitmentCharge", data);
    }
  }
  public void setWaiveTerminationChargeForCustomerContractDelete(Integer data) {
    if (data != null) {
      addInput("WaiveTerminationCharge", data);
    }
  }
  public void setContractTrackingIdForCustomerContractDisconnectChargeAmountGet(Integer data) {
    if (data != null) {
      addInput("ContractTrackingId", data);
    }
  }
  public void setContractTrackingIdServForCustomerContractDisconnectChargeAmountGet(Integer data) {
    if (data != null) {
      addInput("ContractTrackingIdServ", data);
    }
  }
  public void setDisconnectDateForCustomerContractDisconnectChargeAmountGet(Date data) {
    if (data != null) {
      addInput("DisconnectDate", data);
    }
  }
  public void setCustomerContractForCustomerContractDisconnectValidate(CustomerContractObjectBaseData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCustomerContractForCustomerContractExtendedDataFind(CustomerContractObjectBaseKeyData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseKeyHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCustomerContractForCustomerContractExternalFind(CustomerContractObjectFilter data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCustomerContractForCustomerContractFindByServiceOrder(CustomerContractObjectBaseFilter data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setServiceOrderIdForCustomerContractFindByServiceOrder(String data) {
    if (data != null) {
      addInput("ServiceOrderId", data);
    }
  }
  public void setCustomerContractForCustomerContractFind(CustomerContractObjectBaseFilter data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCustomerContractForCustomerContractFindWithExtendedData(CustomerContractObjectFilter data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCustomerContractForCustomerContractGet(CustomerContractObjectBaseKeyData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseKeyHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCustomerContractForCustomerContractHqFind(CustomerContractObjectBaseFilter data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCustomerContractForCustomerContractUpdate(CustomerContractObjectBaseData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setCustomerContractForCustomerContractUpdateValidate(CustomerContractObjectBaseData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setEffectiveDtForCustomerContractUpdateValidate(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  public void setEffectiveDateForServiceDisconnectChargeAmountGet(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setServiceInternalIdForServiceDisconnectChargeAmountGet(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForServiceDisconnectChargeAmountGet(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public AccountDisconnectChargeAccountAmountGetOutputData getAccountDisconnectChargeAccountAmountGetOutputDataAccountDisconnectChargeAccountAmountGetOutputDataFromAccountDisconnectChargeAccountAmountGet() {
    return AccountDisconnectChargeAccountAmountGetOutputHelper.fromMap(outputMap);
  }
  public AccountDisconnectChargeAmountGetOutputData getAccountDisconnectChargeAmountGetOutputDataAccountDisconnectChargeAmountGetOutputDataFromAccountDisconnectChargeAmountGet() {
    return AccountDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
  public AccountDisconnectChargeServiceAmountGetOutputData getAccountDisconnectChargeServiceAmountGetOutputDataAccountDisconnectChargeServiceAmountGetOutputDataFromAccountDisconnectChargeServiceAmountGet() {
    return AccountDisconnectChargeServiceAmountGetOutputHelper.fromMap(outputMap);
  }
  public ComponentDisconnectChargeAmountGetOutputData getComponentDisconnectChargeAmountGetOutputDataComponentDisconnectChargeAmountGetOutputDataFromComponentDisconnectChargeAmountGet() {
    return ComponentDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
  public CustomerContractObjectBaseData getCustomerContractObjectBaseDataCustomerContractFromCustomerContractAlternateGet() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
  public CustomerContractObjectBaseData getCustomerContractObjectBaseDataCustomerContractFromCustomerContractCreate() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
  public CustomerContractObjectBaseData getCustomerContractObjectBaseDataCustomerContractFromCustomerContractCreateInternal() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
  public CustomerContractObjectBaseData getCustomerContractObjectBaseDataCustomerContractFromCustomerContractDelete() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
  public CustomerContractObjectBaseDataList getCustomerContractObjectBaseDataCustomerContractFromCustomerContractDeleteList() {
    return CustomerContractObjectBaseHelper.fromMapList(outputMap, "CustomerContractList");
  }
  public CustomerContractDisconnectChargeAmountGetOutputData getCustomerContractDisconnectChargeAmountGetOutputDataCustomerContractDisconnectChargeAmountGetOutputDataFromCustomerContractDisconnectChargeAmountGet() {
    return CustomerContractDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
  public CustomerContractEDObjectDataList getCustomerContractEDObjectDataCustomerContractExtendedDataFromCustomerContractExtendedDataFind() {
    return CustomerContractEDObjectHelper.fromMapList(outputMap, "CustomerContractExtendedDataList");
  }
  public CustomerContractObjectDataList getCustomerContractObjectDataCustomerContractFromCustomerContractExternalFind() {
    return CustomerContractObjectHelper.fromMapList(outputMap, "CustomerContractList");
  }
  public CustomerContractObjectBaseDataList getCustomerContractObjectBaseDataCustomerContractFromCustomerContractFindByServiceOrder() {
    return CustomerContractObjectBaseHelper.fromMapList(outputMap, "CustomerContractList");
  }
  public CustomerContractObjectBaseDataList getCustomerContractObjectBaseDataCustomerContractFromCustomerContractFind() {
    return CustomerContractObjectBaseHelper.fromMapList(outputMap, "CustomerContractList");
  }
  public CustomerContractObjectDataList getCustomerContractObjectDataCustomerContractFromCustomerContractFindWithExtendedData() {
    return CustomerContractObjectHelper.fromMapList(outputMap, "CustomerContractList");
  }
  public CustomerContractObjectBaseData getCustomerContractObjectBaseDataCustomerContractFromCustomerContractGet() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
  public CustomerContractObjectBaseDataList getCustomerContractObjectBaseDataCustomerContractFromCustomerContractHqFind() {
    return CustomerContractObjectBaseHelper.fromMapList(outputMap, "CustomerContractList");
  }
  public CustomerContractObjectBaseData getCustomerContractObjectBaseDataCustomerContractFromCustomerContractUpdate() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
  public ServiceDisconnectChargeAmountGetOutputData getServiceDisconnectChargeAmountGetOutputDataServiceDisconnectChargeAmountGetOutputDataFromServiceDisconnectChargeAmountGet() {
    return ServiceDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public AccountDisconnectChargeAccountAmountGetOutputData getAccountDisconnectChargeAccountAmountGetOutputData() {
    return AccountDisconnectChargeAccountAmountGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public AccountDisconnectChargeAmountGetOutputData getAccountDisconnectChargeAmountGetOutputData() {
    return AccountDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public AccountDisconnectChargeServiceAmountGetOutputData getAccountDisconnectChargeServiceAmountGetOutputData() {
    return AccountDisconnectChargeServiceAmountGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setAccountInternalId(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setCCDCeaseDate(Date data) {
    if (data != null) {
      addInput("CCDCeaseDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setCompInstId(Integer data) {
    if (data != null) {
      addInput("CompInstId", data);
    }
  }
  /**
   @deprecated
   */
  public void setCompInstIdServ(Integer data) {
    if (data != null) {
      addInput("CompInstIdServ", data);
    }
  }
  /**
   @deprecated
   */
  public ComponentDisconnectChargeAmountGetOutputData getComponentDisconnectChargeAmountGetOutputData() {
    return ComponentDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setContractTrackingId(Integer data) {
    if (data != null) {
      addInput("ContractTrackingId", data);
    }
  }
  /**
   @deprecated
   */
  public void setContractTrackingIdServ(Integer data) {
    if (data != null) {
      addInput("ContractTrackingIdServ", data);
    }
  }
  /**
   @deprecated
   */
  public CustomerContractDisconnectChargeAmountGetOutputData getCustomerContractDisconnectChargeAmountGetOutputData() {
    return CustomerContractDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public CustomerContractEDObjectDataList getCustomerContractEDObjectDataList() {
    return CustomerContractEDObjectHelper.fromMapList(outputMap, "CustomerContractList");
  }
  /**
   @deprecated
   */
  public void setCustomerContractObjectFilter(CustomerContractObjectFilter data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(data, new HashMap()).get("CustomerContractObject"));
    }
  }
  /**
   @deprecated
   */
  public CustomerContractObjectDataList getCustomerContractObjectDataList() {
    return CustomerContractObjectHelper.fromMapList(outputMap, "CustomerContractList");
  }
  /**
   @deprecated
   */
  public void setCustomerContractObjectBaseFilter(CustomerContractObjectBaseFilter data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap()).get("CustomerContractObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setCustomerContractObjectBaseData(CustomerContractObjectBaseData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(data, new HashMap()).get("CustomerContractObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setCustomerContractObjectBaseKeyData(CustomerContractObjectBaseKeyData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectBaseKeyHelper.toMap(data, new HashMap()).get("CustomerContractObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public CustomerContractObjectBaseDataList getCustomerContractObjectBaseDataList() {
    return CustomerContractObjectBaseHelper.fromMapList(outputMap, "CustomerContractList");
  }
  /**
   @deprecated
   */
  public Map  getCustomerContractObjectBaseExtendedData() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract").extendedData;
  }
  
  /**
   @deprecated
   */
  public CustomerContractObjectBaseData getCustomerContractObjectBaseData() {
    return CustomerContractObjectBaseHelper.fromMap(outputMap, "CustomerContract");
  }
  /**
   @deprecated
   */
  public void setDisconnectDate(Date data) {
    if (data != null) {
      addInput("DisconnectDate", data);
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
  public ServiceDisconnectChargeAmountGetOutputData getServiceDisconnectChargeAmountGetOutputData() {
    return ServiceDisconnectChargeAmountGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setServiceInternalId(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceInternalIdResets(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
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
  public void setWaiveCommitmentCharge(Integer data) {
    if (data != null) {
      addInput("WaiveCommitmentCharge", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveTerminationCharge(Integer data) {
    if (data != null) {
      addInput("WaiveTerminationCharge", data);
    }
  }
}
