/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvElementRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvElementRequest (String request, InvElementRequestMethod method) {
    initialize(request, "InvElement", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvElementRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerIdEquipMapRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerIdEquipMapRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NrcRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NrcRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedCiemRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedCiemRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(VanityCodeChargeMapRequest request, InvElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(VanityCodeChargeMapRequest request, InvElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setInvElementForInvElementAssign(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setAssgnContFlagForInvElementAutoAssign(Integer data) {
    if (data != null) {
      addInput("AssgnContFlag", data);
    }
  }
  public void setAssgnQuantityForInvElementAutoAssign(Integer data) {
    if (data != null) {
      addInput("AssgnQuantity", data);
    }
  }
  public void setInvElementForInvElementAutoAssign(InvElementObjFilter data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementAutoCont(InvElementObjFilter data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementAuto(InvElementObjFilter data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setContiguousFlagForInvElementAutoReserve(Integer data) {
    if (data != null) {
      addInput("ContiguousFlag", data);
    }
  }
  public void setInvElementForInvElementAutoReserve(InvElementObjFilter data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setQuantityForInvElementAutoReserve(Integer data) {
    if (data != null) {
      addInput("Quantity", data);
    }
  }
  public void setInvElementForInvElementBulkCreate(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementBulkFind(InvElementObjFilter data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementCreate(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setEquipmentActionIdForInvElementExecuteAction(Integer data) {
    if (data != null) {
      addInput("EquipmentActionId", data);
    }
  }
  public void setInvElementForInvElementExecuteAction(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementExtendedDataFind(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementFindByServiceOrder(InvElementObjFilter data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setServiceOrderIdForInvElementFindByServiceOrder(String data) {
    if (data != null) {
      addInput("ServiceOrderId", data);
    }
  }
  public void setInvElementForInvElementFind(InvElementObjFilter data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementFindPendingExtendedData(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setWpJobIdForInvElementFindPendingExtendedData(String data) {
    if (data != null) {
      addInput("WpJobId", data);
    }
  }
  public void setInvElementForInvElementFindWithExtendedData(InvElementObjFilter data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementGet(InvElementObjKeyData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjKeyHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementReserve(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementReturn(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setSwapDiscReasonForInvElementSwap(Integer data) {
    if (data != null) {
      addInput("SwapDiscReason", data);
    }
  }
  public void setSwapParamAForInvElementSwap(Integer data) {
    if (data != null) {
      addInput("SwapParamA", data);
    }
  }
  public void setSwapParamBForInvElementSwap(Integer data) {
    if (data != null) {
      addInput("SwapParamB", data);
    }
  }
  public void setSwapStartDateForInvElementSwap(Date data) {
    if (data != null) {
      addInput("SwapStartDate", data);
    }
  }
  public void setViewIdSwapInForInvElementSwap(String data) {
    if (data != null) {
      addInput("ViewIdSwapIn", data);
    }
  }
  public void setViewIdSwapOutForInvElementSwap(String data) {
    if (data != null) {
      addInput("ViewIdSwapOut", data);
    }
  }
  public void setInvElementForInvElementTransfer(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementTransferReserve(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setEquipmentTransactionIdForInvElementTxnUpdate(Integer data) {
    if (data != null) {
      addInput("EquipmentTransactionId", data);
    }
  }
  public void setInvElementForInvElementTxnUpdate(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setDisconnectReasonForInvElementUnAssign(Integer data) {
    if (data != null) {
      addInput("DisconnectReason", data);
    }
  }
  public void setInvElementForInvElementUnAssign(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementUnReserve(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementUpdate(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementViewCancel(InvElementObjKeyData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjKeyHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementViewComplete(InvElementObjKeyData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjKeyHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementViewUpdateCheck(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvElementForInvElementViewUpdate(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromInvElementAssign() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromInvElementAutoAssign() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromInvElementAutoCont() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromInvElementAuto() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromInvElementBulkCreate() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromInvElementBulkFind() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  public InvElementObjData getInvElementObjDataInvElementFromInvElementCreate() {
    return InvElementObjHelper.fromMap(outputMap, "InvElement");
  }
  public InvElementEDObjDataList getInvElementEDObjDataInvElementExtendedDataFromInvElementExtendedDataFind() {
    return InvElementEDObjHelper.fromMapList(outputMap, "InvElementExtendedDataList");
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromInvElementFindByServiceOrder() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromInvElementFind() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  public InvElementEDObjDataList getInvElementEDObjDataInvElementPendingExtendedDataFromInvElementFindPendingExtendedData() {
    return InvElementEDObjHelper.fromMapList(outputMap, "InvElementPendingExtendedDataList");
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromInvElementFindWithExtendedData() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  public InvElementObjData getInvElementObjDataInvElementFromInvElementGet() {
    return InvElementObjHelper.fromMap(outputMap, "InvElement");
  }
  public InvElementObjData getInvElementObjDataInvElementFromInvElementReturn() {
    return InvElementObjHelper.fromMap(outputMap, "InvElement");
  }
  public InvElementSwapOutputData getInvElementSwapOutputDataInvElementSwapOutputDataFromInvElementSwap() {
    return InvElementSwapOutputHelper.fromMap(outputMap);
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromInvElementTxnUpdate() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromInvElementUnAssign() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  public InvElementObjData getInvElementObjDataInvElementFromInvElementUpdate() {
    return InvElementObjHelper.fromMap(outputMap, "InvElement");
  }
  public Integer getIntegerVCountFromInvTransitionSP() {
    return (Integer)outputMap.get("VCount");
  }
  /**
   @deprecated
   */
  public void setAssgnContFlag(Integer data) {
    if (data != null) {
      addInput("AssgnContFlag", data);
    }
  }
  /**
   @deprecated
   */
  public void setAssgnQuantity(Integer data) {
    if (data != null) {
      addInput("AssgnQuantity", data);
    }
  }
  /**
   @deprecated
   */
  public void setContiguousFlag(Integer data) {
    if (data != null) {
      addInput("ContiguousFlag", data);
    }
  }
  /**
   @deprecated
   */
  public void setDisconnectReason(Integer data) {
    if (data != null) {
      addInput("DisconnectReason", data);
    }
  }
  /**
   @deprecated
   */
  public void setEquipmentActionId(Integer data) {
    if (data != null) {
      addInput("EquipmentActionId", data);
    }
  }
  /**
   @deprecated
   */
  public void setEquipmentTransactionId(Integer data) {
    if (data != null) {
      addInput("EquipmentTransactionId", data);
    }
  }
  /**
   @deprecated
   */
  public InvElementEDObjDataList getInvElementEDObjDataList() {
    return InvElementEDObjHelper.fromMapList(outputMap, "InvElementList");
  }
  /**
   @deprecated
   */
  public void setInvElementObjFilter(InvElementObjFilter data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap()).get("InvElementObj"));
    }
  }
  /**
   @deprecated
   */
  public void setInvElementObjData(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap()).get("InvElementObj"));
    }
  }
  /**
   @deprecated
   */
  public void setInvElementObjKeyData(InvElementObjKeyData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjKeyHelper.toMap(data, new HashMap()).get("InvElementObj"));
    }
  }
  /**
   @deprecated
   */
  public void setInvElementObjDataArray(InvElementObjData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = InvElementObjHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvElement");
      }
      addInput("InvElementList", list);
    }
  }
  /**
   @deprecated
   */
  public InvElementObjDataList getInvElementObjDataList() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
  /**
   @deprecated
   */
  public Map  getInvElementObjExtendedData() {
    return InvElementObjHelper.fromMap(outputMap, "InvElement").extendedData;
  }
  
  /**
   @deprecated
   */
  public InvElementObjData getInvElementObjData() {
    return InvElementObjHelper.fromMap(outputMap, "InvElement");
  }
  /**
   @deprecated
   */
  public InvElementSwapOutputData getInvElementSwapOutputData() {
    return InvElementSwapOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setQuantity(Integer data) {
    if (data != null) {
      addInput("Quantity", data);
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
  public void setSwapDiscReason(Integer data) {
    if (data != null) {
      addInput("SwapDiscReason", data);
    }
  }
  /**
   @deprecated
   */
  public void setSwapParamA(Integer data) {
    if (data != null) {
      addInput("SwapParamA", data);
    }
  }
  /**
   @deprecated
   */
  public void setSwapParamB(Integer data) {
    if (data != null) {
      addInput("SwapParamB", data);
    }
  }
  /**
   @deprecated
   */
  public void setSwapStartDate(Date data) {
    if (data != null) {
      addInput("SwapStartDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setViewIdSwapIn(String data) {
    if (data != null) {
      addInput("ViewIdSwapIn", data);
    }
  }
  /**
   @deprecated
   */
  public void setViewIdSwapOut(String data) {
    if (data != null) {
      addInput("ViewIdSwapOut", data);
    }
  }
  /**
   @deprecated
   */
  public void setWpJobId(String data) {
    if (data != null) {
      addInput("WpJobId", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getVCount() {
    return (Integer)outputMap.get("VCount");
  }
}
