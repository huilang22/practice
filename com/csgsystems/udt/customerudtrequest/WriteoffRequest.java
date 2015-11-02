/*
 * Generated code DO NOT EDIT
 * Generated file: WriteoffRequest.java
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
public final class WriteoffRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public WriteoffRequest (String request, WriteoffRequestMethod method) {
    initialize(request, "Writeoff", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (WriteoffRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setWriteoffForWriteoffFind(WriteoffObjectFilter data) {
    if (data != null) {
      addInput("Writeoff", WriteoffObjectHelper.toMap(data, new HashMap(), "Writeoff").get("Writeoff"));
    }
  }
  public void setWriteoffForWriteoffGet(WriteoffObjectKeyData data) {
    if (data != null) {
      addInput("Writeoff", WriteoffObjectKeyHelper.toMap(data, new HashMap(), "Writeoff").get("Writeoff"));
    }
  }
  public void setWriteoffForWriteoffRecoveryCreate(WriteoffObjectData data) {
    if (data != null) {
      addInput("Writeoff", WriteoffObjectHelper.toMap(data, new HashMap(), "Writeoff").get("Writeoff"));
    }
  }
  public WriteoffObjectDataList getWriteoffObjectDataWriteoffFromWriteoffFind() {
    return WriteoffObjectHelper.fromMapList(outputMap, "WriteoffList");
  }
  public WriteoffObjectData getWriteoffObjectDataWriteoffFromWriteoffGet() {
    return WriteoffObjectHelper.fromMap(outputMap, "Writeoff");
  }
  public WriteoffObjectData getWriteoffObjectDataWriteoffFromWriteoffRecoveryCreate() {
    return WriteoffObjectHelper.fromMap(outputMap, "Writeoff");
  }
  /**
   @deprecated
   */
  public void setWriteoffObjectFilter(WriteoffObjectFilter data) {
    if (data != null) {
      addInput("Writeoff", WriteoffObjectHelper.toMap(data, new HashMap()).get("WriteoffObject"));
    }
  }
  /**
   @deprecated
   */
  public void setWriteoffObjectData(WriteoffObjectData data) {
    if (data != null) {
      addInput("Writeoff", WriteoffObjectHelper.toMap(data, new HashMap()).get("WriteoffObject"));
    }
  }
  /**
   @deprecated
   */
  public void setWriteoffObjectKeyData(WriteoffObjectKeyData data) {
    if (data != null) {
      addInput("Writeoff", WriteoffObjectKeyHelper.toMap(data, new HashMap()).get("WriteoffObject"));
    }
  }
  /**
   @deprecated
   */
  public WriteoffObjectDataList getWriteoffObjectDataList() {
    return WriteoffObjectHelper.fromMapList(outputMap, "WriteoffList");
  }
  /**
   @deprecated
   */
  public WriteoffObjectData getWriteoffObjectData() {
    return WriteoffObjectHelper.fromMap(outputMap, "Writeoff");
  }
}
