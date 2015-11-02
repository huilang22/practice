/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentRequest.java
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
public final class PaymentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PaymentRequest (String request, PaymentRequestMethod method) {
    initialize(request, "Payment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PaymentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, PaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, PaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, PaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, PaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, PaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, PaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, PaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, PaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, PaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, PaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PaymentDistributionRequest request, PaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PaymentDistributionRequest request, PaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setPaymentForPaymentAllocate(PaymentObjectData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setChargeTypeForPaymentAmountConvert(Integer data) {
    if (data != null) {
      addInput("ChargeType", data);
    }
  }
  public void setConversionDateForPaymentAmountConvert(Date data) {
    if (data != null) {
      addInput("ConversionDate", data);
    }
  }
  public void setCurrencyCodeForPaymentAmountConvert(Integer data) {
    if (data != null) {
      addInput("CurrencyCode", data);
    }
  }
  public void setExrateClassForPaymentAmountConvert(Integer data) {
    if (data != null) {
      addInput("ExrateClass", data);
    }
  }
  public void setExternalAmountForPaymentAmountConvert(BigInteger data) {
    if (data != null) {
      addInput("ExternalAmount", data);
    }
  }
  public void setExternalCurrencyForPaymentAmountConvert(Integer data) {
    if (data != null) {
      addInput("ExternalCurrency", data);
    }
  }
  public void setPaypndcnlTrackingIdForPaymentCancelPending(Integer data) {
    if (data != null) {
      addInput("PaypndcnlTrackingId", data);
    }
  }
  public void setPaypndcnlTrackingIdServForPaymentCancelPending(Integer data) {
    if (data != null) {
      addInput("PaypndcnlTrackingIdServ", data);
    }
  }
  public void setPaypndcmpTrackingIdForPaymentCompletePending(Integer data) {
    if (data != null) {
      addInput("PaypndcmpTrackingId", data);
    }
  }
  public void setPaypndcmpTrackingIdServForPaymentCompletePending(Integer data) {
    if (data != null) {
      addInput("PaypndcmpTrackingIdServ", data);
    }
  }
  public void setPaymentForPaymentCount(PaymentObjectData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setPaymentForPaymentCreate(PaymentObjectData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setPaymentForPaymentCreatePending(PaymentObjectData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setWaiveEpgForPaymentCreate(Integer data) {
    if (data != null) {
      addInput("WaiveEpg", data);
    }
  }
  public void setPaymentForPaymentCredit(PaymentObjectData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setPaymentTransForPaymentCredit(PaymentTransObjectData data) {
    if (data != null) {
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(data, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }
  public void setPaymentForPaymentDebitAssumed(PaymentObjectData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setPaymentForPaymentDelete(PaymentObjectKeyData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectKeyHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setPaymentForPaymentFindCount(PaymentObjectFilter data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setPaymentForPaymentFind(PaymentObjectFilter data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setPaymentForPaymentGet(PaymentObjectKeyData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectKeyHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setPaymentForPaymentNoBackoutFind(PaymentObjectFilter data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setPaymentForPaymentReverse(PaymentObjectData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setAccountExternalIdForPaymentTransfer(String data) {
    if (data != null) {
      addInput("AccountExternalId", data);
    }
  }
  public void setAccountExternalIdTypeForPaymentTransfer(Integer data) {
    if (data != null) {
      addInput("AccountExternalIdType", data);
    }
  }
  public void setBillRefNoForPaymentTransfer(Integer data) {
    if (data != null) {
      addInput("BillRefNo", data);
    }
  }
  public void setBillRefResetsForPaymentTransfer(Integer data) {
    if (data != null) {
      addInput("BillRefResets", data);
    }
  }
  public void setOpenItemIdForPaymentTransfer(Integer data) {
    if (data != null) {
      addInput("OpenItemId", data);
    }
  }
  public void setPaymentForPaymentTransfer(PaymentObjectKeyData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectKeyHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setPaymentForPaymentUpdate(PaymentObjectData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public void setWaiveEpgForPaymentUpdate(Integer data) {
    if (data != null) {
      addInput("WaiveEpg", data);
    }
  }
  public void setPaymentForPaymentValidate(PaymentObjectData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap(), "Payment").get("Payment"));
    }
  }
  public BigInteger getBigIntegerTransAmountFromPaymentAmountConvert() {
    return (BigInteger)outputMap.get("TransAmount");
  }
  public PaymentTransObjectData getPaymentTransObjectDataPaymentTransFromPaymentCancelPending() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
  public PaymentObjectData getPaymentObjectDataPaymentFromPaymentCompletePending() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
  public Integer getIntegerNsfCountFromPaymentCount() {
    return (Integer)outputMap.get("NsfCount");
  }
  public PaymentObjectData getPaymentObjectDataPaymentFromPaymentCreate() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
  public PaymentTransObjectData getPaymentTransObjectDataPaymentTransFromPaymentCreatePending() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
  public PaymentTransObjectData getPaymentTransObjectDataPaymentTransFromPaymentCredit() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
  public PaymentTransObjectData getPaymentTransObjectDataPaymentTransFromPaymentDebitAssumed() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
  public Integer getIntegerTotalCountFromPaymentFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public PaymentObjectDataList getPaymentObjectDataPaymentFromPaymentFind() {
    return PaymentObjectHelper.fromMapList(outputMap, "PaymentList");
  }
  public PaymentObjectData getPaymentObjectDataPaymentFromPaymentGet() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
  public PaymentObjectDataList getPaymentObjectDataPaymentFromPaymentNoBackoutFind() {
    return PaymentObjectHelper.fromMapList(outputMap, "PaymentList");
  }
  public PaymentObjectData getPaymentObjectDataPaymentFromPaymentReverse() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
  public PaymentObjectData getPaymentObjectDataPaymentFromPaymentTransfer() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
  public PaymentObjectData getPaymentObjectDataPaymentFromPaymentUpdate() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
  public PaymentTransObjectData getPaymentTransObjectDataPaymentTransFromPaymentValidate() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
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
  public void setChargeType(Integer data) {
    if (data != null) {
      addInput("ChargeType", data);
    }
  }
  /**
   @deprecated
   */
  public void setConversionDate(Date data) {
    if (data != null) {
      addInput("ConversionDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setCurrencyCode(Integer data) {
    if (data != null) {
      addInput("CurrencyCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setExrateClass(Integer data) {
    if (data != null) {
      addInput("ExrateClass", data);
    }
  }
  /**
   @deprecated
   */
  public void setExternalAmount(BigInteger data) {
    if (data != null) {
      addInput("ExternalAmount", data);
    }
  }
  /**
   @deprecated
   */
  public void setExternalCurrency(Integer data) {
    if (data != null) {
      addInput("ExternalCurrency", data);
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
  public void setPaymentObjectFilter(PaymentObjectFilter data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap()).get("PaymentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentObjectData(PaymentObjectData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectHelper.toMap(data, new HashMap()).get("PaymentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentObjectKeyData(PaymentObjectKeyData data) {
    if (data != null) {
      addInput("Payment", PaymentObjectKeyHelper.toMap(data, new HashMap()).get("PaymentObject"));
    }
  }
  /**
   @deprecated
   */
  public PaymentObjectDataList getPaymentObjectDataList() {
    return PaymentObjectHelper.fromMapList(outputMap, "PaymentList");
  }
  /**
   @deprecated
   */
  public PaymentObjectData getPaymentObjectData() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
  /**
   @deprecated
   */
  public void setPaymentTransObjectData(PaymentTransObjectData data) {
    if (data != null) {
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(data, new HashMap()).get("PaymentTransObject"));
    }
  }
  /**
   @deprecated
   */
  public PaymentTransObjectData getPaymentTransObjectData() {
    return PaymentTransObjectHelper.fromMap(outputMap, "PaymentTrans");
  }
  /**
   @deprecated
   */
  public void setPaypndcmpTrackingId(Integer data) {
    if (data != null) {
      addInput("PaypndcmpTrackingId", data);
    }
  }
  /**
   @deprecated
   */
  public void setPaypndcmpTrackingIdServ(Integer data) {
    if (data != null) {
      addInput("PaypndcmpTrackingIdServ", data);
    }
  }
  /**
   @deprecated
   */
  public void setPaypndcnlTrackingId(Integer data) {
    if (data != null) {
      addInput("PaypndcnlTrackingId", data);
    }
  }
  /**
   @deprecated
   */
  public void setPaypndcnlTrackingIdServ(Integer data) {
    if (data != null) {
      addInput("PaypndcnlTrackingIdServ", data);
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
  public void setWaiveEpg(Integer data) {
    if (data != null) {
      addInput("WaiveEpg", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getNsfCount() {
    return (Integer)outputMap.get("NsfCount");
  }
  /**
   @deprecated
   */
  public BigInteger getTransAmount() {
    return (BigInteger)outputMap.get("TransAmount");
  }
}
