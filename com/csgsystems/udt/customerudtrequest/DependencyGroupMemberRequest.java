/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyGroupMemberRequest.java
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

import com.csgsystems.cf.data.*;
public final class DependencyGroupMemberRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DependencyGroupMemberRequest (String request, DependencyGroupMemberRequestMethod method) {
    initialize(request, "DependencyGroupMember", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DependencyGroupMemberRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDependencyGroupMemberForDependencyGroupMemberFind(DependencyGroupMemberObjectFilter data) {
    if (data != null) {
      addInput("DependencyGroupMember", DependencyGroupMemberObjectHelper.toMap(data, new HashMap(), "DependencyGroupMember").get("DependencyGroupMember"));
    }
  }
  public DependencyGroupMemberObjectDataList getDependencyGroupMemberObjectDataDependencyGroupMemberFromDependencyGroupMemberFind() {
    return DependencyGroupMemberObjectHelper.fromMapList(outputMap, "DependencyGroupMemberList");
  }
  /**
   @deprecated
   */
  public void setDependencyGroupMemberObjectFilter(DependencyGroupMemberObjectFilter data) {
    if (data != null) {
      addInput("DependencyGroupMember", DependencyGroupMemberObjectHelper.toMap(data, new HashMap()).get("DependencyGroupMemberObject"));
    }
  }
  /**
   @deprecated
   */
  public DependencyGroupMemberObjectDataList getDependencyGroupMemberObjectDataList() {
    return DependencyGroupMemberObjectHelper.fromMapList(outputMap, "DependencyGroupMemberList");
  }
}
