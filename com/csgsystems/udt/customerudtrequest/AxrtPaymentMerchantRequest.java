/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtPaymentMerchantRequest.java
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
public final class AxrtPaymentMerchantRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AxrtPaymentMerchantRequest (String request, AxrtPaymentMerchantRequestMethod method) {
    initialize(request, "AxrtPaymentMerchant", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AxrtPaymentMerchantRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAxrtPaymentMerchantForAxrtPaymentMerchantGet(AxrtPaymentMerchantObjectKeyData data) {
    if (data != null) {
      addInput("AxrtPaymentMerchant", AxrtPaymentMerchantObjectKeyHelper.toMap(data, new HashMap(), "AxrtPaymentMerchant").get("AxrtPaymentMerchant"));
    }
  }
  public AxrtPaymentMerchantObjectData getAxrtPaymentMerchantObjectDataAxrtPaymentMerchantFromAxrtPaymentMerchantGet() {
    return AxrtPaymentMerchantObjectHelper.fromMap(outputMap, "AxrtPaymentMerchant");
  }
  /**
   @deprecated
   */
  public void setAxrtPaymentMerchantObjectKeyData(AxrtPaymentMerchantObjectKeyData data) {
    if (data != null) {
      addInput("AxrtPaymentMerchant", AxrtPaymentMerchantObjectKeyHelper.toMap(data, new HashMap()).get("AxrtPaymentMerchantObject"));
    }
  }
  /**
   @deprecated
   */
  public AxrtPaymentMerchantObjectData getAxrtPaymentMerchantObjectData() {
    return AxrtPaymentMerchantObjectHelper.fromMap(outputMap, "AxrtPaymentMerchant");
  }
}
