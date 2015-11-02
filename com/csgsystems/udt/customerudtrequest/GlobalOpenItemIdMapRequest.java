/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalOpenItemIdMapRequest.java
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

import com.csgsystems.bp.data.*;
public final class GlobalOpenItemIdMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GlobalOpenItemIdMapRequest (String request, GlobalOpenItemIdMapRequestMethod method) {
    initialize(request, "GlobalOpenItemIdMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GlobalOpenItemIdMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGlobalOpenItemIdMapForGlobalOpenItemIdMapCreate(GlobalOpenItemIdMapObjectData data) {
    if (data != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(data, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }
  public void setGlobalOpenItemIdMapForGlobalOpenItemIdMapDelete(GlobalOpenItemIdMapObjectKeyData data) {
    if (data != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectKeyHelper.toMap(data, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }
  public void setGlobalOpenItemIdMapForGlobalOpenItemIdMapFind(GlobalOpenItemIdMapObjectFilter data) {
    if (data != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(data, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }
  public void setGlobalOpenItemIdMapForGlobalOpenItemIdMapGet(GlobalOpenItemIdMapObjectKeyData data) {
    if (data != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectKeyHelper.toMap(data, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }
  public void setGlobalOpenItemIdMapForGlobalOpenItemIdMapUpdate(GlobalOpenItemIdMapObjectData data) {
    if (data != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(data, new HashMap(), "GlobalOpenItemIdMap").get("GlobalOpenItemIdMap"));
    }
  }
  public GlobalOpenItemIdMapObjectData getGlobalOpenItemIdMapObjectDataGlobalOpenItemIdMapFromGlobalOpenItemIdMapCreate() {
    return GlobalOpenItemIdMapObjectHelper.fromMap(outputMap, "GlobalOpenItemIdMap");
  }
  public GlobalOpenItemIdMapObjectData getGlobalOpenItemIdMapObjectDataGlobalOpenItemIdMapFromGlobalOpenItemIdMapDelete() {
    return GlobalOpenItemIdMapObjectHelper.fromMap(outputMap, "GlobalOpenItemIdMap");
  }
  public GlobalOpenItemIdMapObjectDataList getGlobalOpenItemIdMapObjectDataGlobalOpenItemIdMapFromGlobalOpenItemIdMapFind() {
    return GlobalOpenItemIdMapObjectHelper.fromMapList(outputMap, "GlobalOpenItemIdMapList");
  }
  public GlobalOpenItemIdMapObjectData getGlobalOpenItemIdMapObjectDataGlobalOpenItemIdMapFromGlobalOpenItemIdMapGet() {
    return GlobalOpenItemIdMapObjectHelper.fromMap(outputMap, "GlobalOpenItemIdMap");
  }
  public GlobalOpenItemIdMapObjectData getGlobalOpenItemIdMapObjectDataGlobalOpenItemIdMapFromGlobalOpenItemIdMapUpdate() {
    return GlobalOpenItemIdMapObjectHelper.fromMap(outputMap, "GlobalOpenItemIdMap");
  }
  /**
   @deprecated
   */
  public void setGlobalOpenItemIdMapObjectFilter(GlobalOpenItemIdMapObjectFilter data) {
    if (data != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(data, new HashMap()).get("GlobalOpenItemIdMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGlobalOpenItemIdMapObjectData(GlobalOpenItemIdMapObjectData data) {
    if (data != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectHelper.toMap(data, new HashMap()).get("GlobalOpenItemIdMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGlobalOpenItemIdMapObjectKeyData(GlobalOpenItemIdMapObjectKeyData data) {
    if (data != null) {
      addInput("GlobalOpenItemIdMap", GlobalOpenItemIdMapObjectKeyHelper.toMap(data, new HashMap()).get("GlobalOpenItemIdMapObject"));
    }
  }
  /**
   @deprecated
   */
  public GlobalOpenItemIdMapObjectDataList getGlobalOpenItemIdMapObjectDataList() {
    return GlobalOpenItemIdMapObjectHelper.fromMapList(outputMap, "GlobalOpenItemIdMapList");
  }
  /**
   @deprecated
   */
  public GlobalOpenItemIdMapObjectData getGlobalOpenItemIdMapObjectData() {
    return GlobalOpenItemIdMapObjectHelper.fromMap(outputMap, "GlobalOpenItemIdMap");
  }
}
