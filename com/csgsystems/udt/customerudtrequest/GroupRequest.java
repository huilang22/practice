/*
 * Generated code DO NOT EDIT
 * Generated file: GroupRequest.java
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
public final class GroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GroupRequest (String request, GroupRequestMethod method) {
    initialize(request, "Group", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGroupForGroupCreate(GroupObjectData data) {
    if (data != null) {
      addInput("Group", GroupObjectHelper.toMap(data, new HashMap(), "Group").get("Group"));
    }
  }
  public void setGroupForGroupFind(GroupObjectFilter data) {
    if (data != null) {
      addInput("Group", GroupObjectHelper.toMap(data, new HashMap(), "Group").get("Group"));
    }
  }
  public void setGroupForGroupGet(GroupObjectKeyData data) {
    if (data != null) {
      addInput("Group", GroupObjectKeyHelper.toMap(data, new HashMap(), "Group").get("Group"));
    }
  }
  public void setGroupForGroupUpdate(GroupObjectData data) {
    if (data != null) {
      addInput("Group", GroupObjectHelper.toMap(data, new HashMap(), "Group").get("Group"));
    }
  }
  public GroupObjectData getGroupObjectDataGroupFromGroupCreate() {
    return GroupObjectHelper.fromMap(outputMap, "Group");
  }
  public GroupObjectDataList getGroupObjectDataGroupFromGroupFind() {
    return GroupObjectHelper.fromMapList(outputMap, "GroupList");
  }
  public GroupObjectData getGroupObjectDataGroupFromGroupGet() {
    return GroupObjectHelper.fromMap(outputMap, "Group");
  }
  public GroupObjectData getGroupObjectDataGroupFromGroupUpdate() {
    return GroupObjectHelper.fromMap(outputMap, "Group");
  }
  /**
   @deprecated
   */
  public void setGroupObjectFilter(GroupObjectFilter data) {
    if (data != null) {
      addInput("Group", GroupObjectHelper.toMap(data, new HashMap()).get("GroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGroupObjectData(GroupObjectData data) {
    if (data != null) {
      addInput("Group", GroupObjectHelper.toMap(data, new HashMap()).get("GroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGroupObjectKeyData(GroupObjectKeyData data) {
    if (data != null) {
      addInput("Group", GroupObjectKeyHelper.toMap(data, new HashMap()).get("GroupObject"));
    }
  }
  /**
   @deprecated
   */
  public GroupObjectDataList getGroupObjectDataList() {
    return GroupObjectHelper.fromMapList(outputMap, "GroupList");
  }
  /**
   @deprecated
   */
  public GroupObjectData getGroupObjectData() {
    return GroupObjectHelper.fromMap(outputMap, "Group");
  }
}
