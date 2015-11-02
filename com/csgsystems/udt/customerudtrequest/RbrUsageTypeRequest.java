/*
 * Generated code DO NOT EDIT
 * Generated file: RbrUsageTypeRequest.java
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
public final class RbrUsageTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrUsageTypeRequest (String request, RbrUsageTypeRequestMethod method) {
    initialize(request, "RbrUsageType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrUsageTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrUsageTypeForRbrUsageTypeCreate(RbrUsageTypeObjectData data) {
    if (data != null) {
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(data, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }
  public void setRbrUsageTypeForRbrUsageTypeFind(RbrUsageTypeObjectFilter data) {
    if (data != null) {
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(data, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }
  public void setRbrUsageTypeForRbrUsageTypeGet(RbrUsageTypeObjectKeyData data) {
    if (data != null) {
      addInput("RbrUsageType", RbrUsageTypeObjectKeyHelper.toMap(data, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }
  public void setRbrUsageTypeForRbrUsageTypeUpdate(RbrUsageTypeObjectData data) {
    if (data != null) {
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(data, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }
  public RbrUsageTypeObjectData getRbrUsageTypeObjectDataRbrUsageTypeFromRbrUsageTypeCreate() {
    return RbrUsageTypeObjectHelper.fromMap(outputMap, "RbrUsageType");
  }
  public RbrUsageTypeObjectDataList getRbrUsageTypeObjectDataRbrUsageTypeFromRbrUsageTypeFind() {
    return RbrUsageTypeObjectHelper.fromMapList(outputMap, "RbrUsageTypeList");
  }
  public RbrUsageTypeObjectData getRbrUsageTypeObjectDataRbrUsageTypeFromRbrUsageTypeGet() {
    return RbrUsageTypeObjectHelper.fromMap(outputMap, "RbrUsageType");
  }
  public RbrUsageTypeObjectData getRbrUsageTypeObjectDataRbrUsageTypeFromRbrUsageTypeUpdate() {
    return RbrUsageTypeObjectHelper.fromMap(outputMap, "RbrUsageType");
  }
  /**
   @deprecated
   */
  public void setRbrUsageTypeObjectFilter(RbrUsageTypeObjectFilter data) {
    if (data != null) {
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(data, new HashMap()).get("RbrUsageTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrUsageTypeObjectData(RbrUsageTypeObjectData data) {
    if (data != null) {
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(data, new HashMap()).get("RbrUsageTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrUsageTypeObjectKeyData(RbrUsageTypeObjectKeyData data) {
    if (data != null) {
      addInput("RbrUsageType", RbrUsageTypeObjectKeyHelper.toMap(data, new HashMap()).get("RbrUsageTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrUsageTypeObjectDataList getRbrUsageTypeObjectDataList() {
    return RbrUsageTypeObjectHelper.fromMapList(outputMap, "RbrUsageTypeList");
  }
  /**
   @deprecated
   */
  public RbrUsageTypeObjectData getRbrUsageTypeObjectData() {
    return RbrUsageTypeObjectHelper.fromMap(outputMap, "RbrUsageType");
  }
}
