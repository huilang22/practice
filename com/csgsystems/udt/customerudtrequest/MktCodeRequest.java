/*
 * Generated code DO NOT EDIT
 * Generated file: MktCodeRequest.java
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
public final class MktCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public MktCodeRequest (String request, MktCodeRequestMethod method) {
    initialize(request, "MktCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (MktCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setMktCodeForMktCodeCreate(MCObjectData data) {
    if (data != null) {
      addInput("MktCode", MCObjectHelper.toMap(data, new HashMap(), "MktCode").get("MktCode"));
    }
  }
  public void setMktCodeForMktCodeDelete(MCObjectKeyData data) {
    if (data != null) {
      addInput("MktCode", MCObjectKeyHelper.toMap(data, new HashMap(), "MktCode").get("MktCode"));
    }
  }
  public void setMktCodeForMktCodeFind(MCObjectFilter data) {
    if (data != null) {
      addInput("MktCode", MCObjectHelper.toMap(data, new HashMap(), "MktCode").get("MktCode"));
    }
  }
  public void setMktCodeForMktCodeGet(MCObjectKeyData data) {
    if (data != null) {
      addInput("MktCode", MCObjectKeyHelper.toMap(data, new HashMap(), "MktCode").get("MktCode"));
    }
  }
  public void setMktCodeForMktCodeUpdate(MCObjectData data) {
    if (data != null) {
      addInput("MktCode", MCObjectHelper.toMap(data, new HashMap(), "MktCode").get("MktCode"));
    }
  }
  public MCObjectData getMCObjectDataMktCodeFromMktCodeCreate() {
    return MCObjectHelper.fromMap(outputMap, "MktCode");
  }
  public MCObjectData getMCObjectDataMktCodeFromMktCodeDelete() {
    return MCObjectHelper.fromMap(outputMap, "MktCode");
  }
  public MCObjectDataList getMCObjectDataMktCodeFromMktCodeFind() {
    return MCObjectHelper.fromMapList(outputMap, "MktCodeList");
  }
  public MCObjectData getMCObjectDataMktCodeFromMktCodeGet() {
    return MCObjectHelper.fromMap(outputMap, "MktCode");
  }
  public MCObjectData getMCObjectDataMktCodeFromMktCodeUpdate() {
    return MCObjectHelper.fromMap(outputMap, "MktCode");
  }
  /**
   @deprecated
   */
  public void setMCObjectFilter(MCObjectFilter data) {
    if (data != null) {
      addInput("MC", MCObjectHelper.toMap(data, new HashMap()).get("MCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMCObjectData(MCObjectData data) {
    if (data != null) {
      addInput("MktCode", MCObjectHelper.toMap(data, new HashMap()).get("MCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMCObjectKeyData(MCObjectKeyData data) {
    if (data != null) {
      addInput("MktCode", MCObjectKeyHelper.toMap(data, new HashMap()).get("MCObject"));
    }
  }
  /**
   @deprecated
   */
  public MCObjectDataList getMCObjectDataList() {
    return MCObjectHelper.fromMapList(outputMap, "MCList");
  }
  /**
   @deprecated
   */
  public MCObjectData getMCObjectData() {
    return MCObjectHelper.fromMap(outputMap, "MktCode");
  }
}
