/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferRequest.java
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
public final class CtcOfferRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcOfferRequest (String request, CtcOfferRequestMethod method) {
    initialize(request, "CtcOffer", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcOfferRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcOfferForCtcOfferCreate(CtcOfferObjectData data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(data, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
  public void setCtcOfferForCtcOfferDelete(CtcOfferObjectKeyData data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(data, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
  public void setCtcOfferForCtcOfferDetailFind(CtcOfferFilterObjectFilter data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferFilterObjectHelper.toMap(data, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
  public void setCtcOfferForCtcOfferDetailGet(CtcOfferObjectKeyData data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(data, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
  public void setCtcOfferForCtcOfferFind(CtcOfferObjectFilter data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(data, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
  public void setCtcOfferForCtcOfferGet(CtcOfferObjectKeyData data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(data, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
  public void setCtcOfferForCtcOfferPpvFind(CtcOfferFilterObjectFilter data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferFilterObjectHelper.toMap(data, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
  public void setCtcOfferForCtcOfferSummaryFind(CtcOfferFilterObjectFilter data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferFilterObjectHelper.toMap(data, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
  public void setCtcOfferForCtcOfferSummaryGet(CtcOfferObjectKeyData data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(data, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
  public void setCtcOfferForCtcOfferUpdate(CtcOfferObjectData data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(data, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }
  public CtcOfferObjectData getCtcOfferObjectDataCtcOfferFromCtcOfferCreate() {
    return CtcOfferObjectHelper.fromMap(outputMap, "CtcOffer");
  }
  public CtcOfferObjectData getCtcOfferObjectDataCtcOfferFromCtcOfferDelete() {
    return CtcOfferObjectHelper.fromMap(outputMap, "CtcOffer");
  }
  public CtcOfferDetailObjectDataList getCtcOfferDetailObjectDataCtcOfferFromCtcOfferDetailFind() {
    return CtcOfferDetailObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
  public CtcOfferDetailObjectData getCtcOfferDetailObjectDataCtcOfferFromCtcOfferDetailGet() {
    return CtcOfferDetailObjectHelper.fromMap(outputMap, "CtcOffer");
  }
  public CtcOfferObjectDataList getCtcOfferObjectDataCtcOfferFromCtcOfferFind() {
    return CtcOfferObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
  public CtcOfferObjectData getCtcOfferObjectDataCtcOfferFromCtcOfferGet() {
    return CtcOfferObjectHelper.fromMap(outputMap, "CtcOffer");
  }
  public CtcOfferObjectDataList getCtcOfferObjectDataCtcOfferFromCtcOfferPpvFind() {
    return CtcOfferObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
  public CtcOfferSummaryObjectDataList getCtcOfferSummaryObjectDataCtcOfferFromCtcOfferSummaryFind() {
    return CtcOfferSummaryObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
  public CtcOfferSummaryObjectData getCtcOfferSummaryObjectDataCtcOfferFromCtcOfferSummaryGet() {
    return CtcOfferSummaryObjectHelper.fromMap(outputMap, "CtcOffer");
  }
  public CtcOfferObjectData getCtcOfferObjectDataCtcOfferFromCtcOfferUpdate() {
    return CtcOfferObjectHelper.fromMap(outputMap, "CtcOffer");
  }
  /**
   @deprecated
   */
  public CtcOfferDetailObjectDataList getCtcOfferDetailObjectDataList() {
    return CtcOfferDetailObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
  /**
   @deprecated
   */
  public CtcOfferDetailObjectData getCtcOfferDetailObjectData() {
    return CtcOfferDetailObjectHelper.fromMap(outputMap, "CtcOfferDetail");
  }
  /**
   @deprecated
   */
  public void setCtcOfferFilterObjectFilter(CtcOfferFilterObjectFilter data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferFilterObjectHelper.toMap(data, new HashMap()).get("CtcOfferFilterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOfferObjectFilter(CtcOfferObjectFilter data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(data, new HashMap()).get("CtcOfferObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOfferObjectData(CtcOfferObjectData data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(data, new HashMap()).get("CtcOfferObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOfferObjectKeyData(CtcOfferObjectKeyData data) {
    if (data != null) {
      addInput("CtcOffer", CtcOfferObjectKeyHelper.toMap(data, new HashMap()).get("CtcOfferObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcOfferObjectDataList getCtcOfferObjectDataList() {
    return CtcOfferObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
  /**
   @deprecated
   */
  public CtcOfferObjectData getCtcOfferObjectData() {
    return CtcOfferObjectHelper.fromMap(outputMap, "CtcOffer");
  }
  /**
   @deprecated
   */
  public CtcOfferSummaryObjectDataList getCtcOfferSummaryObjectDataList() {
    return CtcOfferSummaryObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
  /**
   @deprecated
   */
  public CtcOfferSummaryObjectData getCtcOfferSummaryObjectData() {
    return CtcOfferSummaryObjectHelper.fromMap(outputMap, "CtcOfferSummary");
  }
}
