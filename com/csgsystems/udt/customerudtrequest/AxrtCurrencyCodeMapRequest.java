/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtCurrencyCodeMapRequest.java
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
public final class AxrtCurrencyCodeMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AxrtCurrencyCodeMapRequest (String request, AxrtCurrencyCodeMapRequestMethod method) {
    initialize(request, "AxrtCurrencyCodeMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AxrtCurrencyCodeMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAxrtCurrencyCodeMapForAxrtCurrencyCodeMapGet(AxrtCurrencyCodeMapObjectKeyData data) {
    if (data != null) {
      addInput("AxrtCurrencyCodeMap", AxrtCurrencyCodeMapObjectKeyHelper.toMap(data, new HashMap(), "AxrtCurrencyCodeMap").get("AxrtCurrencyCodeMap"));
    }
  }
  public AxrtCurrencyCodeMapObjectData getAxrtCurrencyCodeMapObjectDataAxrtCurrencyCodeMapFromAxrtCurrencyCodeMapGet() {
    return AxrtCurrencyCodeMapObjectHelper.fromMap(outputMap, "AxrtCurrencyCodeMap");
  }
  /**
   @deprecated
   */
  public void setAxrtCurrencyCodeMapObjectKeyData(AxrtCurrencyCodeMapObjectKeyData data) {
    if (data != null) {
      addInput("AxrtCurrencyCodeMap", AxrtCurrencyCodeMapObjectKeyHelper.toMap(data, new HashMap()).get("AxrtCurrencyCodeMapObject"));
    }
  }
  /**
   @deprecated
   */
  public AxrtCurrencyCodeMapObjectData getAxrtCurrencyCodeMapObjectData() {
    return AxrtCurrencyCodeMapObjectHelper.fromMap(outputMap, "AxrtCurrencyCodeMap");
  }
}
