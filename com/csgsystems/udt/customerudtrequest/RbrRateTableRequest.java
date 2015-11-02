/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTableRequest.java
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
public final class RbrRateTableRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrRateTableRequest (String request, RbrRateTableRequestMethod method) {
    initialize(request, "RbrRateTable", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrRateTableRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrRateTableForRbrRateTableCreate(RbrRateTableObjectData data) {
    if (data != null) {
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(data, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }
  public void setRbrRateTableForRbrRateTableDelete(RbrRateTableObjectKeyData data) {
    if (data != null) {
      addInput("RbrRateTable", RbrRateTableObjectKeyHelper.toMap(data, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }
  public void setRbrRateTableForRbrRateTableFind(RbrRateTableObjectFilter data) {
    if (data != null) {
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(data, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }
  public void setRbrRateTableForRbrRateTableGet(RbrRateTableObjectKeyData data) {
    if (data != null) {
      addInput("RbrRateTable", RbrRateTableObjectKeyHelper.toMap(data, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }
  public void setRbrRateTableForRbrRateTableUpdate(RbrRateTableObjectData data) {
    if (data != null) {
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(data, new HashMap(), "RbrRateTable").get("RbrRateTable"));
    }
  }
  public RbrRateTableObjectData getRbrRateTableObjectDataRbrRateTableFromRbrRateTableCreate() {
    return RbrRateTableObjectHelper.fromMap(outputMap, "RbrRateTable");
  }
  public RbrRateTableObjectData getRbrRateTableObjectDataRbrRateTableFromRbrRateTableDelete() {
    return RbrRateTableObjectHelper.fromMap(outputMap, "RbrRateTable");
  }
  public RbrRateTableObjectDataList getRbrRateTableObjectDataRbrRateTableFromRbrRateTableFind() {
    return RbrRateTableObjectHelper.fromMapList(outputMap, "RbrRateTableList");
  }
  public RbrRateTableObjectData getRbrRateTableObjectDataRbrRateTableFromRbrRateTableGet() {
    return RbrRateTableObjectHelper.fromMap(outputMap, "RbrRateTable");
  }
  public RbrRateTableObjectData getRbrRateTableObjectDataRbrRateTableFromRbrRateTableUpdate() {
    return RbrRateTableObjectHelper.fromMap(outputMap, "RbrRateTable");
  }
  /**
   @deprecated
   */
  public void setRbrRateTableObjectFilter(RbrRateTableObjectFilter data) {
    if (data != null) {
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(data, new HashMap()).get("RbrRateTableObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrRateTableObjectData(RbrRateTableObjectData data) {
    if (data != null) {
      addInput("RbrRateTable", RbrRateTableObjectHelper.toMap(data, new HashMap()).get("RbrRateTableObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrRateTableObjectKeyData(RbrRateTableObjectKeyData data) {
    if (data != null) {
      addInput("RbrRateTable", RbrRateTableObjectKeyHelper.toMap(data, new HashMap()).get("RbrRateTableObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrRateTableObjectDataList getRbrRateTableObjectDataList() {
    return RbrRateTableObjectHelper.fromMapList(outputMap, "RbrRateTableList");
  }
  /**
   @deprecated
   */
  public RbrRateTableObjectData getRbrRateTableObjectData() {
    return RbrRateTableObjectHelper.fromMap(outputMap, "RbrRateTable");
  }
}
