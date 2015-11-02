/*
 * Generated code DO NOT EDIT
 * Generated file: NrcGroupRequest.java
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
public final class NrcGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NrcGroupRequest (String request, NrcGroupRequestMethod method) {
    initialize(request, "NrcGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NrcGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNrcGroupForNrcGroupFind(NrcGroupObjectFilter data) {
    if (data != null) {
      addInput("NrcGroup", NrcGroupObjectHelper.toMap(data, new HashMap(), "NrcGroup").get("NrcGroup"));
    }
  }
  public void setNrcGroupForNrcGroupGet(NrcGroupObjectKeyData data) {
    if (data != null) {
      addInput("NrcGroup", NrcGroupObjectKeyHelper.toMap(data, new HashMap(), "NrcGroup").get("NrcGroup"));
    }
  }
  public NrcGroupObjectDataList getNrcGroupObjectDataNrcGroupFromNrcGroupFind() {
    return NrcGroupObjectHelper.fromMapList(outputMap, "NrcGroupList");
  }
  public NrcGroupObjectData getNrcGroupObjectDataNrcGroupFromNrcGroupGet() {
    return NrcGroupObjectHelper.fromMap(outputMap, "NrcGroup");
  }
  /**
   @deprecated
   */
  public void setNrcGroupObjectFilter(NrcGroupObjectFilter data) {
    if (data != null) {
      addInput("NrcGroup", NrcGroupObjectHelper.toMap(data, new HashMap()).get("NrcGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNrcGroupObjectKeyData(NrcGroupObjectKeyData data) {
    if (data != null) {
      addInput("NrcGroup", NrcGroupObjectKeyHelper.toMap(data, new HashMap()).get("NrcGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public NrcGroupObjectDataList getNrcGroupObjectDataList() {
    return NrcGroupObjectHelper.fromMapList(outputMap, "NrcGroupList");
  }
  /**
   @deprecated
   */
  public NrcGroupObjectData getNrcGroupObjectData() {
    return NrcGroupObjectHelper.fromMap(outputMap, "NrcGroup");
  }
}
