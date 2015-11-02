/*
 * Generated code DO NOT EDIT
 * Generated file: EpiRequest.java
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
public final class EpiRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EpiRequest (String request, EpiRequestMethod method) {
    initialize(request, "Epi", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EpiRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setEpiForEpiCreate(EpiObjectData data) {
    if (data != null) {
      addInput("Epi", EpiObjectHelper.toMap(data, new HashMap(), "Epi").get("Epi"));
    }
  }
  public void setEpiForEpiDelete(EpiObjectKeyData data) {
    if (data != null) {
      addInput("Epi", EpiObjectKeyHelper.toMap(data, new HashMap(), "Epi").get("Epi"));
    }
  }
  public void setEpiForEpiFind(EpiObjectFilter data) {
    if (data != null) {
      addInput("Epi", EpiObjectHelper.toMap(data, new HashMap(), "Epi").get("Epi"));
    }
  }
  public void setEpiForEpiGet(EpiObjectKeyData data) {
    if (data != null) {
      addInput("Epi", EpiObjectKeyHelper.toMap(data, new HashMap(), "Epi").get("Epi"));
    }
  }
  public void setEpiForEpiUpdate(EpiObjectData data) {
    if (data != null) {
      addInput("Epi", EpiObjectHelper.toMap(data, new HashMap(), "Epi").get("Epi"));
    }
  }
  public EpiObjectData getEpiObjectDataEpiFromEpiCreate() {
    return EpiObjectHelper.fromMap(outputMap, "Epi");
  }
  public EpiObjectData getEpiObjectDataEpiFromEpiDelete() {
    return EpiObjectHelper.fromMap(outputMap, "Epi");
  }
  public EpiObjectDataList getEpiObjectDataEpiFromEpiFind() {
    return EpiObjectHelper.fromMapList(outputMap, "EpiList");
  }
  public EpiObjectData getEpiObjectDataEpiFromEpiGet() {
    return EpiObjectHelper.fromMap(outputMap, "Epi");
  }
  public EpiObjectData getEpiObjectDataEpiFromEpiUpdate() {
    return EpiObjectHelper.fromMap(outputMap, "Epi");
  }
  /**
   @deprecated
   */
  public void setEpiObjectFilter(EpiObjectFilter data) {
    if (data != null) {
      addInput("Epi", EpiObjectHelper.toMap(data, new HashMap()).get("EpiObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEpiObjectData(EpiObjectData data) {
    if (data != null) {
      addInput("Epi", EpiObjectHelper.toMap(data, new HashMap()).get("EpiObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEpiObjectKeyData(EpiObjectKeyData data) {
    if (data != null) {
      addInput("Epi", EpiObjectKeyHelper.toMap(data, new HashMap()).get("EpiObject"));
    }
  }
  /**
   @deprecated
   */
  public EpiObjectDataList getEpiObjectDataList() {
    return EpiObjectHelper.fromMapList(outputMap, "EpiList");
  }
  /**
   @deprecated
   */
  public EpiObjectData getEpiObjectData() {
    return EpiObjectHelper.fromMap(outputMap, "Epi");
  }
}
