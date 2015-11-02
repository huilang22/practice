/*
 * Generated code DO NOT EDIT
 * Generated file: AbiNrcDucRequest.java
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
public final class AbiNrcDucRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AbiNrcDucRequest (String request, AbiNrcDucRequestMethod method) {
    initialize(request, "AbiNrcDuc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AbiNrcDucRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAbiNrcDucForAbiNrcDucFind(AbiNrcDucObjectFilter data) {
    if (data != null) {
      addInput("AbiNrcDuc", AbiNrcDucObjectHelper.toMap(data, new HashMap(), "AbiNrcDuc").get("AbiNrcDuc"));
    }
  }
  public void setAbiNrcDucForAbiNrcDucGet(AbiNrcDucObjectKeyData data) {
    if (data != null) {
      addInput("AbiNrcDuc", AbiNrcDucObjectKeyHelper.toMap(data, new HashMap(), "AbiNrcDuc").get("AbiNrcDuc"));
    }
  }
  public void setAbiNrcDucForAbiNrcDucUpdate(AbiNrcDucObjectData data) {
    if (data != null) {
      addInput("AbiNrcDuc", AbiNrcDucObjectHelper.toMap(data, new HashMap(), "AbiNrcDuc").get("AbiNrcDuc"));
    }
  }
  public AbiNrcDucObjectDataList getAbiNrcDucObjectDataAbiNrcDucFromAbiNrcDucFind() {
    return AbiNrcDucObjectHelper.fromMapList(outputMap, "AbiNrcDucList");
  }
  public AbiNrcDucObjectData getAbiNrcDucObjectDataAbiNrcDucFromAbiNrcDucGet() {
    return AbiNrcDucObjectHelper.fromMap(outputMap, "AbiNrcDuc");
  }
  public AbiNrcDucObjectData getAbiNrcDucObjectDataAbiNrcDucFromAbiNrcDucUpdate() {
    return AbiNrcDucObjectHelper.fromMap(outputMap, "AbiNrcDuc");
  }
  /**
   @deprecated
   */
  public void setAbiNrcDucObjectFilter(AbiNrcDucObjectFilter data) {
    if (data != null) {
      addInput("AbiNrcDuc", AbiNrcDucObjectHelper.toMap(data, new HashMap()).get("AbiNrcDucObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAbiNrcDucObjectData(AbiNrcDucObjectData data) {
    if (data != null) {
      addInput("AbiNrcDuc", AbiNrcDucObjectHelper.toMap(data, new HashMap()).get("AbiNrcDucObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAbiNrcDucObjectKeyData(AbiNrcDucObjectKeyData data) {
    if (data != null) {
      addInput("AbiNrcDuc", AbiNrcDucObjectKeyHelper.toMap(data, new HashMap()).get("AbiNrcDucObject"));
    }
  }
  /**
   @deprecated
   */
  public AbiNrcDucObjectDataList getAbiNrcDucObjectDataList() {
    return AbiNrcDucObjectHelper.fromMapList(outputMap, "AbiNrcDucList");
  }
  /**
   @deprecated
   */
  public AbiNrcDucObjectData getAbiNrcDucObjectData() {
    return AbiNrcDucObjectHelper.fromMap(outputMap, "AbiNrcDuc");
  }
}
