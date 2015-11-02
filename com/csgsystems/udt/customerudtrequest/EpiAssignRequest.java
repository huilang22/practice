/*
 * Generated code DO NOT EDIT
 * Generated file: EpiAssignRequest.java
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
public final class EpiAssignRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EpiAssignRequest (String request, EpiAssignRequestMethod method) {
    initialize(request, "EpiAssign", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EpiAssignRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setEpiAssignForEpiAssignCreate(EpiAssignObjectData data) {
    if (data != null) {
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(data, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }
  public void setEpiAssignForEpiAssignDelete(EpiAssignObjectKeyData data) {
    if (data != null) {
      addInput("EpiAssign", EpiAssignObjectKeyHelper.toMap(data, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }
  public void setEpiAssignForEpiAssignFind(EpiAssignObjectFilter data) {
    if (data != null) {
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(data, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }
  public void setEpiAssignForEpiAssignGet(EpiAssignObjectKeyData data) {
    if (data != null) {
      addInput("EpiAssign", EpiAssignObjectKeyHelper.toMap(data, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }
  public void setEpiAssignForEpiAssignUpdate(EpiAssignObjectData data) {
    if (data != null) {
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(data, new HashMap(), "EpiAssign").get("EpiAssign"));
    }
  }
  public EpiAssignObjectData getEpiAssignObjectDataEpiAssignFromEpiAssignCreate() {
    return EpiAssignObjectHelper.fromMap(outputMap, "EpiAssign");
  }
  public EpiAssignObjectData getEpiAssignObjectDataEpiAssignFromEpiAssignDelete() {
    return EpiAssignObjectHelper.fromMap(outputMap, "EpiAssign");
  }
  public EpiAssignObjectDataList getEpiAssignObjectDataEpiAssignFromEpiAssignFind() {
    return EpiAssignObjectHelper.fromMapList(outputMap, "EpiAssignList");
  }
  public EpiAssignObjectData getEpiAssignObjectDataEpiAssignFromEpiAssignGet() {
    return EpiAssignObjectHelper.fromMap(outputMap, "EpiAssign");
  }
  public EpiAssignObjectData getEpiAssignObjectDataEpiAssignFromEpiAssignUpdate() {
    return EpiAssignObjectHelper.fromMap(outputMap, "EpiAssign");
  }
  /**
   @deprecated
   */
  public void setEpiAssignObjectFilter(EpiAssignObjectFilter data) {
    if (data != null) {
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(data, new HashMap()).get("EpiAssignObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEpiAssignObjectData(EpiAssignObjectData data) {
    if (data != null) {
      addInput("EpiAssign", EpiAssignObjectHelper.toMap(data, new HashMap()).get("EpiAssignObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEpiAssignObjectKeyData(EpiAssignObjectKeyData data) {
    if (data != null) {
      addInput("EpiAssign", EpiAssignObjectKeyHelper.toMap(data, new HashMap()).get("EpiAssignObject"));
    }
  }
  /**
   @deprecated
   */
  public EpiAssignObjectDataList getEpiAssignObjectDataList() {
    return EpiAssignObjectHelper.fromMapList(outputMap, "EpiAssignList");
  }
  /**
   @deprecated
   */
  public EpiAssignObjectData getEpiAssignObjectData() {
    return EpiAssignObjectHelper.fromMap(outputMap, "EpiAssign");
  }
}
