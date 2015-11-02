/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyMethodRequest.java
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

import com.csgsystems.ctc.data.*;
public final class CtcOfferBuyMethodRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcOfferBuyMethodRequest (String request, CtcOfferBuyMethodRequestMethod method) {
    initialize(request, "CtcOfferBuyMethod", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcOfferBuyMethodRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcOfferBuyMethodForCtcOfferBuyMethodCreate(CtcOfferBuyMethodObjectData data) {
    if (data != null) {
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectHelper.toMap(data, new HashMap(), "CtcOfferBuyMethod").get("CtcOfferBuyMethod"));
    }
  }
  public void setCtcOfferBuyMethodForCtcOfferBuyMethodDelete(CtcOfferBuyMethodObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectKeyHelper.toMap(data, new HashMap(), "CtcOfferBuyMethod").get("CtcOfferBuyMethod"));
    }
  }
  public void setCtcOfferBuyMethodForCtcOfferBuyMethodFind(CtcOfferBuyMethodObjectFilter data) {
    if (data != null) {
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectHelper.toMap(data, new HashMap(), "CtcOfferBuyMethod").get("CtcOfferBuyMethod"));
    }
  }
  public void setCtcOfferBuyMethodForCtcOfferBuyMethodGet(CtcOfferBuyMethodObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectKeyHelper.toMap(data, new HashMap(), "CtcOfferBuyMethod").get("CtcOfferBuyMethod"));
    }
  }
  public CtcOfferBuyMethodObjectData getCtcOfferBuyMethodObjectDataCtcOfferBuyMethodFromCtcOfferBuyMethodCreate() {
    return CtcOfferBuyMethodObjectHelper.fromMap(outputMap, "CtcOfferBuyMethod");
  }
  public CtcOfferBuyMethodObjectData getCtcOfferBuyMethodObjectDataCtcOfferBuyMethodFromCtcOfferBuyMethodDelete() {
    return CtcOfferBuyMethodObjectHelper.fromMap(outputMap, "CtcOfferBuyMethod");
  }
  public CtcOfferBuyMethodObjectDataList getCtcOfferBuyMethodObjectDataCtcOfferBuyMethodFromCtcOfferBuyMethodFind() {
    return CtcOfferBuyMethodObjectHelper.fromMapList(outputMap, "CtcOfferBuyMethodList");
  }
  public CtcOfferBuyMethodObjectData getCtcOfferBuyMethodObjectDataCtcOfferBuyMethodFromCtcOfferBuyMethodGet() {
    return CtcOfferBuyMethodObjectHelper.fromMap(outputMap, "CtcOfferBuyMethod");
  }
  /**
   @deprecated
   */
  public void setCtcOfferBuyMethodObjectFilter(CtcOfferBuyMethodObjectFilter data) {
    if (data != null) {
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectHelper.toMap(data, new HashMap()).get("CtcOfferBuyMethodObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOfferBuyMethodObjectData(CtcOfferBuyMethodObjectData data) {
    if (data != null) {
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectHelper.toMap(data, new HashMap()).get("CtcOfferBuyMethodObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOfferBuyMethodObjectKeyData(CtcOfferBuyMethodObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferBuyMethod", CtcOfferBuyMethodObjectKeyHelper.toMap(data, new HashMap()).get("CtcOfferBuyMethodObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcOfferBuyMethodObjectDataList getCtcOfferBuyMethodObjectDataList() {
    return CtcOfferBuyMethodObjectHelper.fromMapList(outputMap, "CtcOfferBuyMethodList");
  }
  /**
   @deprecated
   */
  public CtcOfferBuyMethodObjectData getCtcOfferBuyMethodObjectData() {
    return CtcOfferBuyMethodObjectHelper.fromMap(outputMap, "CtcOfferBuyMethod");
  }
}
