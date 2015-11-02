/*
 * Generated code DO NOT EDIT
 * Generated file: TaxExemptionRequest.java
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
public final class TaxExemptionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TaxExemptionRequest (String request, TaxExemptionRequestMethod method) {
    initialize(request, "TaxExemption", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TaxExemptionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, TaxExemptionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, TaxExemptionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, TaxExemptionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, TaxExemptionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setTaxExemptionForTaxExemptionCreate(TaxExemptionObjectData data) {
    if (data != null) {
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(data, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }
  public void setInactiveDateForTaxExemptionDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setInactiveDateForTaxExemptionDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setTaxExemptionForTaxExemptionDeleteList(TaxExemptionObjectFilter data) {
    if (data != null) {
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(data, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }
  public void setTaxExemptionForTaxExemptionDelete(TaxExemptionObjectKeyData data) {
    if (data != null) {
      addInput("TaxExemption", TaxExemptionObjectKeyHelper.toMap(data, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }
  public void setTaxExemptionForTaxExemptionFind(TaxExemptionObjectFilter data) {
    if (data != null) {
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(data, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }
  public void setTaxExemptionForTaxExemptionGet(TaxExemptionObjectKeyData data) {
    if (data != null) {
      addInput("TaxExemption", TaxExemptionObjectKeyHelper.toMap(data, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }
  public void setTaxExemptionForTaxExemptionUpdate(TaxExemptionObjectData data) {
    if (data != null) {
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(data, new HashMap(), "TaxExemption").get("TaxExemption"));
    }
  }
  public TaxExemptionObjectData getTaxExemptionObjectDataTaxExemptionFromTaxExemptionCreate() {
    return TaxExemptionObjectHelper.fromMap(outputMap, "TaxExemption");
  }
  public TaxExemptionObjectData getTaxExemptionObjectDataTaxExemptionFromTaxExemptionDelete() {
    return TaxExemptionObjectHelper.fromMap(outputMap, "TaxExemption");
  }
  public TaxExemptionObjectDataList getTaxExemptionObjectDataTaxExemptionFromTaxExemptionFind() {
    return TaxExemptionObjectHelper.fromMapList(outputMap, "TaxExemptionList");
  }
  public TaxExemptionObjectData getTaxExemptionObjectDataTaxExemptionFromTaxExemptionGet() {
    return TaxExemptionObjectHelper.fromMap(outputMap, "TaxExemption");
  }
  public TaxExemptionObjectData getTaxExemptionObjectDataTaxExemptionFromTaxExemptionUpdate() {
    return TaxExemptionObjectHelper.fromMap(outputMap, "TaxExemption");
  }
  /**
   @deprecated
   */
  public void setInactiveDate(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setTaxExemptionObjectFilter(TaxExemptionObjectFilter data) {
    if (data != null) {
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(data, new HashMap()).get("TaxExemptionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTaxExemptionObjectData(TaxExemptionObjectData data) {
    if (data != null) {
      addInput("TaxExemption", TaxExemptionObjectHelper.toMap(data, new HashMap()).get("TaxExemptionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTaxExemptionObjectKeyData(TaxExemptionObjectKeyData data) {
    if (data != null) {
      addInput("TaxExemption", TaxExemptionObjectKeyHelper.toMap(data, new HashMap()).get("TaxExemptionObject"));
    }
  }
  /**
   @deprecated
   */
  public TaxExemptionObjectDataList getTaxExemptionObjectDataList() {
    return TaxExemptionObjectHelper.fromMapList(outputMap, "TaxExemptionList");
  }
  /**
   @deprecated
   */
  public TaxExemptionObjectData getTaxExemptionObjectData() {
    return TaxExemptionObjectHelper.fromMap(outputMap, "TaxExemption");
  }
}
