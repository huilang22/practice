/*
 * Generated code DO NOT EDIT
 * Generated file: EftTransactionRequest.java
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
public final class EftTransactionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EftTransactionRequest (String request, EftTransactionRequestMethod method) {
    initialize(request, "EftTransaction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EftTransactionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, EftTransactionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, EftTransactionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(EftTransactionRequest request, EftTransactionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(EftTransactionRequest request, EftTransactionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, EftTransactionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, EftTransactionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, EftTransactionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, EftTransactionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setEftTransactionForEftTransactionFind(EftTransactionObjectFilter data) {
    if (data != null) {
      addInput("EftTransaction", EftTransactionObjectHelper.toMap(data, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }
  public void setEftTransactionForEftTransactionGet(EftTransactionObjectKeyData data) {
    if (data != null) {
      addInput("EftTransaction", EftTransactionObjectKeyHelper.toMap(data, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }
  public void setEftTransactionForEftTransactionHold(EftTransactionObjectKeyData data) {
    if (data != null) {
      addInput("EftTransaction", EftTransactionObjectKeyHelper.toMap(data, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }
  public void setEftTransactionForEftTransactionRelease(EftTransactionObjectKeyData data) {
    if (data != null) {
      addInput("EftTransaction", EftTransactionObjectKeyHelper.toMap(data, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }
  public void setEftTransactionForEftTransactionUpdate(EftTransactionObjectData data) {
    if (data != null) {
      addInput("EftTransaction", EftTransactionObjectHelper.toMap(data, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }
  public void setEftTransactionForEftTransactionUpdateFromAccount(EftTransUFAObjectData data) {
    if (data != null) {
      addInput("EftTransaction", EftTransUFAObjectHelper.toMap(data, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }
  public EftTransactionObjectDataList getEftTransactionObjectDataEftTransactionFromEftTransactionFind() {
    return EftTransactionObjectHelper.fromMapList(outputMap, "EftTransactionList");
  }
  public EftTransactionObjectData getEftTransactionObjectDataEftTransactionFromEftTransactionGet() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
  public EftTransactionObjectData getEftTransactionObjectDataEftTransactionFromEftTransactionHold() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
  public EftTransactionObjectData getEftTransactionObjectDataEftTransactionFromEftTransactionRelease() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
  public EftTransactionObjectData getEftTransactionObjectDataEftTransactionFromEftTransactionUpdate() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
  public EftTransactionObjectData getEftTransactionObjectDataEftTransactionFromEftTransactionUpdateFromAccount() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
  /**
   @deprecated
   */
  public void setEftTransUFAObjectData(EftTransUFAObjectData data) {
    if (data != null) {
      addInput("EftTransaction", EftTransUFAObjectHelper.toMap(data, new HashMap()).get("EftTransUFAObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEftTransactionObjectFilter(EftTransactionObjectFilter data) {
    if (data != null) {
      addInput("EftTransaction", EftTransactionObjectHelper.toMap(data, new HashMap()).get("EftTransactionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEftTransactionObjectData(EftTransactionObjectData data) {
    if (data != null) {
      addInput("EftTransaction", EftTransactionObjectHelper.toMap(data, new HashMap()).get("EftTransactionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEftTransactionObjectKeyData(EftTransactionObjectKeyData data) {
    if (data != null) {
      addInput("EftTransaction", EftTransactionObjectKeyHelper.toMap(data, new HashMap()).get("EftTransactionObject"));
    }
  }
  /**
   @deprecated
   */
  public EftTransactionObjectDataList getEftTransactionObjectDataList() {
    return EftTransactionObjectHelper.fromMapList(outputMap, "EftTransactionList");
  }
  /**
   @deprecated
   */
  public EftTransactionObjectData getEftTransactionObjectData() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
}
