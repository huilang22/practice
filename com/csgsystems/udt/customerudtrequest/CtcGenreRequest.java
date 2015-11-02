/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGenreRequest.java
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

import com.csgsystems.ctc.data.*;
public final class CtcGenreRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcGenreRequest (String request, CtcGenreRequestMethod method) {
    initialize(request, "CtcGenre", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcGenreRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcGenreForCtcGenreCreate(CtcGenreObjectData data) {
    if (data != null) {
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(data, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }
  public void setCtcGenreForCtcGenreDelete(CtcGenreObjectKeyData data) {
    if (data != null) {
      addInput("CtcGenre", CtcGenreObjectKeyHelper.toMap(data, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }
  public void setCtcGenreForCtcGenreFind(CtcGenreObjectFilter data) {
    if (data != null) {
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(data, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }
  public void setCtcGenreForCtcGenreGet(CtcGenreObjectKeyData data) {
    if (data != null) {
      addInput("CtcGenre", CtcGenreObjectKeyHelper.toMap(data, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }
  public void setCtcGenreForCtcGenreUpdate(CtcGenreObjectData data) {
    if (data != null) {
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(data, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }
  public CtcGenreObjectData getCtcGenreObjectDataCtcGenreFromCtcGenreCreate() {
    return CtcGenreObjectHelper.fromMap(outputMap, "CtcGenre");
  }
  public CtcGenreObjectData getCtcGenreObjectDataCtcGenreFromCtcGenreDelete() {
    return CtcGenreObjectHelper.fromMap(outputMap, "CtcGenre");
  }
  public CtcGenreObjectDataList getCtcGenreObjectDataCtcGenreFromCtcGenreFind() {
    return CtcGenreObjectHelper.fromMapList(outputMap, "CtcGenreList");
  }
  public CtcGenreObjectData getCtcGenreObjectDataCtcGenreFromCtcGenreGet() {
    return CtcGenreObjectHelper.fromMap(outputMap, "CtcGenre");
  }
  public CtcGenreObjectData getCtcGenreObjectDataCtcGenreFromCtcGenreUpdate() {
    return CtcGenreObjectHelper.fromMap(outputMap, "CtcGenre");
  }
  /**
   @deprecated
   */
  public void setCtcGenreObjectFilter(CtcGenreObjectFilter data) {
    if (data != null) {
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(data, new HashMap()).get("CtcGenreObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcGenreObjectData(CtcGenreObjectData data) {
    if (data != null) {
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(data, new HashMap()).get("CtcGenreObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcGenreObjectKeyData(CtcGenreObjectKeyData data) {
    if (data != null) {
      addInput("CtcGenre", CtcGenreObjectKeyHelper.toMap(data, new HashMap()).get("CtcGenreObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcGenreObjectDataList getCtcGenreObjectDataList() {
    return CtcGenreObjectHelper.fromMapList(outputMap, "CtcGenreList");
  }
  /**
   @deprecated
   */
  public CtcGenreObjectData getCtcGenreObjectData() {
    return CtcGenreObjectHelper.fromMap(outputMap, "CtcGenre");
  }
}
