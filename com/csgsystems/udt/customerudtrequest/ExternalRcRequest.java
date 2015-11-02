/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalRcRequest.java
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

import com.csgsystems.om.data.*;
public final class ExternalRcRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExternalRcRequest (String request, ExternalRcRequestMethod method) {
    initialize(request, "ExternalRc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExternalRcRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExternalRcForExternalRcFind(ExternalRcObjectFilter data) {
    if (data != null) {
      addInput("ExternalRc", ExternalRcObjectHelper.toMap(data, new HashMap(), "ExternalRc").get("ExternalRc"));
    }
  }
  public void setExternalRcForExternalRcGet(ExternalRcObjectKeyData data) {
    if (data != null) {
      addInput("ExternalRc", ExternalRcObjectKeyHelper.toMap(data, new HashMap(), "ExternalRc").get("ExternalRc"));
    }
  }
  public void setExternalRcForExternalRcUpdate(ExternalRcObjectData data) {
    if (data != null) {
      addInput("ExternalRc", ExternalRcObjectHelper.toMap(data, new HashMap(), "ExternalRc").get("ExternalRc"));
    }
  }
  public ExternalRcObjectDataList getExternalRcObjectDataExternalRcFromExternalRcFind() {
    return ExternalRcObjectHelper.fromMapList(outputMap, "ExternalRcList");
  }
  public ExternalRcObjectData getExternalRcObjectDataExternalRcFromExternalRcGet() {
    return ExternalRcObjectHelper.fromMap(outputMap, "ExternalRc");
  }
  public ExternalRcObjectData getExternalRcObjectDataExternalRcFromExternalRcUpdate() {
    return ExternalRcObjectHelper.fromMap(outputMap, "ExternalRc");
  }
  /**
   @deprecated
   */
  public void setExternalRcObjectFilter(ExternalRcObjectFilter data) {
    if (data != null) {
      addInput("ExternalRc", ExternalRcObjectHelper.toMap(data, new HashMap()).get("ExternalRcObject"));
    }
  }
  /**
   @deprecated
   */
  public void setExternalRcObjectData(ExternalRcObjectData data) {
    if (data != null) {
      addInput("ExternalRc", ExternalRcObjectHelper.toMap(data, new HashMap()).get("ExternalRcObject"));
    }
  }
  /**
   @deprecated
   */
  public void setExternalRcObjectKeyData(ExternalRcObjectKeyData data) {
    if (data != null) {
      addInput("ExternalRc", ExternalRcObjectKeyHelper.toMap(data, new HashMap()).get("ExternalRcObject"));
    }
  }
  /**
   @deprecated
   */
  public ExternalRcObjectDataList getExternalRcObjectDataList() {
    return ExternalRcObjectHelper.fromMapList(outputMap, "ExternalRcList");
  }
  /**
   @deprecated
   */
  public ExternalRcObjectData getExternalRcObjectData() {
    return ExternalRcObjectHelper.fromMap(outputMap, "ExternalRc");
  }
}
