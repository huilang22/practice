/*
 * Generated code DO NOT EDIT
 * Generated file: ProviderClassRequest.java
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

import com.csgsystems.cf.data.*;
public final class ProviderClassRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProviderClassRequest (String request, ProviderClassRequestMethod method) {
    initialize(request, "ProviderClass", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProviderClassRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setProviderClassForProviderClassCreate(ProvClsObjectData data) {
    if (data != null) {
      addInput("ProviderClass", ProvClsObjectHelper.toMap(data, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }
  public void setProviderClassForProviderClassDelete(ProvClsObjectKeyData data) {
    if (data != null) {
      addInput("ProviderClass", ProvClsObjectKeyHelper.toMap(data, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }
  public void setProviderClassForProviderClassFind(ProvClsObjectFilter data) {
    if (data != null) {
      addInput("ProviderClass", ProvClsObjectHelper.toMap(data, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }
  public void setProviderClassForProviderClassGet(ProvClsObjectKeyData data) {
    if (data != null) {
      addInput("ProviderClass", ProvClsObjectKeyHelper.toMap(data, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }
  public void setProviderClassForProviderClassUpdate(ProvClsObjectData data) {
    if (data != null) {
      addInput("ProviderClass", ProvClsObjectHelper.toMap(data, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }
  public ProvClsObjectData getProvClsObjectDataProviderClassFromProviderClassCreate() {
    return ProvClsObjectHelper.fromMap(outputMap, "ProviderClass");
  }
  public ProvClsObjectData getProvClsObjectDataProviderClassFromProviderClassDelete() {
    return ProvClsObjectHelper.fromMap(outputMap, "ProviderClass");
  }
  public ProvClsObjectDataList getProvClsObjectDataProviderClassFromProviderClassFind() {
    return ProvClsObjectHelper.fromMapList(outputMap, "ProviderClassList");
  }
  public ProvClsObjectData getProvClsObjectDataProviderClassFromProviderClassGet() {
    return ProvClsObjectHelper.fromMap(outputMap, "ProviderClass");
  }
  public ProvClsObjectData getProvClsObjectDataProviderClassFromProviderClassUpdate() {
    return ProvClsObjectHelper.fromMap(outputMap, "ProviderClass");
  }
  /**
   @deprecated
   */
  public void setProvClsObjectFilter(ProvClsObjectFilter data) {
    if (data != null) {
      addInput("ProvCls", ProvClsObjectHelper.toMap(data, new HashMap()).get("ProvClsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProvClsObjectData(ProvClsObjectData data) {
    if (data != null) {
      addInput("ProviderClass", ProvClsObjectHelper.toMap(data, new HashMap()).get("ProvClsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProvClsObjectKeyData(ProvClsObjectKeyData data) {
    if (data != null) {
      addInput("ProviderClass", ProvClsObjectKeyHelper.toMap(data, new HashMap()).get("ProvClsObject"));
    }
  }
  /**
   @deprecated
   */
  public ProvClsObjectDataList getProvClsObjectDataList() {
    return ProvClsObjectHelper.fromMapList(outputMap, "ProvClsList");
  }
  /**
   @deprecated
   */
  public ProvClsObjectData getProvClsObjectData() {
    return ProvClsObjectHelper.fromMap(outputMap, "ProviderClass");
  }
}
