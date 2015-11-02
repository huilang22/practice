/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageRequest.java
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
public final class BilledUsageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BilledUsageRequest (String request, BilledUsageRequestMethod method) {
    initialize(request, "BilledUsage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BilledUsageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, BilledUsageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, BilledUsageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, BilledUsageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, BilledUsageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, BilledUsageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, BilledUsageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceDetailRequest request, BilledUsageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceDetailRequest request, BilledUsageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAdjReasonCodeForBilledUsageAdjust(Integer data) {
    if (data != null) {
      addInput("AdjReasonCode", data);
    }
  }
  public void setAmountForBilledUsageAdjust(BigInteger data) {
    if (data != null) {
      addInput("Amount", data);
    }
  }
  public void setAnnotationForBilledUsageAdjust(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  public void setBillOrderNumberForBilledUsageAdjust(String data) {
    if (data != null) {
      addInput("BillOrderNumber", data);
    }
  }
  public void setBilledUsageForBilledUsageAdjust(BilledUsageObjectData data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setFraudIndicatorForBilledUsageAdjust(Integer data) {
    if (data != null) {
      addInput("FraudIndicator", data);
    }
  }
  public void setPrimaryUnitsForBilledUsageAdjust(BigInteger data) {
    if (data != null) {
      addInput("PrimaryUnits", data);
    }
  }
  public void setPrimaryUnitsTypeForBilledUsageAdjust(Integer data) {
    if (data != null) {
      addInput("PrimaryUnitsType", data);
    }
  }
  public void setRequestStatusForBilledUsageAdjust(Integer data) {
    if (data != null) {
      addInput("RequestStatus", data);
    }
  }
  public void setTransCodeForBilledUsageAdjust(Integer data) {
    if (data != null) {
      addInput("TransCode", data);
    }
  }
  public void setBilledUsageForBilledUsageAmountGet(BilledUsageObjectKeyData data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectKeyHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageForBilledUsageByAccountFind(BilledUsageAccountObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageAccountObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageForBilledUsageByAccountFindCount(BilledUsageAccountObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageAccountObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setLatestInvoiceForBilledUsageByAccountFindCount(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice", data);
    }
  }
  public void setLatestInvoiceForBilledUsageByAccountFind(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice", data);
    }
  }
  public void setBilledUsageForBilledUsageByAccountServiceFind(BilledUsageServiceObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageServiceObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setLatestInvoice4ForBilledUsageByAccountServiceFind(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice4", data);
    }
  }
  public void setBilledUsageForBilledUsageByServiceFind(BilledUsageServiceObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageServiceObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageForBilledUsageByServiceFindCount(BilledUsageServiceObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageServiceObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setLatestInvoiceForBilledUsageByServiceFindCount(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice", data);
    }
  }
  public void setLatestInvoiceForBilledUsageByServiceFind(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice", data);
    }
  }
  public void setBilledUsageForBilledUsageCalc(BilledUsageObjectData data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageForBilledUsageFind(BilledUsageObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageForBilledUsageFindCount(BilledUsageObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageForBilledUsageFindFast(BilledUsageObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageForBilledUsageFindFastCount(BilledUsageObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageForBilledUsageFindSummary(BilledUsageObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageForBilledUsageFindSummaryCount(BilledUsageObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public void setBilledUsageForBilledUsageGet(BilledUsageObjectKeyData data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectKeyHelper.toMap(data, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }
  public AdjustmentObjectData getAdjustmentObjectDataAdjustmentFromBilledUsageAdjust() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
  public BilledUsageAmountObjectData getBilledUsageAmountObjectDataBilledUsageAmountFromBilledUsageAmountGet() {
    return BilledUsageAmountObjectHelper.fromMap(outputMap, "BilledUsageAmount");
  }
  public BilledUsageObjectDataList getBilledUsageObjectDataBilledUsageFromBilledUsageByAccountFind() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
  public Integer getIntegerTotalCountFromBilledUsageByAccountFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public BilledUsageObjectDataList getBilledUsageObjectDataBilledUsageFromBilledUsageByAccountServiceFind() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
  public BilledUsageObjectDataList getBilledUsageObjectDataBilledUsageFromBilledUsageByServiceFind() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
  public Integer getIntegerTotalCountFromBilledUsageByServiceFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public TaxAndDiscountAmountObjectData getTaxAndDiscountAmountObjectDataTaxAndDiscountSummaryFromBilledUsageCalc() {
    return TaxAndDiscountAmountObjectHelper.fromMap(outputMap, "TaxAndDiscountSummary");
  }
  public BilledUsageObjectDataList getBilledUsageObjectDataBilledUsageFromBilledUsageFind() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
  public Integer getIntegerTotalCountFromBilledUsageFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public BilledUsageObjectDataList getBilledUsageObjectDataBilledUsageFromBilledUsageFindFast() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
  public Integer getIntegerTotalCountFromBilledUsageFindFastCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public BilledUsageObjectDataList getBilledUsageObjectDataBilledUsageFromBilledUsageFindSummary() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
  public Integer getIntegerTotalCountFromBilledUsageFindSummaryCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public BilledUsageObjectData getBilledUsageObjectDataBilledUsageFromBilledUsageGet() {
    return BilledUsageObjectHelper.fromMap(outputMap, "BilledUsage");
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
  public void setBilledUsageAccountObjectFilter(BilledUsageAccountObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageAccountObjectHelper.toMap(data, new HashMap()).get("BilledUsageAccountObject"));
    }
  }
  /**
   @deprecated
   */
  public BilledUsageAmountObjectData getBilledUsageAmountObjectData() {
    return BilledUsageAmountObjectHelper.fromMap(outputMap, "BilledUsageAmount");
  }
  /**
   @deprecated
   */
  public void setBilledUsageObjectFilter(BilledUsageObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap()).get("BilledUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBilledUsageObjectData(BilledUsageObjectData data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(data, new HashMap()).get("BilledUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBilledUsageObjectKeyData(BilledUsageObjectKeyData data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageObjectKeyHelper.toMap(data, new HashMap()).get("BilledUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public BilledUsageObjectDataList getBilledUsageObjectDataList() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
  /**
   @deprecated
   */
  public BilledUsageObjectData getBilledUsageObjectData() {
    return BilledUsageObjectHelper.fromMap(outputMap, "BilledUsage");
  }
  /**
   @deprecated
   */
  public void setBilledUsageServiceObjectFilter(BilledUsageServiceObjectFilter data) {
    if (data != null) {
      addInput("BilledUsage", BilledUsageServiceObjectHelper.toMap(data, new HashMap()).get("BilledUsageServiceObject"));
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
  public void setLatestInvoice(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice", data);
    }
  }
  /**
   @deprecated
   */
  public void setLatestInvoice4(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice4", data);
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
  public TaxAndDiscountAmountObjectData getTaxAndDiscountAmountObjectData() {
    return TaxAndDiscountAmountObjectHelper.fromMap(outputMap, "TaxAndDiscountAmount");
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
}
