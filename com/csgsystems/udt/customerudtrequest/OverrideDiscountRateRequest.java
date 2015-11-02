/*
 * Generated code DO NOT EDIT
 * Generated file: OverrideDiscountRateRequest.java
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
public final class OverrideDiscountRateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OverrideDiscountRateRequest (String request, OverrideDiscountRateRequestMethod method) {
    initialize(request, "OverrideDiscountRate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OverrideDiscountRateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, OverrideDiscountRateRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, OverrideDiscountRateRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, OverrideDiscountRateRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, OverrideDiscountRateRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setOverrideDiscountRateForOverrideDiscountRateCreate(RDOverrideObjectData data) {
    if (data != null) {
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(data, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }
  public void setOverrideDiscountRateForOverrideDiscountRateFind(RDOverrideObjectFilter data) {
    if (data != null) {
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(data, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }
  public void setOverrideDiscountRateForOverrideDiscountRateGet(RDOverrideObjectKeyData data) {
    if (data != null) {
      addInput("OverrideDiscountRate", RDOverrideObjectKeyHelper.toMap(data, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }
  public void setOverrideDiscountRateForOverrideDiscountRateUpdate(RDOverrideObjectData data) {
    if (data != null) {
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(data, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }
  public RDOverrideObjectData getRDOverrideObjectDataOverrideDiscountRateFromOverrideDiscountRateCreate() {
    return RDOverrideObjectHelper.fromMap(outputMap, "OverrideDiscountRate");
  }
  public RDOverrideObjectDataList getRDOverrideObjectDataOverrideDiscountRateFromOverrideDiscountRateFind() {
    return RDOverrideObjectHelper.fromMapList(outputMap, "OverrideDiscountRateList");
  }
  public RDOverrideObjectData getRDOverrideObjectDataOverrideDiscountRateFromOverrideDiscountRateGet() {
    return RDOverrideObjectHelper.fromMap(outputMap, "OverrideDiscountRate");
  }
  public RDOverrideObjectData getRDOverrideObjectDataOverrideDiscountRateFromOverrideDiscountRateUpdate() {
    return RDOverrideObjectHelper.fromMap(outputMap, "OverrideDiscountRate");
  }
  /**
   @deprecated
   */
  public void setRDOverrideObjectFilter(RDOverrideObjectFilter data) {
    if (data != null) {
      addInput("RDOverride", RDOverrideObjectHelper.toMap(data, new HashMap()).get("RDOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRDOverrideObjectData(RDOverrideObjectData data) {
    if (data != null) {
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(data, new HashMap()).get("RDOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRDOverrideObjectKeyData(RDOverrideObjectKeyData data) {
    if (data != null) {
      addInput("OverrideDiscountRate", RDOverrideObjectKeyHelper.toMap(data, new HashMap()).get("RDOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public RDOverrideObjectDataList getRDOverrideObjectDataList() {
    return RDOverrideObjectHelper.fromMapList(outputMap, "RDOverrideList");
  }
  /**
   @deprecated
   */
  public RDOverrideObjectData getRDOverrideObjectData() {
    return RDOverrideObjectHelper.fromMap(outputMap, "OverrideDiscountRate");
  }
}
