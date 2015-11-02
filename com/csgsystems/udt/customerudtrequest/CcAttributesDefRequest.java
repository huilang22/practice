/*
 * Generated code DO NOT EDIT
 * Generated file: CcAttributesDefRequest.java
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
public final class CcAttributesDefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CcAttributesDefRequest (String request, CcAttributesDefRequestMethod method) {
    initialize(request, "CcAttributesDef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CcAttributesDefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCcAttributesDefForCcAttributesDefCreate(CcAttributesDefObjectData data) {
    if (data != null) {
      addInput("CcAttributesDef", CcAttributesDefObjectHelper.toMap(data, new HashMap(), "CcAttributesDef").get("CcAttributesDef"));
    }
  }
  public void setCcAttributesDefForCcAttributesDefFind(CcAttributesDefObjectFilter data) {
    if (data != null) {
      addInput("CcAttributesDef", CcAttributesDefObjectHelper.toMap(data, new HashMap(), "CcAttributesDef").get("CcAttributesDef"));
    }
  }
  public void setCcAttributesDefForCcAttributesDefGet(CcAttributesDefObjectKeyData data) {
    if (data != null) {
      addInput("CcAttributesDef", CcAttributesDefObjectKeyHelper.toMap(data, new HashMap(), "CcAttributesDef").get("CcAttributesDef"));
    }
  }
  public CcAttributesDefObjectData getCcAttributesDefObjectDataCcAttributesDefFromCcAttributesDefCreate() {
    return CcAttributesDefObjectHelper.fromMap(outputMap, "CcAttributesDef");
  }
  public CcAttributesDefObjectDataList getCcAttributesDefObjectDataCcAttributesDefFromCcAttributesDefFind() {
    return CcAttributesDefObjectHelper.fromMapList(outputMap, "CcAttributesDefList");
  }
  public CcAttributesDefObjectData getCcAttributesDefObjectDataCcAttributesDefFromCcAttributesDefGet() {
    return CcAttributesDefObjectHelper.fromMap(outputMap, "CcAttributesDef");
  }
  /**
   @deprecated
   */
  public void setCcAttributesDefObjectFilter(CcAttributesDefObjectFilter data) {
    if (data != null) {
      addInput("CcAttributesDef", CcAttributesDefObjectHelper.toMap(data, new HashMap()).get("CcAttributesDefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCcAttributesDefObjectData(CcAttributesDefObjectData data) {
    if (data != null) {
      addInput("CcAttributesDef", CcAttributesDefObjectHelper.toMap(data, new HashMap()).get("CcAttributesDefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCcAttributesDefObjectKeyData(CcAttributesDefObjectKeyData data) {
    if (data != null) {
      addInput("CcAttributesDef", CcAttributesDefObjectKeyHelper.toMap(data, new HashMap()).get("CcAttributesDefObject"));
    }
  }
  /**
   @deprecated
   */
  public CcAttributesDefObjectDataList getCcAttributesDefObjectDataList() {
    return CcAttributesDefObjectHelper.fromMapList(outputMap, "CcAttributesDefList");
  }
  /**
   @deprecated
   */
  public CcAttributesDefObjectData getCcAttributesDefObjectData() {
    return CcAttributesDefObjectHelper.fromMap(outputMap, "CcAttributesDef");
  }
}
