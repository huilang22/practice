/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimCardConfigRequest.java
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
public final class InvsSimCardConfigRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsSimCardConfigRequest (String request, InvsSimCardConfigRequestMethod method) {
    initialize(request, "InvsSimCardConfig", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsSimCardConfigRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsSimCardConfigForInvsSimCardConfigCreate(InvsSimCardConfigObjectData data) {
    if (data != null) {
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(data, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }
  public void setInvsSimCardConfigForInvsSimCardConfigFind(InvsSimCardConfigObjectFilter data) {
    if (data != null) {
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(data, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }
  public void setInvsSimCardConfigForInvsSimCardConfigGet(InvsSimCardConfigObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectKeyHelper.toMap(data, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }
  public void setInvsSimCardConfigForInvsSimCardConfigUpdate(InvsSimCardConfigObjectData data) {
    if (data != null) {
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(data, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }
  public InvsSimCardConfigObjectData getInvsSimCardConfigObjectDataInvsSimCardConfigFromInvsSimCardConfigCreate() {
    return InvsSimCardConfigObjectHelper.fromMap(outputMap, "InvsSimCardConfig");
  }
  public InvsSimCardConfigObjectDataList getInvsSimCardConfigObjectDataInvsSimCardConfigFromInvsSimCardConfigFind() {
    return InvsSimCardConfigObjectHelper.fromMapList(outputMap, "InvsSimCardConfigList");
  }
  public InvsSimCardConfigObjectData getInvsSimCardConfigObjectDataInvsSimCardConfigFromInvsSimCardConfigGet() {
    return InvsSimCardConfigObjectHelper.fromMap(outputMap, "InvsSimCardConfig");
  }
  public InvsSimCardConfigObjectData getInvsSimCardConfigObjectDataInvsSimCardConfigFromInvsSimCardConfigUpdate() {
    return InvsSimCardConfigObjectHelper.fromMap(outputMap, "InvsSimCardConfig");
  }
  /**
   @deprecated
   */
  public void setInvsSimCardConfigObjectFilter(InvsSimCardConfigObjectFilter data) {
    if (data != null) {
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(data, new HashMap()).get("InvsSimCardConfigObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimCardConfigObjectData(InvsSimCardConfigObjectData data) {
    if (data != null) {
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(data, new HashMap()).get("InvsSimCardConfigObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimCardConfigObjectKeyData(InvsSimCardConfigObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectKeyHelper.toMap(data, new HashMap()).get("InvsSimCardConfigObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsSimCardConfigObjectDataList getInvsSimCardConfigObjectDataList() {
    return InvsSimCardConfigObjectHelper.fromMapList(outputMap, "InvsSimCardConfigList");
  }
  /**
   @deprecated
   */
  public InvsSimCardConfigObjectData getInvsSimCardConfigObjectData() {
    return InvsSimCardConfigObjectHelper.fromMap(outputMap, "InvsSimCardConfig");
  }
}
