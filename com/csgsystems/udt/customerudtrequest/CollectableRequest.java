/*
 * Generated code DO NOT EDIT
 * Generated file: CollectableRequest.java
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

import com.csgsystems.ar.data.*;
public final class CollectableRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CollectableRequest (String request, CollectableRequestMethod method) {
    initialize(request, "Collectable", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CollectableRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, CollectableRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, CollectableRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, CollectableRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, CollectableRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(EventQueueRequest request, CollectableRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(EventQueueRequest request, CollectableRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, CollectableRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, CollectableRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, CollectableRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, CollectableRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setCollectableForCollectableFind(CollectableObjectFilter data) {
    if (data != null) {
      addInput("Collectable", CollectableObjectHelper.toMap(data, new HashMap(), "Collectable").get("Collectable"));
    }
  }
  public void setCollectableForCollectableGet(CollectableObjectKeyData data) {
    if (data != null) {
      addInput("Collectable", CollectableObjectKeyHelper.toMap(data, new HashMap(), "Collectable").get("Collectable"));
    }
  }
  public CollectableObjectDataList getCollectableObjectDataCollectableFromCollectableFind() {
    return CollectableObjectHelper.fromMapList(outputMap, "CollectableList");
  }
  public CollectableObjectData getCollectableObjectDataCollectableFromCollectableGet() {
    return CollectableObjectHelper.fromMap(outputMap, "Collectable");
  }
  /**
   @deprecated
   */
  public void setCollectableObjectFilter(CollectableObjectFilter data) {
    if (data != null) {
      addInput("Collectable", CollectableObjectHelper.toMap(data, new HashMap()).get("CollectableObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCollectableObjectKeyData(CollectableObjectKeyData data) {
    if (data != null) {
      addInput("Collectable", CollectableObjectKeyHelper.toMap(data, new HashMap()).get("CollectableObject"));
    }
  }
  /**
   @deprecated
   */
  public CollectableObjectDataList getCollectableObjectDataList() {
    return CollectableObjectHelper.fromMapList(outputMap, "CollectableList");
  }
  /**
   @deprecated
   */
  public CollectableObjectData getCollectableObjectData() {
    return CollectableObjectHelper.fromMap(outputMap, "Collectable");
  }
}
