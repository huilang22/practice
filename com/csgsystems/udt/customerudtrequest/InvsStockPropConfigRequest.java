/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropConfigRequest.java
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
public final class InvsStockPropConfigRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsStockPropConfigRequest (String request, InvsStockPropConfigRequestMethod method) {
    initialize(request, "InvsStockPropConfig", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsStockPropConfigRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsStockPropConfigForInvsStockPropConfigCreate(InvsStockPropConfigObjectData data) {
    if (data != null) {
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(data, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }
  public void setInvsStockPropConfigForInvsStockPropConfigFind(InvsStockPropConfigObjectFilter data) {
    if (data != null) {
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(data, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }
  public void setInvsStockPropConfigForInvsStockPropConfigGet(InvsStockPropConfigObjectKeyData data) {
    if (data != null) {
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectKeyHelper.toMap(data, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }
  public void setInvsStockPropConfigForInvsStockPropConfigUpdate(InvsStockPropConfigObjectData data) {
    if (data != null) {
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(data, new HashMap(), "InvsStockPropConfig").get("InvsStockPropConfig"));
    }
  }
  public InvsStockPropConfigObjectData getInvsStockPropConfigObjectDataInvsStockPropConfigFromInvsStockPropConfigCreate() {
    return InvsStockPropConfigObjectHelper.fromMap(outputMap, "InvsStockPropConfig");
  }
  public InvsStockPropConfigObjectDataList getInvsStockPropConfigObjectDataInvsStockPropConfigFromInvsStockPropConfigFind() {
    return InvsStockPropConfigObjectHelper.fromMapList(outputMap, "InvsStockPropConfigList");
  }
  public InvsStockPropConfigObjectData getInvsStockPropConfigObjectDataInvsStockPropConfigFromInvsStockPropConfigGet() {
    return InvsStockPropConfigObjectHelper.fromMap(outputMap, "InvsStockPropConfig");
  }
  public InvsStockPropConfigObjectData getInvsStockPropConfigObjectDataInvsStockPropConfigFromInvsStockPropConfigUpdate() {
    return InvsStockPropConfigObjectHelper.fromMap(outputMap, "InvsStockPropConfig");
  }
  /**
   @deprecated
   */
  public void setInvsStockPropConfigObjectFilter(InvsStockPropConfigObjectFilter data) {
    if (data != null) {
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(data, new HashMap()).get("InvsStockPropConfigObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsStockPropConfigObjectData(InvsStockPropConfigObjectData data) {
    if (data != null) {
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectHelper.toMap(data, new HashMap()).get("InvsStockPropConfigObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsStockPropConfigObjectKeyData(InvsStockPropConfigObjectKeyData data) {
    if (data != null) {
      addInput("InvsStockPropConfig", InvsStockPropConfigObjectKeyHelper.toMap(data, new HashMap()).get("InvsStockPropConfigObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsStockPropConfigObjectDataList getInvsStockPropConfigObjectDataList() {
    return InvsStockPropConfigObjectHelper.fromMapList(outputMap, "InvsStockPropConfigList");
  }
  /**
   @deprecated
   */
  public InvsStockPropConfigObjectData getInvsStockPropConfigObjectData() {
    return InvsStockPropConfigObjectHelper.fromMap(outputMap, "InvsStockPropConfig");
  }
}
