/*
 * Generated code DO NOT EDIT
 * Generated file: EquipTypeCodeRequest.java
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
public final class EquipTypeCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EquipTypeCodeRequest (String request, EquipTypeCodeRequestMethod method) {
    initialize(request, "EquipTypeCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EquipTypeCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setEquipTypeCodeForEquipTypeCodeCreate(ETGObjectData data) {
    if (data != null) {
      addInput("EquipTypeCode", ETGObjectHelper.toMap(data, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }
  public void setEquipTypeCodeForEquipTypeCodeDelete(ETGObjectKeyData data) {
    if (data != null) {
      addInput("EquipTypeCode", ETGObjectKeyHelper.toMap(data, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }
  public void setEquipTypeCodeForEquipTypeCodeFind(ETGObjectFilter data) {
    if (data != null) {
      addInput("EquipTypeCode", ETGObjectHelper.toMap(data, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }
  public void setEquipTypeCodeForEquipTypeCodeGet(ETGObjectKeyData data) {
    if (data != null) {
      addInput("EquipTypeCode", ETGObjectKeyHelper.toMap(data, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }
  public void setEquipTypeCodeForEquipTypeCodeUpdate(ETGObjectData data) {
    if (data != null) {
      addInput("EquipTypeCode", ETGObjectHelper.toMap(data, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }
  public ETGObjectData getETGObjectDataEquipTypeCodeFromEquipTypeCodeCreate() {
    return ETGObjectHelper.fromMap(outputMap, "EquipTypeCode");
  }
  public ETGObjectData getETGObjectDataEquipTypeCodeFromEquipTypeCodeDelete() {
    return ETGObjectHelper.fromMap(outputMap, "EquipTypeCode");
  }
  public ETGObjectDataList getETGObjectDataEquipTypeCodeFromEquipTypeCodeFind() {
    return ETGObjectHelper.fromMapList(outputMap, "EquipTypeCodeList");
  }
  public ETGObjectData getETGObjectDataEquipTypeCodeFromEquipTypeCodeGet() {
    return ETGObjectHelper.fromMap(outputMap, "EquipTypeCode");
  }
  public ETGObjectData getETGObjectDataEquipTypeCodeFromEquipTypeCodeUpdate() {
    return ETGObjectHelper.fromMap(outputMap, "EquipTypeCode");
  }
  /**
   @deprecated
   */
  public void setETGObjectFilter(ETGObjectFilter data) {
    if (data != null) {
      addInput("ETG", ETGObjectHelper.toMap(data, new HashMap()).get("ETGObject"));
    }
  }
  /**
   @deprecated
   */
  public void setETGObjectData(ETGObjectData data) {
    if (data != null) {
      addInput("EquipTypeCode", ETGObjectHelper.toMap(data, new HashMap()).get("ETGObject"));
    }
  }
  /**
   @deprecated
   */
  public void setETGObjectKeyData(ETGObjectKeyData data) {
    if (data != null) {
      addInput("EquipTypeCode", ETGObjectKeyHelper.toMap(data, new HashMap()).get("ETGObject"));
    }
  }
  /**
   @deprecated
   */
  public ETGObjectDataList getETGObjectDataList() {
    return ETGObjectHelper.fromMapList(outputMap, "ETGList");
  }
  /**
   @deprecated
   */
  public ETGObjectData getETGObjectData() {
    return ETGObjectHelper.fromMap(outputMap, "EquipTypeCode");
  }
}
