/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeGroupRequest.java
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
public final class EntityTypeGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EntityTypeGroupRequest (String request, EntityTypeGroupRequestMethod method) {
    initialize(request, "EntityTypeGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EntityTypeGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setEntityTypeGroupForEntityTypeGroupCreate(EntityTypeGroupObjectData data) {
    if (data != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(data, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }
  public void setEntityTypeGroupForEntityTypeGroupDelete(EntityTypeGroupObjectKeyData data) {
    if (data != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectKeyHelper.toMap(data, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }
  public void setEntityTypeGroupForEntityTypeGroupFind(EntityTypeGroupObjectFilter data) {
    if (data != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(data, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }
  public void setEntityTypeGroupForEntityTypeGroupGet(EntityTypeGroupObjectKeyData data) {
    if (data != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectKeyHelper.toMap(data, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }
  public void setEntityTypeGroupForEntityTypeGroupUpdate(EntityTypeGroupObjectData data) {
    if (data != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(data, new HashMap(), "EntityTypeGroup").get("EntityTypeGroup"));
    }
  }
  public EntityTypeGroupObjectData getEntityTypeGroupObjectDataEntityTypeGroupFromEntityTypeGroupCreate() {
    return EntityTypeGroupObjectHelper.fromMap(outputMap, "EntityTypeGroup");
  }
  public EntityTypeGroupObjectData getEntityTypeGroupObjectDataEntityTypeGroupFromEntityTypeGroupDelete() {
    return EntityTypeGroupObjectHelper.fromMap(outputMap, "EntityTypeGroup");
  }
  public EntityTypeGroupObjectDataList getEntityTypeGroupObjectDataEntityTypeGroupFromEntityTypeGroupFind() {
    return EntityTypeGroupObjectHelper.fromMapList(outputMap, "EntityTypeGroupList");
  }
  public EntityTypeGroupObjectData getEntityTypeGroupObjectDataEntityTypeGroupFromEntityTypeGroupGet() {
    return EntityTypeGroupObjectHelper.fromMap(outputMap, "EntityTypeGroup");
  }
  public EntityTypeGroupObjectData getEntityTypeGroupObjectDataEntityTypeGroupFromEntityTypeGroupUpdate() {
    return EntityTypeGroupObjectHelper.fromMap(outputMap, "EntityTypeGroup");
  }
  /**
   @deprecated
   */
  public void setEntityTypeGroupObjectFilter(EntityTypeGroupObjectFilter data) {
    if (data != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(data, new HashMap()).get("EntityTypeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEntityTypeGroupObjectData(EntityTypeGroupObjectData data) {
    if (data != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectHelper.toMap(data, new HashMap()).get("EntityTypeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEntityTypeGroupObjectKeyData(EntityTypeGroupObjectKeyData data) {
    if (data != null) {
      addInput("EntityTypeGroup", EntityTypeGroupObjectKeyHelper.toMap(data, new HashMap()).get("EntityTypeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public EntityTypeGroupObjectDataList getEntityTypeGroupObjectDataList() {
    return EntityTypeGroupObjectHelper.fromMapList(outputMap, "EntityTypeGroupList");
  }
  /**
   @deprecated
   */
  public EntityTypeGroupObjectData getEntityTypeGroupObjectData() {
    return EntityTypeGroupObjectHelper.fromMap(outputMap, "EntityTypeGroup");
  }
}
