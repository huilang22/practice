/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseInfoRequest.java
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
public final class ClearingHouseInfoRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ClearingHouseInfoRequest (String request, ClearingHouseInfoRequestMethod method) {
    initialize(request, "ClearingHouseInfo", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ClearingHouseInfoRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setClearingHouseInfoForClearingHouseInfoFind(ClearingHouseInfoObjectFilter data) {
    if (data != null) {
      addInput("ClearingHouseInfo", ClearingHouseInfoObjectHelper.toMap(data, new HashMap(), "ClearingHouseInfo").get("ClearingHouseInfo"));
    }
  }
  public void setClearingHouseInfoForClearingHouseInfoGet(ClearingHouseInfoObjectKeyData data) {
    if (data != null) {
      addInput("ClearingHouseInfo", ClearingHouseInfoObjectKeyHelper.toMap(data, new HashMap(), "ClearingHouseInfo").get("ClearingHouseInfo"));
    }
  }
  public ClearingHouseInfoObjectDataList getClearingHouseInfoObjectDataClearingHouseInfoFromClearingHouseInfoFind() {
    return ClearingHouseInfoObjectHelper.fromMapList(outputMap, "ClearingHouseInfoList");
  }
  public ClearingHouseInfoObjectData getClearingHouseInfoObjectDataClearingHouseInfoFromClearingHouseInfoGet() {
    return ClearingHouseInfoObjectHelper.fromMap(outputMap, "ClearingHouseInfo");
  }
  /**
   @deprecated
   */
  public void setClearingHouseInfoObjectFilter(ClearingHouseInfoObjectFilter data) {
    if (data != null) {
      addInput("ClearingHouseInfo", ClearingHouseInfoObjectHelper.toMap(data, new HashMap()).get("ClearingHouseInfoObject"));
    }
  }
  /**
   @deprecated
   */
  public void setClearingHouseInfoObjectKeyData(ClearingHouseInfoObjectKeyData data) {
    if (data != null) {
      addInput("ClearingHouseInfo", ClearingHouseInfoObjectKeyHelper.toMap(data, new HashMap()).get("ClearingHouseInfoObject"));
    }
  }
  /**
   @deprecated
   */
  public ClearingHouseInfoObjectDataList getClearingHouseInfoObjectDataList() {
    return ClearingHouseInfoObjectHelper.fromMapList(outputMap, "ClearingHouseInfoList");
  }
  /**
   @deprecated
   */
  public ClearingHouseInfoObjectData getClearingHouseInfoObjectData() {
    return ClearingHouseInfoObjectHelper.fromMap(outputMap, "ClearingHouseInfo");
  }
}
