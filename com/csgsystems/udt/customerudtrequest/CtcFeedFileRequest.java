/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFeedFileRequest.java
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

import com.csgsystems.ctc.data.*;
public final class CtcFeedFileRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcFeedFileRequest (String request, CtcFeedFileRequestMethod method) {
    initialize(request, "CtcFeedFile", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcFeedFileRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcFeedFileForCtcFeedFileCreate(CtcFeedFileObjectData data) {
    if (data != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(data, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }
  public void setCtcFeedFileForCtcFeedFileDelete(CtcFeedFileObjectKeyData data) {
    if (data != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectKeyHelper.toMap(data, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }
  public void setCtcFeedFileForCtcFeedFileFind(CtcFeedFileObjectFilter data) {
    if (data != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(data, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }
  public void setCtcFeedFileForCtcFeedFileGet(CtcFeedFileObjectKeyData data) {
    if (data != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectKeyHelper.toMap(data, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }
  public void setCtcFeedFileForCtcFeedFileUpdate(CtcFeedFileObjectData data) {
    if (data != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(data, new HashMap(), "CtcFeedFile").get("CtcFeedFile"));
    }
  }
  public CtcFeedFileObjectData getCtcFeedFileObjectDataCtcFeedFileFromCtcFeedFileCreate() {
    return CtcFeedFileObjectHelper.fromMap(outputMap, "CtcFeedFile");
  }
  public CtcFeedFileObjectData getCtcFeedFileObjectDataCtcFeedFileFromCtcFeedFileDelete() {
    return CtcFeedFileObjectHelper.fromMap(outputMap, "CtcFeedFile");
  }
  public CtcFeedFileObjectDataList getCtcFeedFileObjectDataCtcFeedFileFromCtcFeedFileFind() {
    return CtcFeedFileObjectHelper.fromMapList(outputMap, "CtcFeedFileList");
  }
  public CtcFeedFileObjectData getCtcFeedFileObjectDataCtcFeedFileFromCtcFeedFileGet() {
    return CtcFeedFileObjectHelper.fromMap(outputMap, "CtcFeedFile");
  }
  public CtcFeedFileObjectData getCtcFeedFileObjectDataCtcFeedFileFromCtcFeedFileUpdate() {
    return CtcFeedFileObjectHelper.fromMap(outputMap, "CtcFeedFile");
  }
  /**
   @deprecated
   */
  public void setCtcFeedFileObjectFilter(CtcFeedFileObjectFilter data) {
    if (data != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(data, new HashMap()).get("CtcFeedFileObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcFeedFileObjectData(CtcFeedFileObjectData data) {
    if (data != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectHelper.toMap(data, new HashMap()).get("CtcFeedFileObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcFeedFileObjectKeyData(CtcFeedFileObjectKeyData data) {
    if (data != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectKeyHelper.toMap(data, new HashMap()).get("CtcFeedFileObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcFeedFileObjectDataList getCtcFeedFileObjectDataList() {
    return CtcFeedFileObjectHelper.fromMapList(outputMap, "CtcFeedFileList");
  }
  /**
   @deprecated
   */
  public CtcFeedFileObjectData getCtcFeedFileObjectData() {
    return CtcFeedFileObjectHelper.fromMap(outputMap, "CtcFeedFile");
  }
}
