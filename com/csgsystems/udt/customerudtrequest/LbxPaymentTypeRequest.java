/*
 * Generated code DO NOT EDIT
 * Generated file: LbxPaymentTypeRequest.java
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
public final class LbxPaymentTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public LbxPaymentTypeRequest (String request, LbxPaymentTypeRequestMethod method) {
    initialize(request, "LbxPaymentType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (LbxPaymentTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setLbxPaymentTypeForLbxPaymentTypeFind(LbxPaymentTypeObjectFilter data) {
    if (data != null) {
      addInput("LbxPaymentType", LbxPaymentTypeObjectHelper.toMap(data, new HashMap(), "LbxPaymentType").get("LbxPaymentType"));
    }
  }
  public void setLbxPaymentTypeForLbxPaymentTypeGet(LbxPaymentTypeObjectKeyData data) {
    if (data != null) {
      addInput("LbxPaymentType", LbxPaymentTypeObjectKeyHelper.toMap(data, new HashMap(), "LbxPaymentType").get("LbxPaymentType"));
    }
  }
  public LbxPaymentTypeObjectDataList getLbxPaymentTypeObjectDataLbxPaymentTypeFromLbxPaymentTypeFind() {
    return LbxPaymentTypeObjectHelper.fromMapList(outputMap, "LbxPaymentTypeList");
  }
  public LbxPaymentTypeObjectData getLbxPaymentTypeObjectDataLbxPaymentTypeFromLbxPaymentTypeGet() {
    return LbxPaymentTypeObjectHelper.fromMap(outputMap, "LbxPaymentType");
  }
  /**
   @deprecated
   */
  public void setLbxPaymentTypeObjectFilter(LbxPaymentTypeObjectFilter data) {
    if (data != null) {
      addInput("LbxPaymentType", LbxPaymentTypeObjectHelper.toMap(data, new HashMap()).get("LbxPaymentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLbxPaymentTypeObjectKeyData(LbxPaymentTypeObjectKeyData data) {
    if (data != null) {
      addInput("LbxPaymentType", LbxPaymentTypeObjectKeyHelper.toMap(data, new HashMap()).get("LbxPaymentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public LbxPaymentTypeObjectDataList getLbxPaymentTypeObjectDataList() {
    return LbxPaymentTypeObjectHelper.fromMapList(outputMap, "LbxPaymentTypeList");
  }
  /**
   @deprecated
   */
  public LbxPaymentTypeObjectData getLbxPaymentTypeObjectData() {
    return LbxPaymentTypeObjectHelper.fromMap(outputMap, "LbxPaymentType");
  }
}
