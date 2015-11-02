/*
 * Generated code DO NOT EDIT
 * Generated file: ActivityDefRequest.java
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

import com.csgsystems.we.data.*;
public final class ActivityDefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ActivityDefRequest (String request, ActivityDefRequestMethod method) {
    initialize(request, "ActivityDef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ActivityDefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActivityDefForActivityDefCreate(ActivityDefObjectData data) {
    if (data != null) {
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(data, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }
  public void setActivityDefForActivityDefFind(ActivityDefObjectFilter data) {
    if (data != null) {
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(data, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }
  public void setActivityDefForActivityDefGet(ActivityDefObjectKeyData data) {
    if (data != null) {
      addInput("ActivityDef", ActivityDefObjectKeyHelper.toMap(data, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }
  public void setActivityDefForActivityDefUpdate(ActivityDefObjectData data) {
    if (data != null) {
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(data, new HashMap(), "ActivityDef").get("ActivityDef"));
    }
  }
  public ActivityDefObjectData getActivityDefObjectDataActivityDefFromActivityDefCreate() {
    return ActivityDefObjectHelper.fromMap(outputMap, "ActivityDef");
  }
  public ActivityDefObjectDataList getActivityDefObjectDataActivityDefFromActivityDefFind() {
    return ActivityDefObjectHelper.fromMapList(outputMap, "ActivityDefList");
  }
  public ActivityDefObjectData getActivityDefObjectDataActivityDefFromActivityDefGet() {
    return ActivityDefObjectHelper.fromMap(outputMap, "ActivityDef");
  }
  public ActivityDefObjectData getActivityDefObjectDataActivityDefFromActivityDefUpdate() {
    return ActivityDefObjectHelper.fromMap(outputMap, "ActivityDef");
  }
  /**
   @deprecated
   */
  public void setActivityDefObjectFilter(ActivityDefObjectFilter data) {
    if (data != null) {
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(data, new HashMap()).get("ActivityDefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setActivityDefObjectData(ActivityDefObjectData data) {
    if (data != null) {
      addInput("ActivityDef", ActivityDefObjectHelper.toMap(data, new HashMap()).get("ActivityDefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setActivityDefObjectKeyData(ActivityDefObjectKeyData data) {
    if (data != null) {
      addInput("ActivityDef", ActivityDefObjectKeyHelper.toMap(data, new HashMap()).get("ActivityDefObject"));
    }
  }
  /**
   @deprecated
   */
  public ActivityDefObjectDataList getActivityDefObjectDataList() {
    return ActivityDefObjectHelper.fromMapList(outputMap, "ActivityDefList");
  }
  /**
   @deprecated
   */
  public ActivityDefObjectData getActivityDefObjectData() {
    return ActivityDefObjectHelper.fromMap(outputMap, "ActivityDef");
  }
}
