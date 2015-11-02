/*
 * Generated code DO NOT EDIT
 * Generated file: DiscReasonRequest.java
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
public final class DiscReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DiscReasonRequest (String request, DiscReasonRequestMethod method) {
    initialize(request, "DiscReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DiscReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDiscReasonForDiscReasonCreate(DiscReasonObjectData data) {
    if (data != null) {
      addInput("DiscReason", DiscReasonObjectHelper.toMap(data, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }
  public void setDiscReasonForDiscReasonDelete(DiscReasonObjectKeyData data) {
    if (data != null) {
      addInput("DiscReason", DiscReasonObjectKeyHelper.toMap(data, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }
  public void setDiscReasonForDiscReasonFind(DiscReasonObjectFilter data) {
    if (data != null) {
      addInput("DiscReason", DiscReasonObjectHelper.toMap(data, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }
  public void setDiscReasonForDiscReasonGet(DiscReasonObjectKeyData data) {
    if (data != null) {
      addInput("DiscReason", DiscReasonObjectKeyHelper.toMap(data, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }
  public void setDiscReasonForDiscReasonUpdate(DiscReasonObjectData data) {
    if (data != null) {
      addInput("DiscReason", DiscReasonObjectHelper.toMap(data, new HashMap(), "DiscReason").get("DiscReason"));
    }
  }
  public DiscReasonObjectData getDiscReasonObjectDataDiscReasonFromDiscReasonCreate() {
    return DiscReasonObjectHelper.fromMap(outputMap, "DiscReason");
  }
  public DiscReasonObjectData getDiscReasonObjectDataDiscReasonFromDiscReasonDelete() {
    return DiscReasonObjectHelper.fromMap(outputMap, "DiscReason");
  }
  public DiscReasonObjectDataList getDiscReasonObjectDataDiscReasonFromDiscReasonFind() {
    return DiscReasonObjectHelper.fromMapList(outputMap, "DiscReasonList");
  }
  public DiscReasonObjectData getDiscReasonObjectDataDiscReasonFromDiscReasonGet() {
    return DiscReasonObjectHelper.fromMap(outputMap, "DiscReason");
  }
  public DiscReasonObjectData getDiscReasonObjectDataDiscReasonFromDiscReasonUpdate() {
    return DiscReasonObjectHelper.fromMap(outputMap, "DiscReason");
  }
  /**
   @deprecated
   */
  public void setDiscReasonObjectFilter(DiscReasonObjectFilter data) {
    if (data != null) {
      addInput("DiscReason", DiscReasonObjectHelper.toMap(data, new HashMap()).get("DiscReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDiscReasonObjectData(DiscReasonObjectData data) {
    if (data != null) {
      addInput("DiscReason", DiscReasonObjectHelper.toMap(data, new HashMap()).get("DiscReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDiscReasonObjectKeyData(DiscReasonObjectKeyData data) {
    if (data != null) {
      addInput("DiscReason", DiscReasonObjectKeyHelper.toMap(data, new HashMap()).get("DiscReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public DiscReasonObjectDataList getDiscReasonObjectDataList() {
    return DiscReasonObjectHelper.fromMapList(outputMap, "DiscReasonList");
  }
  /**
   @deprecated
   */
  public DiscReasonObjectData getDiscReasonObjectData() {
    return DiscReasonObjectHelper.fromMap(outputMap, "DiscReason");
  }
}
