/*
 * Generated code DO NOT EDIT
 * Generated file: NrcLineRequest.java
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
public final class NrcLineRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NrcLineRequest (String request, NrcLineRequestMethod method) {
    initialize(request, "NrcLine", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NrcLineRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNrcLineForNrcLineCreate(NrcLineObjectData data) {
    if (data != null) {
      addInput("NrcLine", NrcLineObjectHelper.toMap(data, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }
  public void setNrcLineForNrcLineDelete(NrcLineObjectKeyData data) {
    if (data != null) {
      addInput("NrcLine", NrcLineObjectKeyHelper.toMap(data, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }
  public void setNrcLineForNrcLineFind(NrcLineObjectFilter data) {
    if (data != null) {
      addInput("NrcLine", NrcLineObjectHelper.toMap(data, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }
  public void setNrcLineForNrcLineGet(NrcLineObjectKeyData data) {
    if (data != null) {
      addInput("NrcLine", NrcLineObjectKeyHelper.toMap(data, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }
  public void setNrcLineForNrcLineUpdate(NrcLineObjectData data) {
    if (data != null) {
      addInput("NrcLine", NrcLineObjectHelper.toMap(data, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }
  public NrcLineObjectData getNrcLineObjectDataNrcLineFromNrcLineCreate() {
    return NrcLineObjectHelper.fromMap(outputMap, "NrcLine");
  }
  public NrcLineObjectData getNrcLineObjectDataNrcLineFromNrcLineDelete() {
    return NrcLineObjectHelper.fromMap(outputMap, "NrcLine");
  }
  public NrcLineObjectDataList getNrcLineObjectDataNrcLineFromNrcLineFind() {
    return NrcLineObjectHelper.fromMapList(outputMap, "NrcLineList");
  }
  public NrcLineObjectData getNrcLineObjectDataNrcLineFromNrcLineGet() {
    return NrcLineObjectHelper.fromMap(outputMap, "NrcLine");
  }
  public NrcLineObjectData getNrcLineObjectDataNrcLineFromNrcLineUpdate() {
    return NrcLineObjectHelper.fromMap(outputMap, "NrcLine");
  }
  /**
   @deprecated
   */
  public void setNrcLineObjectFilter(NrcLineObjectFilter data) {
    if (data != null) {
      addInput("NrcLine", NrcLineObjectHelper.toMap(data, new HashMap()).get("NrcLineObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNrcLineObjectData(NrcLineObjectData data) {
    if (data != null) {
      addInput("NrcLine", NrcLineObjectHelper.toMap(data, new HashMap()).get("NrcLineObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNrcLineObjectKeyData(NrcLineObjectKeyData data) {
    if (data != null) {
      addInput("NrcLine", NrcLineObjectKeyHelper.toMap(data, new HashMap()).get("NrcLineObject"));
    }
  }
  /**
   @deprecated
   */
  public NrcLineObjectDataList getNrcLineObjectDataList() {
    return NrcLineObjectHelper.fromMapList(outputMap, "NrcLineList");
  }
  /**
   @deprecated
   */
  public NrcLineObjectData getNrcLineObjectData() {
    return NrcLineObjectHelper.fromMap(outputMap, "NrcLine");
  }
}
