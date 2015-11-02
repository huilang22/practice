/*
 * Generated code DO NOT EDIT
 * Generated file: InvsCountryCodeRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvsCountryCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsCountryCodeRequest (String request, InvsCountryCodeRequestMethod method) {
    initialize(request, "InvsCountryCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsCountryCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsCountryCodeForInvsCountryCodeFind(InvsCountryCodeObjectFilter data) {
    if (data != null) {
      addInput("InvsCountryCode", InvsCountryCodeObjectHelper.toMap(data, new HashMap(), "InvsCountryCode").get("InvsCountryCode"));
    }
  }
  public void setInvsCountryCodeForInvsCountryCodeGet(InvsCountryCodeObjectKeyData data) {
    if (data != null) {
      addInput("InvsCountryCode", InvsCountryCodeObjectKeyHelper.toMap(data, new HashMap(), "InvsCountryCode").get("InvsCountryCode"));
    }
  }
  public InvsCountryCodeObjectDataList getInvsCountryCodeObjectDataInvsCountryCodeFromInvsCountryCodeFind() {
    return InvsCountryCodeObjectHelper.fromMapList(outputMap, "InvsCountryCodeList");
  }
  public InvsCountryCodeObjectData getInvsCountryCodeObjectDataInvsCountryCodeFromInvsCountryCodeGet() {
    return InvsCountryCodeObjectHelper.fromMap(outputMap, "InvsCountryCode");
  }
  /**
   @deprecated
   */
  public void setInvsCountryCodeObjectFilter(InvsCountryCodeObjectFilter data) {
    if (data != null) {
      addInput("InvsCountryCode", InvsCountryCodeObjectHelper.toMap(data, new HashMap()).get("InvsCountryCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsCountryCodeObjectKeyData(InvsCountryCodeObjectKeyData data) {
    if (data != null) {
      addInput("InvsCountryCode", InvsCountryCodeObjectKeyHelper.toMap(data, new HashMap()).get("InvsCountryCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsCountryCodeObjectDataList getInvsCountryCodeObjectDataList() {
    return InvsCountryCodeObjectHelper.fromMapList(outputMap, "InvsCountryCodeList");
  }
  /**
   @deprecated
   */
  public InvsCountryCodeObjectData getInvsCountryCodeObjectData() {
    return InvsCountryCodeObjectHelper.fromMap(outputMap, "InvsCountryCode");
  }
}
