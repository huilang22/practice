/*
 * Generated code DO NOT EDIT
 * Generated file: InvsProfileRequest.java
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
public final class InvsProfileRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsProfileRequest (String request, InvsProfileRequestMethod method) {
    initialize(request, "InvsProfile", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsProfileRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsProfileForInvsProfileCreate(InvsProfileObjectData data) {
    if (data != null) {
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(data, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }
  public void setInvsProfileForInvsProfileFind(InvsProfileObjectFilter data) {
    if (data != null) {
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(data, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }
  public void setInvsProfileForInvsProfileGet(InvsProfileObjectKeyData data) {
    if (data != null) {
      addInput("InvsProfile", InvsProfileObjectKeyHelper.toMap(data, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }
  public void setInvsProfileForInvsProfileUpdate(InvsProfileObjectData data) {
    if (data != null) {
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(data, new HashMap(), "InvsProfile").get("InvsProfile"));
    }
  }
  public InvsProfileObjectData getInvsProfileObjectDataInvsProfileFromInvsProfileCreate() {
    return InvsProfileObjectHelper.fromMap(outputMap, "InvsProfile");
  }
  public InvsProfileObjectDataList getInvsProfileObjectDataInvsProfileFromInvsProfileFind() {
    return InvsProfileObjectHelper.fromMapList(outputMap, "InvsProfileList");
  }
  public InvsProfileObjectData getInvsProfileObjectDataInvsProfileFromInvsProfileGet() {
    return InvsProfileObjectHelper.fromMap(outputMap, "InvsProfile");
  }
  public InvsProfileObjectData getInvsProfileObjectDataInvsProfileFromInvsProfileUpdate() {
    return InvsProfileObjectHelper.fromMap(outputMap, "InvsProfile");
  }
  /**
   @deprecated
   */
  public void setInvsProfileObjectFilter(InvsProfileObjectFilter data) {
    if (data != null) {
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(data, new HashMap()).get("InvsProfileObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsProfileObjectData(InvsProfileObjectData data) {
    if (data != null) {
      addInput("InvsProfile", InvsProfileObjectHelper.toMap(data, new HashMap()).get("InvsProfileObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsProfileObjectKeyData(InvsProfileObjectKeyData data) {
    if (data != null) {
      addInput("InvsProfile", InvsProfileObjectKeyHelper.toMap(data, new HashMap()).get("InvsProfileObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsProfileObjectDataList getInvsProfileObjectDataList() {
    return InvsProfileObjectHelper.fromMapList(outputMap, "InvsProfileList");
  }
  /**
   @deprecated
   */
  public InvsProfileObjectData getInvsProfileObjectData() {
    return InvsProfileObjectHelper.fromMap(outputMap, "InvsProfile");
  }
}
