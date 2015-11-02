/*
 * Generated code DO NOT EDIT
 * Generated file: AppNameRequest.java
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
public final class AppNameRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AppNameRequest (String request, AppNameRequestMethod method) {
    initialize(request, "AppName", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AppNameRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAppNameForAppNameCreate(AppNameObjectData data) {
    if (data != null) {
      addInput("AppName", AppNameObjectHelper.toMap(data, new HashMap(), "AppName").get("AppName"));
    }
  }
  public void setAppNameForAppNameFind(AppNameObjectFilter data) {
    if (data != null) {
      addInput("AppName", AppNameObjectHelper.toMap(data, new HashMap(), "AppName").get("AppName"));
    }
  }
  public void setAppNameForAppNameGet(AppNameObjectKeyData data) {
    if (data != null) {
      addInput("AppName", AppNameObjectKeyHelper.toMap(data, new HashMap(), "AppName").get("AppName"));
    }
  }
  public void setAppNameForAppNameUpdate(AppNameObjectData data) {
    if (data != null) {
      addInput("AppName", AppNameObjectHelper.toMap(data, new HashMap(), "AppName").get("AppName"));
    }
  }
  public AppNameObjectData getAppNameObjectDataAppNameFromAppNameCreate() {
    return AppNameObjectHelper.fromMap(outputMap, "AppName");
  }
  public AppNameObjectDataList getAppNameObjectDataAppNameFromAppNameFind() {
    return AppNameObjectHelper.fromMapList(outputMap, "AppNameList");
  }
  public AppNameObjectData getAppNameObjectDataAppNameFromAppNameGet() {
    return AppNameObjectHelper.fromMap(outputMap, "AppName");
  }
  public AppNameObjectData getAppNameObjectDataAppNameFromAppNameUpdate() {
    return AppNameObjectHelper.fromMap(outputMap, "AppName");
  }
  /**
   @deprecated
   */
  public void setAppNameObjectFilter(AppNameObjectFilter data) {
    if (data != null) {
      addInput("AppName", AppNameObjectHelper.toMap(data, new HashMap()).get("AppNameObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAppNameObjectData(AppNameObjectData data) {
    if (data != null) {
      addInput("AppName", AppNameObjectHelper.toMap(data, new HashMap()).get("AppNameObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAppNameObjectKeyData(AppNameObjectKeyData data) {
    if (data != null) {
      addInput("AppName", AppNameObjectKeyHelper.toMap(data, new HashMap()).get("AppNameObject"));
    }
  }
  /**
   @deprecated
   */
  public AppNameObjectDataList getAppNameObjectDataList() {
    return AppNameObjectHelper.fromMapList(outputMap, "AppNameList");
  }
  /**
   @deprecated
   */
  public AppNameObjectData getAppNameObjectData() {
    return AppNameObjectHelper.fromMap(outputMap, "AppName");
  }
}
