/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdAcctMapRequest.java
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
public final class ExternalIdAcctMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExternalIdAcctMapRequest (String request, ExternalIdAcctMapRequestMethod method) {
    initialize(request, "ExternalIdAcctMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExternalIdAcctMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExternalIdAcctMapForExternalIdAcctMapFind(EIAMObjectFilter data) {
    if (data != null) {
      addInput("ExternalIdAcctMap", EIAMObjectHelper.toMap(data, new HashMap(), "ExternalIdAcctMap").get("ExternalIdAcctMap"));
    }
  }
  public void setExternalIdAcctMapForExternalIdAcctMapGet(EIAMObjectKeyData data) {
    if (data != null) {
      addInput("ExternalIdAcctMap", EIAMObjectKeyHelper.toMap(data, new HashMap(), "ExternalIdAcctMap").get("ExternalIdAcctMap"));
    }
  }
  public EIAMObjectDataList getEIAMObjectDataExternalIdAcctMapFromExternalIdAcctMapFind() {
    return EIAMObjectHelper.fromMapList(outputMap, "ExternalIdAcctMapList");
  }
  public EIAMObjectData getEIAMObjectDataExternalIdAcctMapFromExternalIdAcctMapGet() {
    return EIAMObjectHelper.fromMap(outputMap, "ExternalIdAcctMap");
  }
  /**
   @deprecated
   */
  public void setEIAMObjectFilter(EIAMObjectFilter data) {
    if (data != null) {
      addInput("EIAM", EIAMObjectHelper.toMap(data, new HashMap()).get("EIAMObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEIAMObjectKeyData(EIAMObjectKeyData data) {
    if (data != null) {
      addInput("ExternalIdAcctMap", EIAMObjectKeyHelper.toMap(data, new HashMap()).get("EIAMObject"));
    }
  }
  /**
   @deprecated
   */
  public EIAMObjectDataList getEIAMObjectDataList() {
    return EIAMObjectHelper.fromMapList(outputMap, "EIAMList");
  }
  /**
   @deprecated
   */
  public EIAMObjectData getEIAMObjectData() {
    return EIAMObjectHelper.fromMap(outputMap, "ExternalIdAcctMap");
  }
}
