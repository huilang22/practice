/*
 * Generated code DO NOT EDIT
 * Generated file: CtmTableRequest.java
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
public final class CtmTableRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtmTableRequest (String request, CtmTableRequestMethod method) {
    initialize(request, "CtmTable", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtmTableRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtmTableForCtmTableCreate(CtmTableObjectData data) {
    if (data != null) {
      addInput("CtmTable", CtmTableObjectHelper.toMap(data, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }
  public void setCtmTableForCtmTableFind(CtmTableObjectFilter data) {
    if (data != null) {
      addInput("CtmTable", CtmTableObjectHelper.toMap(data, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }
  public void setCtmTableForCtmTableGet(CtmTableObjectKeyData data) {
    if (data != null) {
      addInput("CtmTable", CtmTableObjectKeyHelper.toMap(data, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }
  public void setCtmTableForCtmTableUpdate(CtmTableObjectData data) {
    if (data != null) {
      addInput("CtmTable", CtmTableObjectHelper.toMap(data, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }
  public CtmTableObjectData getCtmTableObjectDataCtmTableFromCtmTableCreate() {
    return CtmTableObjectHelper.fromMap(outputMap, "CtmTable");
  }
  public CtmTableObjectDataList getCtmTableObjectDataCtmTableFromCtmTableFind() {
    return CtmTableObjectHelper.fromMapList(outputMap, "CtmTableList");
  }
  public CtmTableObjectData getCtmTableObjectDataCtmTableFromCtmTableGet() {
    return CtmTableObjectHelper.fromMap(outputMap, "CtmTable");
  }
  public CtmTableObjectData getCtmTableObjectDataCtmTableFromCtmTableUpdate() {
    return CtmTableObjectHelper.fromMap(outputMap, "CtmTable");
  }
  /**
   @deprecated
   */
  public void setCtmTableObjectFilter(CtmTableObjectFilter data) {
    if (data != null) {
      addInput("CtmTable", CtmTableObjectHelper.toMap(data, new HashMap()).get("CtmTableObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtmTableObjectData(CtmTableObjectData data) {
    if (data != null) {
      addInput("CtmTable", CtmTableObjectHelper.toMap(data, new HashMap()).get("CtmTableObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtmTableObjectKeyData(CtmTableObjectKeyData data) {
    if (data != null) {
      addInput("CtmTable", CtmTableObjectKeyHelper.toMap(data, new HashMap()).get("CtmTableObject"));
    }
  }
  /**
   @deprecated
   */
  public CtmTableObjectDataList getCtmTableObjectDataList() {
    return CtmTableObjectHelper.fromMapList(outputMap, "CtmTableList");
  }
  /**
   @deprecated
   */
  public CtmTableObjectData getCtmTableObjectData() {
    return CtmTableObjectHelper.fromMap(outputMap, "CtmTable");
  }
}
