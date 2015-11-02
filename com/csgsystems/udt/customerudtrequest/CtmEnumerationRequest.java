/*
 * Generated code DO NOT EDIT
 * Generated file: CtmEnumerationRequest.java
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
public final class CtmEnumerationRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtmEnumerationRequest (String request, CtmEnumerationRequestMethod method) {
    initialize(request, "CtmEnumeration", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtmEnumerationRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtmEnumerationForCtmEnumerationCreate(CtmEnumerationObjectData data) {
    if (data != null) {
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(data, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }
  public void setCtmEnumerationForCtmEnumerationFind(CtmEnumerationObjectFilter data) {
    if (data != null) {
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(data, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }
  public void setCtmEnumerationForCtmEnumerationGet(CtmEnumerationObjectKeyData data) {
    if (data != null) {
      addInput("CtmEnumeration", CtmEnumerationObjectKeyHelper.toMap(data, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }
  public void setCtmEnumerationForCtmEnumerationUpdate(CtmEnumerationObjectData data) {
    if (data != null) {
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(data, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }
  public CtmEnumerationObjectData getCtmEnumerationObjectDataCtmEnumerationFromCtmEnumerationCreate() {
    return CtmEnumerationObjectHelper.fromMap(outputMap, "CtmEnumeration");
  }
  public CtmEnumerationObjectDataList getCtmEnumerationObjectDataCtmEnumerationFromCtmEnumerationFind() {
    return CtmEnumerationObjectHelper.fromMapList(outputMap, "CtmEnumerationList");
  }
  public CtmEnumerationObjectData getCtmEnumerationObjectDataCtmEnumerationFromCtmEnumerationGet() {
    return CtmEnumerationObjectHelper.fromMap(outputMap, "CtmEnumeration");
  }
  public CtmEnumerationObjectData getCtmEnumerationObjectDataCtmEnumerationFromCtmEnumerationUpdate() {
    return CtmEnumerationObjectHelper.fromMap(outputMap, "CtmEnumeration");
  }
  /**
   @deprecated
   */
  public void setCtmEnumerationObjectFilter(CtmEnumerationObjectFilter data) {
    if (data != null) {
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(data, new HashMap()).get("CtmEnumerationObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtmEnumerationObjectData(CtmEnumerationObjectData data) {
    if (data != null) {
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(data, new HashMap()).get("CtmEnumerationObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtmEnumerationObjectKeyData(CtmEnumerationObjectKeyData data) {
    if (data != null) {
      addInput("CtmEnumeration", CtmEnumerationObjectKeyHelper.toMap(data, new HashMap()).get("CtmEnumerationObject"));
    }
  }
  /**
   @deprecated
   */
  public CtmEnumerationObjectDataList getCtmEnumerationObjectDataList() {
    return CtmEnumerationObjectHelper.fromMapList(outputMap, "CtmEnumerationList");
  }
  /**
   @deprecated
   */
  public CtmEnumerationObjectData getCtmEnumerationObjectData() {
    return CtmEnumerationObjectHelper.fromMap(outputMap, "CtmEnumeration");
  }
}
