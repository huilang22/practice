/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentTxnFieldAssocRequest.java
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
public final class InvsEquipmentTxnFieldAssocRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsEquipmentTxnFieldAssocRequest (String request, InvsEquipmentTxnFieldAssocRequestMethod method) {
    initialize(request, "InvsEquipmentTxnFieldAssoc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsEquipmentTxnFieldAssocRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsEquipmentTxnFieldAssocForInvsEquipmentTxnFieldAssocCreate(InvsEquipmentTxnFieldAssocObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectHelper.toMap(data, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }
  public void setInvsEquipmentTxnFieldAssocForInvsEquipmentTxnFieldAssocDelete(InvsEquipmentTxnFieldAssocObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectKeyHelper.toMap(data, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }
  public void setInvsEquipmentTxnFieldAssocForInvsEquipmentTxnFieldAssocFind(InvsEquipmentTxnFieldTablesObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldTablesObjectHelper.toMap(data, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }
  public void setInvsEquipmentTxnFieldAssocForInvsEquipmentTxnFieldAssocGet(InvsEquipmentTxnFieldTablesObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldTablesObjectKeyHelper.toMap(data, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }
  public void setInvsEquipmentTxnFieldAssocForInvsEquipmentTxnFieldAssocUpdate(InvsEquipmentTxnFieldAssocObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectHelper.toMap(data, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }
  public InvsEquipmentTxnFieldAssocObjectData getInvsEquipmentTxnFieldAssocObjectDataInvsEquipmentTxnFieldAssocFromInvsEquipmentTxnFieldAssocCreate() {
    return InvsEquipmentTxnFieldAssocObjectHelper.fromMap(outputMap, "InvsEquipmentTxnFieldAssoc");
  }
  public InvsEquipmentTxnFieldTablesObjectDataList getInvsEquipmentTxnFieldTablesObjectDataInvsEquipmentTxnFieldAssocFromInvsEquipmentTxnFieldAssocFind() {
    return InvsEquipmentTxnFieldTablesObjectHelper.fromMapList(outputMap, "InvsEquipmentTxnFieldAssocList");
  }
  public InvsEquipmentTxnFieldTablesObjectData getInvsEquipmentTxnFieldTablesObjectDataInvsEquipmentTxnFieldAssocFromInvsEquipmentTxnFieldAssocGet() {
    return InvsEquipmentTxnFieldTablesObjectHelper.fromMap(outputMap, "InvsEquipmentTxnFieldAssoc");
  }
  public InvsEquipmentTxnFieldAssocObjectData getInvsEquipmentTxnFieldAssocObjectDataInvsEquipmentTxnFieldAssocFromInvsEquipmentTxnFieldAssocUpdate() {
    return InvsEquipmentTxnFieldAssocObjectHelper.fromMap(outputMap, "InvsEquipmentTxnFieldAssoc");
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentTxnFieldAssocObjectData(InvsEquipmentTxnFieldAssocObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectHelper.toMap(data, new HashMap()).get("InvsEquipmentTxnFieldAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentTxnFieldAssocObjectKeyData(InvsEquipmentTxnFieldAssocObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldAssocObjectKeyHelper.toMap(data, new HashMap()).get("InvsEquipmentTxnFieldAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsEquipmentTxnFieldAssocObjectData getInvsEquipmentTxnFieldAssocObjectData() {
    return InvsEquipmentTxnFieldAssocObjectHelper.fromMap(outputMap, "InvsEquipmentTxnFieldAssoc");
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentTxnFieldTablesObjectFilter(InvsEquipmentTxnFieldTablesObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipmentTxnFieldTables", InvsEquipmentTxnFieldTablesObjectHelper.toMap(data, new HashMap()).get("InvsEquipmentTxnFieldTablesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentTxnFieldTablesObjectKeyData(InvsEquipmentTxnFieldTablesObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldTablesObjectKeyHelper.toMap(data, new HashMap()).get("InvsEquipmentTxnFieldTablesObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsEquipmentTxnFieldTablesObjectDataList getInvsEquipmentTxnFieldTablesObjectDataList() {
    return InvsEquipmentTxnFieldTablesObjectHelper.fromMapList(outputMap, "InvsEquipmentTxnFieldTablesList");
  }
  /**
   @deprecated
   */
  public InvsEquipmentTxnFieldTablesObjectData getInvsEquipmentTxnFieldTablesObjectData() {
    return InvsEquipmentTxnFieldTablesObjectHelper.fromMap(outputMap, "InvsEquipmentTxnFieldAssoc");
  }
}
