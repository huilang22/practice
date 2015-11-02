/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupCorridorRequest.java
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
public final class HqGroupCorridorRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public HqGroupCorridorRequest (String request, HqGroupCorridorRequestMethod method) {
    initialize(request, "HqGroupCorridor", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (HqGroupCorridorRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setHqGroupCorridorForHqGroupCorridorCreate(HqGroupCorridorObjectData data) {
    if (data != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(data, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }
  public void setHqGroupCorridorForHqGroupCorridorDelete(HqGroupCorridorObjectData data) {
    if (data != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(data, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }
  public void setHqGroupCorridorForHqGroupCorridorDeleteList(HqGroupCorridorObjectFilter data) {
    if (data != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(data, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }
  public void setHqGroupCorridorForHqGroupCorridorFind(HqGroupCorridorObjectFilter data) {
    if (data != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(data, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }
  public void setHqGroupCorridorForHqGroupCorridorGet(HqGroupCorridorObjectData data) {
    if (data != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(data, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }
  public void setHqGroupCorridorForHqGroupCorridorUpdate(HqGroupCorridorObjectData data) {
    if (data != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(data, new HashMap(), "HqGroupCorridor").get("HqGroupCorridor"));
    }
  }
  public HqGroupCorridorObjectData getHqGroupCorridorObjectDataHqGroupCorridorFromHqGroupCorridorCreate() {
    return HqGroupCorridorObjectHelper.fromMap(outputMap, "HqGroupCorridor");
  }
  public HqGroupCorridorObjectData getHqGroupCorridorObjectDataHqGroupCorridorFromHqGroupCorridorDelete() {
    return HqGroupCorridorObjectHelper.fromMap(outputMap, "HqGroupCorridor");
  }
  public HqGroupCorridorObjectDataList getHqGroupCorridorObjectDataHqGroupCorridorFromHqGroupCorridorFind() {
    return HqGroupCorridorObjectHelper.fromMapList(outputMap, "HqGroupCorridorList");
  }
  public HqGroupCorridorObjectData getHqGroupCorridorObjectDataHqGroupCorridorFromHqGroupCorridorGet() {
    return HqGroupCorridorObjectHelper.fromMap(outputMap, "HqGroupCorridor");
  }
  public HqGroupCorridorObjectData getHqGroupCorridorObjectDataHqGroupCorridorFromHqGroupCorridorUpdate() {
    return HqGroupCorridorObjectHelper.fromMap(outputMap, "HqGroupCorridor");
  }
  /**
   @deprecated
   */
  public void setHqGroupCorridorObjectFilter(HqGroupCorridorObjectFilter data) {
    if (data != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(data, new HashMap()).get("HqGroupCorridorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupCorridorObjectData(HqGroupCorridorObjectData data) {
    if (data != null) {
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(data, new HashMap()).get("HqGroupCorridorObject"));
    }
  }
  /**
   @deprecated
   */
  public HqGroupCorridorObjectDataList getHqGroupCorridorObjectDataList() {
    return HqGroupCorridorObjectHelper.fromMapList(outputMap, "HqGroupCorridorList");
  }
  /**
   @deprecated
   */
  public HqGroupCorridorObjectData getHqGroupCorridorObjectData() {
    return HqGroupCorridorObjectHelper.fromMap(outputMap, "HqGroupCorridor");
  }
}
