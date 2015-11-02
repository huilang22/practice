/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentRequest.java
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
public final class AdjustmentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AdjustmentRequest (String request, AdjustmentRequestMethod method) {
    initialize(request, "Adjustment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AdjustmentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, AdjustmentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, AdjustmentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BilledUsageRequest request, AdjustmentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BilledUsageRequest request, AdjustmentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, AdjustmentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, AdjustmentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceDetailRequest request, AdjustmentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceDetailRequest request, AdjustmentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(RefinancePlanRequest request, AdjustmentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(RefinancePlanRequest request, AdjustmentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(UnbilledUsageRequest request, AdjustmentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(UnbilledUsageRequest request, AdjustmentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAdjustmentForAdjustmentApprove(AdjustmentObjectData data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
  public void setSupervisorNameForAdjustmentApprove(String data) {
    if (data != null) {
      addInput("SupervisorName", data);
    }
  }
  public void setAdjustmentForAdjustmentCancel(AdjustmentObjectData data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
  public void setAdjustmentForAdjustmentCreate(AdjustmentObjectData data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
  public void setAdjustmentForAdjustmentDeny(AdjustmentObjectData data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
  public void setSupervisorNameForAdjustmentDeny(String data) {
    if (data != null) {
      addInput("SupervisorName", data);
    }
  }
  public void setAdjustmentForAdjustmentFind(AdjustmentObjectFilter data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
  public void setAdjustmentForAdjustmentFindCount(AdjustmentObjectFilter data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
  public void setAdjustmentForAdjustmentGet(AdjustmentObjectKeyData data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectKeyHelper.toMap(data, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
  public void setAdjustmentForAdjustmentModify(AdjustmentObjectData data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
  public void setAdjustmentForAdjustmentNoBackoutFind(AdjustmentObjectFilter data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
  public void setAdjustmentForAdjustmentNoBackoutFindCount(AdjustmentObjectFilter data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
  public void setAdjustmentForAdjustmentUpdate(AdjustmentObjectData data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }
  public void setBillRefNoForInvoiceAdjustmentTotalGet(Integer data) {
    if (data != null) {
      addInput("BillRefNo", data);
    }
  }
  public void setBillRefResetsForInvoiceAdjustmentTotalGet(Integer data) {
    if (data != null) {
      addInput("BillRefResets", data);
    }
  }
  public void setOpenItemIdForInvoiceAdjustmentTotalGet(Integer data) {
    if (data != null) {
      addInput("OpenItemId", data);
    }
  }
  public AdjustmentObjectData getAdjustmentObjectDataAdjustmentFromAdjustmentApprove() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
  public AdjustmentObjectData getAdjustmentObjectDataAdjustmentFromAdjustmentCancel() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
  public AdjustmentObjectData getAdjustmentObjectDataAdjustmentFromAdjustmentCreate() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
  public AdjustmentObjectData getAdjustmentObjectDataAdjustmentFromAdjustmentDeny() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
  public AdjustmentObjectDataList getAdjustmentObjectDataAdjustmentFromAdjustmentFind() {
    return AdjustmentObjectHelper.fromMapList(outputMap, "AdjustmentList");
  }
  public Integer getIntegerTotalCountFromAdjustmentFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public AdjustmentObjectData getAdjustmentObjectDataAdjustmentFromAdjustmentGet() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
  public AdjustmentObjectData getAdjustmentObjectDataAdjustmentFromAdjustmentModify() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
  public AdjustmentObjectDataList getAdjustmentObjectDataAdjustmentFromAdjustmentNoBackoutFind() {
    return AdjustmentObjectHelper.fromMapList(outputMap, "AdjustmentList");
  }
  public Integer getIntegerTotalCountFromAdjustmentNoBackoutFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public AdjustmentObjectData getAdjustmentObjectDataAdjustmentFromAdjustmentUpdate() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
  public BigInteger getBigIntegerTotalAmountFromInvoiceAdjustmentTotalGet() {
    return (BigInteger)outputMap.get("TotalAmount");
  }
  /**
   @deprecated
   */
  public void setAdjustmentObjectFilter(AdjustmentObjectFilter data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap()).get("AdjustmentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAdjustmentObjectData(AdjustmentObjectData data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(data, new HashMap()).get("AdjustmentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAdjustmentObjectKeyData(AdjustmentObjectKeyData data) {
    if (data != null) {
      addInput("Adjustment", AdjustmentObjectKeyHelper.toMap(data, new HashMap()).get("AdjustmentObject"));
    }
  }
  /**
   @deprecated
   */
  public AdjustmentObjectDataList getAdjustmentObjectDataList() {
    return AdjustmentObjectHelper.fromMapList(outputMap, "AdjustmentList");
  }
  /**
   @deprecated
   */
  public AdjustmentObjectData getAdjustmentObjectData() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
  /**
   @deprecated
   */
  public void setBillRefNo(Integer data) {
    if (data != null) {
      addInput("BillRefNo", data);
    }
  }
  /**
   @deprecated
   */
  public void setBillRefResets(Integer data) {
    if (data != null) {
      addInput("BillRefResets", data);
    }
  }
  /**
   @deprecated
   */
  public void setOpenItemId(Integer data) {
    if (data != null) {
      addInput("OpenItemId", data);
    }
  }
  /**
   @deprecated
   */
  public void setSupervisorName(String data) {
    if (data != null) {
      addInput("SupervisorName", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getTotalCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  /**
   @deprecated
   */
  public BigInteger getTotalAmount() {
    return (BigInteger)outputMap.get("TotalAmount");
  }
}
