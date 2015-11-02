/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupMembersRequest.java
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
public final class HqGroupMembersRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public HqGroupMembersRequest (String request, HqGroupMembersRequestMethod method) {
    initialize(request, "HqGroupMembers", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (HqGroupMembersRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setHqGroupMembersForHqGroupMembersCreate(HqGroupMembersObjectData data) {
    if (data != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(data, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }
  public void setHqGroupMembersForHqGroupMembersDelete(HqGroupMembersObjectData data) {
    if (data != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(data, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }
  public void setHGMDlDiscReForHqGroupMembersDeleteList(Integer data) {
    if (data != null) {
      addInput("HGMDlDiscRe", data);
    }
  }
  public void setHGMDlInactiveDateForHqGroupMembersDeleteList(Date data) {
    if (data != null) {
      addInput("HGMDlInactiveDate", data);
    }
  }
  public void setHqGroupMembersForHqGroupMembersDeleteList(HqGroupMembersObjectFilter data) {
    if (data != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(data, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }
  public void setHqGroupMembersForHqGroupMembersFind(HqGroupMembersObjectFilter data) {
    if (data != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(data, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }
  public void setHqGroupMembersForHqGroupMembersGet(HqGroupMembersObjectData data) {
    if (data != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(data, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }
  public void setHqGroupMembersForHqGroupMembersUpdate(HqGroupMembersObjectData data) {
    if (data != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(data, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
  }
  public HqGroupMembersObjectData getHqGroupMembersObjectDataHqGroupMembersFromHqGroupMembersCreate() {
    return HqGroupMembersObjectHelper.fromMap(outputMap, "HqGroupMembers");
  }
  public HqGroupMembersObjectData getHqGroupMembersObjectDataHqGroupMembersFromHqGroupMembersDelete() {
    return HqGroupMembersObjectHelper.fromMap(outputMap, "HqGroupMembers");
  }
  public HqGroupMembersObjectDataList getHqGroupMembersObjectDataHqGroupMembersFromHqGroupMembersDeleteList() {
    return HqGroupMembersObjectHelper.fromMapList(outputMap, "HqGroupMembersList");
  }
  public HqGroupMembersObjectDataList getHqGroupMembersObjectDataHqGroupMembersFromHqGroupMembersFind() {
    return HqGroupMembersObjectHelper.fromMapList(outputMap, "HqGroupMembersList");
  }
  public HqGroupMembersObjectData getHqGroupMembersObjectDataHqGroupMembersFromHqGroupMembersGet() {
    return HqGroupMembersObjectHelper.fromMap(outputMap, "HqGroupMembers");
  }
  public HqGroupMembersObjectData getHqGroupMembersObjectDataHqGroupMembersFromHqGroupMembersUpdate() {
    return HqGroupMembersObjectHelper.fromMap(outputMap, "HqGroupMembers");
  }
  /**
   @deprecated
   */
  public void setHGMDlDiscRe(Integer data) {
    if (data != null) {
      addInput("HGMDlDiscRe", data);
    }
  }
  /**
   @deprecated
   */
  public void setHGMDlInactiveDate(Date data) {
    if (data != null) {
      addInput("HGMDlInactiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupMembersObjectFilter(HqGroupMembersObjectFilter data) {
    if (data != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(data, new HashMap()).get("HqGroupMembersObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupMembersObjectData(HqGroupMembersObjectData data) {
    if (data != null) {
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(data, new HashMap()).get("HqGroupMembersObject"));
    }
  }
  /**
   @deprecated
   */
  public HqGroupMembersObjectDataList getHqGroupMembersObjectDataList() {
    return HqGroupMembersObjectHelper.fromMapList(outputMap, "HqGroupMembersList");
  }
  /**
   @deprecated
   */
  public HqGroupMembersObjectData getHqGroupMembersObjectData() {
    return HqGroupMembersObjectHelper.fromMap(outputMap, "HqGroupMembers");
  }
}
