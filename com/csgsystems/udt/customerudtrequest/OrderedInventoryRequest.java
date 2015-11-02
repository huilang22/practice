/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInventoryRequest.java
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
import com.csgsystems.om.data.*;
public final class OrderedInventoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderedInventoryRequest (String request, OrderedInventoryRequestMethod method) {
    initialize(request, "OrderedInventory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderedInventoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerIdEquipMapRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerIdEquipMapRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NrcRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NrcRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedCiemRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedCiemRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(VanityCodeChargeMapRequest request, OrderedInventoryRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(VanityCodeChargeMapRequest request, OrderedInventoryRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setEffectiveDtForOrderedInventoryAssign(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  public void setExternalIdTypeForOrderedInventoryAssign(Integer data) {
    if (data != null) {
      addInput("ExternalIdType", data);
    }
  }
  public void setFindExistingSOForOrderedInventoryAssign(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setInvElementForOrderedInventoryAssign(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvPlaceholderForOrderedInventoryAssign(InvPlaceholderObjectData data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(data, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }
  public void setManageVanityChargesForOrderedInventoryAssign(Boolean data) {
    if (data != null) {
      addInput("ManageVanityCharges", data);
    }
  }
  public void setOrderForOrderedInventoryAssign(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceForOrderedInventoryAssign(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceOrderForOrderedInventoryAssign(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedInventoryAssign(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setEffectiveDtForOrderedInventorySwap(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  public void setExternalIdTypeForOrderedInventorySwap(Integer data) {
    if (data != null) {
      addInput("ExternalIdType", data);
    }
  }
  public void setFindExistingSOForOrderedInventorySwap(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setManageVanityChargesForOrderedInventorySwap(Boolean data) {
    if (data != null) {
      addInput("ManageVanityCharges", data);
    }
  }
  public void setOrderForOrderedInventorySwap(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceForOrderedInventorySwap(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceOrderForOrderedInventorySwap(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setSwapInInvElementForOrderedInventorySwap(InvElementObjData data) {
    if (data != null) {
      addInput("SwapInInvElement", InvElementObjHelper.toMap(data, new HashMap(), "SwapInInvElement").get("SwapInInvElement"));
    }
  }
  public void setSwapOutInvElementForOrderedInventorySwap(InvElementObjData data) {
    if (data != null) {
      addInput("SwapOutInvElement", InvElementObjHelper.toMap(data, new HashMap(), "SwapOutInvElement").get("SwapOutInvElement"));
    }
  }
  public void setSwapReasonForOrderedInventorySwap(Integer data) {
    if (data != null) {
      addInput("SwapReason", data);
    }
  }
  public void setVerboseResponseForOrderedInventorySwap(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setDisconnectReasonForOrderedInventoryUnAssign(Integer data) {
    if (data != null) {
      addInput("DisconnectReason", data);
    }
  }
  public void setEffectiveDtForOrderedInventoryUnAssign(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  public void setFindExistingSOForOrderedInventoryUnAssign(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setInvElementForOrderedInventoryUnAssign(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setManageVanityChargesForOrderedInventoryUnAssign(Boolean data) {
    if (data != null) {
      addInput("ManageVanityCharges", data);
    }
  }
  public void setOrderForOrderedInventoryUnAssign(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceOrderForOrderedInventoryUnAssign(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedInventoryUnAssign(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public OrderedInventoryAssignOutputData getOrderedInventoryAssignOutputDataOrderedInventoryAssignOutputDataFromOrderedInventoryAssign() {
    return OrderedInventoryAssignOutputHelper.fromMap(outputMap);
  }
  public OrderedInventorySwapOutputData getOrderedInventorySwapOutputDataOrderedInventorySwapOutputDataFromOrderedInventorySwap() {
    return OrderedInventorySwapOutputHelper.fromMap(outputMap);
  }
  public OrderedInventoryUnAssignOutputData getOrderedInventoryUnAssignOutputDataOrderedInventoryUnAssignOutputDataFromOrderedInventoryUnAssign() {
    return OrderedInventoryUnAssignOutputHelper.fromMap(outputMap);
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
  public void setEffectiveDt(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  /**
   @deprecated
   */
  public void setExternalIdType(Integer data) {
    if (data != null) {
      addInput("ExternalIdType", data);
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
  public void setInvElementObjData(InvElementObjData data) {
    if (data != null) {
      addInput("InvElementObj", InvElementObjHelper.toMap(data, new HashMap()).get("InvElementObj"));
    }
  }
  /**
   @deprecated
   */
  public void setInvPlaceholderObjectData(InvPlaceholderObjectData data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(data, new HashMap()).get("InvPlaceholderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setManageVanityCharges(Boolean data) {
    if (data != null) {
      addInput("ManageVanityCharges", data);
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
  public OrderedInventoryAssignOutputData getOrderedInventoryAssignOutputData() {
    return OrderedInventoryAssignOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedInventorySwapOutputData getOrderedInventorySwapOutputData() {
    return OrderedInventorySwapOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedInventoryUnAssignOutputData getOrderedInventoryUnAssignOutputData() {
    return OrderedInventoryUnAssignOutputHelper.fromMap(outputMap);
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
  public void setSwapReason(Integer data) {
    if (data != null) {
      addInput("SwapReason", data);
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
}
