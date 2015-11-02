/*
 * Generated code DO NOT EDIT
 * Generated file: DepositRequest.java
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
public final class DepositRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DepositRequest (String request, DepositRequestMethod method) {
    initialize(request, "Deposit", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DepositRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, DepositRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, DepositRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, DepositRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, DepositRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setDepositForDepositCreate(DepositObjectData data) {
    if (data != null) {
      addInput("Deposit", DepositObjectHelper.toMap(data, new HashMap(), "Deposit").get("Deposit"));
    }
  }
  public void setDepositForDepositFind(DepositObjectFilter data) {
    if (data != null) {
      addInput("Deposit", DepositObjectHelper.toMap(data, new HashMap(), "Deposit").get("Deposit"));
    }
  }
  public void setDepositForDepositGet(DepositObjectKeyData data) {
    if (data != null) {
      addInput("Deposit", DepositObjectKeyHelper.toMap(data, new HashMap(), "Deposit").get("Deposit"));
    }
  }
  public void setDepositForDepositReturn(DepositObjectData data) {
    if (data != null) {
      addInput("Deposit", DepositObjectHelper.toMap(data, new HashMap(), "Deposit").get("Deposit"));
    }
  }
  public DepositObjectData getDepositObjectDataDepositFromDepositCreate() {
    return DepositObjectHelper.fromMap(outputMap, "Deposit");
  }
  public DepositObjectDataList getDepositObjectDataDepositFromDepositFind() {
    return DepositObjectHelper.fromMapList(outputMap, "DepositList");
  }
  public DepositObjectData getDepositObjectDataDepositFromDepositGet() {
    return DepositObjectHelper.fromMap(outputMap, "Deposit");
  }
  public DepositObjectData getDepositObjectDataDepositFromDepositReturn() {
    return DepositObjectHelper.fromMap(outputMap, "Deposit");
  }
  /**
   @deprecated
   */
  public void setDepositObjectFilter(DepositObjectFilter data) {
    if (data != null) {
      addInput("Deposit", DepositObjectHelper.toMap(data, new HashMap()).get("DepositObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDepositObjectData(DepositObjectData data) {
    if (data != null) {
      addInput("Deposit", DepositObjectHelper.toMap(data, new HashMap()).get("DepositObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDepositObjectKeyData(DepositObjectKeyData data) {
    if (data != null) {
      addInput("Deposit", DepositObjectKeyHelper.toMap(data, new HashMap()).get("DepositObject"));
    }
  }
  /**
   @deprecated
   */
  public DepositObjectDataList getDepositObjectDataList() {
    return DepositObjectHelper.fromMapList(outputMap, "DepositList");
  }
  /**
   @deprecated
   */
  public DepositObjectData getDepositObjectData() {
    return DepositObjectHelper.fromMap(outputMap, "Deposit");
  }
}
