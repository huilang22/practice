/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedPackageRequest.java
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
public final class OrderedPackageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderedPackageRequest (String request, OrderedPackageRequestMethod method) {
    initialize(request, "OrderedPackage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderedPackageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentRequest request, OrderedPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentRequest request, OrderedPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, OrderedPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, OrderedPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, OrderedPackageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, OrderedPackageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setFindExistingSOForOrderedPackageCreate(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setOrderForOrderedPackageCreate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setProductPackageForOrderedPackageCreate(ProductPackageObjectData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setServiceOrderForOrderedPackageCreate(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedPackageCreate(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setAnnotationForOrderedPackageDisconnect(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  public void setInactiveDtForOrderedPackageDisconnect(Date data) {
    if (data != null) {
      addInput("InactiveDt", data);
    }
  }
  public void setOrderForOrderedPackageDisconnect(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setProductPackageForOrderedPackageDisconnect(ProductPackageObjectData data) {
    if (data != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(data, new HashMap(), "ProductPackage").get("ProductPackage"));
    }
  }
  public void setStatusReasonIdForOrderedPackageDisconnect(Integer data) {
    if (data != null) {
      addInput("StatusReasonId", data);
    }
  }
  public void setVerboseResponseForOrderedPackageDisconnect(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setWaiveTerminationObligationForOrderedPackageDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveTerminationObligation", data);
    }
  }
  public void setWaiveUnmetObligationForOrderedPackageDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveUnmetObligation", data);
    }
  }
  public OrderedPackageCreateOutputData getOrderedPackageCreateOutputDataOrderedPackageCreateOutputDataFromOrderedPackageCreate() {
    return OrderedPackageCreateOutputHelper.fromMap(outputMap);
  }
  public OrderedPackageDisconnectOutputData getOrderedPackageDisconnectOutputDataOrderedPackageDisconnectOutputDataFromOrderedPackageDisconnect() {
    return OrderedPackageDisconnectOutputHelper.fromMap(outputMap);
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
  public OrderedPackageCreateOutputData getOrderedPackageCreateOutputData() {
    return OrderedPackageCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedPackageDisconnectOutputData getOrderedPackageDisconnectOutputData() {
    return OrderedPackageDisconnectOutputHelper.fromMap(outputMap);
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
  public void setVerboseResponse(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
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
  public void setWaiveUnmetObligation(Integer data) {
    if (data != null) {
      addInput("WaiveUnmetObligation", data);
    }
  }
}
