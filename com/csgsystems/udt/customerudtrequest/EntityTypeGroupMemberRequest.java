/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeGroupMemberRequest.java
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
public final class EntityTypeGroupMemberRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EntityTypeGroupMemberRequest (String request, EntityTypeGroupMemberRequestMethod method) {
    initialize(request, "EntityTypeGroupMember", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EntityTypeGroupMemberRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setEntityTypeGroupMemberForEntityTypeGroupMemberCreate(EntityTypeGroupMemberObjectData data) {
    if (data != null) {
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectHelper.toMap(data, new HashMap(), "EntityTypeGroupMember").get("EntityTypeGroupMember"));
    }
  }
  public void setEntityTypeGroupMemberForEntityTypeGroupMemberFind(EntityTypeGroupMemberObjectFilter data) {
    if (data != null) {
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectHelper.toMap(data, new HashMap(), "EntityTypeGroupMember").get("EntityTypeGroupMember"));
    }
  }
  public void setEntityTypeGroupMemberForEntityTypeGroupMemberGet(EntityTypeGroupMemberObjectKeyData data) {
    if (data != null) {
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectKeyHelper.toMap(data, new HashMap(), "EntityTypeGroupMember").get("EntityTypeGroupMember"));
    }
  }
  public EntityTypeGroupMemberObjectData getEntityTypeGroupMemberObjectDataEntityTypeGroupMemberFromEntityTypeGroupMemberCreate() {
    return EntityTypeGroupMemberObjectHelper.fromMap(outputMap, "EntityTypeGroupMember");
  }
  public EntityTypeGroupMemberObjectDataList getEntityTypeGroupMemberObjectDataEntityTypeGroupMemberFromEntityTypeGroupMemberFind() {
    return EntityTypeGroupMemberObjectHelper.fromMapList(outputMap, "EntityTypeGroupMemberList");
  }
  public EntityTypeGroupMemberObjectData getEntityTypeGroupMemberObjectDataEntityTypeGroupMemberFromEntityTypeGroupMemberGet() {
    return EntityTypeGroupMemberObjectHelper.fromMap(outputMap, "EntityTypeGroupMember");
  }
  /**
   @deprecated
   */
  public void setEntityTypeGroupMemberObjectFilter(EntityTypeGroupMemberObjectFilter data) {
    if (data != null) {
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectHelper.toMap(data, new HashMap()).get("EntityTypeGroupMemberObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEntityTypeGroupMemberObjectData(EntityTypeGroupMemberObjectData data) {
    if (data != null) {
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectHelper.toMap(data, new HashMap()).get("EntityTypeGroupMemberObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEntityTypeGroupMemberObjectKeyData(EntityTypeGroupMemberObjectKeyData data) {
    if (data != null) {
      addInput("EntityTypeGroupMember", EntityTypeGroupMemberObjectKeyHelper.toMap(data, new HashMap()).get("EntityTypeGroupMemberObject"));
    }
  }
  /**
   @deprecated
   */
  public EntityTypeGroupMemberObjectDataList getEntityTypeGroupMemberObjectDataList() {
    return EntityTypeGroupMemberObjectHelper.fromMapList(outputMap, "EntityTypeGroupMemberList");
  }
  /**
   @deprecated
   */
  public EntityTypeGroupMemberObjectData getEntityTypeGroupMemberObjectData() {
    return EntityTypeGroupMemberObjectHelper.fromMap(outputMap, "EntityTypeGroupMember");
  }
}
