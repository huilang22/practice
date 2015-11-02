/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceDetailRequest.java
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
public final class InvoiceDetailRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvoiceDetailRequest (String request, InvoiceDetailRequestMethod method) {
    initialize(request, "InvoiceDetail", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvoiceDetailRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, InvoiceDetailRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, InvoiceDetailRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, InvoiceDetailRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, InvoiceDetailRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BilledUsageRequest request, InvoiceDetailRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BilledUsageRequest request, InvoiceDetailRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, InvoiceDetailRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, InvoiceDetailRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setBillRefNoForBillInvoiceDetailAmountGet(Integer data) {
    if (data != null) {
      addInput("BillRefNo", data);
    }
  }
  public void setBillRefResetsForBillInvoiceDetailAmountGet(Integer data) {
    if (data != null) {
      addInput("BillRefResets", data);
    }
  }
  public void setOpenItemIdForBillInvoiceDetailAmountGet(Integer data) {
    if (data != null) {
      addInput("OpenItemId", data);
    }
  }
  public void setAdjReasonCodeForInvoiceDetailAdjust(Integer data) {
    if (data != null) {
      addInput("AdjReasonCode", data);
    }
  }
  public void setAmountForInvoiceDetailAdjust(BigInteger data) {
    if (data != null) {
      addInput("Amount", data);
    }
  }
  public void setAnnotationForInvoiceDetailAdjust(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  public void setBillOrderNumberForInvoiceDetailAdjust(String data) {
    if (data != null) {
      addInput("BillOrderNumber", data);
    }
  }
  public void setEffectiveDateForInvoiceDetailAdjust(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setFraudIndicatorForInvoiceDetailAdjust(Integer data) {
    if (data != null) {
      addInput("FraudIndicator", data);
    }
  }
  public void setInvoiceDetailForInvoiceDetailAdjust(InvoiceDetailObjectData data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(data, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
  public void setPrimaryUnitsForInvoiceDetailAdjust(BigInteger data) {
    if (data != null) {
      addInput("PrimaryUnits", data);
    }
  }
  public void setPrimaryUnitsTypeForInvoiceDetailAdjust(Integer data) {
    if (data != null) {
      addInput("PrimaryUnitsType", data);
    }
  }
  public void setRequestStatusForInvoiceDetailAdjust(Integer data) {
    if (data != null) {
      addInput("RequestStatus", data);
    }
  }
  public void setTransCodeForInvoiceDetailAdjust(Integer data) {
    if (data != null) {
      addInput("TransCode", data);
    }
  }
  public void setInvoiceDetailForInvoiceDetailAdjustmentFind(InvoiceDetailObjectFilter data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(data, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
  public void setInvoiceDetailForInvoiceDetailAmountGet(InvoiceDetailObjectKeyData data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectKeyHelper.toMap(data, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
  public void setInvoiceDetailForInvoiceDetailByAccountFindCount(InvoiceDetailAccountObjectFilter data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailAccountObjectHelper.toMap(data, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
  public void setLatestInvoiceForInvoiceDetailByAccountFindCount(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice", data);
    }
  }
  public void setInvoiceDetailForInvoiceDetailByAccountFind(InvoiceDetailAccountObjectFilter data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailAccountObjectHelper.toMap(data, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
  public void setLatestInvoiceForInvoiceDetailByAccountFind(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice", data);
    }
  }
  public void setInvoiceDetailForInvoiceDetailFindCount(InvoiceDetailObjectFilter data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(data, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
  public void setInvoiceDetailForInvoiceDetailFind(InvoiceDetailObjectFilter data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(data, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
  public void setInvoiceDetailForInvoiceDetailGet(InvoiceDetailObjectKeyData data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectKeyHelper.toMap(data, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
  public BillInvoiceDetailAmountObjectData getBillInvoiceDetailAmountObjectDataBillInvoiceDetailAmountFromBillInvoiceDetailAmountGet() {
    return BillInvoiceDetailAmountObjectHelper.fromMap(outputMap, "BillInvoiceDetailAmount");
  }
  public AdjustmentObjectData getAdjustmentObjectDataAdjustmentFromInvoiceDetailAdjust() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
  public InvoiceDetailObjectDataList getInvoiceDetailObjectDataInvoiceDetailFromInvoiceDetailAdjustmentFind() {
    return InvoiceDetailObjectHelper.fromMapList(outputMap, "InvoiceDetailList");
  }
  public BigInteger getBigIntegerAdjustmentEligibleAmountFromInvoiceDetailAmountGet() {
    return (BigInteger)outputMap.get("AdjustmentEligibleAmount");
  }
  public Integer getIntegerTotalCountFromInvoiceDetailByAccountFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public InvoiceDetailObjectDataList getInvoiceDetailObjectDataInvoiceDetailFromInvoiceDetailByAccountFind() {
    return InvoiceDetailObjectHelper.fromMapList(outputMap, "InvoiceDetailList");
  }
  public Integer getIntegerTotalCountFromInvoiceDetailFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public InvoiceDetailObjectDataList getInvoiceDetailObjectDataInvoiceDetailFromInvoiceDetailFind() {
    return InvoiceDetailObjectHelper.fromMapList(outputMap, "InvoiceDetailList");
  }
  public InvoiceDetailObjectData getInvoiceDetailObjectDataInvoiceDetailFromInvoiceDetailGet() {
    return InvoiceDetailObjectHelper.fromMap(outputMap, "InvoiceDetail");
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
  public BillInvoiceDetailAmountObjectData getBillInvoiceDetailAmountObjectData() {
    return BillInvoiceDetailAmountObjectHelper.fromMap(outputMap, "BillInvoiceDetailAmount");
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
  public void setEffectiveDate(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
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
  public void setInvoiceDetailAccountObjectFilter(InvoiceDetailAccountObjectFilter data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailAccountObjectHelper.toMap(data, new HashMap()).get("InvoiceDetailAccountObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvoiceDetailObjectFilter(InvoiceDetailObjectFilter data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(data, new HashMap()).get("InvoiceDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvoiceDetailObjectData(InvoiceDetailObjectData data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(data, new HashMap()).get("InvoiceDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvoiceDetailObjectKeyData(InvoiceDetailObjectKeyData data) {
    if (data != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectKeyHelper.toMap(data, new HashMap()).get("InvoiceDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public InvoiceDetailObjectDataList getInvoiceDetailObjectDataList() {
    return InvoiceDetailObjectHelper.fromMapList(outputMap, "InvoiceDetailList");
  }
  /**
   @deprecated
   */
  public InvoiceDetailObjectData getInvoiceDetailObjectData() {
    return InvoiceDetailObjectHelper.fromMap(outputMap, "InvoiceDetail");
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
  public void setOpenItemId(Integer data) {
    if (data != null) {
      addInput("OpenItemId", data);
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
  public BigInteger getAdjustmentEligibleAmount() {
    return (BigInteger)outputMap.get("AdjustmentEligibleAmount");
  }
}
