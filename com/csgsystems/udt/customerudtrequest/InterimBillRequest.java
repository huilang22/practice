/*
 * Generated code DO NOT EDIT
 * Generated file: InterimBillRequest.java
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
public final class InterimBillRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InterimBillRequest (String request, InterimBillRequestMethod method) {
    initialize(request, "InterimBill", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InterimBillRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, InterimBillRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, InterimBillRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, InterimBillRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, InterimBillRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, InterimBillRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, InterimBillRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setInterimBillForInterimBillCancel(InterimBillObjectKeyData data) {
    if (data != null) {
      addInput("InterimBill", InterimBillObjectKeyHelper.toMap(data, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }
  public void setInterimBillForInterimBillCreate(InterimBillObjectData data) {
    if (data != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(data, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }
  public void setInterimBillForInterimBillFind(InterimBillObjectFilter data) {
    if (data != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(data, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }
  public void setInterimBillForInterimBillGet(InterimBillObjectKeyData data) {
    if (data != null) {
      addInput("InterimBill", InterimBillObjectKeyHelper.toMap(data, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }
  public void setInterimBillForInterimBillPollHot(InterimBillObjectData data) {
    if (data != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(data, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }
  public void setHotInvoiceForInterimBillRequestHot(HotInvoiceObjectData data) {
    if (data != null) {
      addInput("HotInvoice", HotInvoiceObjectHelper.toMap(data, new HashMap(), "HotInvoice").get("HotInvoice"));
    }
  }
  public void setInterimBillForInterimBillRequestHot(InterimBillObjectData data) {
    if (data != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(data, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }
  public void setInterimBillForInterimBillUpdate(InterimBillObjectData data) {
    if (data != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(data, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }
  public InterimBillObjectData getInterimBillObjectDataInterimBillFromInterimBillCancel() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
  public InterimBillObjectData getInterimBillObjectDataInterimBillFromInterimBillCreate() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
  public InterimBillObjectDataList getInterimBillObjectDataInterimBillFromInterimBillFind() {
    return InterimBillObjectHelper.fromMapList(outputMap, "InterimBillList");
  }
  public InterimBillObjectData getInterimBillObjectDataInterimBillFromInterimBillGet() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
  public InterimBillPollHotOutputData getInterimBillPollHotOutputDataInterimBillPollHotOutputDataFromInterimBillPollHot() {
    return InterimBillPollHotOutputHelper.fromMap(outputMap);
  }
  public InterimBillObjectData getInterimBillObjectDataInterimBillFromInterimBillRequestHot() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
  public InterimBillObjectData getInterimBillObjectDataInterimBillFromInterimBillUpdate() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
  /**
   @deprecated
   */
  public void setHotInvoiceObjectData(HotInvoiceObjectData data) {
    if (data != null) {
      addInput("HotInvoice", HotInvoiceObjectHelper.toMap(data, new HashMap()).get("HotInvoiceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInterimBillObjectFilter(InterimBillObjectFilter data) {
    if (data != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(data, new HashMap()).get("InterimBillObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInterimBillObjectData(InterimBillObjectData data) {
    if (data != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(data, new HashMap()).get("InterimBillObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInterimBillObjectKeyData(InterimBillObjectKeyData data) {
    if (data != null) {
      addInput("InterimBill", InterimBillObjectKeyHelper.toMap(data, new HashMap()).get("InterimBillObject"));
    }
  }
  /**
   @deprecated
   */
  public InterimBillObjectDataList getInterimBillObjectDataList() {
    return InterimBillObjectHelper.fromMapList(outputMap, "InterimBillList");
  }
  /**
   @deprecated
   */
  public InterimBillObjectData getInterimBillObjectData() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
  /**
   @deprecated
   */
  public InterimBillPollHotOutputData getInterimBillPollHotOutputData() {
    return InterimBillPollHotOutputHelper.fromMap(outputMap);
  }
}
