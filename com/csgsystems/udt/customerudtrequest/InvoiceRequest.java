/*
 * Generated code DO NOT EDIT
 * Generated file: InvoiceRequest.java
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
public final class InvoiceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvoiceRequest (String request, InvoiceRequestMethod method) {
    initialize(request, "Invoice", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvoiceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountBonusPointTransactionRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountBonusPointTransactionRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BillImageRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BillImageRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BillImagePageRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BillImagePageRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BilledUsageRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BilledUsageRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CollectableRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CollectableRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(EftTransactionRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(EftTransactionRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InterimBillRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InterimBillRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceDetailRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceDetailRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PaymentRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PaymentRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PaymentDistributionRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PaymentDistributionRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PrepaymentRequest request, InvoiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PrepaymentRequest request, InvoiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setInvoiceForInvoiceAmountGet(InvoiceObjectKeyData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setInvoiceForInvoiceBalanceSummary(InvoiceObjectData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setInvoiceForInvoiceFindCount(InvoiceObjectFilter data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setInvoiceForInvoiceFind(InvoiceObjectFilter data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setInvoiceForInvoiceGet(InvoiceObjectKeyData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setInvoiceForInvoicePostpaidBilledUsageTotal(InvoiceObjectKeyData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setBillRefNoForInvoicePostpaidProductChargeTotal(Integer data) {
    if (data != null) {
      addInput("BillRefNo", data);
    }
  }
  public void setBillRefResetsForInvoicePostpaidProductChargeTotal(Integer data) {
    if (data != null) {
      addInput("BillRefResets", data);
    }
  }
  public void setAccountInternalIdForInvoicePostpaidUnbilledUsageTotal(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setInvoiceForInvoicePrepaidBilledUsageTotal(InvoiceObjectKeyData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setBillRefNoForInvoicePrepaidProductChargeTotal(Integer data) {
    if (data != null) {
      addInput("BillRefNo", data);
    }
  }
  public void setBillRefResetsForInvoicePrepaidProductChargeTotal(Integer data) {
    if (data != null) {
      addInput("BillRefResets", data);
    }
  }
  public void setAccountInternalIdForInvoicePrepaidUnbilledUsageTotal(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setBillDispMethForInvoiceReIssue(Integer data) {
    if (data != null) {
      addInput("BillDispMeth", data);
    }
  }
  public void setInvoiceForInvoiceReIssue(InvoiceObjectKeyData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setInvoiceForInvoiceReissueFind(InvoiceObjectFilter data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setInvoiceForInvoiceReissueGet(InvoiceObjectKeyData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setInvoiceForInvoiceSummaryGet(InvoiceObjectKeyData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setInvoiceForPaymentDateReschedule(InvoiceObjectKeyData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(data, new HashMap(), "Invoice").get("Invoice"));
    }
  }
  public void setPaymentDueDateForPaymentDateReschedule(Date data) {
    if (data != null) {
      addInput("PaymentDueDate", data);
    }
  }
  public InvoiceAmountObjectData getInvoiceAmountObjectDataInvoiceAmountFromInvoiceAmountGet() {
    return InvoiceAmountObjectHelper.fromMap(outputMap, "InvoiceAmount");
  }
  public InvoiceBalanceSummaryOutputData getInvoiceBalanceSummaryOutputDataInvoiceBalanceSummaryOutputDataFromInvoiceBalanceSummary() {
    return InvoiceBalanceSummaryOutputHelper.fromMap(outputMap);
  }
  public Integer getIntegerTotalCountFromInvoiceFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public InvoiceObjectDataList getInvoiceObjectDataInvoiceFromInvoiceFind() {
    return InvoiceObjectHelper.fromMapList(outputMap, "InvoiceList");
  }
  public InvoiceObjectData getInvoiceObjectDataInvoiceFromInvoiceGet() {
    return InvoiceObjectHelper.fromMap(outputMap, "Invoice");
  }
  public BigInteger getBigIntegerTotalPostpaidBilledUsageFromInvoicePostpaidBilledUsageTotal() {
    return (BigInteger)outputMap.get("TotalPostpaidBilledUsage");
  }
  public InvoicePostpaidProductChargeTotalOutputData getInvoicePostpaidProductChargeTotalOutputDataInvoicePostpaidProductChargeTotalOutputDataFromInvoicePostpaidProductChargeTotal() {
    return InvoicePostpaidProductChargeTotalOutputHelper.fromMap(outputMap);
  }
  public InvoicePostpaidUnbilledUsageTotalOutputData getInvoicePostpaidUnbilledUsageTotalOutputDataInvoicePostpaidUnbilledUsageTotalOutputDataFromInvoicePostpaidUnbilledUsageTotal() {
    return InvoicePostpaidUnbilledUsageTotalOutputHelper.fromMap(outputMap);
  }
  public BigInteger getBigIntegerTotalPrepaidBilledUsageFromInvoicePrepaidBilledUsageTotal() {
    return (BigInteger)outputMap.get("TotalPrepaidBilledUsage");
  }
  public InvoicePrepaidProductChargeTotalOutputData getInvoicePrepaidProductChargeTotalOutputDataInvoicePrepaidProductChargeTotalOutputDataFromInvoicePrepaidProductChargeTotal() {
    return InvoicePrepaidProductChargeTotalOutputHelper.fromMap(outputMap);
  }
  public InvoicePrepaidUnbilledUsageTotalOutputData getInvoicePrepaidUnbilledUsageTotalOutputDataInvoicePrepaidUnbilledUsageTotalOutputDataFromInvoicePrepaidUnbilledUsageTotal() {
    return InvoicePrepaidUnbilledUsageTotalOutputHelper.fromMap(outputMap);
  }
  public InvoiceObjectData getInvoiceObjectDataInvoiceFromInvoiceReIssue() {
    return InvoiceObjectHelper.fromMap(outputMap, "Invoice");
  }
  public InvoiceObjectDataList getInvoiceObjectDataInvoiceFromInvoiceReissueFind() {
    return InvoiceObjectHelper.fromMapList(outputMap, "InvoiceList");
  }
  public InvoiceObjectData getInvoiceObjectDataInvoiceFromInvoiceReissueGet() {
    return InvoiceObjectHelper.fromMap(outputMap, "Invoice");
  }
  public InvoiceSummaryObjectData getInvoiceSummaryObjectDataInvoiceSummaryFromInvoiceSummaryGet() {
    return InvoiceSummaryObjectHelper.fromMap(outputMap, "InvoiceSummary");
  }
  public InvoiceObjectData getInvoiceObjectDataInvoiceFromPaymentDateReschedule() {
    return InvoiceObjectHelper.fromMap(outputMap, "Invoice");
  }
  /**
   @deprecated
   */
  public void setAccountInternalId(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setBillDispMeth(Integer data) {
    if (data != null) {
      addInput("BillDispMeth", data);
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
  public InvoiceAmountObjectData getInvoiceAmountObjectData() {
    return InvoiceAmountObjectHelper.fromMap(outputMap, "InvoiceAmount");
  }
  /**
   @deprecated
   */
  public InvoiceBalanceSummaryOutputData getInvoiceBalanceSummaryOutputData() {
    return InvoiceBalanceSummaryOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setInvoiceObjectFilter(InvoiceObjectFilter data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(data, new HashMap()).get("InvoiceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvoiceObjectData(InvoiceObjectData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(data, new HashMap()).get("InvoiceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvoiceObjectKeyData(InvoiceObjectKeyData data) {
    if (data != null) {
      addInput("Invoice", InvoiceObjectKeyHelper.toMap(data, new HashMap()).get("InvoiceObject"));
    }
  }
  /**
   @deprecated
   */
  public InvoiceObjectDataList getInvoiceObjectDataList() {
    return InvoiceObjectHelper.fromMapList(outputMap, "InvoiceList");
  }
  /**
   @deprecated
   */
  public InvoiceObjectData getInvoiceObjectData() {
    return InvoiceObjectHelper.fromMap(outputMap, "Invoice");
  }
  /**
   @deprecated
   */
  public InvoicePostpaidProductChargeTotalOutputData getInvoicePostpaidProductChargeTotalOutputData() {
    return InvoicePostpaidProductChargeTotalOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public InvoicePostpaidUnbilledUsageTotalOutputData getInvoicePostpaidUnbilledUsageTotalOutputData() {
    return InvoicePostpaidUnbilledUsageTotalOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public InvoicePrepaidProductChargeTotalOutputData getInvoicePrepaidProductChargeTotalOutputData() {
    return InvoicePrepaidProductChargeTotalOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public InvoicePrepaidUnbilledUsageTotalOutputData getInvoicePrepaidUnbilledUsageTotalOutputData() {
    return InvoicePrepaidUnbilledUsageTotalOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public InvoiceSummaryObjectData getInvoiceSummaryObjectData() {
    return InvoiceSummaryObjectHelper.fromMap(outputMap, "InvoiceSummary");
  }
  /**
   @deprecated
   */
  public void setPaymentDueDate(Date data) {
    if (data != null) {
      addInput("PaymentDueDate", data);
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
  public BigInteger getTotalPostpaidBilledUsage() {
    return (BigInteger)outputMap.get("TotalPostpaidBilledUsage");
  }
  /**
   @deprecated
   */
  public BigInteger getTotalPrepaidBilledUsage() {
    return (BigInteger)outputMap.get("TotalPrepaidBilledUsage");
  }
}
