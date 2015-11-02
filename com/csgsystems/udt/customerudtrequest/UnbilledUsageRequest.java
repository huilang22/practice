/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageRequest.java
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
public final class UnbilledUsageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UnbilledUsageRequest (String request, UnbilledUsageRequestMethod method) {
    initialize(request, "UnbilledUsage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UnbilledUsageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, UnbilledUsageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, UnbilledUsageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, UnbilledUsageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, UnbilledUsageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, UnbilledUsageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, UnbilledUsageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAdjReasonCodeForUnbilledUsageAdjust(Integer data) {
    if (data != null) {
      addInput("AdjReasonCode", data);
    }
  }
  public void setAmountForUnbilledUsageAdjust(BigInteger data) {
    if (data != null) {
      addInput("Amount", data);
    }
  }
  public void setAnnotationForUnbilledUsageAdjust(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  public void setBillOrderNumberForUnbilledUsageAdjust(String data) {
    if (data != null) {
      addInput("BillOrderNumber", data);
    }
  }
  public void setFraudIndicatorForUnbilledUsageAdjust(Integer data) {
    if (data != null) {
      addInput("FraudIndicator", data);
    }
  }
  public void setPrimaryUnitsForUnbilledUsageAdjust(BigInteger data) {
    if (data != null) {
      addInput("PrimaryUnits", data);
    }
  }
  public void setPrimaryUnitsTypeForUnbilledUsageAdjust(Integer data) {
    if (data != null) {
      addInput("PrimaryUnitsType", data);
    }
  }
  public void setRequestStatusForUnbilledUsageAdjust(Integer data) {
    if (data != null) {
      addInput("RequestStatus", data);
    }
  }
  public void setTransCodeForUnbilledUsageAdjust(Integer data) {
    if (data != null) {
      addInput("TransCode", data);
    }
  }
  public void setUnbilledUsageForUnbilledUsageAdjust(UnbilledUsageObjectData data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageAmountGet(UnbilledUsageObjectKeyData data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectKeyHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageByAccountFindCount(UnbilledUsageAccountObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageAccountObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageByAccountFind(UnbilledUsageAccountObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageAccountObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageByServiceFindCount(UnbilledUsageServiceObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageServiceObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageByServiceFind(UnbilledUsageServiceObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageServiceObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageFindCount(UnbilledUsageObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageFindFastCount(UnbilledUsageObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageFindFast(UnbilledUsageObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageFindSummaryCount(UnbilledUsageObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageFindSummary(UnbilledUsageObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageFind(UnbilledUsageObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setUnbilledUsageForUnbilledUsageGet(UnbilledUsageObjectKeyData data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectKeyHelper.toMap(data, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }
  public void setAccountExternalIdForUnbilledUsageTotal(String data) {
    if (data != null) {
      addInput("AccountExternalId", data);
    }
  }
  public void setAccountExternalIdTypeForUnbilledUsageTotal(Integer data) {
    if (data != null) {
      addInput("AccountExternalIdType", data);
    }
  }
  public void setServiceExternalIdForUnbilledUsageTotal(String data) {
    if (data != null) {
      addInput("ServiceExternalId", data);
    }
  }
  public void setServiceExternalIdTypeForUnbilledUsageTotal(Integer data) {
    if (data != null) {
      addInput("ServiceExternalIdType", data);
    }
  }
  public AdjustmentObjectData getAdjustmentObjectDataAdjustmentFromUnbilledUsageAdjust() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
  public UnbilledUsageAmountObjectData getUnbilledUsageAmountObjectDataUnbilledUsageAmountFromUnbilledUsageAmountGet() {
    return UnbilledUsageAmountObjectHelper.fromMap(outputMap, "UnbilledUsageAmount");
  }
  public Integer getIntegerTotalCountFromUnbilledUsageByAccountFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public UnbilledUsageObjectDataList getUnbilledUsageObjectDataUnbilledUsageFromUnbilledUsageByAccountFind() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
  public Integer getIntegerTotalCountFromUnbilledUsageByServiceFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public UnbilledUsageObjectDataList getUnbilledUsageObjectDataUnbilledUsageFromUnbilledUsageByServiceFind() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
  public Integer getIntegerTotalCountFromUnbilledUsageFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public Integer getIntegerTotalCountFromUnbilledUsageFindFastCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public UnbilledUsageObjectDataList getUnbilledUsageObjectDataUnbilledUsageFromUnbilledUsageFindFast() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
  public Integer getIntegerTotalCountFromUnbilledUsageFindSummaryCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public UnbilledUsageObjectDataList getUnbilledUsageObjectDataUnbilledUsageFromUnbilledUsageFindSummary() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
  public UnbilledUsageObjectDataList getUnbilledUsageObjectDataUnbilledUsageFromUnbilledUsageFind() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
  public UnbilledUsageObjectData getUnbilledUsageObjectDataUnbilledUsageFromUnbilledUsageGet() {
    return UnbilledUsageObjectHelper.fromMap(outputMap, "UnbilledUsage");
  }
  public BigInteger getBigIntegerTotalFromUnbilledUsageTotal() {
    return (BigInteger)outputMap.get("Total");
  }
  /**
   @deprecated
   */
  public void setAccountExternalId(String data) {
    if (data != null) {
      addInput("AccountExternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setAccountExternalIdType(Integer data) {
    if (data != null) {
      addInput("AccountExternalIdType", data);
    }
  }
  /**
   @deprecated
   */
  public void setAdjReasonCode(Integer data) {
    if (data != null) {
      addInput("AdjReasonCode", data);
    }
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
  public void setAmount(BigInteger data) {
    if (data != null) {
      addInput("Amount", data);
    }
  }
  /**
   @deprecated
   */
  public void setAnnotation(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  /**
   @deprecated
   */
  public void setBillOrderNumber(String data) {
    if (data != null) {
      addInput("BillOrderNumber", data);
    }
  }
  /**
   @deprecated
   */
  public void setFraudIndicator(Integer data) {
    if (data != null) {
      addInput("FraudIndicator", data);
    }
  }
  /**
   @deprecated
   */
  public void setPrimaryUnits(BigInteger data) {
    if (data != null) {
      addInput("PrimaryUnits", data);
    }
  }
  /**
   @deprecated
   */
  public void setPrimaryUnitsType(Integer data) {
    if (data != null) {
      addInput("PrimaryUnitsType", data);
    }
  }
  /**
   @deprecated
   */
  public void setRequestStatus(Integer data) {
    if (data != null) {
      addInput("RequestStatus", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceExternalId(String data) {
    if (data != null) {
      addInput("ServiceExternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceExternalIdType(Integer data) {
    if (data != null) {
      addInput("ServiceExternalIdType", data);
    }
  }
  /**
   @deprecated
   */
  public BigInteger getTotal() {
    return (BigInteger)outputMap.get("Total");
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
  public void setTransCode(Integer data) {
    if (data != null) {
      addInput("TransCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setUnbilledUsageAccountObjectFilter(UnbilledUsageAccountObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageAccountObjectHelper.toMap(data, new HashMap()).get("UnbilledUsageAccountObject"));
    }
  }
  /**
   @deprecated
   */
  public UnbilledUsageAmountObjectData getUnbilledUsageAmountObjectData() {
    return UnbilledUsageAmountObjectHelper.fromMap(outputMap, "UnbilledUsageAmount");
  }
  /**
   @deprecated
   */
  public void setUnbilledUsageObjectFilter(UnbilledUsageObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap()).get("UnbilledUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnbilledUsageObjectData(UnbilledUsageObjectData data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(data, new HashMap()).get("UnbilledUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnbilledUsageObjectKeyData(UnbilledUsageObjectKeyData data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectKeyHelper.toMap(data, new HashMap()).get("UnbilledUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public UnbilledUsageObjectDataList getUnbilledUsageObjectDataList() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
  /**
   @deprecated
   */
  public UnbilledUsageObjectData getUnbilledUsageObjectData() {
    return UnbilledUsageObjectHelper.fromMap(outputMap, "UnbilledUsage");
  }
  /**
   @deprecated
   */
  public void setUnbilledUsageServiceObjectFilter(UnbilledUsageServiceObjectFilter data) {
    if (data != null) {
      addInput("UnbilledUsage", UnbilledUsageServiceObjectHelper.toMap(data, new HashMap()).get("UnbilledUsageServiceObject"));
    }
  }
}
