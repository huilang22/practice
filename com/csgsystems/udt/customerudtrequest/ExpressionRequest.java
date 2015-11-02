/*
 * Generated code DO NOT EDIT
 * Generated file: ExpressionRequest.java
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
public final class ExpressionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExpressionRequest (String request, ExpressionRequestMethod method) {
    initialize(request, "Expression", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExpressionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExpressionForExpressionCreate(ExprObjData data) {
    if (data != null) {
      addInput("Expression", ExprObjHelper.toMap(data, new HashMap(), "Expression").get("Expression"));
    }
  }
  public void setExpressionForExpressionFind(ExprObjFilter data) {
    if (data != null) {
      addInput("Expression", ExprObjHelper.toMap(data, new HashMap(), "Expression").get("Expression"));
    }
  }
  public void setExpressionForExpressionGet(ExprObjKeyData data) {
    if (data != null) {
      addInput("Expression", ExprObjKeyHelper.toMap(data, new HashMap(), "Expression").get("Expression"));
    }
  }
  public void setExpressionForExpressionUpdate(ExprObjData data) {
    if (data != null) {
      addInput("Expression", ExprObjHelper.toMap(data, new HashMap(), "Expression").get("Expression"));
    }
  }
  public ExprObjData getExprObjDataExpressionFromExpressionCreate() {
    return ExprObjHelper.fromMap(outputMap, "Expression");
  }
  public ExprObjDataList getExprObjDataExpressionFromExpressionFind() {
    return ExprObjHelper.fromMapList(outputMap, "ExpressionList");
  }
  public ExprObjData getExprObjDataExpressionFromExpressionGet() {
    return ExprObjHelper.fromMap(outputMap, "Expression");
  }
  public ExprObjData getExprObjDataExpressionFromExpressionUpdate() {
    return ExprObjHelper.fromMap(outputMap, "Expression");
  }
  /**
   @deprecated
   */
  public void setExprObjFilter(ExprObjFilter data) {
    if (data != null) {
      addInput("ExprObj", ExprObjHelper.toMap(data, new HashMap()).get("ExprObj"));
    }
  }
  /**
   @deprecated
   */
  public void setExprObjData(ExprObjData data) {
    if (data != null) {
      addInput("Expression", ExprObjHelper.toMap(data, new HashMap()).get("ExprObj"));
    }
  }
  /**
   @deprecated
   */
  public void setExprObjKeyData(ExprObjKeyData data) {
    if (data != null) {
      addInput("Expression", ExprObjKeyHelper.toMap(data, new HashMap()).get("ExprObj"));
    }
  }
  /**
   @deprecated
   */
  public ExprObjDataList getExprObjDataList() {
    return ExprObjHelper.fromMapList(outputMap, "ExprObjList");
  }
  /**
   @deprecated
   */
  public ExprObjData getExprObjData() {
    return ExprObjHelper.fromMap(outputMap, "Expression");
  }
}
