/*
 * Generated code DO NOT EDIT
 * Generated file: CcViewDefRequest.java
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
public final class CcViewDefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CcViewDefRequest (String request, CcViewDefRequestMethod method) {
    initialize(request, "CcViewDef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CcViewDefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCcViewDefForCcViewDefCreate(CcViewDefObjectData data) {
    if (data != null) {
      addInput("CcViewDef", CcViewDefObjectHelper.toMap(data, new HashMap(), "CcViewDef").get("CcViewDef"));
    }
  }
  public void setCcViewDefForCcViewDefFind(CcViewDefObjectFilter data) {
    if (data != null) {
      addInput("CcViewDef", CcViewDefObjectHelper.toMap(data, new HashMap(), "CcViewDef").get("CcViewDef"));
    }
  }
  public void setCcViewDefForCcViewDefGet(CcViewDefObjectKeyData data) {
    if (data != null) {
      addInput("CcViewDef", CcViewDefObjectKeyHelper.toMap(data, new HashMap(), "CcViewDef").get("CcViewDef"));
    }
  }
  public CcViewDefObjectData getCcViewDefObjectDataCcViewDefFromCcViewDefCreate() {
    return CcViewDefObjectHelper.fromMap(outputMap, "CcViewDef");
  }
  public CcViewDefObjectDataList getCcViewDefObjectDataCcViewDefFromCcViewDefFind() {
    return CcViewDefObjectHelper.fromMapList(outputMap, "CcViewDefList");
  }
  public CcViewDefObjectData getCcViewDefObjectDataCcViewDefFromCcViewDefGet() {
    return CcViewDefObjectHelper.fromMap(outputMap, "CcViewDef");
  }
  /**
   @deprecated
   */
  public void setCcViewDefObjectFilter(CcViewDefObjectFilter data) {
    if (data != null) {
      addInput("CcViewDef", CcViewDefObjectHelper.toMap(data, new HashMap()).get("CcViewDefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCcViewDefObjectData(CcViewDefObjectData data) {
    if (data != null) {
      addInput("CcViewDef", CcViewDefObjectHelper.toMap(data, new HashMap()).get("CcViewDefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCcViewDefObjectKeyData(CcViewDefObjectKeyData data) {
    if (data != null) {
      addInput("CcViewDef", CcViewDefObjectKeyHelper.toMap(data, new HashMap()).get("CcViewDefObject"));
    }
  }
  /**
   @deprecated
   */
  public CcViewDefObjectDataList getCcViewDefObjectDataList() {
    return CcViewDefObjectHelper.fromMapList(outputMap, "CcViewDefList");
  }
  /**
   @deprecated
   */
  public CcViewDefObjectData getCcViewDefObjectData() {
    return CcViewDefObjectHelper.fromMap(outputMap, "CcViewDef");
  }
}
