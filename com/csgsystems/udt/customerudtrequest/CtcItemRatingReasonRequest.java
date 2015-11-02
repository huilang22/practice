/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemRatingReasonRequest.java
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
public final class CtcItemRatingReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcItemRatingReasonRequest (String request, CtcItemRatingReasonRequestMethod method) {
    initialize(request, "CtcItemRatingReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcItemRatingReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcItemRatingReasonForCtcItemRatingReasonCreate(CtcItemRatingReasonObjectData data) {
    if (data != null) {
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectHelper.toMap(data, new HashMap(), "CtcItemRatingReason").get("CtcItemRatingReason"));
    }
  }
  public void setCtcItemRatingReasonForCtcItemRatingReasonDelete(CtcItemRatingReasonObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectKeyHelper.toMap(data, new HashMap(), "CtcItemRatingReason").get("CtcItemRatingReason"));
    }
  }
  public void setCtcItemRatingReasonForCtcItemRatingReasonFind(CtcItemRatingReasonObjectFilter data) {
    if (data != null) {
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectHelper.toMap(data, new HashMap(), "CtcItemRatingReason").get("CtcItemRatingReason"));
    }
  }
  public void setCtcItemRatingReasonForCtcItemRatingReasonGet(CtcItemRatingReasonObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectKeyHelper.toMap(data, new HashMap(), "CtcItemRatingReason").get("CtcItemRatingReason"));
    }
  }
  public CtcItemRatingReasonObjectData getCtcItemRatingReasonObjectDataCtcItemRatingReasonFromCtcItemRatingReasonCreate() {
    return CtcItemRatingReasonObjectHelper.fromMap(outputMap, "CtcItemRatingReason");
  }
  public CtcItemRatingReasonObjectData getCtcItemRatingReasonObjectDataCtcItemRatingReasonFromCtcItemRatingReasonDelete() {
    return CtcItemRatingReasonObjectHelper.fromMap(outputMap, "CtcItemRatingReason");
  }
  public CtcItemRatingReasonObjectDataList getCtcItemRatingReasonObjectDataCtcItemRatingReasonFromCtcItemRatingReasonFind() {
    return CtcItemRatingReasonObjectHelper.fromMapList(outputMap, "CtcItemRatingReasonList");
  }
  public CtcItemRatingReasonObjectData getCtcItemRatingReasonObjectDataCtcItemRatingReasonFromCtcItemRatingReasonGet() {
    return CtcItemRatingReasonObjectHelper.fromMap(outputMap, "CtcItemRatingReason");
  }
  /**
   @deprecated
   */
  public void setCtcItemRatingReasonObjectFilter(CtcItemRatingReasonObjectFilter data) {
    if (data != null) {
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectHelper.toMap(data, new HashMap()).get("CtcItemRatingReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemRatingReasonObjectData(CtcItemRatingReasonObjectData data) {
    if (data != null) {
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectHelper.toMap(data, new HashMap()).get("CtcItemRatingReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemRatingReasonObjectKeyData(CtcItemRatingReasonObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectKeyHelper.toMap(data, new HashMap()).get("CtcItemRatingReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcItemRatingReasonObjectDataList getCtcItemRatingReasonObjectDataList() {
    return CtcItemRatingReasonObjectHelper.fromMapList(outputMap, "CtcItemRatingReasonList");
  }
  /**
   @deprecated
   */
  public CtcItemRatingReasonObjectData getCtcItemRatingReasonObjectData() {
    return CtcItemRatingReasonObjectHelper.fromMap(outputMap, "CtcItemRatingReason");
  }
}
