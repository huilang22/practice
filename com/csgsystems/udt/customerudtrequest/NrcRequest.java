/*
 * Generated code DO NOT EDIT
 * Generated file: NrcRequest.java
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
import com.csgsystems.om.data.*;
public final class NrcRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NrcRequest (String request, NrcRequestMethod method) {
    initialize(request, "Nrc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NrcRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvElementRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvElementRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NrcRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NrcRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(RefinancePlanRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(RefinancePlanRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, NrcRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, NrcRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setNrcForNrcAlternateGet(NrcObjectBaseData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setBillingAccountInternalIdForNrcBillToReevaluate(Integer data) {
    if (data != null) {
      addInput("BillingAccountInternalId", data);
    }
  }
  public void setNrcForNrcBillToReevaluate(NrcObjectBaseKeyData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setOpenItemIdForNrcBillToReevaluate(Integer data) {
    if (data != null) {
      addInput("OpenItemId", data);
    }
  }
  public void setReevaluationDateForNrcBillToReevaluate(Date data) {
    if (data != null) {
      addInput("ReevaluationDate", data);
    }
  }
  public void setNrcForNrcCreate(NrcObjectBaseData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setNrcForNrcDelete(NrcObjectBaseKeyData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setNrcForNrcDeleteValidate(NrcObjectBaseData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setNrcForNrcExtendedDataFind(NrcObjectBaseKeyData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setNrcForNrcExternalFind(NrcObjectFilter data) {
    if (data != null) {
      addInput("Nrc", NrcObjectHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setViewableOnlyForNrcExternalFind(Boolean data) {
    if (data != null) {
      addInput("ViewableOnly", data);
    }
  }
  public void setNrcForNrcFindByServiceOrder(NrcObjectBaseFilter data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setServiceOrderIdForNrcFindByServiceOrder(String data) {
    if (data != null) {
      addInput("ServiceOrderId", data);
    }
  }
  public void setViewableOnlyForNrcFindByServiceOrder(Boolean data) {
    if (data != null) {
      addInput("ViewableOnly", data);
    }
  }
  public void setNrcForNrcFind(NrcObjectBaseFilter data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setViewableOnlyForNrcFind(Boolean data) {
    if (data != null) {
      addInput("ViewableOnly", data);
    }
  }
  public void setNrcForNrcFindWithExtendedData(NrcObjectFilter data) {
    if (data != null) {
      addInput("Nrc", NrcObjectHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setViewableOnlyForNrcFindWithExtendedData(Boolean data) {
    if (data != null) {
      addInput("ViewableOnly", data);
    }
  }
  public void setNrcForNrcGet(NrcObjectBaseKeyData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setNrcForNrcNoBackoutFind(NrcInvObjectFilter data) {
    if (data != null) {
      addInput("Nrc", NrcInvObjectHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setBalanceLineItemForNrcRefinanceCreate(BalanceLineItemObjectData data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(data, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
  public void setNrcForNrcRefinanceCreate(NrcObjectBaseData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setAccountInternalIdForNrcUnbilledInstallmentFind(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setDisconnectDateForNrcUnbilledInstallmentFind(Date data) {
    if (data != null) {
      addInput("DisconnectDate", data);
    }
  }
  public void setServiceInternalIdForNrcUnbilledInstallmentFind(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForNrcUnbilledInstallmentFind(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setNrcForNrcUpdate(NrcObjectBaseData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public void setNrcForNrcUpdateValidate(NrcObjectBaseData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(data, new HashMap(), "Nrc").get("Nrc"));
    }
  }
  public NrcObjectBaseData getNrcObjectBaseDataNrcFromNrcAlternateGet() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
  public NrcObjectBaseData getNrcObjectBaseDataNrcFromNrcBillToReevaluate() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
  public NrcObjectBaseData getNrcObjectBaseDataNrcFromNrcCreate() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
  public NrcObjectBaseData getNrcObjectBaseDataNrcFromNrcDelete() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
  public NrcEDObjectDataList getNrcEDObjectDataNrcExtendedDataFromNrcExtendedDataFind() {
    return NrcEDObjectHelper.fromMapList(outputMap, "NrcExtendedDataList");
  }
  public NrcObjectDataList getNrcObjectDataNrcFromNrcExternalFind() {
    return NrcObjectHelper.fromMapList(outputMap, "NrcList");
  }
  public NrcObjectBaseDataList getNrcObjectBaseDataNrcFromNrcFindByServiceOrder() {
    return NrcObjectBaseHelper.fromMapList(outputMap, "NrcList");
  }
  public NrcObjectBaseDataList getNrcObjectBaseDataNrcFromNrcFind() {
    return NrcObjectBaseHelper.fromMapList(outputMap, "NrcList");
  }
  public NrcObjectDataList getNrcObjectDataNrcFromNrcFindWithExtendedData() {
    return NrcObjectHelper.fromMapList(outputMap, "NrcList");
  }
  public NrcObjectBaseData getNrcObjectBaseDataNrcFromNrcGet() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
  public NrcInvObjectDataList getNrcInvObjectDataNrcFromNrcNoBackoutFind() {
    return NrcInvObjectHelper.fromMapList(outputMap, "NrcList");
  }
  public NrcObjectBaseData getNrcObjectBaseDataNrcFromNrcRefinanceCreate() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
  }
  public NrcObjectBaseDataList getNrcObjectBaseDataNrcFromNrcUnbilledInstallmentFind() {
    return NrcObjectBaseHelper.fromMapList(outputMap, "NrcList");
  }
  public NrcObjectBaseData getNrcObjectBaseDataNrcFromNrcUpdate() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
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
  public void setBalanceLineItemObjectDataArray(BalanceLineItemObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = BalanceLineItemObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "BalanceLineItem");
      }
      addInput("BalanceLineItemList", list);
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
  public void setDisconnectDate(Date data) {
    if (data != null) {
      addInput("DisconnectDate", data);
    }
  }
  /**
   @deprecated
   */
  public NrcEDObjectDataList getNrcEDObjectDataList() {
    return NrcEDObjectHelper.fromMapList(outputMap, "NrcList");
  }
  /**
   @deprecated
   */
  public void setNrcInvObjectFilter(NrcInvObjectFilter data) {
    if (data != null) {
      addInput("Nrc", NrcInvObjectHelper.toMap(data, new HashMap()).get("NrcInvObject"));
    }
  }
  /**
   @deprecated
   */
  public NrcInvObjectDataList getNrcInvObjectDataList() {
    return NrcInvObjectHelper.fromMapList(outputMap, "NrcList");
  }
  /**
   @deprecated
   */
  public void setNrcObjectFilter(NrcObjectFilter data) {
    if (data != null) {
      addInput("Nrc", NrcObjectHelper.toMap(data, new HashMap()).get("NrcObject"));
    }
  }
  /**
   @deprecated
   */
  public NrcObjectDataList getNrcObjectDataList() {
    return NrcObjectHelper.fromMapList(outputMap, "NrcList");
  }
  /**
   @deprecated
   */
  public void setNrcObjectBaseFilter(NrcObjectBaseFilter data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(data, new HashMap()).get("NrcObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setNrcObjectBaseData(NrcObjectBaseData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseHelper.toMap(data, new HashMap()).get("NrcObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setNrcObjectBaseKeyData(NrcObjectBaseKeyData data) {
    if (data != null) {
      addInput("Nrc", NrcObjectBaseKeyHelper.toMap(data, new HashMap()).get("NrcObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public NrcObjectBaseDataList getNrcObjectBaseDataList() {
    return NrcObjectBaseHelper.fromMapList(outputMap, "NrcList");
  }
  /**
   @deprecated
   */
  public Map  getNrcObjectBaseExtendedData() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc").extendedData;
  }
  
  /**
   @deprecated
   */
  public NrcObjectBaseData getNrcObjectBaseData() {
    return NrcObjectBaseHelper.fromMap(outputMap, "Nrc");
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
  public void setReevaluationDate(Date data) {
    if (data != null) {
      addInput("ReevaluationDate", data);
    }
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
  public void setViewableOnly(Boolean data) {
    if (data != null) {
      addInput("ViewableOnly", data);
    }
  }
}
