/*
 * Generated code DO NOT EDIT
 * Generated file: RefundRequest.java
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
public final class RefundRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RefundRequest (String request, RefundRequestMethod method) {
    initialize(request, "Refund", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RefundRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, RefundRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, RefundRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ContactRequest request, RefundRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ContactRequest request, RefundRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, RefundRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, RefundRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAccountInternalIdForRefundApprove(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setAmountForRefundApprove(BigInteger data) {
    if (data != null) {
      addInput("Amount", data);
    }
  }
  public void setRefundForRefundApprove(RefundObjectKeyData data) {
    if (data != null) {
      addInput("Refund", RefundObjectKeyHelper.toMap(data, new HashMap(), "Refund").get("Refund"));
    }
  }
  public void setSupervisorForRefundApprove(String data) {
    if (data != null) {
      addInput("Supervisor", data);
    }
  }
  public void setUserForRefundApprove(String data) {
    if (data != null) {
      addInput("User", data);
    }
  }
  public void setRefundForRefundCreate(RefundObjectData data) {
    if (data != null) {
      addInput("Refund", RefundObjectHelper.toMap(data, new HashMap(), "Refund").get("Refund"));
    }
  }
  public void setRefundForRefundDeny(RefundObjectKeyData data) {
    if (data != null) {
      addInput("Refund", RefundObjectKeyHelper.toMap(data, new HashMap(), "Refund").get("Refund"));
    }
  }
  public void setTreasuryFlagForRefundDeny(Integer data) {
    if (data != null) {
      addInput("TreasuryFlag", data);
    }
  }
  public void setRefundForRefundFind(RefundObjectFilter data) {
    if (data != null) {
      addInput("Refund", RefundObjectHelper.toMap(data, new HashMap(), "Refund").get("Refund"));
    }
  }
  public void setRefundForRefundGet(RefundObjectKeyData data) {
    if (data != null) {
      addInput("Refund", RefundObjectKeyHelper.toMap(data, new HashMap(), "Refund").get("Refund"));
    }
  }
  public void setCheckNumForRefundMarkPaid(String data) {
    if (data != null) {
      addInput("CheckNum", data);
    }
  }
  public void setRefundForRefundMarkPaid(RefundObjectKeyData data) {
    if (data != null) {
      addInput("Refund", RefundObjectKeyHelper.toMap(data, new HashMap(), "Refund").get("Refund"));
    }
  }
  public void setTreasuryDateForRefundMarkPaid(Date data) {
    if (data != null) {
      addInput("TreasuryDate", data);
    }
  }
  public void setRefundForRefundUpdate(RefundObjectData data) {
    if (data != null) {
      addInput("Refund", RefundObjectHelper.toMap(data, new HashMap(), "Refund").get("Refund"));
    }
  }
  public RefundObjectData getRefundObjectDataRefundFromRefundApprove() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
  public RefundObjectData getRefundObjectDataRefundFromRefundCreate() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
  public RefundObjectData getRefundObjectDataRefundFromRefundDeny() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
  public RefundObjectDataList getRefundObjectDataRefundFromRefundFind() {
    return RefundObjectHelper.fromMapList(outputMap, "RefundList");
  }
  public RefundObjectData getRefundObjectDataRefundFromRefundGet() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
  public RefundObjectData getRefundObjectDataRefundFromRefundMarkPaid() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
  public RefundObjectData getRefundObjectDataRefundFromRefundUpdate() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
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
  public void setAmount(BigInteger data) {
    if (data != null) {
      addInput("Amount", data);
    }
  }
  /**
   @deprecated
   */
  public void setCheckNum(String data) {
    if (data != null) {
      addInput("CheckNum", data);
    }
  }
  /**
   @deprecated
   */
  public void setRefundObjectFilter(RefundObjectFilter data) {
    if (data != null) {
      addInput("Refund", RefundObjectHelper.toMap(data, new HashMap()).get("RefundObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRefundObjectData(RefundObjectData data) {
    if (data != null) {
      addInput("Refund", RefundObjectHelper.toMap(data, new HashMap()).get("RefundObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRefundObjectKeyData(RefundObjectKeyData data) {
    if (data != null) {
      addInput("Refund", RefundObjectKeyHelper.toMap(data, new HashMap()).get("RefundObject"));
    }
  }
  /**
   @deprecated
   */
  public RefundObjectDataList getRefundObjectDataList() {
    return RefundObjectHelper.fromMapList(outputMap, "RefundList");
  }
  /**
   @deprecated
   */
  public RefundObjectData getRefundObjectData() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
  /**
   @deprecated
   */
  public void setSupervisor(String data) {
    if (data != null) {
      addInput("Supervisor", data);
    }
  }
  /**
   @deprecated
   */
  public void setTreasuryDate(Date data) {
    if (data != null) {
      addInput("TreasuryDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setTreasuryFlag(Integer data) {
    if (data != null) {
      addInput("TreasuryFlag", data);
    }
  }
  /**
   @deprecated
   */
  public void setUser(String data) {
    if (data != null) {
      addInput("User", data);
    }
  }
}
