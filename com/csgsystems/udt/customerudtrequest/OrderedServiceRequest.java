/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedServiceRequest.java
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
public final class OrderedServiceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderedServiceRequest (String request, OrderedServiceRequestMethod method) {
    initialize(request, "OrderedService", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderedServiceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CorridorRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CorridorRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerIdEquipMapRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerIdEquipMapRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(EmfConfigurationRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(EmfConfigurationRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvElementRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvElementRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NrcRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NrcRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OpenItemIdMapRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OpenItemIdMapRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedCiemRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedCiemRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceOrderRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceOrderRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServicePricingPlanRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServicePricingPlanRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceStatusRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceStatusRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceZoneRequest request, OrderedServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceZoneRequest request, OrderedServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setOrderForOrderedServiceCreate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceForOrderedServiceCreate(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setVerboseResponseForOrderedServiceCreate(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setAnnotationForOrderedServiceDisconnect(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  public void setInactiveDtForOrderedServiceDisconnect(Date data) {
    if (data != null) {
      addInput("InactiveDt", data);
    }
  }
  public void setOrderForOrderedServiceDisconnect(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceForOrderedServiceDisconnect(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setStatusReasonIdForOrderedServiceDisconnect(Integer data) {
    if (data != null) {
      addInput("StatusReasonId", data);
    }
  }
  public void setVerboseResponseForOrderedServiceDisconnect(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setWaiveInstallmentNrcForOrderedServiceDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveInstallmentNrc", data);
    }
  }
  public void setWaiveRefinanceNrcForOrderedServiceDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveRefinanceNrc", data);
    }
  }
  public void setWaiveTerminationObligationForOrderedServiceDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveTerminationObligation", data);
    }
  }
  public void setWaiveUnbilledNrcForOrderedServiceDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveUnbilledNrc", data);
    }
  }
  public void setWaiveUnmetObligationForOrderedServiceDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveUnmetObligation", data);
    }
  }
  public void setAddressIdForOrderedServiceMove(Integer data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  public void setPivotDateForOrderedServiceMove(Date data) {
    if (data != null) {
      addInput("PivotDate", data);
    }
  }
  public void setServiceForOrderedServiceMove(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceOrderForOrderedServiceMove(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setUpdateAccountAlternateAddressForOrderedServiceMove(Integer data) {
    if (data != null) {
      addInput("UpdateAccountAlternateAddress", data);
    }
  }
  public void setUpdateAccountBillingAddressForOrderedServiceMove(Integer data) {
    if (data != null) {
      addInput("UpdateAccountBillingAddress", data);
    }
  }
  public void setVerboseResponseForOrderedServiceMove(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setAnnotationForOrderedServiceResume(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  public void setOrderForOrderedServiceResume(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setResumeDtForOrderedServiceResume(Date data) {
    if (data != null) {
      addInput("ResumeDt", data);
    }
  }
  public void setServiceForOrderedServiceResume(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setStatusReasonIdForOrderedServiceResume(Integer data) {
    if (data != null) {
      addInput("StatusReasonId", data);
    }
  }
  public void setVerboseResponseForOrderedServiceResume(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setAnnotationForOrderedServiceSuspend(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  public void setOrderForOrderedServiceSuspend(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setResumeDtForOrderedServiceSuspend(Date data) {
    if (data != null) {
      addInput("ResumeDt", data);
    }
  }
  public void setServiceForOrderedServiceSuspend(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setStatusReasonIdForOrderedServiceSuspend(Integer data) {
    if (data != null) {
      addInput("StatusReasonId", data);
    }
  }
  public void setSuspendDtForOrderedServiceSuspend(Date data) {
    if (data != null) {
      addInput("SuspendDt", data);
    }
  }
  public void setVerboseResponseForOrderedServiceSuspend(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setAnnotationForOrderedServiceTransfer(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  public void setNewBalanceAccountInternalIdForOrderedServiceTransfer(Integer data) {
    if (data != null) {
      addInput("NewBalanceAccountInternalId", data);
    }
  }
  public void setNewOpenItemIdForOrderedServiceTransfer(Integer data) {
    if (data != null) {
      addInput("NewOpenItemId", data);
    }
  }
  public void setNewPostpaidAccountInternalIdForOrderedServiceTransfer(Integer data) {
    if (data != null) {
      addInput("NewPostpaidAccountInternalId", data);
    }
  }
  public void setOrderForOrderedServiceTransfer(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceForOrderedServiceTransfer(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setStatusReasonIdForOrderedServiceTransfer(Integer data) {
    if (data != null) {
      addInput("StatusReasonId", data);
    }
  }
  public void setTransferDtForOrderedServiceTransfer(Date data) {
    if (data != null) {
      addInput("TransferDt", data);
    }
  }
  public void setTransferToAccountInternalIdForOrderedServiceTransfer(Integer data) {
    if (data != null) {
      addInput("TransferToAccountInternalId", data);
    }
  }
  public void setVerboseResponseForOrderedServiceTransfer(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setWaiveInstallmentNrcsForOrderedServiceTransfer(Integer data) {
    if (data != null) {
      addInput("WaiveInstallmentNrcs", data);
    }
  }
  public void setWaiveRefinanceNrcsForOrderedServiceTransfer(Integer data) {
    if (data != null) {
      addInput("WaiveRefinanceNrcs", data);
    }
  }
  public void setWaiveUnbilledNrcsForOrderedServiceTransfer(Integer data) {
    if (data != null) {
      addInput("WaiveUnbilledNrcs", data);
    }
  }
  public void setEffectiveDtForOrderedServiceUpdate(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  public void setFindExistingSOForOrderedServiceUpdate(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setOrderForOrderedServiceUpdate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceForOrderedServiceUpdate(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceOrderForOrderedServiceUpdate(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedServiceUpdate(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public OrderedServiceCreateOutputData getOrderedServiceCreateOutputDataOrderedServiceCreateOutputDataFromOrderedServiceCreate() {
    return OrderedServiceCreateOutputHelper.fromMap(outputMap);
  }
  public OrderedServiceDisconnectOutputData getOrderedServiceDisconnectOutputDataOrderedServiceDisconnectOutputDataFromOrderedServiceDisconnect() {
    return OrderedServiceDisconnectOutputHelper.fromMap(outputMap);
  }
  public OrderedServiceMoveOutputData getOrderedServiceMoveOutputDataOrderedServiceMoveOutputDataFromOrderedServiceMove() {
    return OrderedServiceMoveOutputHelper.fromMap(outputMap);
  }
  public OrderedServiceResumeOutputData getOrderedServiceResumeOutputDataOrderedServiceResumeOutputDataFromOrderedServiceResume() {
    return OrderedServiceResumeOutputHelper.fromMap(outputMap);
  }
  public OrderedServiceSuspendOutputData getOrderedServiceSuspendOutputDataOrderedServiceSuspendOutputDataFromOrderedServiceSuspend() {
    return OrderedServiceSuspendOutputHelper.fromMap(outputMap);
  }
  public OrderedServiceTransferOutputData getOrderedServiceTransferOutputDataOrderedServiceTransferOutputDataFromOrderedServiceTransfer() {
    return OrderedServiceTransferOutputHelper.fromMap(outputMap);
  }
  public OrderedServiceUpdateOutputData getOrderedServiceUpdateOutputDataOrderedServiceUpdateOutputDataFromOrderedServiceUpdate() {
    return OrderedServiceUpdateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setAddressId(Integer data) {
    if (data != null) {
      addInput("AddressId", data);
    }
  }
  /**
   @deprecated
   */
  public void setAnnotation(String data) {
    if (data != null) {
      addInput("Annotation", data);
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
  public void setFindExistingSO(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  /**
   @deprecated
   */
  public void setInactiveDt(Date data) {
    if (data != null) {
      addInput("InactiveDt", data);
    }
  }
  /**
   @deprecated
   */
  public void setNewBalanceAccountInternalId(Integer data) {
    if (data != null) {
      addInput("NewBalanceAccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setNewOpenItemId(Integer data) {
    if (data != null) {
      addInput("NewOpenItemId", data);
    }
  }
  /**
   @deprecated
   */
  public void setNewPostpaidAccountInternalId(Integer data) {
    if (data != null) {
      addInput("NewPostpaidAccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setOrderObjectData(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap()).get("OrderObject"));
    }
  }
  /**
   @deprecated
   */
  public OrderedServiceCreateOutputData getOrderedServiceCreateOutputData() {
    return OrderedServiceCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedServiceDisconnectOutputData getOrderedServiceDisconnectOutputData() {
    return OrderedServiceDisconnectOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedServiceMoveOutputData getOrderedServiceMoveOutputData() {
    return OrderedServiceMoveOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedServiceResumeOutputData getOrderedServiceResumeOutputData() {
    return OrderedServiceResumeOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedServiceSuspendOutputData getOrderedServiceSuspendOutputData() {
    return OrderedServiceSuspendOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedServiceTransferOutputData getOrderedServiceTransferOutputData() {
    return OrderedServiceTransferOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedServiceUpdateOutputData getOrderedServiceUpdateOutputData() {
    return OrderedServiceUpdateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setPivotDate(Date data) {
    if (data != null) {
      addInput("PivotDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setResumeDt(Date data) {
    if (data != null) {
      addInput("ResumeDt", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceObjectData(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap()).get("ServiceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderObjectData(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap()).get("ServiceOrderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setStatusReasonId(Integer data) {
    if (data != null) {
      addInput("StatusReasonId", data);
    }
  }
  /**
   @deprecated
   */
  public void setSuspendDt(Date data) {
    if (data != null) {
      addInput("SuspendDt", data);
    }
  }
  /**
   @deprecated
   */
  public void setTransferDt(Date data) {
    if (data != null) {
      addInput("TransferDt", data);
    }
  }
  /**
   @deprecated
   */
  public void setTransferToAccountInternalId(Integer data) {
    if (data != null) {
      addInput("TransferToAccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setUpdateAccountAlternateAddress(Integer data) {
    if (data != null) {
      addInput("UpdateAccountAlternateAddress", data);
    }
  }
  /**
   @deprecated
   */
  public void setUpdateAccountBillingAddress(Integer data) {
    if (data != null) {
      addInput("UpdateAccountBillingAddress", data);
    }
  }
  /**
   @deprecated
   */
  public void setVerboseResponse(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveInstallmentNrc(Integer data) {
    if (data != null) {
      addInput("WaiveInstallmentNrc", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveInstallmentNrcs(Integer data) {
    if (data != null) {
      addInput("WaiveInstallmentNrcs", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveRefinanceNrc(Integer data) {
    if (data != null) {
      addInput("WaiveRefinanceNrc", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveRefinanceNrcs(Integer data) {
    if (data != null) {
      addInput("WaiveRefinanceNrcs", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveTerminationObligation(Integer data) {
    if (data != null) {
      addInput("WaiveTerminationObligation", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveUnbilledNrc(Integer data) {
    if (data != null) {
      addInput("WaiveUnbilledNrc", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveUnbilledNrcs(Integer data) {
    if (data != null) {
      addInput("WaiveUnbilledNrcs", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveUnmetObligation(Integer data) {
    if (data != null) {
      addInput("WaiveUnmetObligation", data);
    }
  }
}
