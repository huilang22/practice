/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardRequest.java
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
public final class CreditCardRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CreditCardRequest (String request, CreditCardRequestMethod method) {
    initialize(request, "CreditCard", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CreditCardRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, CreditCardRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, CreditCardRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, CreditCardRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, CreditCardRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setCreditCardForCreditCardCreate(CreditCardObjectData data) {
    if (data != null) {
      addInput("CreditCard", CreditCardObjectHelper.toMap(data, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }
  public void setCreditCardForCreditCardFind(CreditCardObjectFilter data) {
    if (data != null) {
      addInput("CreditCard", CreditCardObjectHelper.toMap(data, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }
  public void setCreditCardForCreditCardGet(CreditCardObjectKeyData data) {
    if (data != null) {
      addInput("CreditCard", CreditCardObjectKeyHelper.toMap(data, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }
  public void setCreditCardForCreditCardUpdate(CreditCardObjectData data) {
    if (data != null) {
      addInput("CreditCard", CreditCardObjectHelper.toMap(data, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }
  public void setCreditCardForCreditCardValidate(CreditCardObjectData data) {
    if (data != null) {
      addInput("CreditCard", CreditCardObjectHelper.toMap(data, new HashMap(), "CreditCard").get("CreditCard"));
    }
  }
  public CreditCardObjectData getCreditCardObjectDataCreditCardFromCreditCardCreate() {
    return CreditCardObjectHelper.fromMap(outputMap, "CreditCard");
  }
  public CreditCardObjectDataList getCreditCardObjectDataCreditCardFromCreditCardFind() {
    return CreditCardObjectHelper.fromMapList(outputMap, "CreditCardList");
  }
  public CreditCardObjectData getCreditCardObjectDataCreditCardFromCreditCardGet() {
    return CreditCardObjectHelper.fromMap(outputMap, "CreditCard");
  }
  public CreditCardObjectData getCreditCardObjectDataCreditCardFromCreditCardUpdate() {
    return CreditCardObjectHelper.fromMap(outputMap, "CreditCard");
  }
  /**
   @deprecated
   */
  public void setCreditCardObjectFilter(CreditCardObjectFilter data) {
    if (data != null) {
      addInput("CreditCard", CreditCardObjectHelper.toMap(data, new HashMap()).get("CreditCardObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCreditCardObjectData(CreditCardObjectData data) {
    if (data != null) {
      addInput("CreditCard", CreditCardObjectHelper.toMap(data, new HashMap()).get("CreditCardObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCreditCardObjectKeyData(CreditCardObjectKeyData data) {
    if (data != null) {
      addInput("CreditCard", CreditCardObjectKeyHelper.toMap(data, new HashMap()).get("CreditCardObject"));
    }
  }
  /**
   @deprecated
   */
  public CreditCardObjectDataList getCreditCardObjectDataList() {
    return CreditCardObjectHelper.fromMapList(outputMap, "CreditCardList");
  }
  /**
   @deprecated
   */
  public CreditCardObjectData getCreditCardObjectData() {
    return CreditCardObjectHelper.fromMap(outputMap, "CreditCard");
  }
}
