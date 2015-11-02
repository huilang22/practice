/*
 * Generated code DO NOT EDIT
 * Generated file: InvdReserveEndRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvdReserveEndRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvdReserveEndRequest (String request, InvdReserveEndRequestMethod method) {
    initialize(request, "InvdReserveEnd", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvdReserveEndRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvdReserveEndForInvdReserveEndCreate(InvdReserveEndObjectData data) {
    if (data != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(data, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }
  public void setInvdReserveEndForInvdReserveEndDelete(InvdReserveEndObjectFilter data) {
    if (data != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(data, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }
  public void setInvdReserveEndForInvdReserveEndFind(InvdReserveEndObjectFilter data) {
    if (data != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(data, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }
  public void setInvdReserveEndForInvdReserveEndGet(InvdReserveEndObjectKeyData data) {
    if (data != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectKeyHelper.toMap(data, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }
  public void setInvdReserveEndForInvdReserveEndUpdate(InvdReserveEndObjectData data) {
    if (data != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(data, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }
  public Integer getIntegerVCountFromInvReserveHandlingSP() {
    return (Integer)outputMap.get("VCount");
  }
  public InvdReserveEndObjectData getInvdReserveEndObjectDataInvdReserveEndFromInvdReserveEndCreate() {
    return InvdReserveEndObjectHelper.fromMap(outputMap, "InvdReserveEnd");
  }
  public InvdReserveEndObjectDataList getInvdReserveEndObjectDataInvdReserveEndFromInvdReserveEndFind() {
    return InvdReserveEndObjectHelper.fromMapList(outputMap, "InvdReserveEndList");
  }
  public InvdReserveEndObjectData getInvdReserveEndObjectDataInvdReserveEndFromInvdReserveEndGet() {
    return InvdReserveEndObjectHelper.fromMap(outputMap, "InvdReserveEnd");
  }
  public InvdReserveEndObjectData getInvdReserveEndObjectDataInvdReserveEndFromInvdReserveEndUpdate() {
    return InvdReserveEndObjectHelper.fromMap(outputMap, "InvdReserveEnd");
  }
  /**
   @deprecated
   */
  public void setInvdReserveEndObjectFilter(InvdReserveEndObjectFilter data) {
    if (data != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(data, new HashMap()).get("InvdReserveEndObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdReserveEndObjectData(InvdReserveEndObjectData data) {
    if (data != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(data, new HashMap()).get("InvdReserveEndObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdReserveEndObjectKeyData(InvdReserveEndObjectKeyData data) {
    if (data != null) {
      addInput("InvdReserveEnd", InvdReserveEndObjectKeyHelper.toMap(data, new HashMap()).get("InvdReserveEndObject"));
    }
  }
  /**
   @deprecated
   */
  public InvdReserveEndObjectDataList getInvdReserveEndObjectDataList() {
    return InvdReserveEndObjectHelper.fromMapList(outputMap, "InvdReserveEndList");
  }
  /**
   @deprecated
   */
  public InvdReserveEndObjectData getInvdReserveEndObjectData() {
    return InvdReserveEndObjectHelper.fromMap(outputMap, "InvdReserveEnd");
  }
  /**
   @deprecated
   */
  public Integer getVCount() {
    return (Integer)outputMap.get("VCount");
  }
}
