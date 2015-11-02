/*
 * Generated code DO NOT EDIT
 * Generated file: PrivacyLevelRequest.java
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

import com.csgsystems.bp.data.*;
public final class PrivacyLevelRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PrivacyLevelRequest (String request, PrivacyLevelRequestMethod method) {
    initialize(request, "PrivacyLevel", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PrivacyLevelRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPrivacyLevelForPrivacyLevelCreate(PrivacyLevelObjectData data) {
    if (data != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(data, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }
  public void setPrivacyLevelForPrivacyLevelDelete(PrivacyLevelObjectKeyData data) {
    if (data != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectKeyHelper.toMap(data, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }
  public void setPrivacyLevelForPrivacyLevelFind(PrivacyLevelObjectFilter data) {
    if (data != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(data, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }
  public void setPrivacyLevelForPrivacyLevelGet(PrivacyLevelObjectKeyData data) {
    if (data != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectKeyHelper.toMap(data, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }
  public void setPrivacyLevelForPrivacyLevelUpdate(PrivacyLevelObjectData data) {
    if (data != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(data, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }
  public PrivacyLevelObjectData getPrivacyLevelObjectDataPrivacyLevelFromPrivacyLevelCreate() {
    return PrivacyLevelObjectHelper.fromMap(outputMap, "PrivacyLevel");
  }
  public PrivacyLevelObjectData getPrivacyLevelObjectDataPrivacyLevelFromPrivacyLevelDelete() {
    return PrivacyLevelObjectHelper.fromMap(outputMap, "PrivacyLevel");
  }
  public PrivacyLevelObjectDataList getPrivacyLevelObjectDataPrivacyLevelFromPrivacyLevelFind() {
    return PrivacyLevelObjectHelper.fromMapList(outputMap, "PrivacyLevelList");
  }
  public PrivacyLevelObjectData getPrivacyLevelObjectDataPrivacyLevelFromPrivacyLevelGet() {
    return PrivacyLevelObjectHelper.fromMap(outputMap, "PrivacyLevel");
  }
  public PrivacyLevelObjectData getPrivacyLevelObjectDataPrivacyLevelFromPrivacyLevelUpdate() {
    return PrivacyLevelObjectHelper.fromMap(outputMap, "PrivacyLevel");
  }
  /**
   @deprecated
   */
  public void setPrivacyLevelObjectFilter(PrivacyLevelObjectFilter data) {
    if (data != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(data, new HashMap()).get("PrivacyLevelObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPrivacyLevelObjectData(PrivacyLevelObjectData data) {
    if (data != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(data, new HashMap()).get("PrivacyLevelObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPrivacyLevelObjectKeyData(PrivacyLevelObjectKeyData data) {
    if (data != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectKeyHelper.toMap(data, new HashMap()).get("PrivacyLevelObject"));
    }
  }
  /**
   @deprecated
   */
  public PrivacyLevelObjectDataList getPrivacyLevelObjectDataList() {
    return PrivacyLevelObjectHelper.fromMapList(outputMap, "PrivacyLevelList");
  }
  /**
   @deprecated
   */
  public PrivacyLevelObjectData getPrivacyLevelObjectData() {
    return PrivacyLevelObjectHelper.fromMap(outputMap, "PrivacyLevel");
  }
}
