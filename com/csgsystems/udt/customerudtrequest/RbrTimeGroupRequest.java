/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimeGroupRequest.java
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
public final class RbrTimeGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrTimeGroupRequest (String request, RbrTimeGroupRequestMethod method) {
    initialize(request, "RbrTimeGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrTimeGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrTimeGroupForRbrTimeGroupCreate(RbrTmGrpObjectData data) {
    if (data != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(data, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }
  public void setRbrTimeGroupForRbrTimeGroupDelete(RbrTmGrpObjectKeyData data) {
    if (data != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectKeyHelper.toMap(data, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }
  public void setRbrTimeGroupForRbrTimeGroupFind(RbrTmGrpObjectFilter data) {
    if (data != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(data, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }
  public void setRbrTimeGroupForRbrTimeGroupGet(RbrTmGrpObjectKeyData data) {
    if (data != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectKeyHelper.toMap(data, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }
  public void setRbrTimeGroupForRbrTimeGroupUpdate(RbrTmGrpObjectData data) {
    if (data != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(data, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }
  public RbrTmGrpObjectData getRbrTmGrpObjectDataRbrTimeGroupFromRbrTimeGroupCreate() {
    return RbrTmGrpObjectHelper.fromMap(outputMap, "RbrTimeGroup");
  }
  public RbrTmGrpObjectData getRbrTmGrpObjectDataRbrTimeGroupFromRbrTimeGroupDelete() {
    return RbrTmGrpObjectHelper.fromMap(outputMap, "RbrTimeGroup");
  }
  public RbrTmGrpObjectDataList getRbrTmGrpObjectDataRbrTimeGroupFromRbrTimeGroupFind() {
    return RbrTmGrpObjectHelper.fromMapList(outputMap, "RbrTimeGroupList");
  }
  public RbrTmGrpObjectData getRbrTmGrpObjectDataRbrTimeGroupFromRbrTimeGroupGet() {
    return RbrTmGrpObjectHelper.fromMap(outputMap, "RbrTimeGroup");
  }
  public RbrTmGrpObjectData getRbrTmGrpObjectDataRbrTimeGroupFromRbrTimeGroupUpdate() {
    return RbrTmGrpObjectHelper.fromMap(outputMap, "RbrTimeGroup");
  }
  /**
   @deprecated
   */
  public void setRbrTmGrpObjectFilter(RbrTmGrpObjectFilter data) {
    if (data != null) {
      addInput("RbrTmGrp", RbrTmGrpObjectHelper.toMap(data, new HashMap()).get("RbrTmGrpObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrTmGrpObjectData(RbrTmGrpObjectData data) {
    if (data != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(data, new HashMap()).get("RbrTmGrpObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrTmGrpObjectKeyData(RbrTmGrpObjectKeyData data) {
    if (data != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectKeyHelper.toMap(data, new HashMap()).get("RbrTmGrpObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrTmGrpObjectDataList getRbrTmGrpObjectDataList() {
    return RbrTmGrpObjectHelper.fromMapList(outputMap, "RbrTmGrpList");
  }
  /**
   @deprecated
   */
  public RbrTmGrpObjectData getRbrTmGrpObjectData() {
    return RbrTmGrpObjectHelper.fromMap(outputMap, "RbrTimeGroup");
  }
}
