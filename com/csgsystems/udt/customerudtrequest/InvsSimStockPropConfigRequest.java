/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimStockPropConfigRequest.java
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
public final class InvsSimStockPropConfigRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsSimStockPropConfigRequest (String request, InvsSimStockPropConfigRequestMethod method) {
    initialize(request, "InvsSimStockPropConfig", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsSimStockPropConfigRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsSimStockPropConfigForInvsSimStockPropConfigCreate(InvsSimStockPropConfigObjectData data) {
    if (data != null) {
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(data, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }
  public void setInvsSimStockPropConfigForInvsSimStockPropConfigFind(InvsSimStockPropConfigObjectFilter data) {
    if (data != null) {
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(data, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }
  public void setInvsSimStockPropConfigForInvsSimStockPropConfigGet(InvsSimStockPropConfigObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectKeyHelper.toMap(data, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }
  public void setInvsSimStockPropConfigForInvsSimStockPropConfigUpdate(InvsSimStockPropConfigObjectData data) {
    if (data != null) {
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(data, new HashMap(), "InvsSimStockPropConfig").get("InvsSimStockPropConfig"));
    }
  }
  public InvsSimStockPropConfigObjectData getInvsSimStockPropConfigObjectDataInvsSimStockPropConfigFromInvsSimStockPropConfigCreate() {
    return InvsSimStockPropConfigObjectHelper.fromMap(outputMap, "InvsSimStockPropConfig");
  }
  public InvsSimStockPropConfigObjectDataList getInvsSimStockPropConfigObjectDataInvsSimStockPropConfigFromInvsSimStockPropConfigFind() {
    return InvsSimStockPropConfigObjectHelper.fromMapList(outputMap, "InvsSimStockPropConfigList");
  }
  public InvsSimStockPropConfigObjectData getInvsSimStockPropConfigObjectDataInvsSimStockPropConfigFromInvsSimStockPropConfigGet() {
    return InvsSimStockPropConfigObjectHelper.fromMap(outputMap, "InvsSimStockPropConfig");
  }
  public InvsSimStockPropConfigObjectData getInvsSimStockPropConfigObjectDataInvsSimStockPropConfigFromInvsSimStockPropConfigUpdate() {
    return InvsSimStockPropConfigObjectHelper.fromMap(outputMap, "InvsSimStockPropConfig");
  }
  /**
   @deprecated
   */
  public void setInvsSimStockPropConfigObjectFilter(InvsSimStockPropConfigObjectFilter data) {
    if (data != null) {
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(data, new HashMap()).get("InvsSimStockPropConfigObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimStockPropConfigObjectData(InvsSimStockPropConfigObjectData data) {
    if (data != null) {
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectHelper.toMap(data, new HashMap()).get("InvsSimStockPropConfigObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimStockPropConfigObjectKeyData(InvsSimStockPropConfigObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimStockPropConfig", InvsSimStockPropConfigObjectKeyHelper.toMap(data, new HashMap()).get("InvsSimStockPropConfigObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsSimStockPropConfigObjectDataList getInvsSimStockPropConfigObjectDataList() {
    return InvsSimStockPropConfigObjectHelper.fromMapList(outputMap, "InvsSimStockPropConfigList");
  }
  /**
   @deprecated
   */
  public InvsSimStockPropConfigObjectData getInvsSimStockPropConfigObjectData() {
    return InvsSimStockPropConfigObjectHelper.fromMap(outputMap, "InvsSimStockPropConfig");
  }
}
