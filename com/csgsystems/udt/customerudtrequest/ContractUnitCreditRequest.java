/*
 * Generated code DO NOT EDIT
 * Generated file: ContractUnitCreditRequest.java
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
public final class ContractUnitCreditRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ContractUnitCreditRequest (String request, ContractUnitCreditRequestMethod method) {
    initialize(request, "ContractUnitCredit", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ContractUnitCreditRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, ContractUnitCreditRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, ContractUnitCreditRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, ContractUnitCreditRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, ContractUnitCreditRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setContractUnitCreditConfigForContractUnitCreditConfigGet(ContractUnitCreditConfigData data) {
    if (data != null) {
      addInput("ContractUnitCreditConfig", ContractUnitCreditConfigHelper.toMap(data, new HashMap(), "ContractUnitCreditConfig").get("ContractUnitCreditConfig"));
    }
  }
  public void setContractUnitCreditForContractUnitCreditCreate(ContractUnitCreditObjectData data) {
    if (data != null) {
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(data, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }
  public void setContractUnitCreditForContractUnitCreditFind(ContractUnitCreditObjectFilter data) {
    if (data != null) {
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(data, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }
  public void setContractUnitCreditForContractUnitCreditGet(ContractUnitCreditObjectKeyData data) {
    if (data != null) {
      addInput("ContractUnitCredit", ContractUnitCreditObjectKeyHelper.toMap(data, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }
  public void setContractUnitCreditForContractUnitCreditUpdate(ContractUnitCreditObjectData data) {
    if (data != null) {
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(data, new HashMap(), "ContractUnitCredit").get("ContractUnitCredit"));
    }
  }
  public ContractUnitCreditObjectData getContractUnitCreditObjectDataContractUnitCreditFromContractUnitCreditConfigGet() {
    return ContractUnitCreditObjectHelper.fromMap(outputMap, "ContractUnitCredit");
  }
  public ContractUnitCreditObjectData getContractUnitCreditObjectDataContractUnitCreditFromContractUnitCreditCreate() {
    return ContractUnitCreditObjectHelper.fromMap(outputMap, "ContractUnitCredit");
  }
  public ContractUnitCreditObjectDataList getContractUnitCreditObjectDataContractUnitCreditFromContractUnitCreditFind() {
    return ContractUnitCreditObjectHelper.fromMapList(outputMap, "ContractUnitCreditList");
  }
  public ContractUnitCreditObjectData getContractUnitCreditObjectDataContractUnitCreditFromContractUnitCreditGet() {
    return ContractUnitCreditObjectHelper.fromMap(outputMap, "ContractUnitCredit");
  }
  public ContractUnitCreditObjectData getContractUnitCreditObjectDataContractUnitCreditFromContractUnitCreditUpdate() {
    return ContractUnitCreditObjectHelper.fromMap(outputMap, "ContractUnitCredit");
  }
  /**
   @deprecated
   */
  public void setContractUnitCreditConfigData(ContractUnitCreditConfigData data) {
    if (data != null) {
      addInput("ContractUnitCreditConfig", ContractUnitCreditConfigHelper.toMap(data, new HashMap()).get("ContractUnitCreditConfig"));
    }
  }
  /**
   @deprecated
   */
  public void setContractUnitCreditObjectFilter(ContractUnitCreditObjectFilter data) {
    if (data != null) {
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(data, new HashMap()).get("ContractUnitCreditObject"));
    }
  }
  /**
   @deprecated
   */
  public void setContractUnitCreditObjectData(ContractUnitCreditObjectData data) {
    if (data != null) {
      addInput("ContractUnitCredit", ContractUnitCreditObjectHelper.toMap(data, new HashMap()).get("ContractUnitCreditObject"));
    }
  }
  /**
   @deprecated
   */
  public void setContractUnitCreditObjectKeyData(ContractUnitCreditObjectKeyData data) {
    if (data != null) {
      addInput("ContractUnitCredit", ContractUnitCreditObjectKeyHelper.toMap(data, new HashMap()).get("ContractUnitCreditObject"));
    }
  }
  /**
   @deprecated
   */
  public ContractUnitCreditObjectDataList getContractUnitCreditObjectDataList() {
    return ContractUnitCreditObjectHelper.fromMapList(outputMap, "ContractUnitCreditList");
  }
  /**
   @deprecated
   */
  public ContractUnitCreditObjectData getContractUnitCreditObjectData() {
    return ContractUnitCreditObjectHelper.fromMap(outputMap, "ContractUnitCredit");
  }
}
