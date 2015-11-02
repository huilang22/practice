/*
 * Generated code DO NOT EDIT
 * Generated file: OppvDeliveryRequest.java
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

import com.csgsystems.om.data.*;
public final class OppvDeliveryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OppvDeliveryRequest (String request, OppvDeliveryRequestMethod method) {
    initialize(request, "OppvDelivery", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OppvDeliveryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setOppvDeliveryForOppvDeliveryCreate(OppvDeliveryObjData data) {
    if (data != null) {
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(data, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
  public void setOppvDeliveryForOppvDeliveryDelete(OppvDeliveryObjKeyData data) {
    if (data != null) {
      addInput("OppvDelivery", OppvDeliveryObjKeyHelper.toMap(data, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
  public void setOppvDeliveryForOppvDeliveryFind(OppvDeliveryExtObjFilter data) {
    if (data != null) {
      addInput("OppvDelivery", OppvDeliveryExtObjHelper.toMap(data, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
  public void setOppvDeliveryForOppvDeliveryGet(OppvDeliveryObjKeyData data) {
    if (data != null) {
      addInput("OppvDelivery", OppvDeliveryObjKeyHelper.toMap(data, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
  public void setOppvDeliveryForOppvDeliveryNonCancelledFind(OppvOrderItemObjFilter data) {
    if (data != null) {
      addInput("OppvDelivery", OppvOrderItemObjHelper.toMap(data, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
  public void setOppvDeliveryForOppvDeliveryUpdate(OppvDeliveryObjData data) {
    if (data != null) {
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(data, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
  public OppvDeliveryObjData getOppvDeliveryObjDataOppvDeliveryFromOppvDeliveryCreate() {
    return OppvDeliveryObjHelper.fromMap(outputMap, "OppvDelivery");
  }
  public OppvDeliveryObjData getOppvDeliveryObjDataOppvDeliveryFromOppvDeliveryDelete() {
    return OppvDeliveryObjHelper.fromMap(outputMap, "OppvDelivery");
  }
  public OppvDeliveryExtObjDataList getOppvDeliveryExtObjDataOppvDeliveryFromOppvDeliveryFind() {
    return OppvDeliveryExtObjHelper.fromMapList(outputMap, "OppvDeliveryList");
  }
  public OppvDeliveryExtObjData getOppvDeliveryExtObjDataOppvDeliveryFromOppvDeliveryGet() {
    return OppvDeliveryExtObjHelper.fromMap(outputMap, "OppvDelivery");
  }
  public OppvOrderItemObjDataList getOppvOrderItemObjDataOppvDeliveryFromOppvDeliveryNonCancelledFind() {
    return OppvOrderItemObjHelper.fromMapList(outputMap, "OppvDeliveryList");
  }
  public OppvDeliveryObjData getOppvDeliveryObjDataOppvDeliveryFromOppvDeliveryUpdate() {
    return OppvDeliveryObjHelper.fromMap(outputMap, "OppvDelivery");
  }
  /**
   @deprecated
   */
  public void setOppvDeliveryExtObjFilter(OppvDeliveryExtObjFilter data) {
    if (data != null) {
      addInput("OppvDelivery", OppvDeliveryExtObjHelper.toMap(data, new HashMap()).get("OppvDeliveryExtObj"));
    }
  }
  /**
   @deprecated
   */
  public OppvDeliveryExtObjDataList getOppvDeliveryExtObjDataList() {
    return OppvDeliveryExtObjHelper.fromMapList(outputMap, "OppvDeliveryList");
  }
  /**
   @deprecated
   */
  public OppvDeliveryExtObjData getOppvDeliveryExtObjData() {
    return OppvDeliveryExtObjHelper.fromMap(outputMap, "OppvDelivery");
  }
  /**
   @deprecated
   */
  public void setOppvDeliveryObjData(OppvDeliveryObjData data) {
    if (data != null) {
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(data, new HashMap()).get("OppvDeliveryObj"));
    }
  }
  /**
   @deprecated
   */
  public void setOppvDeliveryObjKeyData(OppvDeliveryObjKeyData data) {
    if (data != null) {
      addInput("OppvDelivery", OppvDeliveryObjKeyHelper.toMap(data, new HashMap()).get("OppvDeliveryObj"));
    }
  }
  /**
   @deprecated
   */
  public OppvDeliveryObjData getOppvDeliveryObjData() {
    return OppvDeliveryObjHelper.fromMap(outputMap, "OppvDelivery");
  }
  /**
   @deprecated
   */
  public void setOppvOrderItemObjFilter(OppvOrderItemObjFilter data) {
    if (data != null) {
      addInput("OppvOrderItemObj", OppvOrderItemObjHelper.toMap(data, new HashMap()).get("OppvOrderItemObj"));
    }
  }
  /**
   @deprecated
   */
  public OppvOrderItemObjDataList getOppvOrderItemObjDataList() {
    return OppvOrderItemObjHelper.fromMapList(outputMap, "OppvOrderItemObjList");
  }
}
