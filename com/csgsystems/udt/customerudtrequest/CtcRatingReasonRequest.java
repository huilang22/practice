/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingReasonRequest.java
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

import com.csgsystems.ctc.data.*;
public final class CtcRatingReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcRatingReasonRequest (String request, CtcRatingReasonRequestMethod method) {
    initialize(request, "CtcRatingReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcRatingReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcRatingReasonForCtcRatingReasonCreate(CtcRatingReasonObjectData data) {
    if (data != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(data, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }
  public void setCtcRatingReasonForCtcRatingReasonDelete(CtcRatingReasonObjectKeyData data) {
    if (data != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectKeyHelper.toMap(data, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }
  public void setCtcRatingReasonForCtcRatingReasonFind(CtcRatingReasonObjectFilter data) {
    if (data != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(data, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }
  public void setCtcRatingReasonForCtcRatingReasonGet(CtcRatingReasonObjectKeyData data) {
    if (data != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectKeyHelper.toMap(data, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }
  public void setCtcRatingReasonForCtcRatingReasonUpdate(CtcRatingReasonObjectData data) {
    if (data != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(data, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }
  public CtcRatingReasonObjectData getCtcRatingReasonObjectDataCtcRatingReasonFromCtcRatingReasonCreate() {
    return CtcRatingReasonObjectHelper.fromMap(outputMap, "CtcRatingReason");
  }
  public CtcRatingReasonObjectData getCtcRatingReasonObjectDataCtcRatingReasonFromCtcRatingReasonDelete() {
    return CtcRatingReasonObjectHelper.fromMap(outputMap, "CtcRatingReason");
  }
  public CtcRatingReasonObjectDataList getCtcRatingReasonObjectDataCtcRatingReasonFromCtcRatingReasonFind() {
    return CtcRatingReasonObjectHelper.fromMapList(outputMap, "CtcRatingReasonList");
  }
  public CtcRatingReasonObjectData getCtcRatingReasonObjectDataCtcRatingReasonFromCtcRatingReasonGet() {
    return CtcRatingReasonObjectHelper.fromMap(outputMap, "CtcRatingReason");
  }
  public CtcRatingReasonObjectData getCtcRatingReasonObjectDataCtcRatingReasonFromCtcRatingReasonUpdate() {
    return CtcRatingReasonObjectHelper.fromMap(outputMap, "CtcRatingReason");
  }
  /**
   @deprecated
   */
  public void setCtcRatingReasonObjectFilter(CtcRatingReasonObjectFilter data) {
    if (data != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(data, new HashMap()).get("CtcRatingReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcRatingReasonObjectData(CtcRatingReasonObjectData data) {
    if (data != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(data, new HashMap()).get("CtcRatingReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcRatingReasonObjectKeyData(CtcRatingReasonObjectKeyData data) {
    if (data != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectKeyHelper.toMap(data, new HashMap()).get("CtcRatingReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcRatingReasonObjectDataList getCtcRatingReasonObjectDataList() {
    return CtcRatingReasonObjectHelper.fromMapList(outputMap, "CtcRatingReasonList");
  }
  /**
   @deprecated
   */
  public CtcRatingReasonObjectData getCtcRatingReasonObjectData() {
    return CtcRatingReasonObjectHelper.fromMap(outputMap, "CtcRatingReason");
  }
}
