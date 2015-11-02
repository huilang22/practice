/*
 * Generated code DO NOT EDIT
 * Generated file: GroupLocateRequest.java
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
public final class GroupLocateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GroupLocateRequest (String request, GroupLocateRequestMethod method) {
    initialize(request, "GroupLocate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GroupLocateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGroupLocateForGroupLocateFind(GroupLocateObjectFilter data) {
    if (data != null) {
      addInput("GroupLocate", GroupLocateObjectHelper.toMap(data, new HashMap(), "GroupLocate").get("GroupLocate"));
    }
  }
  public void setGroupLocateForGroupLocateGet(GroupLocateObjectKeyData data) {
    if (data != null) {
      addInput("GroupLocate", GroupLocateObjectKeyHelper.toMap(data, new HashMap(), "GroupLocate").get("GroupLocate"));
    }
  }
  public GroupLocateObjectDataList getGroupLocateObjectDataGroupLocateFromGroupLocateFind() {
    return GroupLocateObjectHelper.fromMapList(outputMap, "GroupLocateList");
  }
  public GroupLocateObjectData getGroupLocateObjectDataGroupLocateFromGroupLocateGet() {
    return GroupLocateObjectHelper.fromMap(outputMap, "GroupLocate");
  }
  /**
   @deprecated
   */
  public void setGroupLocateObjectFilter(GroupLocateObjectFilter data) {
    if (data != null) {
      addInput("GroupLocate", GroupLocateObjectHelper.toMap(data, new HashMap()).get("GroupLocateObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGroupLocateObjectKeyData(GroupLocateObjectKeyData data) {
    if (data != null) {
      addInput("GroupLocate", GroupLocateObjectKeyHelper.toMap(data, new HashMap()).get("GroupLocateObject"));
    }
  }
  /**
   @deprecated
   */
  public GroupLocateObjectDataList getGroupLocateObjectDataList() {
    return GroupLocateObjectHelper.fromMapList(outputMap, "GroupLocateList");
  }
  /**
   @deprecated
   */
  public GroupLocateObjectData getGroupLocateObjectData() {
    return GroupLocateObjectHelper.fromMap(outputMap, "GroupLocate");
  }
}
