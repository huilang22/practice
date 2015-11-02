/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyRequest.java
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
public final class CtcOfferBuyRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcOfferBuyRequest (String request, CtcOfferBuyRequestMethod method) {
    initialize(request, "CtcOfferBuy", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcOfferBuyRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcOfferBuyForCtcOfferBuyCreate(CtcOfferBuyObjectData data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(data, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
  public void setCtcOfferBuyForCtcOfferBuyDelete(CtcOfferBuyObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(data, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
  public void setCtcOfferBuyForCtcOfferBuyDetailCreate(CtcOfferBuyObjectData data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(data, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
  public void setCtcOfferBuyForCtcOfferBuyDetailDelete(CtcOfferBuyObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(data, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
  public void setCtcOfferBuyForCtcOfferBuyDetailFind(CtcOfferBuyObjectFilter data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(data, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
  public void setCtcOfferBuyForCtcOfferBuyDetailGet(CtcOfferBuyObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(data, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
  public void setCtcOfferBuyForCtcOfferBuyDetailUpdate(CtcOfferBuyObjectData data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(data, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
  public void setCtcOfferBuyForCtcOfferBuyFind(CtcOfferBuyObjectFilter data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(data, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
  public void setCtcOfferBuyForCtcOfferBuyGet(CtcOfferBuyObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(data, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
  public void setCtcOfferBuyForCtcOfferBuyUpdate(CtcOfferBuyObjectData data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(data, new HashMap(), "CtcOfferBuy").get("CtcOfferBuy"));
    }
  }
  public CtcOfferBuyObjectData getCtcOfferBuyObjectDataCtcOfferBuyFromCtcOfferBuyCreate() {
    return CtcOfferBuyObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
  public CtcOfferBuyObjectData getCtcOfferBuyObjectDataCtcOfferBuyFromCtcOfferBuyDelete() {
    return CtcOfferBuyObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
  public CtcOfferBuyDetailObjectData getCtcOfferBuyDetailObjectDataCreateDetailOutFromCtcOfferBuyDetailCreate() {
    return CtcOfferBuyDetailObjectHelper.fromMap(outputMap, "CreateDetailOut");
  }
  public CtcOfferBuyDetailObjectData getCtcOfferBuyDetailObjectDataCtcOfferBuyFromCtcOfferBuyDetailDelete() {
    return CtcOfferBuyDetailObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
  public CtcOfferBuyDetailObjectDataList getCtcOfferBuyDetailObjectDataCtcOfferBuyFromCtcOfferBuyDetailFind() {
    return CtcOfferBuyDetailObjectHelper.fromMapList(outputMap, "CtcOfferBuyList");
  }
  public CtcOfferBuyDetailObjectData getCtcOfferBuyDetailObjectDataCtcOfferBuyFromCtcOfferBuyDetailGet() {
    return CtcOfferBuyDetailObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
  public CtcOfferBuyDetailObjectData getCtcOfferBuyDetailObjectDataCtcOfferBuyFromCtcOfferBuyDetailUpdate() {
    return CtcOfferBuyDetailObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
  public CtcOfferBuyObjectDataList getCtcOfferBuyObjectDataCtcOfferBuyFromCtcOfferBuyFind() {
    return CtcOfferBuyObjectHelper.fromMapList(outputMap, "CtcOfferBuyList");
  }
  public CtcOfferBuyObjectData getCtcOfferBuyObjectDataCtcOfferBuyFromCtcOfferBuyGet() {
    return CtcOfferBuyObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
  public CtcOfferBuyObjectData getCtcOfferBuyObjectDataCtcOfferBuyFromCtcOfferBuyUpdate() {
    return CtcOfferBuyObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
  /**
   @deprecated
   */
  public CtcOfferBuyDetailObjectDataList getCtcOfferBuyDetailObjectDataList() {
    return CtcOfferBuyDetailObjectHelper.fromMapList(outputMap, "CtcOfferBuyList");
  }
  /**
   @deprecated
   */
  public CtcOfferBuyDetailObjectData getCtcOfferBuyDetailObjectData() {
    return CtcOfferBuyDetailObjectHelper.fromMap(outputMap, "CtcOfferBuyDetail");
  }
  /**
   @deprecated
   */
  public void setCtcOfferBuyObjectFilter(CtcOfferBuyObjectFilter data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(data, new HashMap()).get("CtcOfferBuyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOfferBuyObjectData(CtcOfferBuyObjectData data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectHelper.toMap(data, new HashMap()).get("CtcOfferBuyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOfferBuyObjectKeyData(CtcOfferBuyObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferBuy", CtcOfferBuyObjectKeyHelper.toMap(data, new HashMap()).get("CtcOfferBuyObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcOfferBuyObjectDataList getCtcOfferBuyObjectDataList() {
    return CtcOfferBuyObjectHelper.fromMapList(outputMap, "CtcOfferBuyList");
  }
  /**
   @deprecated
   */
  public CtcOfferBuyObjectData getCtcOfferBuyObjectData() {
    return CtcOfferBuyObjectHelper.fromMap(outputMap, "CtcOfferBuy");
  }
}
