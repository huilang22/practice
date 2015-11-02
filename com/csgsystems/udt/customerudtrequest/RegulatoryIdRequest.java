/*
 * Generated code DO NOT EDIT
 * Generated file: RegulatoryIdRequest.java
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
public final class RegulatoryIdRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RegulatoryIdRequest (String request, RegulatoryIdRequestMethod method) {
    initialize(request, "RegulatoryId", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RegulatoryIdRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRegulatoryIdForRegulatoryIdCreate(RegulatoryIdObjectData data) {
    if (data != null) {
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(data, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }
  public void setRegulatoryIdForRegulatoryIdDelete(RegulatoryIdObjectKeyData data) {
    if (data != null) {
      addInput("RegulatoryId", RegulatoryIdObjectKeyHelper.toMap(data, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }
  public void setRegulatoryIdForRegulatoryIdFind(RegulatoryIdObjectFilter data) {
    if (data != null) {
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(data, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }
  public void setRegulatoryIdForRegulatoryIdGet(RegulatoryIdObjectKeyData data) {
    if (data != null) {
      addInput("RegulatoryId", RegulatoryIdObjectKeyHelper.toMap(data, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }
  public void setRegulatoryIdForRegulatoryIdUpdate(RegulatoryIdObjectData data) {
    if (data != null) {
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(data, new HashMap(), "RegulatoryId").get("RegulatoryId"));
    }
  }
  public RegulatoryIdObjectData getRegulatoryIdObjectDataRegulatoryIdFromRegulatoryIdCreate() {
    return RegulatoryIdObjectHelper.fromMap(outputMap, "RegulatoryId");
  }
  public RegulatoryIdObjectData getRegulatoryIdObjectDataRegulatoryIdFromRegulatoryIdDelete() {
    return RegulatoryIdObjectHelper.fromMap(outputMap, "RegulatoryId");
  }
  public RegulatoryIdObjectDataList getRegulatoryIdObjectDataRegulatoryIdFromRegulatoryIdFind() {
    return RegulatoryIdObjectHelper.fromMapList(outputMap, "RegulatoryIdList");
  }
  public RegulatoryIdObjectData getRegulatoryIdObjectDataRegulatoryIdFromRegulatoryIdGet() {
    return RegulatoryIdObjectHelper.fromMap(outputMap, "RegulatoryId");
  }
  public RegulatoryIdObjectData getRegulatoryIdObjectDataRegulatoryIdFromRegulatoryIdUpdate() {
    return RegulatoryIdObjectHelper.fromMap(outputMap, "RegulatoryId");
  }
  /**
   @deprecated
   */
  public void setRegulatoryIdObjectFilter(RegulatoryIdObjectFilter data) {
    if (data != null) {
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(data, new HashMap()).get("RegulatoryIdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRegulatoryIdObjectData(RegulatoryIdObjectData data) {
    if (data != null) {
      addInput("RegulatoryId", RegulatoryIdObjectHelper.toMap(data, new HashMap()).get("RegulatoryIdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRegulatoryIdObjectKeyData(RegulatoryIdObjectKeyData data) {
    if (data != null) {
      addInput("RegulatoryId", RegulatoryIdObjectKeyHelper.toMap(data, new HashMap()).get("RegulatoryIdObject"));
    }
  }
  /**
   @deprecated
   */
  public RegulatoryIdObjectDataList getRegulatoryIdObjectDataList() {
    return RegulatoryIdObjectHelper.fromMapList(outputMap, "RegulatoryIdList");
  }
  /**
   @deprecated
   */
  public RegulatoryIdObjectData getRegulatoryIdObjectData() {
    return RegulatoryIdObjectHelper.fromMap(outputMap, "RegulatoryId");
  }
}
