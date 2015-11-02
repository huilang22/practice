/*
 * Generated code DO NOT EDIT
 * Generated file: TransferReasonRequest.java
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
public final class TransferReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TransferReasonRequest (String request, TransferReasonRequestMethod method) {
    initialize(request, "TransferReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TransferReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setTransferReasonForTransferReasonCreate(TransferReasonObjectData data) {
    if (data != null) {
      addInput("TransferReason", TransferReasonObjectHelper.toMap(data, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }
  public void setTransferReasonForTransferReasonDelete(TransferReasonObjectKeyData data) {
    if (data != null) {
      addInput("TransferReason", TransferReasonObjectKeyHelper.toMap(data, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }
  public void setTransferReasonForTransferReasonFind(TransferReasonObjectFilter data) {
    if (data != null) {
      addInput("TransferReason", TransferReasonObjectHelper.toMap(data, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }
  public void setTransferReasonForTransferReasonGet(TransferReasonObjectKeyData data) {
    if (data != null) {
      addInput("TransferReason", TransferReasonObjectKeyHelper.toMap(data, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }
  public void setTransferReasonForTransferReasonUpdate(TransferReasonObjectData data) {
    if (data != null) {
      addInput("TransferReason", TransferReasonObjectHelper.toMap(data, new HashMap(), "TransferReason").get("TransferReason"));
    }
  }
  public TransferReasonObjectData getTransferReasonObjectDataTransferReasonFromTransferReasonCreate() {
    return TransferReasonObjectHelper.fromMap(outputMap, "TransferReason");
  }
  public TransferReasonObjectData getTransferReasonObjectDataTransferReasonFromTransferReasonDelete() {
    return TransferReasonObjectHelper.fromMap(outputMap, "TransferReason");
  }
  public TransferReasonObjectDataList getTransferReasonObjectDataTransferReasonFromTransferReasonFind() {
    return TransferReasonObjectHelper.fromMapList(outputMap, "TransferReasonList");
  }
  public TransferReasonObjectData getTransferReasonObjectDataTransferReasonFromTransferReasonGet() {
    return TransferReasonObjectHelper.fromMap(outputMap, "TransferReason");
  }
  public TransferReasonObjectData getTransferReasonObjectDataTransferReasonFromTransferReasonUpdate() {
    return TransferReasonObjectHelper.fromMap(outputMap, "TransferReason");
  }
  /**
   @deprecated
   */
  public void setTransferReasonObjectFilter(TransferReasonObjectFilter data) {
    if (data != null) {
      addInput("TransferReason", TransferReasonObjectHelper.toMap(data, new HashMap()).get("TransferReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTransferReasonObjectData(TransferReasonObjectData data) {
    if (data != null) {
      addInput("TransferReason", TransferReasonObjectHelper.toMap(data, new HashMap()).get("TransferReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTransferReasonObjectKeyData(TransferReasonObjectKeyData data) {
    if (data != null) {
      addInput("TransferReason", TransferReasonObjectKeyHelper.toMap(data, new HashMap()).get("TransferReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public TransferReasonObjectDataList getTransferReasonObjectDataList() {
    return TransferReasonObjectHelper.fromMapList(outputMap, "TransferReasonList");
  }
  /**
   @deprecated
   */
  public TransferReasonObjectData getTransferReasonObjectData() {
    return TransferReasonObjectHelper.fromMap(outputMap, "TransferReason");
  }
}
