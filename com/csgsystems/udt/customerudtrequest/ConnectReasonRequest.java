/*
 * Generated code DO NOT EDIT
 * Generated file: ConnectReasonRequest.java
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
public final class ConnectReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ConnectReasonRequest (String request, ConnectReasonRequestMethod method) {
    initialize(request, "ConnectReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ConnectReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setConnectReasonForConnectReasonCreate(ConnectReasonObjectData data) {
    if (data != null) {
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(data, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }
  public void setConnectReasonForConnectReasonDelete(ConnectReasonObjectKeyData data) {
    if (data != null) {
      addInput("ConnectReason", ConnectReasonObjectKeyHelper.toMap(data, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }
  public void setConnectReasonForConnectReasonFind(ConnectReasonObjectFilter data) {
    if (data != null) {
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(data, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }
  public void setConnectReasonForConnectReasonGet(ConnectReasonObjectKeyData data) {
    if (data != null) {
      addInput("ConnectReason", ConnectReasonObjectKeyHelper.toMap(data, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }
  public void setConnectReasonForConnectReasonUpdate(ConnectReasonObjectData data) {
    if (data != null) {
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(data, new HashMap(), "ConnectReason").get("ConnectReason"));
    }
  }
  public ConnectReasonObjectData getConnectReasonObjectDataConnectReasonFromConnectReasonCreate() {
    return ConnectReasonObjectHelper.fromMap(outputMap, "ConnectReason");
  }
  public ConnectReasonObjectData getConnectReasonObjectDataConnectReasonFromConnectReasonDelete() {
    return ConnectReasonObjectHelper.fromMap(outputMap, "ConnectReason");
  }
  public ConnectReasonObjectDataList getConnectReasonObjectDataConnectReasonFromConnectReasonFind() {
    return ConnectReasonObjectHelper.fromMapList(outputMap, "ConnectReasonList");
  }
  public ConnectReasonObjectData getConnectReasonObjectDataConnectReasonFromConnectReasonGet() {
    return ConnectReasonObjectHelper.fromMap(outputMap, "ConnectReason");
  }
  public ConnectReasonObjectData getConnectReasonObjectDataConnectReasonFromConnectReasonUpdate() {
    return ConnectReasonObjectHelper.fromMap(outputMap, "ConnectReason");
  }
  /**
   @deprecated
   */
  public void setConnectReasonObjectFilter(ConnectReasonObjectFilter data) {
    if (data != null) {
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(data, new HashMap()).get("ConnectReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setConnectReasonObjectData(ConnectReasonObjectData data) {
    if (data != null) {
      addInput("ConnectReason", ConnectReasonObjectHelper.toMap(data, new HashMap()).get("ConnectReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setConnectReasonObjectKeyData(ConnectReasonObjectKeyData data) {
    if (data != null) {
      addInput("ConnectReason", ConnectReasonObjectKeyHelper.toMap(data, new HashMap()).get("ConnectReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public ConnectReasonObjectDataList getConnectReasonObjectDataList() {
    return ConnectReasonObjectHelper.fromMapList(outputMap, "ConnectReasonList");
  }
  /**
   @deprecated
   */
  public ConnectReasonObjectData getConnectReasonObjectData() {
    return ConnectReasonObjectHelper.fromMap(outputMap, "ConnectReason");
  }
}
