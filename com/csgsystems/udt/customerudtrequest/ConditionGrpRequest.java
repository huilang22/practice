/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionGrpRequest.java
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
public final class ConditionGrpRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ConditionGrpRequest (String request, ConditionGrpRequestMethod method) {
    initialize(request, "ConditionGrp", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ConditionGrpRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setConditionGrpForConditionGrpCreate(CondGrpObjBaseData data) {
    if (data != null) {
      addInput("ConditionGrp", CondGrpObjBaseHelper.toMap(data, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }
  public void setConditionGrpForConditionGrpFind(CondGrpObjFilter data) {
    if (data != null) {
      addInput("ConditionGrp", CondGrpObjHelper.toMap(data, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }
  public void setConditionGrpForConditionGrpGet(CondGrpObjBaseKeyData data) {
    if (data != null) {
      addInput("ConditionGrp", CondGrpObjBaseKeyHelper.toMap(data, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }
  public void setConditionGrpForConditionGrpUpdate(CondGrpObjData data) {
    if (data != null) {
      addInput("ConditionGrp", CondGrpObjHelper.toMap(data, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }
  public CondGrpObjBaseData getCondGrpObjBaseDataConditionGrpFromConditionGrpCreate() {
    return CondGrpObjBaseHelper.fromMap(outputMap, "ConditionGrp");
  }
  public CondGrpObjDataList getCondGrpObjDataConditionGrpFromConditionGrpFind() {
    return CondGrpObjHelper.fromMapList(outputMap, "ConditionGrpList");
  }
  public CondGrpObjData getCondGrpObjDataConditionGrpFromConditionGrpGet() {
    return CondGrpObjHelper.fromMap(outputMap, "ConditionGrp");
  }
  public CondGrpObjData getCondGrpObjDataConditionGrpFromConditionGrpUpdate() {
    return CondGrpObjHelper.fromMap(outputMap, "ConditionGrp");
  }
  /**
   @deprecated
   */
  public void setCondGrpObjFilter(CondGrpObjFilter data) {
    if (data != null) {
      addInput("CondGrpObj", CondGrpObjHelper.toMap(data, new HashMap()).get("CondGrpObj"));
    }
  }
  /**
   @deprecated
   */
  public void setCondGrpObjData(CondGrpObjData data) {
    if (data != null) {
      addInput("ConditionGrp", CondGrpObjHelper.toMap(data, new HashMap()).get("CondGrpObj"));
    }
  }
  /**
   @deprecated
   */
  public CondGrpObjDataList getCondGrpObjDataList() {
    return CondGrpObjHelper.fromMapList(outputMap, "CondGrpObjList");
  }
  /**
   @deprecated
   */
  public CondGrpObjData getCondGrpObjData() {
    return CondGrpObjHelper.fromMap(outputMap, "ConditionGrp");
  }
  /**
   @deprecated
   */
  public void setCondGrpObjBaseData(CondGrpObjBaseData data) {
    if (data != null) {
      addInput("ConditionGrp", CondGrpObjBaseHelper.toMap(data, new HashMap()).get("CondGrpObjBase"));
    }
  }
  /**
   @deprecated
   */
  public void setCondGrpObjBaseKeyData(CondGrpObjBaseKeyData data) {
    if (data != null) {
      addInput("ConditionGrp", CondGrpObjBaseKeyHelper.toMap(data, new HashMap()).get("CondGrpObjBase"));
    }
  }
  /**
   @deprecated
   */
  public CondGrpObjBaseData getCondGrpObjBaseData() {
    return CondGrpObjBaseHelper.fromMap(outputMap, "ConditionGrp");
  }
}
