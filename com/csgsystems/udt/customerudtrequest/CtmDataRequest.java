/*
 * Generated code DO NOT EDIT
 * Generated file: CtmDataRequest.java
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
public final class CtmDataRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtmDataRequest (String request, CtmDataRequestMethod method) {
    initialize(request, "CtmData", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtmDataRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtmDataForCtmDataCreate(CtmDataRowData data) {
    if (data != null) {
      addInput("CtmData", CtmDataRowHelper.toMap(data, new HashMap(), "CtmData").get("CtmData"));
    }
  }
  public void setTableIdForCtmDataCreate(Integer data) {
    if (data != null) {
      addInput("TableId", data);
    }
  }
  public void setCtmDataForCtmDataDelete(CtmDataRowKeyData data) {
    if (data != null) {
      addInput("CtmData", CtmDataRowKeyHelper.toMap(data, new HashMap(), "CtmData").get("CtmData"));
    }
  }
  public void setTableIdForCtmDataDelete(Integer data) {
    if (data != null) {
      addInput("TableId", data);
    }
  }
  public void setCtmDataForCtmDataFind(CtmDataRowFilter data) {
    if (data != null) {
      addInput("CtmData", CtmDataRowHelper.toMap(data, new HashMap(), "CtmData").get("CtmData"));
    }
  }
  public void setTableIdForCtmDataFind(Integer data) {
    if (data != null) {
      addInput("TableId", data);
    }
  }
  public void setCtmDataForCtmDataGet(CtmDataRowKeyData data) {
    if (data != null) {
      addInput("CtmData", CtmDataRowKeyHelper.toMap(data, new HashMap(), "CtmData").get("CtmData"));
    }
  }
  public void setTableIdForCtmDataGet(Integer data) {
    if (data != null) {
      addInput("TableId", data);
    }
  }
  public void setCtmDataForCtmDataUpdate(CtmDataRowData data) {
    if (data != null) {
      addInput("CtmData", CtmDataRowHelper.toMap(data, new HashMap(), "CtmData").get("CtmData"));
    }
  }
  public void setTableIdForCtmDataUpdate(Integer data) {
    if (data != null) {
      addInput("TableId", data);
    }
  }
  public CtmDataRowData getCtmDataRowDataCtmDataFromCtmDataCreate() {
    return CtmDataRowHelper.fromMap(outputMap, "CtmData");
  }
  public CtmDataRowDataList getCtmDataRowDataCtmDataFromCtmDataFind() {
    return CtmDataRowHelper.fromMapList(outputMap, "CtmDataList");
  }
  public CtmDataRowData getCtmDataRowDataCtmDataFromCtmDataGet() {
    return CtmDataRowHelper.fromMap(outputMap, "CtmData");
  }
  public CtmDataRowData getCtmDataRowDataCtmDataFromCtmDataUpdate() {
    return CtmDataRowHelper.fromMap(outputMap, "CtmData");
  }
  /**
   @deprecated
   */
  public void setCtmDataRowFilter(CtmDataRowFilter data) {
    if (data != null) {
      addInput("CtmData", CtmDataRowHelper.toMap(data, new HashMap()).get("CtmDataRow"));
    }
  }
  /**
   @deprecated
   */
  public void setCtmDataRowData(CtmDataRowData data) {
    if (data != null) {
      addInput("CtmData", CtmDataRowHelper.toMap(data, new HashMap()).get("CtmDataRow"));
    }
  }
  /**
   @deprecated
   */
  public void setCtmDataRowKeyData(CtmDataRowKeyData data) {
    if (data != null) {
      addInput("CtmData", CtmDataRowKeyHelper.toMap(data, new HashMap()).get("CtmDataRow"));
    }
  }
  /**
   @deprecated
   */
  public CtmDataRowDataList getCtmDataRowDataList() {
    return CtmDataRowHelper.fromMapList(outputMap, "CtmDataList");
  }
  /**
   @deprecated
   */
  public CtmDataRowData getCtmDataRowData() {
    return CtmDataRowHelper.fromMap(outputMap, "CtmData");
  }
  /**
   @deprecated
   */
  public void setTableId(Integer data) {
    if (data != null) {
      addInput("TableId", data);
    }
  }
}
