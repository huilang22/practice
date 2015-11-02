/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentTransRequest.java
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
public final class AxrtPaymentTransRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AxrtPaymentTransRequest (String request, AxrtPaymentTransRequestMethod method) {
    initialize(request, "AxrtPaymentTrans", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AxrtPaymentTransRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAxrtPaymentTransForAxrtPaymentTransCreate(AxrtPaymentTransObjectData data) {
    if (data != null) {
      addInput("AxrtPaymentTrans", AxrtPaymentTransObjectHelper.toMap(data, new HashMap(), "AxrtPaymentTrans").get("AxrtPaymentTrans"));
    }
  }
  public void setAxrtPaymentTransForAxrtPaymentTransUpdate(AxrtPaymentTransObjectData data) {
    if (data != null) {
      addInput("AxrtPaymentTrans", AxrtPaymentTransObjectHelper.toMap(data, new HashMap(), "AxrtPaymentTrans").get("AxrtPaymentTrans"));
    }
  }
  public AxrtPaymentTransObjectData getAxrtPaymentTransObjectDataAxrtPaymentTransFromAxrtPaymentTransCreate() {
    return AxrtPaymentTransObjectHelper.fromMap(outputMap, "AxrtPaymentTrans");
  }
  public AxrtPaymentTransObjectData getAxrtPaymentTransObjectDataAxrtPaymentTransFromAxrtPaymentTransUpdate() {
    return AxrtPaymentTransObjectHelper.fromMap(outputMap, "AxrtPaymentTrans");
  }
  /**
   @deprecated
   */
  public void setAxrtPaymentTransObjectData(AxrtPaymentTransObjectData data) {
    if (data != null) {
      addInput("AxrtPaymentTrans", AxrtPaymentTransObjectHelper.toMap(data, new HashMap()).get("AxrtPaymentTransObject"));
    }
  }
  /**
   @deprecated
   */
  public AxrtPaymentTransObjectData getAxrtPaymentTransObjectData() {
    return AxrtPaymentTransObjectHelper.fromMap(outputMap, "AxrtPaymentTrans");
  }
}
