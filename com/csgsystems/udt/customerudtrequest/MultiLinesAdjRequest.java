/*
 * Generated code DO NOT EDIT
 * Generated file: MultiLinesAdjRequest.java
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
public final class MultiLinesAdjRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public MultiLinesAdjRequest (String request, MultiLinesAdjRequestMethod method) {
    initialize(request, "MultiLinesAdj", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (MultiLinesAdjRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setMultiLinesAdjForMultiLinesAdjDelete(MultiLinesAdjKeyObjectFilter data) {
    if (data != null) {
      addInput("MultiLinesAdj", MultiLinesAdjKeyObjectHelper.toMap(data, new HashMap(), "MultiLinesAdj").get("MultiLinesAdj"));
    }
  }
  public void setMultiLinesAdjForMultiLinesAdjFindCount(MultiLinesAdjObjectFilter data) {
    if (data != null) {
      addInput("MultiLinesAdj", MultiLinesAdjObjectHelper.toMap(data, new HashMap(), "MultiLinesAdj").get("MultiLinesAdj"));
    }
  }
  public void setMultiLinesAdjForMultiLinesAdjFind(MultiLinesAdjObjectFilter data) {
    if (data != null) {
      addInput("MultiLinesAdj", MultiLinesAdjObjectHelper.toMap(data, new HashMap(), "MultiLinesAdj").get("MultiLinesAdj"));
    }
  }
  public MultiLinesAdjObjectDataList getMultiLinesAdjObjectDataMultiLinesAdjFromMultiLinesAdjDelete() {
    return MultiLinesAdjObjectHelper.fromMapList(outputMap, "MultiLinesAdjList");
  }
  public Integer getIntegerMLABillCountOutFromMultiLinesAdjFindCount() {
    return (Integer)outputMap.get("MLABillCountOut");
  }
  public MultiLinesAdjObjectDataList getMultiLinesAdjObjectDataMultiLinesAdjFromMultiLinesAdjFind() {
    return MultiLinesAdjObjectHelper.fromMapList(outputMap, "MultiLinesAdjList");
  }
  /**
   @deprecated
   */
  public Integer getMLABillCountOut() {
    return (Integer)outputMap.get("MLABillCountOut");
  }
  /**
   @deprecated
   */
  public void setMultiLinesAdjKeyObjectFilter(MultiLinesAdjKeyObjectFilter data) {
    if (data != null) {
      addInput("MultiLinesAdj", MultiLinesAdjKeyObjectHelper.toMap(data, new HashMap()).get("MultiLinesAdjKeyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMultiLinesAdjObjectFilter(MultiLinesAdjObjectFilter data) {
    if (data != null) {
      addInput("MultiLinesAdj", MultiLinesAdjObjectHelper.toMap(data, new HashMap()).get("MultiLinesAdjObject"));
    }
  }
  /**
   @deprecated
   */
  public MultiLinesAdjObjectDataList getMultiLinesAdjObjectDataList() {
    return MultiLinesAdjObjectHelper.fromMapList(outputMap, "MultiLinesAdjList");
  }
}
