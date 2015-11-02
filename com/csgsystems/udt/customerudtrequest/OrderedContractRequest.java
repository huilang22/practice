/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedContractRequest.java
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
public final class OrderedContractRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderedContractRequest (String request, OrderedContractRequestMethod method) {
    initialize(request, "OrderedContract", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderedContractRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountHqContractRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountHqContractRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ContractUnitCreditRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ContractUnitCreditRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NrcRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NrcRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OverrideDiscountRateRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OverrideDiscountRateRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OverrideUsageCreditRateRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OverrideUsageCreditRateRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OrderedContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OrderedContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setCustomerContractForOrderedContractCreate(CustomerContractObjectData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setFindExistingSOForOrderedContractCreate(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setOrderForOrderedContractCreate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceOrderForOrderedContractCreate(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedContractCreate(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setWaiveActivationForOrderedContractCreate(Boolean data) {
    if (data != null) {
      addInput("WaiveActivation", data);
    }
  }
  public void setCustomerContractForOrderedContractDisconnect(CustomerContractObjectData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setFindExistingSOForOrderedContractDisconnect(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setInactiveDtForOrderedContractDisconnect(Date data) {
    if (data != null) {
      addInput("InactiveDt", data);
    }
  }
  public void setOrderForOrderedContractDisconnect(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceOrderForOrderedContractDisconnect(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedContractDisconnect(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setWaiveTerminationForOrderedContractDisconnect(Boolean data) {
    if (data != null) {
      addInput("WaiveTermination", data);
    }
  }
  public void setWaiveUnmetObligationForOrderedContractDisconnect(Boolean data) {
    if (data != null) {
      addInput("WaiveUnmetObligation", data);
    }
  }
  public void setCustomerContractForOrderedContractUpdate(CustomerContractObjectData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(data, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
  public void setEffectiveDtForOrderedContractUpdate(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  public void setFindExistingSOForOrderedContractUpdate(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setOrderForOrderedContractUpdate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceOrderForOrderedContractUpdate(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedContractUpdate(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public OrderedContractCreateOutputData getOrderedContractCreateOutputDataOrderedContractCreateOutputDataFromOrderedContractCreate() {
    return OrderedContractCreateOutputHelper.fromMap(outputMap);
  }
  public OrderedContractDisconnectOutputData getOrderedContractDisconnectOutputDataOrderedContractDisconnectOutputDataFromOrderedContractDisconnect() {
    return OrderedContractDisconnectOutputHelper.fromMap(outputMap);
  }
  public OrderedContractUpdateOutputData getOrderedContractUpdateOutputDataOrderedContractUpdateOutputDataFromOrderedContractUpdate() {
    return OrderedContractUpdateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setCustomerContractObjectData(CustomerContractObjectData data) {
    if (data != null) {
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(data, new HashMap()).get("CustomerContractObject"));
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
  public OrderedContractCreateOutputData getOrderedContractCreateOutputData() {
    return OrderedContractCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedContractDisconnectOutputData getOrderedContractDisconnectOutputData() {
    return OrderedContractDisconnectOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedContractUpdateOutputData getOrderedContractUpdateOutputData() {
    return OrderedContractUpdateOutputHelper.fromMap(outputMap);
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
