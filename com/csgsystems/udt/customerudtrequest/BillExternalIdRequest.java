/*
 * Generated code DO NOT EDIT
 * Generated file: BillExternalIdRequest.java
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

import com.csgsystems.si.data.*;
public final class BillExternalIdRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillExternalIdRequest (String request, BillExternalIdRequestMethod method) {
    initialize(request, "BillExternalId", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillExternalIdRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillExternalIdForBillExternalIdFind(BillExternalIdObjectFilter data) {
    if (data != null) {
      addInput("BillExternalId", BillExternalIdObjectHelper.toMap(data, new HashMap(), "BillExternalId").get("BillExternalId"));
    }
  }
  public void setBillExternalIdForBillExternalIdGet(BillExternalIdObjectKeyData data) {
    if (data != null) {
      addInput("BillExternalId", BillExternalIdObjectKeyHelper.toMap(data, new HashMap(), "BillExternalId").get("BillExternalId"));
    }
  }
  public BillExternalIdObjectDataList getBillExternalIdObjectDataBillExternalIdFromBillExternalIdFind() {
    return BillExternalIdObjectHelper.fromMapList(outputMap, "BillExternalIdList");
  }
  public BillExternalIdObjectData getBillExternalIdObjectDataBillExternalIdFromBillExternalIdGet() {
    return BillExternalIdObjectHelper.fromMap(outputMap, "BillExternalId");
  }
  /**
   @deprecated
   */
  public void setBillExternalIdObjectFilter(BillExternalIdObjectFilter data) {
    if (data != null) {
      addInput("BillExternalId", BillExternalIdObjectHelper.toMap(data, new HashMap()).get("BillExternalIdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillExternalIdObjectKeyData(BillExternalIdObjectKeyData data) {
    if (data != null) {
      addInput("BillExternalId", BillExternalIdObjectKeyHelper.toMap(data, new HashMap()).get("BillExternalIdObject"));
    }
  }
  /**
   @deprecated
   */
  public BillExternalIdObjectDataList getBillExternalIdObjectDataList() {
    return BillExternalIdObjectHelper.fromMapList(outputMap, "BillExternalIdList");
  }
  /**
   @deprecated
   */
  public BillExternalIdObjectData getBillExternalIdObjectData() {
    return BillExternalIdObjectHelper.fromMap(outputMap, "BillExternalId");
  }
}
