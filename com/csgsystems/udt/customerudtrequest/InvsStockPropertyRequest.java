/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStockPropertyRequest.java
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
public final class InvsStockPropertyRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsStockPropertyRequest (String request, InvsStockPropertyRequestMethod method) {
    initialize(request, "InvsStockProperty", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsStockPropertyRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsStockPropertyForInvsStockPropertyCreate(InvsStockPropertyObjectData data) {
    if (data != null) {
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(data, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }
  public void setInvsStockPropertyForInvsStockPropertyFind(InvsStockPropertyObjectFilter data) {
    if (data != null) {
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(data, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }
  public void setInvsStockPropertyForInvsStockPropertyGet(InvsStockPropertyObjectKeyData data) {
    if (data != null) {
      addInput("InvsStockProperty", InvsStockPropertyObjectKeyHelper.toMap(data, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }
  public void setInvsStockPropertyForInvsStockPropertyUpdate(InvsStockPropertyObjectData data) {
    if (data != null) {
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(data, new HashMap(), "InvsStockProperty").get("InvsStockProperty"));
    }
  }
  public InvsStockPropertyObjectData getInvsStockPropertyObjectDataInvsStockPropertyFromInvsStockPropertyCreate() {
    return InvsStockPropertyObjectHelper.fromMap(outputMap, "InvsStockProperty");
  }
  public InvsStockPropertyObjectDataList getInvsStockPropertyObjectDataInvsStockPropertyFromInvsStockPropertyFind() {
    return InvsStockPropertyObjectHelper.fromMapList(outputMap, "InvsStockPropertyList");
  }
  public InvsStockPropertyObjectData getInvsStockPropertyObjectDataInvsStockPropertyFromInvsStockPropertyGet() {
    return InvsStockPropertyObjectHelper.fromMap(outputMap, "InvsStockProperty");
  }
  public InvsStockPropertyObjectData getInvsStockPropertyObjectDataInvsStockPropertyFromInvsStockPropertyUpdate() {
    return InvsStockPropertyObjectHelper.fromMap(outputMap, "InvsStockProperty");
  }
  /**
   @deprecated
   */
  public void setInvsStockPropertyObjectFilter(InvsStockPropertyObjectFilter data) {
    if (data != null) {
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(data, new HashMap()).get("InvsStockPropertyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsStockPropertyObjectData(InvsStockPropertyObjectData data) {
    if (data != null) {
      addInput("InvsStockProperty", InvsStockPropertyObjectHelper.toMap(data, new HashMap()).get("InvsStockPropertyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsStockPropertyObjectKeyData(InvsStockPropertyObjectKeyData data) {
    if (data != null) {
      addInput("InvsStockProperty", InvsStockPropertyObjectKeyHelper.toMap(data, new HashMap()).get("InvsStockPropertyObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsStockPropertyObjectDataList getInvsStockPropertyObjectDataList() {
    return InvsStockPropertyObjectHelper.fromMapList(outputMap, "InvsStockPropertyList");
  }
  /**
   @deprecated
   */
  public InvsStockPropertyObjectData getInvsStockPropertyObjectData() {
    return InvsStockPropertyObjectHelper.fromMap(outputMap, "InvsStockProperty");
  }
}
