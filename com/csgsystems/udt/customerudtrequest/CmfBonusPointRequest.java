/*
 * Generated code DO NOT EDIT
 * Generated file: CmfBonusPointRequest.java
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

import com.csgsystems.bp.data.*;
public final class CmfBonusPointRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CmfBonusPointRequest (String request, CmfBonusPointRequestMethod method) {
    initialize(request, "CmfBonusPoint", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CmfBonusPointRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCmfBonusPointForCmfBonusPointCreate(CmfBonusPointObjectData data) {
    if (data != null) {
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(data, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }
  public void setCmfBonusPointForCmfBonusPointFind(CmfBonusPointObjectFilter data) {
    if (data != null) {
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(data, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }
  public void setCmfBonusPointForCmfBonusPointGet(CmfBonusPointObjectKeyData data) {
    if (data != null) {
      addInput("CmfBonusPoint", CmfBonusPointObjectKeyHelper.toMap(data, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }
  public void setCmfBonusPointForCmfBonusPointUpdate(CmfBonusPointObjectData data) {
    if (data != null) {
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(data, new HashMap(), "CmfBonusPoint").get("CmfBonusPoint"));
    }
  }
  public CmfBonusPointObjectData getCmfBonusPointObjectDataCmfBonusPointFromCmfBonusPointCreate() {
    return CmfBonusPointObjectHelper.fromMap(outputMap, "CmfBonusPoint");
  }
  public CmfBonusPointObjectDataList getCmfBonusPointObjectDataCmfBonusPointFromCmfBonusPointFind() {
    return CmfBonusPointObjectHelper.fromMapList(outputMap, "CmfBonusPointList");
  }
  public CmfBonusPointObjectData getCmfBonusPointObjectDataCmfBonusPointFromCmfBonusPointGet() {
    return CmfBonusPointObjectHelper.fromMap(outputMap, "CmfBonusPoint");
  }
  public CmfBonusPointObjectData getCmfBonusPointObjectDataCmfBonusPointFromCmfBonusPointUpdate() {
    return CmfBonusPointObjectHelper.fromMap(outputMap, "CmfBonusPoint");
  }
  /**
   @deprecated
   */
  public void setCmfBonusPointObjectFilter(CmfBonusPointObjectFilter data) {
    if (data != null) {
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(data, new HashMap()).get("CmfBonusPointObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCmfBonusPointObjectData(CmfBonusPointObjectData data) {
    if (data != null) {
      addInput("CmfBonusPoint", CmfBonusPointObjectHelper.toMap(data, new HashMap()).get("CmfBonusPointObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCmfBonusPointObjectKeyData(CmfBonusPointObjectKeyData data) {
    if (data != null) {
      addInput("CmfBonusPoint", CmfBonusPointObjectKeyHelper.toMap(data, new HashMap()).get("CmfBonusPointObject"));
    }
  }
  /**
   @deprecated
   */
  public CmfBonusPointObjectDataList getCmfBonusPointObjectDataList() {
    return CmfBonusPointObjectHelper.fromMapList(outputMap, "CmfBonusPointList");
  }
  /**
   @deprecated
   */
  public CmfBonusPointObjectData getCmfBonusPointObjectData() {
    return CmfBonusPointObjectHelper.fromMap(outputMap, "CmfBonusPoint");
  }
}
