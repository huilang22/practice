/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentRequest.java
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
public final class AxrtPaymentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AxrtPaymentRequest (String request, AxrtPaymentRequestMethod method) {
    initialize(request, "AxrtPayment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AxrtPaymentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAxrtPaymentForAxrtPaymentUpdate(AxrtPaymentObjectData data) {
    if (data != null) {
      addInput("AxrtPayment", AxrtPaymentObjectHelper.toMap(data, new HashMap(), "AxrtPayment").get("AxrtPayment"));
    }
  }
  public AxrtPaymentObjectData getAxrtPaymentObjectDataAxrtPaymentFromAxrtPaymentUpdate() {
    return AxrtPaymentObjectHelper.fromMap(outputMap, "AxrtPayment");
  }
  /**
   @deprecated
   */
  public void setAxrtPaymentObjectData(AxrtPaymentObjectData data) {
    if (data != null) {
      addInput("AxrtPayment", AxrtPaymentObjectHelper.toMap(data, new HashMap()).get("AxrtPaymentObject"));
    }
  }
  /**
   @deprecated
   */
  public AxrtPaymentObjectData getAxrtPaymentObjectData() {
    return AxrtPaymentObjectHelper.fromMap(outputMap, "AxrtPayment");
  }
}
