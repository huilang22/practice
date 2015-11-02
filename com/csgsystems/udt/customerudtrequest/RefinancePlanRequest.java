/*
 * Generated code DO NOT EDIT
 * Generated file: RefinancePlanRequest.java
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
public final class RefinancePlanRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RefinancePlanRequest (String request, RefinancePlanRequestMethod method) {
    initialize(request, "RefinancePlan", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RefinancePlanRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, RefinancePlanRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, RefinancePlanRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, RefinancePlanRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, RefinancePlanRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NrcRequest request, RefinancePlanRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NrcRequest request, RefinancePlanRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, RefinancePlanRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, RefinancePlanRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setRefinancePlanForRefinancePlanFind(RefinancePlanObjectFilter data) {
    if (data != null) {
      addInput("RefinancePlan", RefinancePlanObjectHelper.toMap(data, new HashMap(), "RefinancePlan").get("RefinancePlan"));
    }
  }
  public void setRefinancePlanForRefinancePlanGet(RefinancePlanObjectKeyData data) {
    if (data != null) {
      addInput("RefinancePlan", RefinancePlanObjectKeyHelper.toMap(data, new HashMap(), "RefinancePlan").get("RefinancePlan"));
    }
  }
  public RefinancePlanObjectDataList getRefinancePlanObjectDataRefinancePlanFromRefinancePlanFind() {
    return RefinancePlanObjectHelper.fromMapList(outputMap, "RefinancePlanList");
  }
  public RefinancePlanObjectData getRefinancePlanObjectDataRefinancePlanFromRefinancePlanGet() {
    return RefinancePlanObjectHelper.fromMap(outputMap, "RefinancePlan");
  }
  /**
   @deprecated
   */
  public void setRefinancePlanObjectFilter(RefinancePlanObjectFilter data) {
    if (data != null) {
      addInput("RefinancePlan", RefinancePlanObjectHelper.toMap(data, new HashMap()).get("RefinancePlanObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRefinancePlanObjectKeyData(RefinancePlanObjectKeyData data) {
    if (data != null) {
      addInput("RefinancePlan", RefinancePlanObjectKeyHelper.toMap(data, new HashMap()).get("RefinancePlanObject"));
    }
  }
  /**
   @deprecated
   */
  public RefinancePlanObjectDataList getRefinancePlanObjectDataList() {
    return RefinancePlanObjectHelper.fromMapList(outputMap, "RefinancePlanList");
  }
  /**
   @deprecated
   */
  public RefinancePlanObjectData getRefinancePlanObjectData() {
    return RefinancePlanObjectHelper.fromMap(outputMap, "RefinancePlan");
  }
}
