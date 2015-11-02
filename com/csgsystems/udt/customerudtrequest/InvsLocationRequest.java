/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationRequest.java
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
public final class InvsLocationRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsLocationRequest (String request, InvsLocationRequestMethod method) {
    initialize(request, "InvsLocation", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsLocationRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsLocationForInvsLocationCreate(InvsLocationObjectData data) {
    if (data != null) {
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(data, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }
  public void setInvsLocationForInvsLocationFind(InvsLocationObjectFilter data) {
    if (data != null) {
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(data, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }
  public void setInvsLocationForInvsLocationGet(InvsLocationObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocation", InvsLocationObjectKeyHelper.toMap(data, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }
  public void setInvsLocationForInvsLocationUpdate(InvsLocationObjectData data) {
    if (data != null) {
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(data, new HashMap(), "InvsLocation").get("InvsLocation"));
    }
  }
  public InvsLocationObjectData getInvsLocationObjectDataInvsLocationFromInvsLocationCreate() {
    return InvsLocationObjectHelper.fromMap(outputMap, "InvsLocation");
  }
  public InvsLocationObjectDataList getInvsLocationObjectDataInvsLocationFromInvsLocationFind() {
    return InvsLocationObjectHelper.fromMapList(outputMap, "InvsLocationList");
  }
  public InvsLocationObjectData getInvsLocationObjectDataInvsLocationFromInvsLocationGet() {
    return InvsLocationObjectHelper.fromMap(outputMap, "InvsLocation");
  }
  public InvsLocationObjectData getInvsLocationObjectDataInvsLocationFromInvsLocationUpdate() {
    return InvsLocationObjectHelper.fromMap(outputMap, "InvsLocation");
  }
  /**
   @deprecated
   */
  public void setInvsLocationObjectFilter(InvsLocationObjectFilter data) {
    if (data != null) {
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(data, new HashMap()).get("InvsLocationObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLocationObjectData(InvsLocationObjectData data) {
    if (data != null) {
      addInput("InvsLocation", InvsLocationObjectHelper.toMap(data, new HashMap()).get("InvsLocationObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLocationObjectKeyData(InvsLocationObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocation", InvsLocationObjectKeyHelper.toMap(data, new HashMap()).get("InvsLocationObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsLocationObjectDataList getInvsLocationObjectDataList() {
    return InvsLocationObjectHelper.fromMapList(outputMap, "InvsLocationList");
  }
  /**
   @deprecated
   */
  public InvsLocationObjectData getInvsLocationObjectData() {
    return InvsLocationObjectHelper.fromMap(outputMap, "InvsLocation");
  }
}
