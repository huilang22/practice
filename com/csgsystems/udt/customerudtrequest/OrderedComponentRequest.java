/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedComponentRequest.java
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
public final class OrderedComponentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderedComponentRequest (String request, OrderedComponentRequestMethod method) {
    initialize(request, "OrderedComponent", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderedComponentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, OrderedComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, OrderedComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedPackageRequest request, OrderedComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedPackageRequest request, OrderedComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OrderedComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OrderedComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductPackageRequest request, OrderedComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductPackageRequest request, OrderedComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OrderedComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OrderedComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setComponentForOrderedComponentCreate(ComponentObjectData data) {
    if (data != null) {
      addInput("Component", ComponentObjectHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setFindExistingSOForOrderedComponentCreate(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setGroupIdForOrderedComponentCreate(Integer data) {
    if (data != null) {
      addInput("GroupId", data);
    }
  }
  public void setGroupIdServForOrderedComponentCreate(Integer data) {
    if (data != null) {
      addInput("GroupIdServ", data);
    }
  }
  public void setOrderForOrderedComponentCreate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setOwningAccountInternalIdForOrderedComponentCreate(Integer data) {
    if (data != null) {
      addInput("OwningAccountInternalId", data);
    }
  }
  public void setServiceOrderForOrderedComponentCreate(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedComponentCreate(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setWaiveActivationForOrderedComponentCreate(Boolean data) {
    if (data != null) {
      addInput("WaiveActivation", data);
    }
  }
  public void setComponentForOrderedComponentDisconnect(ComponentObjectData data) {
    if (data != null) {
      addInput("Component", ComponentObjectHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setFindExistingSOForOrderedComponentDisconnect(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setInactiveDtForOrderedComponentDisconnect(Date data) {
    if (data != null) {
      addInput("InactiveDt", data);
    }
  }
  public void setOrderForOrderedComponentDisconnect(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceOrderForOrderedComponentDisconnect(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedComponentDisconnect(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setWaiveTerminationForOrderedComponentDisconnect(Boolean data) {
    if (data != null) {
      addInput("WaiveTermination", data);
    }
  }
  public void setWaiveUnmetObligationForOrderedComponentDisconnect(Boolean data) {
    if (data != null) {
      addInput("WaiveUnmetObligation", data);
    }
  }
  public OrderedComponentCreateOutputData getOrderedComponentCreateOutputDataOrderedComponentCreateOutputDataFromOrderedComponentCreate() {
    return OrderedComponentCreateOutputHelper.fromMap(outputMap);
  }
  public OrderedComponentDisconnectOutputData getOrderedComponentDisconnectOutputDataOrderedComponentDisconnectOutputDataFromOrderedComponentDisconnect() {
    return OrderedComponentDisconnectOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setComponentObjectData(ComponentObjectData data) {
    if (data != null) {
      addInput("Component", ComponentObjectHelper.toMap(data, new HashMap()).get("ComponentObject"));
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
  public void setGroupId(Integer data) {
    if (data != null) {
      addInput("GroupId", data);
    }
  }
  /**
   @deprecated
   */
  public void setGroupIdServ(Integer data) {
    if (data != null) {
      addInput("GroupIdServ", data);
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
  public void setOrderObjectData(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap()).get("OrderObject"));
    }
  }
  /**
   @deprecated
   */
  public OrderedComponentCreateOutputData getOrderedComponentCreateOutputData() {
    return OrderedComponentCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedComponentDisconnectOutputData getOrderedComponentDisconnectOutputData() {
    return OrderedComponentDisconnectOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setOwningAccountInternalId(Integer data) {
    if (data != null) {
      addInput("OwningAccountInternalId", data);
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
  public void setVerboseResponse(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveActivation(Boolean data) {
    if (data != null) {
      addInput("WaiveActivation", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveTermination(Boolean data) {
    if (data != null) {
      addInput("WaiveTermination", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveUnmetObligation(Boolean data) {
    if (data != null) {
      addInput("WaiveUnmetObligation", data);
    }
  }
}
