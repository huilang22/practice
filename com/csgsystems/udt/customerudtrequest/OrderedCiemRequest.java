/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedCiemRequest.java
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
public final class OrderedCiemRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderedCiemRequest (String request, OrderedCiemRequestMethod method) {
    initialize(request, "OrderedCiem", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderedCiemRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvElementRequest request, OrderedCiemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvElementRequest request, OrderedCiemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedCiemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedCiemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, OrderedCiemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, OrderedCiemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OrderedCiemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OrderedCiemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OrderedCiemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OrderedCiemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setCustomerIdEquipMapForOrderedCiemCreate(CustomerIdEquipMapObjectData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setFindExistingSOForOrderedCiemCreate(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setOrderForOrderedCiemCreate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceOrderForOrderedCiemCreate(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedCiemCreate(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setCustomerIdEquipMapForOrderedCiemDisconnect(CustomerIdEquipMapObjectData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setFindExistingSOForOrderedCiemDisconnect(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setInactiveDtForOrderedCiemDisconnect(Date data) {
    if (data != null) {
      addInput("InactiveDt", data);
    }
  }
  public void setOrderForOrderedCiemDisconnect(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceOrderForOrderedCiemDisconnect(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedCiemDisconnect(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setCustomerIdEquipMapForOrderedCiemSetCurrent(CustomerIdEquipMapObjectData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap(), "CustomerIdEquipMap").get("CustomerIdEquipMap"));
    }
  }
  public void setEffectiveDtForOrderedCiemSetCurrent(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  public void setFindExistingSOForOrderedCiemSetCurrent(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setOrderForOrderedCiemSetCurrent(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceOrderForOrderedCiemSetCurrent(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedCiemSetCurrent(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public OrderedCiemCreateOutputData getOrderedCiemCreateOutputDataOrderedCiemCreateOutputDataFromOrderedCiemCreate() {
    return OrderedCiemCreateOutputHelper.fromMap(outputMap);
  }
  public OrderedCiemDisconnectOutputData getOrderedCiemDisconnectOutputDataOrderedCiemDisconnectOutputDataFromOrderedCiemDisconnect() {
    return OrderedCiemDisconnectOutputHelper.fromMap(outputMap);
  }
  public OrderedCiemSetCurrentOutputData getOrderedCiemSetCurrentOutputDataOrderedCiemSetCurrentOutputDataFromOrderedCiemSetCurrent() {
    return OrderedCiemSetCurrentOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setCustomerIdEquipMapObjectData(CustomerIdEquipMapObjectData data) {
    if (data != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(data, new HashMap()).get("CustomerIdEquipMapObject"));
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
  public void setOrderObjectData(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap()).get("OrderObject"));
    }
  }
  /**
   @deprecated
   */
  public OrderedCiemCreateOutputData getOrderedCiemCreateOutputData() {
    return OrderedCiemCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedCiemDisconnectOutputData getOrderedCiemDisconnectOutputData() {
    return OrderedCiemDisconnectOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedCiemSetCurrentOutputData getOrderedCiemSetCurrentOutputData() {
    return OrderedCiemSetCurrentOutputHelper.fromMap(outputMap);
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
}
