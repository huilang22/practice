/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupsRequest.java
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
public final class HqGroupsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public HqGroupsRequest (String request, HqGroupsRequestMethod method) {
    initialize(request, "HqGroups", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (HqGroupsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountExternalIdForHqGroupsCreate(String data) {
    if (data != null) {
      addInput("AccountExternalId", data);
    }
  }
  public void setAccountExternalIdTypeForHqGroupsCreate(Integer data) {
    if (data != null) {
      addInput("AccountExternalIdType", data);
    }
  }
  public void setHqGroupsForHqGroupsCreate(HqGroupsObjectData data) {
    if (data != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(data, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }
  public void setHqGroupsForHqGroupsDelete(HqGroupsObjectData data) {
    if (data != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(data, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }
  public void setHGInactiveDateForHqGroupsDeleteList(Date data) {
    if (data != null) {
      addInput("HGInactiveDate", data);
    }
  }
  public void setHgxlFilterForHqGroupsDeleteList(HqGroupsObjectFilter data) {
    if (data != null) {
      addInput("HgxlFilter", HqGroupsObjectHelper.toMap(data, new HashMap(), "HgxlFilter").get("HgxlFilter"));
    }
  }
  public void setHqGroupsForHqGroupsFind(HqGroupsObjectFilter data) {
    if (data != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(data, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }
  public void setHqGroupsForHqGroupsGet(HqGroupsObjectData data) {
    if (data != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(data, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }
  public void setHqGroupsForHqGroupsUpdate(HqGroupsObjectData data) {
    if (data != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(data, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }
  public HqGroupsObjectData getHqGroupsObjectDataHqGroupsFromHqGroupsCreate() {
    return HqGroupsObjectHelper.fromMap(outputMap, "HqGroups");
  }
  public HqGroupsObjectData getHqGroupsObjectDataHqGroupsFromHqGroupsDelete() {
    return HqGroupsObjectHelper.fromMap(outputMap, "HqGroups");
  }
  public HqGroupsObjectDataList getHqGroupsObjectDataHqGroupsFromHqGroupsFind() {
    return HqGroupsObjectHelper.fromMapList(outputMap, "HqGroupsList");
  }
  public HqGroupsObjectData getHqGroupsObjectDataHqGroupsFromHqGroupsGet() {
    return HqGroupsObjectHelper.fromMap(outputMap, "HqGroups");
  }
  public HqGroupsObjectData getHqGroupsObjectDataHqGroupsFromHqGroupsUpdate() {
    return HqGroupsObjectHelper.fromMap(outputMap, "HqGroups");
  }
  /**
   @deprecated
   */
  public void setAccountExternalId(String data) {
    if (data != null) {
      addInput("AccountExternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setAccountExternalIdType(Integer data) {
    if (data != null) {
      addInput("AccountExternalIdType", data);
    }
  }
  /**
   @deprecated
   */
  public void setHGInactiveDate(Date data) {
    if (data != null) {
      addInput("HGInactiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupsObjectFilter(HqGroupsObjectFilter data) {
    if (data != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(data, new HashMap()).get("HqGroupsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupsObjectData(HqGroupsObjectData data) {
    if (data != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(data, new HashMap()).get("HqGroupsObject"));
    }
  }
  /**
   @deprecated
   */
  public HqGroupsObjectDataList getHqGroupsObjectDataList() {
    return HqGroupsObjectHelper.fromMapList(outputMap, "HqGroupsList");
  }
  /**
   @deprecated
   */
  public HqGroupsObjectData getHqGroupsObjectData() {
    return HqGroupsObjectHelper.fromMap(outputMap, "HqGroups");
  }
}
