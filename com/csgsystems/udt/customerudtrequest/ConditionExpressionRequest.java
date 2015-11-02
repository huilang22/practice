/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionExpressionRequest.java
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
public final class ConditionExpressionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ConditionExpressionRequest (String request, ConditionExpressionRequestMethod method) {
    initialize(request, "ConditionExpression", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ConditionExpressionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setConditionExpressionForConditionExpressionCreate(CondExprObjData data) {
    if (data != null) {
      addInput("ConditionExpression", CondExprObjHelper.toMap(data, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }
  public void setConditionExpressionForConditionExpressionFind(CondExprObjFilter data) {
    if (data != null) {
      addInput("ConditionExpression", CondExprObjHelper.toMap(data, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }
  public void setConditionExpressionForConditionExpressionGet(CondExprObjKeyData data) {
    if (data != null) {
      addInput("ConditionExpression", CondExprObjKeyHelper.toMap(data, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }
  public void setConditionExpressionForConditionExpressionUpdate(CondExprObjData data) {
    if (data != null) {
      addInput("ConditionExpression", CondExprObjHelper.toMap(data, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }
  public CondExprObjData getCondExprObjDataConditionExpressionFromConditionExpressionCreate() {
    return CondExprObjHelper.fromMap(outputMap, "ConditionExpression");
  }
  public CondExprObjDataList getCondExprObjDataConditionExpressionFromConditionExpressionFind() {
    return CondExprObjHelper.fromMapList(outputMap, "ConditionExpressionList");
  }
  public CondExprObjData getCondExprObjDataConditionExpressionFromConditionExpressionGet() {
    return CondExprObjHelper.fromMap(outputMap, "ConditionExpression");
  }
  public CondExprObjData getCondExprObjDataConditionExpressionFromConditionExpressionUpdate() {
    return CondExprObjHelper.fromMap(outputMap, "ConditionExpression");
  }
  /**
   @deprecated
   */
  public void setCondExprObjFilter(CondExprObjFilter data) {
    if (data != null) {
      addInput("CondExprObj", CondExprObjHelper.toMap(data, new HashMap()).get("CondExprObj"));
    }
  }
  /**
   @deprecated
   */
  public void setCondExprObjData(CondExprObjData data) {
    if (data != null) {
      addInput("ConditionExpression", CondExprObjHelper.toMap(data, new HashMap()).get("CondExprObj"));
    }
  }
  /**
   @deprecated
   */
  public void setCondExprObjKeyData(CondExprObjKeyData data) {
    if (data != null) {
      addInput("ConditionExpression", CondExprObjKeyHelper.toMap(data, new HashMap()).get("CondExprObj"));
    }
  }
  /**
   @deprecated
   */
  public CondExprObjDataList getCondExprObjDataList() {
    return CondExprObjHelper.fromMapList(outputMap, "CondExprObjList");
  }
  /**
   @deprecated
   */
  public CondExprObjData getCondExprObjData() {
    return CondExprObjHelper.fromMap(outputMap, "ConditionExpression");
  }
}
