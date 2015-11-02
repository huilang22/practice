/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionGrpRequest.java
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

import com.csgsystems.om.data.*;
public final class ConditionExpressionGrpRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ConditionExpressionGrpRequest (String request, ConditionExpressionGrpRequestMethod method) {
    initialize(request, "ConditionExpressionGrp", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ConditionExpressionGrpRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setConditionExpressionGrpForConditionExpressionGrpCreate(CondExprGrpObjBaseData data) {
    if (data != null) {
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseHelper.toMap(data, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }
  public void setConditionExpressionGrpForConditionExpressionGrpFind(CondExprGrpObjFilter data) {
    if (data != null) {
      addInput("ConditionExpressionGrp", CondExprGrpObjHelper.toMap(data, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }
  public void setConditionExpressionGrpForConditionExpressionGrpGet(CondExprGrpObjBaseKeyData data) {
    if (data != null) {
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseKeyHelper.toMap(data, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }
  public void setConditionExpressionGrpForConditionExpressionGrpUpdate(CondExprGrpObjBaseData data) {
    if (data != null) {
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseHelper.toMap(data, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }
  public CondExprGrpObjBaseData getCondExprGrpObjBaseDataConditionExpressionGrpFromConditionExpressionGrpCreate() {
    return CondExprGrpObjBaseHelper.fromMap(outputMap, "ConditionExpressionGrp");
  }
  public CondExprGrpObjDataList getCondExprGrpObjDataConditionExpressionGrpFromConditionExpressionGrpFind() {
    return CondExprGrpObjHelper.fromMapList(outputMap, "ConditionExpressionGrpList");
  }
  public CondExprGrpObjData getCondExprGrpObjDataConditionExpressionGrpFromConditionExpressionGrpGet() {
    return CondExprGrpObjHelper.fromMap(outputMap, "ConditionExpressionGrp");
  }
  public CondExprGrpObjBaseData getCondExprGrpObjBaseDataConditionExpressionGrpFromConditionExpressionGrpUpdate() {
    return CondExprGrpObjBaseHelper.fromMap(outputMap, "ConditionExpressionGrp");
  }
  /**
   @deprecated
   */
  public void setCondExprGrpObjFilter(CondExprGrpObjFilter data) {
    if (data != null) {
      addInput("CondExprGrpObj", CondExprGrpObjHelper.toMap(data, new HashMap()).get("CondExprGrpObj"));
    }
  }
  /**
   @deprecated
   */
  public CondExprGrpObjDataList getCondExprGrpObjDataList() {
    return CondExprGrpObjHelper.fromMapList(outputMap, "CondExprGrpObjList");
  }
  /**
   @deprecated
   */
  public CondExprGrpObjData getCondExprGrpObjData() {
    return CondExprGrpObjHelper.fromMap(outputMap, "ConditionExpressionGrp");
  }
  /**
   @deprecated
   */
  public void setCondExprGrpObjBaseData(CondExprGrpObjBaseData data) {
    if (data != null) {
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseHelper.toMap(data, new HashMap()).get("CondExprGrpObjBase"));
    }
  }
  /**
   @deprecated
   */
  public void setCondExprGrpObjBaseKeyData(CondExprGrpObjBaseKeyData data) {
    if (data != null) {
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseKeyHelper.toMap(data, new HashMap()).get("CondExprGrpObjBase"));
    }
  }
  /**
   @deprecated
   */
  public CondExprGrpObjBaseData getCondExprGrpObjBaseData() {
    return CondExprGrpObjBaseHelper.fromMap(outputMap, "ConditionExpressionGrp");
  }
}
