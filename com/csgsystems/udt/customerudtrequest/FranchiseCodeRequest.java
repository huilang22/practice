/*
 * Generated code DO NOT EDIT
 * Generated file: FranchiseCodeRequest.java
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
public final class FranchiseCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public FranchiseCodeRequest (String request, FranchiseCodeRequestMethod method) {
    initialize(request, "FranchiseCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (FranchiseCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setFranchiseCodeForFranchiseCodeCreate(FranchiseCodeObjectData data) {
    if (data != null) {
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(data, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }
  public void setFranchiseCodeForFranchiseCodeDelete(FranchiseCodeObjectKeyData data) {
    if (data != null) {
      addInput("FranchiseCode", FranchiseCodeObjectKeyHelper.toMap(data, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }
  public void setFranchiseCodeForFranchiseCodeFind(FranchiseCodeObjectFilter data) {
    if (data != null) {
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(data, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }
  public void setFranchiseCodeForFranchiseCodeGet(FranchiseCodeObjectKeyData data) {
    if (data != null) {
      addInput("FranchiseCode", FranchiseCodeObjectKeyHelper.toMap(data, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }
  public void setFranchiseCodeForFranchiseCodeUpdate(FranchiseCodeObjectData data) {
    if (data != null) {
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(data, new HashMap(), "FranchiseCode").get("FranchiseCode"));
    }
  }
  public FranchiseCodeObjectData getFranchiseCodeObjectDataFranchiseCodeFromFranchiseCodeCreate() {
    return FranchiseCodeObjectHelper.fromMap(outputMap, "FranchiseCode");
  }
  public FranchiseCodeObjectData getFranchiseCodeObjectDataFranchiseCodeFromFranchiseCodeDelete() {
    return FranchiseCodeObjectHelper.fromMap(outputMap, "FranchiseCode");
  }
  public FranchiseCodeObjectDataList getFranchiseCodeObjectDataFranchiseCodeFromFranchiseCodeFind() {
    return FranchiseCodeObjectHelper.fromMapList(outputMap, "FranchiseCodeList");
  }
  public FranchiseCodeObjectData getFranchiseCodeObjectDataFranchiseCodeFromFranchiseCodeGet() {
    return FranchiseCodeObjectHelper.fromMap(outputMap, "FranchiseCode");
  }
  public FranchiseCodeObjectData getFranchiseCodeObjectDataFranchiseCodeFromFranchiseCodeUpdate() {
    return FranchiseCodeObjectHelper.fromMap(outputMap, "FranchiseCode");
  }
  /**
   @deprecated
   */
  public void setFranchiseCodeObjectFilter(FranchiseCodeObjectFilter data) {
    if (data != null) {
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(data, new HashMap()).get("FranchiseCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setFranchiseCodeObjectData(FranchiseCodeObjectData data) {
    if (data != null) {
      addInput("FranchiseCode", FranchiseCodeObjectHelper.toMap(data, new HashMap()).get("FranchiseCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setFranchiseCodeObjectKeyData(FranchiseCodeObjectKeyData data) {
    if (data != null) {
      addInput("FranchiseCode", FranchiseCodeObjectKeyHelper.toMap(data, new HashMap()).get("FranchiseCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public FranchiseCodeObjectDataList getFranchiseCodeObjectDataList() {
    return FranchiseCodeObjectHelper.fromMapList(outputMap, "FranchiseCodeList");
  }
  /**
   @deprecated
   */
  public FranchiseCodeObjectData getFranchiseCodeObjectData() {
    return FranchiseCodeObjectHelper.fromMap(outputMap, "FranchiseCode");
  }
}
