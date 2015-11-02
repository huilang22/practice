/*
 * Generated code DO NOT EDIT
 * Generated file: BillingFrequencyRequest.java
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
public final class BillingFrequencyRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillingFrequencyRequest (String request, BillingFrequencyRequestMethod method) {
    initialize(request, "BillingFrequency", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillingFrequencyRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillingFrequencyForBillingFrequencyCreate(BFObjectData data) {
    if (data != null) {
      addInput("BillingFrequency", BFObjectHelper.toMap(data, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }
  public void setBillingFrequencyForBillingFrequencyDelete(BFObjectKeyData data) {
    if (data != null) {
      addInput("BillingFrequency", BFObjectKeyHelper.toMap(data, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }
  public void setBillingFrequencyForBillingFrequencyFind(BFObjectFilter data) {
    if (data != null) {
      addInput("BillingFrequency", BFObjectHelper.toMap(data, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }
  public void setBillingFrequencyForBillingFrequencyGet(BFObjectKeyData data) {
    if (data != null) {
      addInput("BillingFrequency", BFObjectKeyHelper.toMap(data, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }
  public void setBillingFrequencyForBillingFrequencyUpdate(BFObjectData data) {
    if (data != null) {
      addInput("BillingFrequency", BFObjectHelper.toMap(data, new HashMap(), "BillingFrequency").get("BillingFrequency"));
    }
  }
  public BFObjectData getBFObjectDataBillingFrequencyFromBillingFrequencyCreate() {
    return BFObjectHelper.fromMap(outputMap, "BillingFrequency");
  }
  public BFObjectData getBFObjectDataBillingFrequencyFromBillingFrequencyDelete() {
    return BFObjectHelper.fromMap(outputMap, "BillingFrequency");
  }
  public BFObjectDataList getBFObjectDataBillingFrequencyFromBillingFrequencyFind() {
    return BFObjectHelper.fromMapList(outputMap, "BillingFrequencyList");
  }
  public BFObjectData getBFObjectDataBillingFrequencyFromBillingFrequencyGet() {
    return BFObjectHelper.fromMap(outputMap, "BillingFrequency");
  }
  public BFObjectData getBFObjectDataBillingFrequencyFromBillingFrequencyUpdate() {
    return BFObjectHelper.fromMap(outputMap, "BillingFrequency");
  }
  /**
   @deprecated
   */
  public void setBFObjectFilter(BFObjectFilter data) {
    if (data != null) {
      addInput("BF", BFObjectHelper.toMap(data, new HashMap()).get("BFObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBFObjectData(BFObjectData data) {
    if (data != null) {
      addInput("BillingFrequency", BFObjectHelper.toMap(data, new HashMap()).get("BFObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBFObjectKeyData(BFObjectKeyData data) {
    if (data != null) {
      addInput("BillingFrequency", BFObjectKeyHelper.toMap(data, new HashMap()).get("BFObject"));
    }
  }
  /**
   @deprecated
   */
  public BFObjectDataList getBFObjectDataList() {
    return BFObjectHelper.fromMapList(outputMap, "BFList");
  }
  /**
   @deprecated
   */
  public BFObjectData getBFObjectData() {
    return BFObjectHelper.fromMap(outputMap, "BillingFrequency");
  }
}
