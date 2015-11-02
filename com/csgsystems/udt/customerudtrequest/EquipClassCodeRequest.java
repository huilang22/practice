/*
 * Generated code DO NOT EDIT
 * Generated file: EquipClassCodeRequest.java
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

import com.csgsystems.cf.data.*;
public final class EquipClassCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EquipClassCodeRequest (String request, EquipClassCodeRequestMethod method) {
    initialize(request, "EquipClassCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EquipClassCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setEquipClassCodeForEquipClassCodeCreate(ECCObjectData data) {
    if (data != null) {
      addInput("EquipClassCode", ECCObjectHelper.toMap(data, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }
  public void setEquipClassCodeForEquipClassCodeDelete(ECCObjectKeyData data) {
    if (data != null) {
      addInput("EquipClassCode", ECCObjectKeyHelper.toMap(data, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }
  public void setEquipClassCodeForEquipClassCodeFind(ECCObjectFilter data) {
    if (data != null) {
      addInput("EquipClassCode", ECCObjectHelper.toMap(data, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }
  public void setEquipClassCodeForEquipClassCodeGet(ECCObjectKeyData data) {
    if (data != null) {
      addInput("EquipClassCode", ECCObjectKeyHelper.toMap(data, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }
  public void setEquipClassCodeForEquipClassCodeUpdate(ECCObjectData data) {
    if (data != null) {
      addInput("EquipClassCode", ECCObjectHelper.toMap(data, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }
  public ECCObjectData getECCObjectDataEquipClassCodeFromEquipClassCodeCreate() {
    return ECCObjectHelper.fromMap(outputMap, "EquipClassCode");
  }
  public ECCObjectData getECCObjectDataEquipClassCodeFromEquipClassCodeDelete() {
    return ECCObjectHelper.fromMap(outputMap, "EquipClassCode");
  }
  public ECCObjectDataList getECCObjectDataEquipClassCodeFromEquipClassCodeFind() {
    return ECCObjectHelper.fromMapList(outputMap, "EquipClassCodeList");
  }
  public ECCObjectData getECCObjectDataEquipClassCodeFromEquipClassCodeGet() {
    return ECCObjectHelper.fromMap(outputMap, "EquipClassCode");
  }
  public ECCObjectData getECCObjectDataEquipClassCodeFromEquipClassCodeUpdate() {
    return ECCObjectHelper.fromMap(outputMap, "EquipClassCode");
  }
  /**
   @deprecated
   */
  public void setECCObjectFilter(ECCObjectFilter data) {
    if (data != null) {
      addInput("ECC", ECCObjectHelper.toMap(data, new HashMap()).get("ECCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setECCObjectData(ECCObjectData data) {
    if (data != null) {
      addInput("EquipClassCode", ECCObjectHelper.toMap(data, new HashMap()).get("ECCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setECCObjectKeyData(ECCObjectKeyData data) {
    if (data != null) {
      addInput("EquipClassCode", ECCObjectKeyHelper.toMap(data, new HashMap()).get("ECCObject"));
    }
  }
  /**
   @deprecated
   */
  public ECCObjectDataList getECCObjectDataList() {
    return ECCObjectHelper.fromMapList(outputMap, "ECCList");
  }
  /**
   @deprecated
   */
  public ECCObjectData getECCObjectData() {
    return ECCObjectHelper.fromMap(outputMap, "EquipClassCode");
  }
}
