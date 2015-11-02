/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdHqGroupsMapRequest.java
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
public final class ExternalIdHqGroupsMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExternalIdHqGroupsMapRequest (String request, ExternalIdHqGroupsMapRequestMethod method) {
    initialize(request, "ExternalIdHqGroupsMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExternalIdHqGroupsMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExternalIdHqGroupsMapForExternalIdHqgroupsMapFind(EIHGMObjectFilter data) {
    if (data != null) {
      addInput("ExternalIdHqGroupsMap", EIHGMObjectHelper.toMap(data, new HashMap(), "ExternalIdHqGroupsMap").get("ExternalIdHqGroupsMap"));
    }
  }
  public void setExternalIdHqGroupsMapForExternalIdHqgroupsMapGet(EIHGMObjectKeyData data) {
    if (data != null) {
      addInput("ExternalIdHqGroupsMap", EIHGMObjectKeyHelper.toMap(data, new HashMap(), "ExternalIdHqGroupsMap").get("ExternalIdHqGroupsMap"));
    }
  }
  public EIHGMObjectDataList getEIHGMObjectDataExternalIdHqGroupsMapFromExternalIdHqgroupsMapFind() {
    return EIHGMObjectHelper.fromMapList(outputMap, "ExternalIdHqGroupsMapList");
  }
  public EIHGMObjectData getEIHGMObjectDataExternalIdHqGroupsMapFromExternalIdHqgroupsMapGet() {
    return EIHGMObjectHelper.fromMap(outputMap, "ExternalIdHqGroupsMap");
  }
  /**
   @deprecated
   */
  public void setEIHGMObjectFilter(EIHGMObjectFilter data) {
    if (data != null) {
      addInput("EIHGM", EIHGMObjectHelper.toMap(data, new HashMap()).get("EIHGMObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEIHGMObjectKeyData(EIHGMObjectKeyData data) {
    if (data != null) {
      addInput("ExternalIdHqGroupsMap", EIHGMObjectKeyHelper.toMap(data, new HashMap()).get("EIHGMObject"));
    }
  }
  /**
   @deprecated
   */
  public EIHGMObjectDataList getEIHGMObjectDataList() {
    return EIHGMObjectHelper.fromMapList(outputMap, "EIHGMList");
  }
  /**
   @deprecated
   */
  public EIHGMObjectData getEIHGMObjectData() {
    return EIHGMObjectHelper.fromMap(outputMap, "ExternalIdHqGroupsMap");
  }
}
