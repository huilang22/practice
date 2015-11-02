/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptFormatsRequest.java
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

import com.csgsystems.cf.data.*;
public final class BillFmtOptFormatsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillFmtOptFormatsRequest (String request, BillFmtOptFormatsRequestMethod method) {
    initialize(request, "BillFmtOptFormats", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillFmtOptFormatsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillFmtOptFormatsForBillFmtOptFormatsCreate(BillFmtOptFormatsObjectData data) {
    if (data != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(data, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }
  public void setBillFmtOptFormatsForBillFmtOptFormatsDelete(BillFmtOptFormatsObjectData data) {
    if (data != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(data, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }
  public void setBillFmtOptFormatsForBillFmtOptFormatsFind(BillFmtOptFormatsObjectFilter data) {
    if (data != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(data, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }
  public void setBillFmtOptFormatsForBillFmtOptFormatsGet(BillFmtOptFormatsObjectKeyData data) {
    if (data != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectKeyHelper.toMap(data, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }
  public void setBillFmtOptFormatsForBillFmtOptFormatsUpdate(BillFmtOptFormatsObjectData data) {
    if (data != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(data, new HashMap(), "BillFmtOptFormats").get("BillFmtOptFormats"));
    }
  }
  public BillFmtOptFormatsObjectData getBillFmtOptFormatsObjectDataBillFmtOptFormatsFromBillFmtOptFormatsCreate() {
    return BillFmtOptFormatsObjectHelper.fromMap(outputMap, "BillFmtOptFormats");
  }
  public BillFmtOptFormatsObjectData getBillFmtOptFormatsObjectDataBillFmtOptFormatsFromBillFmtOptFormatsDelete() {
    return BillFmtOptFormatsObjectHelper.fromMap(outputMap, "BillFmtOptFormats");
  }
  public BillFmtOptFormatsObjectDataList getBillFmtOptFormatsObjectDataBillFmtOptFormatsFromBillFmtOptFormatsFind() {
    return BillFmtOptFormatsObjectHelper.fromMapList(outputMap, "BillFmtOptFormatsList");
  }
  public BillFmtOptFormatsObjectData getBillFmtOptFormatsObjectDataBillFmtOptFormatsFromBillFmtOptFormatsGet() {
    return BillFmtOptFormatsObjectHelper.fromMap(outputMap, "BillFmtOptFormats");
  }
  public BillFmtOptFormatsObjectData getBillFmtOptFormatsObjectDataBillFmtOptFormatsFromBillFmtOptFormatsUpdate() {
    return BillFmtOptFormatsObjectHelper.fromMap(outputMap, "BillFmtOptFormats");
  }
  /**
   @deprecated
   */
  public void setBillFmtOptFormatsObjectFilter(BillFmtOptFormatsObjectFilter data) {
    if (data != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(data, new HashMap()).get("BillFmtOptFormatsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillFmtOptFormatsObjectData(BillFmtOptFormatsObjectData data) {
    if (data != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectHelper.toMap(data, new HashMap()).get("BillFmtOptFormatsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillFmtOptFormatsObjectKeyData(BillFmtOptFormatsObjectKeyData data) {
    if (data != null) {
      addInput("BillFmtOptFormats", BillFmtOptFormatsObjectKeyHelper.toMap(data, new HashMap()).get("BillFmtOptFormatsObject"));
    }
  }
  /**
   @deprecated
   */
  public BillFmtOptFormatsObjectDataList getBillFmtOptFormatsObjectDataList() {
    return BillFmtOptFormatsObjectHelper.fromMapList(outputMap, "BillFmtOptFormatsList");
  }
  /**
   @deprecated
   */
  public BillFmtOptFormatsObjectData getBillFmtOptFormatsObjectData() {
    return BillFmtOptFormatsObjectHelper.fromMap(outputMap, "BillFmtOptFormats");
  }
}
