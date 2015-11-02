/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentTxnRequest.java
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
public final class InvsEquipmentTxnRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsEquipmentTxnRequest (String request, InvsEquipmentTxnRequestMethod method) {
    initialize(request, "InvsEquipmentTxn", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsEquipmentTxnRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsEquipmentTxnForInvsEquipmentTxnCreate(InvsEquipmentTxnObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(data, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }
  public void setInvsEquipmentTxnForInvsEquipmentTxnDelete(InvsEquipmentTxnObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectKeyHelper.toMap(data, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }
  public void setInvsEquipmentTxnForInvsEquipmentTxnFind(InvsEquipmentTxnObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(data, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }
  public void setInvsEquipmentTxnForInvsEquipmentTxnGet(InvsEquipmentTxnObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectKeyHelper.toMap(data, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }
  public void setInvsEquipmentTxnForInvsEquipmentTxnUpdate(InvsEquipmentTxnObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(data, new HashMap(), "InvsEquipmentTxn").get("InvsEquipmentTxn"));
    }
  }
  public InvsEquipmentTxnObjectData getInvsEquipmentTxnObjectDataInvsEquipmentTxnFromInvsEquipmentTxnCreate() {
    return InvsEquipmentTxnObjectHelper.fromMap(outputMap, "InvsEquipmentTxn");
  }
  public InvsEquipmentTxnObjectData getInvsEquipmentTxnObjectDataInvsEquipmentTxnFromInvsEquipmentTxnDelete() {
    return InvsEquipmentTxnObjectHelper.fromMap(outputMap, "InvsEquipmentTxn");
  }
  public InvsEquipmentTxnObjectDataList getInvsEquipmentTxnObjectDataInvsEquipmentTxnFromInvsEquipmentTxnFind() {
    return InvsEquipmentTxnObjectHelper.fromMapList(outputMap, "InvsEquipmentTxnList");
  }
  public InvsEquipmentTxnObjectData getInvsEquipmentTxnObjectDataInvsEquipmentTxnFromInvsEquipmentTxnGet() {
    return InvsEquipmentTxnObjectHelper.fromMap(outputMap, "InvsEquipmentTxn");
  }
  public InvsEquipmentTxnObjectData getInvsEquipmentTxnObjectDataInvsEquipmentTxnFromInvsEquipmentTxnUpdate() {
    return InvsEquipmentTxnObjectHelper.fromMap(outputMap, "InvsEquipmentTxn");
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentTxnObjectFilter(InvsEquipmentTxnObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(data, new HashMap()).get("InvsEquipmentTxnObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentTxnObjectData(InvsEquipmentTxnObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectHelper.toMap(data, new HashMap()).get("InvsEquipmentTxnObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentTxnObjectKeyData(InvsEquipmentTxnObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentTxn", InvsEquipmentTxnObjectKeyHelper.toMap(data, new HashMap()).get("InvsEquipmentTxnObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsEquipmentTxnObjectDataList getInvsEquipmentTxnObjectDataList() {
    return InvsEquipmentTxnObjectHelper.fromMapList(outputMap, "InvsEquipmentTxnList");
  }
  /**
   @deprecated
   */
  public InvsEquipmentTxnObjectData getInvsEquipmentTxnObjectData() {
    return InvsEquipmentTxnObjectHelper.fromMap(outputMap, "InvsEquipmentTxn");
  }
}
