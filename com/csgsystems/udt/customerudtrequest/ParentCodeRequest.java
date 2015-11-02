/*
 * Generated code DO NOT EDIT
 * Generated file: ParentCodeRequest.java
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
public final class ParentCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ParentCodeRequest (String request, ParentCodeRequestMethod method) {
    initialize(request, "ParentCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ParentCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setParentCodeForParentCodeCreate(ParentCodeObjectData data) {
    if (data != null) {
      addInput("ParentCode", ParentCodeObjectHelper.toMap(data, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }
  public void setParentCodeForParentCodeDelete(ParentCodeObjectKeyData data) {
    if (data != null) {
      addInput("ParentCode", ParentCodeObjectKeyHelper.toMap(data, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }
  public void setParentCodeForParentCodeFind(ParentCodeObjectFilter data) {
    if (data != null) {
      addInput("ParentCode", ParentCodeObjectHelper.toMap(data, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }
  public void setParentCodeForParentCodeGet(ParentCodeObjectKeyData data) {
    if (data != null) {
      addInput("ParentCode", ParentCodeObjectKeyHelper.toMap(data, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }
  public void setParentCodeForParentCodeUpdate(ParentCodeObjectData data) {
    if (data != null) {
      addInput("ParentCode", ParentCodeObjectHelper.toMap(data, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }
  public ParentCodeObjectData getParentCodeObjectDataParentCodeFromParentCodeCreate() {
    return ParentCodeObjectHelper.fromMap(outputMap, "ParentCode");
  }
  public ParentCodeObjectData getParentCodeObjectDataParentCodeFromParentCodeDelete() {
    return ParentCodeObjectHelper.fromMap(outputMap, "ParentCode");
  }
  public ParentCodeObjectDataList getParentCodeObjectDataParentCodeFromParentCodeFind() {
    return ParentCodeObjectHelper.fromMapList(outputMap, "ParentCodeList");
  }
  public ParentCodeObjectData getParentCodeObjectDataParentCodeFromParentCodeGet() {
    return ParentCodeObjectHelper.fromMap(outputMap, "ParentCode");
  }
  public ParentCodeObjectData getParentCodeObjectDataParentCodeFromParentCodeUpdate() {
    return ParentCodeObjectHelper.fromMap(outputMap, "ParentCode");
  }
  /**
   @deprecated
   */
  public void setParentCodeObjectFilter(ParentCodeObjectFilter data) {
    if (data != null) {
      addInput("ParentCode", ParentCodeObjectHelper.toMap(data, new HashMap()).get("ParentCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setParentCodeObjectData(ParentCodeObjectData data) {
    if (data != null) {
      addInput("ParentCode", ParentCodeObjectHelper.toMap(data, new HashMap()).get("ParentCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setParentCodeObjectKeyData(ParentCodeObjectKeyData data) {
    if (data != null) {
      addInput("ParentCode", ParentCodeObjectKeyHelper.toMap(data, new HashMap()).get("ParentCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public ParentCodeObjectDataList getParentCodeObjectDataList() {
    return ParentCodeObjectHelper.fromMapList(outputMap, "ParentCodeList");
  }
  /**
   @deprecated
   */
  public ParentCodeObjectData getParentCodeObjectData() {
    return ParentCodeObjectHelper.fromMap(outputMap, "ParentCode");
  }
}
