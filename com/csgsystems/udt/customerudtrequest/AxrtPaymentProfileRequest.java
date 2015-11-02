/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentProfileRequest.java
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
public final class AxrtPaymentProfileRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AxrtPaymentProfileRequest (String request, AxrtPaymentProfileRequestMethod method) {
    initialize(request, "AxrtPaymentProfile", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AxrtPaymentProfileRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAxrtPaymentProfileForAxrtPaymentProfileCreate(AxrtPaymentProfileObjectData data) {
    if (data != null) {
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(data, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }
  public void setAxrtPaymentProfileForAxrtPaymentProfileDelete(AxrtPaymentProfileObjectData data) {
    if (data != null) {
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(data, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }
  public void setAxrtPaymentProfileForAxrtPaymentProfileFind(AxrtPaymentProfileObjectFilter data) {
    if (data != null) {
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(data, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }
  public void setAxrtPaymentProfileForAxrtPaymentProfileUpdate(AxrtPaymentProfileObjectData data) {
    if (data != null) {
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(data, new HashMap(), "AxrtPaymentProfile").get("AxrtPaymentProfile"));
    }
  }
  public AxrtPaymentProfileObjectData getAxrtPaymentProfileObjectDataAxrtPaymentProfileFromAxrtPaymentProfileCreate() {
    return AxrtPaymentProfileObjectHelper.fromMap(outputMap, "AxrtPaymentProfile");
  }
  public AxrtPaymentProfileObjectData getAxrtPaymentProfileObjectDataAxrtPaymentProfileFromAxrtPaymentProfileDelete() {
    return AxrtPaymentProfileObjectHelper.fromMap(outputMap, "AxrtPaymentProfile");
  }
  public AxrtPaymentProfileObjectDataList getAxrtPaymentProfileObjectDataAxrtPaymentProfileFromAxrtPaymentProfileFind() {
    return AxrtPaymentProfileObjectHelper.fromMapList(outputMap, "AxrtPaymentProfileList");
  }
  public AxrtPaymentProfileObjectData getAxrtPaymentProfileObjectDataAxrtPaymentProfileFromAxrtPaymentProfileUpdate() {
    return AxrtPaymentProfileObjectHelper.fromMap(outputMap, "AxrtPaymentProfile");
  }
  /**
   @deprecated
   */
  public void setAxrtPaymentProfileObjectFilter(AxrtPaymentProfileObjectFilter data) {
    if (data != null) {
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(data, new HashMap()).get("AxrtPaymentProfileObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAxrtPaymentProfileObjectData(AxrtPaymentProfileObjectData data) {
    if (data != null) {
      addInput("AxrtPaymentProfile", AxrtPaymentProfileObjectHelper.toMap(data, new HashMap()).get("AxrtPaymentProfileObject"));
    }
  }
  /**
   @deprecated
   */
  public AxrtPaymentProfileObjectDataList getAxrtPaymentProfileObjectDataList() {
    return AxrtPaymentProfileObjectHelper.fromMapList(outputMap, "AxrtPaymentProfileList");
  }
  /**
   @deprecated
   */
  public AxrtPaymentProfileObjectData getAxrtPaymentProfileObjectData() {
    return AxrtPaymentProfileObjectHelper.fromMap(outputMap, "AxrtPaymentProfile");
  }
}
