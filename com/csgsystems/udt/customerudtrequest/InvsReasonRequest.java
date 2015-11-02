/*
 * Generated code DO NOT EDIT
 * Generated file: InvsReasonRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvsReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsReasonRequest (String request, InvsReasonRequestMethod method) {
    initialize(request, "InvsReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsReasonForInvsReasonCreate(InvsReasonObjectData data) {
    if (data != null) {
      addInput("InvsReason", InvsReasonObjectHelper.toMap(data, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }
  public void setInvsReasonForInvsReasonFind(InvsReasonObjectFilter data) {
    if (data != null) {
      addInput("InvsReason", InvsReasonObjectHelper.toMap(data, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }
  public void setInvsReasonForInvsReasonGet(InvsReasonObjectKeyData data) {
    if (data != null) {
      addInput("InvsReason", InvsReasonObjectKeyHelper.toMap(data, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }
  public void setInvsReasonForInvsReasonUpdate(InvsReasonObjectData data) {
    if (data != null) {
      addInput("InvsReason", InvsReasonObjectHelper.toMap(data, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }
  public InvsReasonObjectData getInvsReasonObjectDataInvsReasonFromInvsReasonCreate() {
    return InvsReasonObjectHelper.fromMap(outputMap, "InvsReason");
  }
  public InvsReasonObjectDataList getInvsReasonObjectDataInvsReasonFromInvsReasonFind() {
    return InvsReasonObjectHelper.fromMapList(outputMap, "InvsReasonList");
  }
  public InvsReasonObjectData getInvsReasonObjectDataInvsReasonFromInvsReasonGet() {
    return InvsReasonObjectHelper.fromMap(outputMap, "InvsReason");
  }
  public InvsReasonObjectData getInvsReasonObjectDataInvsReasonFromInvsReasonUpdate() {
    return InvsReasonObjectHelper.fromMap(outputMap, "InvsReason");
  }
  /**
   @deprecated
   */
  public void setInvsReasonObjectFilter(InvsReasonObjectFilter data) {
    if (data != null) {
      addInput("InvsReason", InvsReasonObjectHelper.toMap(data, new HashMap()).get("InvsReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsReasonObjectData(InvsReasonObjectData data) {
    if (data != null) {
      addInput("InvsReason", InvsReasonObjectHelper.toMap(data, new HashMap()).get("InvsReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsReasonObjectKeyData(InvsReasonObjectKeyData data) {
    if (data != null) {
      addInput("InvsReason", InvsReasonObjectKeyHelper.toMap(data, new HashMap()).get("InvsReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsReasonObjectDataList getInvsReasonObjectDataList() {
    return InvsReasonObjectHelper.fromMapList(outputMap, "InvsReasonList");
  }
  /**
   @deprecated
   */
  public InvsReasonObjectData getInvsReasonObjectData() {
    return InvsReasonObjectHelper.fromMap(outputMap, "InvsReason");
  }
}
