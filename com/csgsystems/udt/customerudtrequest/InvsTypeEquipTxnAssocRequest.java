/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeEquipTxnAssocRequest.java
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
public final class InvsTypeEquipTxnAssocRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsTypeEquipTxnAssocRequest (String request, InvsTypeEquipTxnAssocRequestMethod method) {
    initialize(request, "InvsTypeEquipTxnAssoc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsTypeEquipTxnAssocRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsTypeEquipTxnAssocForInvsTypeEquipTxnAssocCreate(InvsTypeEquipTxnAssocObjectData data) {
    if (data != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnAssocObjectHelper.toMap(data, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }
  public void setInvsTypeEquipTxnAssocForInvsTypeEquipTxnAssocDelete(InvsTypeEquipTxnAssocObjectKeyData data) {
    if (data != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnAssocObjectKeyHelper.toMap(data, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }
  public void setInvsTypeEquipTxnAssocForInvsTypeEquipTxnAssocFind(InvsTypeEquipTxnTablesObjectFilter data) {
    if (data != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnTablesObjectHelper.toMap(data, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }
  public void setInvsTypeEquipTxnAssocForInvsTypeEquipTxnAssocFindcommontxn(ITETAInventoryTypeObjectData data) {
    if (data != null) {
      addInput("InvsTypeEquipTxnAssoc", ITETAInventoryTypeObjectHelper.toMap(data, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }
  public void setInvsTypeEquipTxnAssocForInvsTypeEquipTxnAssocGet(InvsTypeEquipTxnTablesObjectKeyData data) {
    if (data != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnTablesObjectKeyHelper.toMap(data, new HashMap(), "InvsTypeEquipTxnAssoc").get("InvsTypeEquipTxnAssoc"));
    }
  }
  public InvsTypeEquipTxnAssocObjectData getInvsTypeEquipTxnAssocObjectDataInvsTypeEquipTxnAssocFromInvsTypeEquipTxnAssocCreate() {
    return InvsTypeEquipTxnAssocObjectHelper.fromMap(outputMap, "InvsTypeEquipTxnAssoc");
  }
  public InvsTypeEquipTxnTablesObjectDataList getInvsTypeEquipTxnTablesObjectDataInvsTypeEquipTxnAssocFromInvsTypeEquipTxnAssocFind() {
    return InvsTypeEquipTxnTablesObjectHelper.fromMapList(outputMap, "InvsTypeEquipTxnAssocList");
  }
  public ITETAEquipmentTransactionIdObjectDataList getITETAEquipmentTransactionIdObjectDataInvsTypeEquipTxnAssocFromInvsTypeEquipTxnAssocFindcommontxn() {
    return ITETAEquipmentTransactionIdObjectHelper.fromMapList(outputMap, "InvsTypeEquipTxnAssocList");
  }
  public InvsTypeEquipTxnTablesObjectData getInvsTypeEquipTxnTablesObjectDataInvsTypeEquipTxnAssocFromInvsTypeEquipTxnAssocGet() {
    return InvsTypeEquipTxnTablesObjectHelper.fromMap(outputMap, "InvsTypeEquipTxnAssoc");
  }
  /**
   @deprecated
   */
  public ITETAEquipmentTransactionIdObjectDataList getITETAEquipmentTransactionIdObjectDataList() {
    return ITETAEquipmentTransactionIdObjectHelper.fromMapList(outputMap, "ITETAEquipmentTransactionIdList");
  }
  /**
   @deprecated
   */
  public void setITETAInventoryTypeObjectDataArray(ITETAInventoryTypeObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = ITETAInventoryTypeObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ITETAInventoryType");
      }
      addInput("ITETAInventoryTypeList", list);
    }
  }
  /**
   @deprecated
   */
  public void setInvsTypeEquipTxnAssocObjectData(InvsTypeEquipTxnAssocObjectData data) {
    if (data != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnAssocObjectHelper.toMap(data, new HashMap()).get("InvsTypeEquipTxnAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsTypeEquipTxnAssocObjectKeyData(InvsTypeEquipTxnAssocObjectKeyData data) {
    if (data != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnAssocObjectKeyHelper.toMap(data, new HashMap()).get("InvsTypeEquipTxnAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsTypeEquipTxnAssocObjectData getInvsTypeEquipTxnAssocObjectData() {
    return InvsTypeEquipTxnAssocObjectHelper.fromMap(outputMap, "InvsTypeEquipTxnAssoc");
  }
  /**
   @deprecated
   */
  public void setInvsTypeEquipTxnTablesObjectFilter(InvsTypeEquipTxnTablesObjectFilter data) {
    if (data != null) {
      addInput("InvsTypeEquipTxnTables", InvsTypeEquipTxnTablesObjectHelper.toMap(data, new HashMap()).get("InvsTypeEquipTxnTablesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsTypeEquipTxnTablesObjectKeyData(InvsTypeEquipTxnTablesObjectKeyData data) {
    if (data != null) {
      addInput("InvsTypeEquipTxnAssoc", InvsTypeEquipTxnTablesObjectKeyHelper.toMap(data, new HashMap()).get("InvsTypeEquipTxnTablesObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsTypeEquipTxnTablesObjectDataList getInvsTypeEquipTxnTablesObjectDataList() {
    return InvsTypeEquipTxnTablesObjectHelper.fromMapList(outputMap, "InvsTypeEquipTxnTablesList");
  }
  /**
   @deprecated
   */
  public InvsTypeEquipTxnTablesObjectData getInvsTypeEquipTxnTablesObjectData() {
    return InvsTypeEquipTxnTablesObjectHelper.fromMap(outputMap, "InvsTypeEquipTxnAssoc");
  }
}
