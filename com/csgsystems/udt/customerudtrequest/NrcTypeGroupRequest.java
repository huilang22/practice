/*
 * Generated code DO NOT EDIT
 * Generated file: NrcTypeGroupRequest.java
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
public final class NrcTypeGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NrcTypeGroupRequest (String request, NrcTypeGroupRequestMethod method) {
    initialize(request, "NrcTypeGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NrcTypeGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNrcTypeGroupForNrcTypeGroupCreate(NrcTypeGroupObjectData data) {
    if (data != null) {
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(data, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }
  public void setNrcTypeGroupForNrcTypeGroupFind(NrcTypeGroupObjectFilter data) {
    if (data != null) {
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(data, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }
  public void setNrcTypeGroupForNrcTypeGroupGet(NrcTypeGroupObjectKeyData data) {
    if (data != null) {
      addInput("NrcTypeGroup", NrcTypeGroupObjectKeyHelper.toMap(data, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }
  public void setNTGUpdGetForNrcTypeGroupUpdate(NrcTypeGroupObjectData data) {
    if (data != null) {
      addInput("NTGUpdGet", NrcTypeGroupObjectHelper.toMap(data, new HashMap(), "NTGUpdGet").get("NTGUpdGet"));
    }
  }
  public void setNTGUpdateFilterForNrcTypeGroupUpdate(NrcTypeGroupObjectFilter data) {
    if (data != null) {
      addInput("NTGUpdateFilter", NrcTypeGroupObjectHelper.toMap(data, new HashMap(), "NTGUpdateFilter").get("NTGUpdateFilter"));
    }
  }
  public void setNrcTypeGroupForNrcTypeGroupUpdate(NrcTypeGroupObjectData data) {
    if (data != null) {
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(data, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }
  public NrcTypeGroupObjectData getNrcTypeGroupObjectDataNrcTypeGroupFromNrcTypeGroupCreate() {
    return NrcTypeGroupObjectHelper.fromMap(outputMap, "NrcTypeGroup");
  }
  public NrcTypeGroupObjectDataList getNrcTypeGroupObjectDataNrcTypeGroupFromNrcTypeGroupFind() {
    return NrcTypeGroupObjectHelper.fromMapList(outputMap, "NrcTypeGroupList");
  }
  public NrcTypeGroupObjectData getNrcTypeGroupObjectDataNrcTypeGroupFromNrcTypeGroupGet() {
    return NrcTypeGroupObjectHelper.fromMap(outputMap, "NrcTypeGroup");
  }
  public NrcTypeGroupObjectData getNrcTypeGroupObjectDataNrcTypeGroupFromNrcTypeGroupUpdate() {
    return NrcTypeGroupObjectHelper.fromMap(outputMap, "NrcTypeGroup");
  }
  /**
   @deprecated
   */
  public void setNrcTypeGroupObjectFilter(NrcTypeGroupObjectFilter data) {
    if (data != null) {
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(data, new HashMap()).get("NrcTypeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNrcTypeGroupObjectData(NrcTypeGroupObjectData data) {
    if (data != null) {
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(data, new HashMap()).get("NrcTypeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNrcTypeGroupObjectKeyData(NrcTypeGroupObjectKeyData data) {
    if (data != null) {
      addInput("NrcTypeGroup", NrcTypeGroupObjectKeyHelper.toMap(data, new HashMap()).get("NrcTypeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public NrcTypeGroupObjectDataList getNrcTypeGroupObjectDataList() {
    return NrcTypeGroupObjectHelper.fromMapList(outputMap, "NrcTypeGroupList");
  }
  /**
   @deprecated
   */
  public NrcTypeGroupObjectData getNrcTypeGroupObjectData() {
    return NrcTypeGroupObjectHelper.fromMap(outputMap, "NrcTypeGroup");
  }
}
