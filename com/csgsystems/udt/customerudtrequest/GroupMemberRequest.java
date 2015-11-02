/*
 * Generated code DO NOT EDIT
 * Generated file: GroupMemberRequest.java
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
public final class GroupMemberRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GroupMemberRequest (String request, GroupMemberRequestMethod method) {
    initialize(request, "GroupMember", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GroupMemberRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGroupMemberForGroupMemberCreate(GroupMemberObjectData data) {
    if (data != null) {
      addInput("GroupMember", GroupMemberObjectHelper.toMap(data, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }
  public void setGroupMemberForGroupMemberDelete(GroupMemberObjectKeyData data) {
    if (data != null) {
      addInput("GroupMember", GroupMemberObjectKeyHelper.toMap(data, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }
  public void setInactiveDateForGroupMemberDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setGroupMemberForGroupMemberDeleteList(GroupMemberObjectFilter data) {
    if (data != null) {
      addInput("GroupMember", GroupMemberObjectHelper.toMap(data, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }
  public void setInactiveDateForGroupMemberDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setGroupMemberForGroupMemberFind(GroupMemberObjectFilter data) {
    if (data != null) {
      addInput("GroupMember", GroupMemberObjectHelper.toMap(data, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }
  public void setGroupMemberForGroupMemberGet(GroupMemberObjectKeyData data) {
    if (data != null) {
      addInput("GroupMember", GroupMemberObjectKeyHelper.toMap(data, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }
  public void setGroupMemberForGroupMemberUpdate(GroupMemberObjectData data) {
    if (data != null) {
      addInput("GroupMember", GroupMemberObjectHelper.toMap(data, new HashMap(), "GroupMember").get("GroupMember"));
    }
  }
  public GroupMemberObjectData getGroupMemberObjectDataGroupMemberFromGroupMemberCreate() {
    return GroupMemberObjectHelper.fromMap(outputMap, "GroupMember");
  }
  public GroupMemberObjectData getGroupMemberObjectDataGroupMemberFromGroupMemberDelete() {
    return GroupMemberObjectHelper.fromMap(outputMap, "GroupMember");
  }
  public GroupMemberObjectDataList getGroupMemberObjectDataGroupMemberFromGroupMemberFind() {
    return GroupMemberObjectHelper.fromMapList(outputMap, "GroupMemberList");
  }
  public GroupMemberObjectData getGroupMemberObjectDataGroupMemberFromGroupMemberGet() {
    return GroupMemberObjectHelper.fromMap(outputMap, "GroupMember");
  }
  public GroupMemberObjectData getGroupMemberObjectDataGroupMemberFromGroupMemberUpdate() {
    return GroupMemberObjectHelper.fromMap(outputMap, "GroupMember");
  }
  /**
   @deprecated
   */
  public void setGroupMemberObjectFilter(GroupMemberObjectFilter data) {
    if (data != null) {
      addInput("GroupMember", GroupMemberObjectHelper.toMap(data, new HashMap()).get("GroupMemberObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGroupMemberObjectData(GroupMemberObjectData data) {
    if (data != null) {
      addInput("GroupMember", GroupMemberObjectHelper.toMap(data, new HashMap()).get("GroupMemberObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGroupMemberObjectKeyData(GroupMemberObjectKeyData data) {
    if (data != null) {
      addInput("GroupMember", GroupMemberObjectKeyHelper.toMap(data, new HashMap()).get("GroupMemberObject"));
    }
  }
  /**
   @deprecated
   */
  public GroupMemberObjectDataList getGroupMemberObjectDataList() {
    return GroupMemberObjectHelper.fromMapList(outputMap, "GroupMemberList");
  }
  /**
   @deprecated
   */
  public GroupMemberObjectData getGroupMemberObjectData() {
    return GroupMemberObjectHelper.fromMap(outputMap, "GroupMember");
  }
  /**
   @deprecated
   */
  public void setInactiveDate(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
}
