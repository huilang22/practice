/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVanityRequest.java
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
public final class InvsVanityRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsVanityRequest (String request, InvsVanityRequestMethod method) {
    initialize(request, "InvsVanity", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsVanityRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsVanityForInvsVanityCreate(InvsVanityObjectData data) {
    if (data != null) {
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(data, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }
  public void setInvsVanityForInvsVanityFind(InvsVanityObjectFilter data) {
    if (data != null) {
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(data, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }
  public void setInvsVanityForInvsVanityGet(InvsVanityObjectKeyData data) {
    if (data != null) {
      addInput("InvsVanity", InvsVanityObjectKeyHelper.toMap(data, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }
  public void setInvsVanityForInvsVanityUpdate(InvsVanityObjectData data) {
    if (data != null) {
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(data, new HashMap(), "InvsVanity").get("InvsVanity"));
    }
  }
  public InvsVanityObjectData getInvsVanityObjectDataInvsVanityFromInvsVanityCreate() {
    return InvsVanityObjectHelper.fromMap(outputMap, "InvsVanity");
  }
  public InvsVanityObjectDataList getInvsVanityObjectDataInvsVanityFromInvsVanityFind() {
    return InvsVanityObjectHelper.fromMapList(outputMap, "InvsVanityList");
  }
  public InvsVanityObjectData getInvsVanityObjectDataInvsVanityFromInvsVanityGet() {
    return InvsVanityObjectHelper.fromMap(outputMap, "InvsVanity");
  }
  public InvsVanityObjectData getInvsVanityObjectDataInvsVanityFromInvsVanityUpdate() {
    return InvsVanityObjectHelper.fromMap(outputMap, "InvsVanity");
  }
  /**
   @deprecated
   */
  public void setInvsVanityObjectFilter(InvsVanityObjectFilter data) {
    if (data != null) {
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(data, new HashMap()).get("InvsVanityObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsVanityObjectData(InvsVanityObjectData data) {
    if (data != null) {
      addInput("InvsVanity", InvsVanityObjectHelper.toMap(data, new HashMap()).get("InvsVanityObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsVanityObjectKeyData(InvsVanityObjectKeyData data) {
    if (data != null) {
      addInput("InvsVanity", InvsVanityObjectKeyHelper.toMap(data, new HashMap()).get("InvsVanityObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsVanityObjectDataList getInvsVanityObjectDataList() {
    return InvsVanityObjectHelper.fromMapList(outputMap, "InvsVanityList");
  }
  /**
   @deprecated
   */
  public InvsVanityObjectData getInvsVanityObjectData() {
    return InvsVanityObjectHelper.fromMap(outputMap, "InvsVanity");
  }
}
