/*
 * Generated code DO NOT EDIT
 * Generated file: LateFeeTypesRequest.java
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
public final class LateFeeTypesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public LateFeeTypesRequest (String request, LateFeeTypesRequestMethod method) {
    initialize(request, "LateFeeTypes", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (LateFeeTypesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setLateFeeTypesForLateFeeTypesFind(LFTObjectFilter data) {
    if (data != null) {
      addInput("LateFeeTypes", LFTObjectHelper.toMap(data, new HashMap(), "LateFeeTypes").get("LateFeeTypes"));
    }
  }
  public void setLateFeeTypesForLateFeeTypesGet(LFTObjectKeyData data) {
    if (data != null) {
      addInput("LateFeeTypes", LFTObjectKeyHelper.toMap(data, new HashMap(), "LateFeeTypes").get("LateFeeTypes"));
    }
  }
  public LFTObjectDataList getLFTObjectDataLateFeeTypesFromLateFeeTypesFind() {
    return LFTObjectHelper.fromMapList(outputMap, "LateFeeTypesList");
  }
  public LFTObjectData getLFTObjectDataLateFeeTypesFromLateFeeTypesGet() {
    return LFTObjectHelper.fromMap(outputMap, "LateFeeTypes");
  }
  /**
   @deprecated
   */
  public void setLFTObjectFilter(LFTObjectFilter data) {
    if (data != null) {
      addInput("LFT", LFTObjectHelper.toMap(data, new HashMap()).get("LFTObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLFTObjectKeyData(LFTObjectKeyData data) {
    if (data != null) {
      addInput("LateFeeTypes", LFTObjectKeyHelper.toMap(data, new HashMap()).get("LFTObject"));
    }
  }
  /**
   @deprecated
   */
  public LFTObjectDataList getLFTObjectDataList() {
    return LFTObjectHelper.fromMapList(outputMap, "LFTList");
  }
  /**
   @deprecated
   */
  public LFTObjectData getLFTObjectData() {
    return LFTObjectHelper.fromMap(outputMap, "LateFeeTypes");
  }
}
