/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataParamRequest.java
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
public final class ExtendedDataParamRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExtendedDataParamRequest (String request, ExtendedDataParamRequestMethod method) {
    initialize(request, "ExtendedDataParam", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExtendedDataParamRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExtendedDataParamForExtendedDataParamCreate(XPDObjectData data) {
    if (data != null) {
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(data, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }
  public void setExtendedDataParamForExtendedDataParamDelete(XPDObjectData data) {
    if (data != null) {
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(data, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }
  public void setExtendedDataParamForExtendedDataParamFind(XPDObjectFilter data) {
    if (data != null) {
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(data, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }
  public void setExtendedDataParamForExtendedDataParamGet(XPDObjectKeyData data) {
    if (data != null) {
      addInput("ExtendedDataParam", XPDObjectKeyHelper.toMap(data, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }
  public void setExtendedDataParamForExtendedDataParamUpdate(XPDObjectData data) {
    if (data != null) {
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(data, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }
  public XPDObjectData getXPDObjectDataExtendedDataParamFromExtendedDataParamCreate() {
    return XPDObjectHelper.fromMap(outputMap, "ExtendedDataParam");
  }
  public XPDObjectData getXPDObjectDataExtendedDataParamFromExtendedDataParamDelete() {
    return XPDObjectHelper.fromMap(outputMap, "ExtendedDataParam");
  }
  public XPDObjectDataList getXPDObjectDataExtendedDataParamFromExtendedDataParamFind() {
    return XPDObjectHelper.fromMapList(outputMap, "ExtendedDataParamList");
  }
  public XPDObjectData getXPDObjectDataExtendedDataParamFromExtendedDataParamGet() {
    return XPDObjectHelper.fromMap(outputMap, "ExtendedDataParam");
  }
  public XPDObjectData getXPDObjectDataExtendedDataParamFromExtendedDataParamUpdate() {
    return XPDObjectHelper.fromMap(outputMap, "ExtendedDataParam");
  }
  /**
   @deprecated
   */
  public void setXPDObjectFilter(XPDObjectFilter data) {
    if (data != null) {
      addInput("XPD", XPDObjectHelper.toMap(data, new HashMap()).get("XPDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setXPDObjectData(XPDObjectData data) {
    if (data != null) {
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(data, new HashMap()).get("XPDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setXPDObjectKeyData(XPDObjectKeyData data) {
    if (data != null) {
      addInput("ExtendedDataParam", XPDObjectKeyHelper.toMap(data, new HashMap()).get("XPDObject"));
    }
  }
  /**
   @deprecated
   */
  public XPDObjectDataList getXPDObjectDataList() {
    return XPDObjectHelper.fromMapList(outputMap, "XPDList");
  }
  /**
   @deprecated
   */
  public XPDObjectData getXPDObjectData() {
    return XPDObjectHelper.fromMap(outputMap, "ExtendedDataParam");
  }
}
