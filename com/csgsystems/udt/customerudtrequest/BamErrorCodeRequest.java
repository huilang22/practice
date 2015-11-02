/*
 * Generated code DO NOT EDIT
 * Generated file: BamErrorCodeRequest.java
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
public final class BamErrorCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BamErrorCodeRequest (String request, BamErrorCodeRequestMethod method) {
    initialize(request, "BamErrorCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BamErrorCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBamErrorCodeForBamErrorCodeCreate(BECObjectData data) {
    if (data != null) {
      addInput("BamErrorCode", BECObjectHelper.toMap(data, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }
  public void setBamErrorCodeForBamErrorCodeDelete(BECObjectKeyData data) {
    if (data != null) {
      addInput("BamErrorCode", BECObjectKeyHelper.toMap(data, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }
  public void setBamErrorCodeForBamErrorCodeFind(BECObjectFilter data) {
    if (data != null) {
      addInput("BamErrorCode", BECObjectHelper.toMap(data, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }
  public void setBamErrorCodeForBamErrorCodeGet(BECObjectKeyData data) {
    if (data != null) {
      addInput("BamErrorCode", BECObjectKeyHelper.toMap(data, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }
  public void setBamErrorCodeForBamErrorCodeUpdate(BECObjectData data) {
    if (data != null) {
      addInput("BamErrorCode", BECObjectHelper.toMap(data, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }
  public BECObjectData getBECObjectDataBamErrorCodeFromBamErrorCodeCreate() {
    return BECObjectHelper.fromMap(outputMap, "BamErrorCode");
  }
  public BECObjectData getBECObjectDataBamErrorCodeFromBamErrorCodeDelete() {
    return BECObjectHelper.fromMap(outputMap, "BamErrorCode");
  }
  public BECObjectDataList getBECObjectDataBamErrorCodeFromBamErrorCodeFind() {
    return BECObjectHelper.fromMapList(outputMap, "BamErrorCodeList");
  }
  public BECObjectData getBECObjectDataBamErrorCodeFromBamErrorCodeGet() {
    return BECObjectHelper.fromMap(outputMap, "BamErrorCode");
  }
  public BECObjectData getBECObjectDataBamErrorCodeFromBamErrorCodeUpdate() {
    return BECObjectHelper.fromMap(outputMap, "BamErrorCode");
  }
  /**
   @deprecated
   */
  public void setBECObjectFilter(BECObjectFilter data) {
    if (data != null) {
      addInput("BEC", BECObjectHelper.toMap(data, new HashMap()).get("BECObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBECObjectData(BECObjectData data) {
    if (data != null) {
      addInput("BamErrorCode", BECObjectHelper.toMap(data, new HashMap()).get("BECObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBECObjectKeyData(BECObjectKeyData data) {
    if (data != null) {
      addInput("BamErrorCode", BECObjectKeyHelper.toMap(data, new HashMap()).get("BECObject"));
    }
  }
  /**
   @deprecated
   */
  public BECObjectDataList getBECObjectDataList() {
    return BECObjectHelper.fromMapList(outputMap, "BECList");
  }
  /**
   @deprecated
   */
  public BECObjectData getBECObjectData() {
    return BECObjectHelper.fromMap(outputMap, "BamErrorCode");
  }
}
