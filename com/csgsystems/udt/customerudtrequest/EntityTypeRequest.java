/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeRequest.java
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
public final class EntityTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EntityTypeRequest (String request, EntityTypeRequestMethod method) {
    initialize(request, "EntityType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EntityTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountInternalIdForEntityFind(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setEffectiveDateForEntityFind(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setServiceInternalIdForEntityFind(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForEntityFind(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setEntityTypeForEntityTypeCreate(EntityTypeObjectData data) {
    if (data != null) {
      addInput("EntityType", EntityTypeObjectHelper.toMap(data, new HashMap(), "EntityType").get("EntityType"));
    }
  }
  public void setEntityTypeForEntityTypeDelete(EntityTypeObjectKeyData data) {
    if (data != null) {
      addInput("EntityType", EntityTypeObjectKeyHelper.toMap(data, new HashMap(), "EntityType").get("EntityType"));
    }
  }
  public void setEntityTypeForEntityTypeFind(EntityTypeObjectFilter data) {
    if (data != null) {
      addInput("EntityType", EntityTypeObjectHelper.toMap(data, new HashMap(), "EntityType").get("EntityType"));
    }
  }
  public void setEntityTypeForEntityTypeGet(EntityTypeObjectKeyData data) {
    if (data != null) {
      addInput("EntityType", EntityTypeObjectKeyHelper.toMap(data, new HashMap(), "EntityType").get("EntityType"));
    }
  }
  public void setEntityTypeForEntityTypeUpdate(EntityTypeObjectData data) {
    if (data != null) {
      addInput("EntityType", EntityTypeObjectHelper.toMap(data, new HashMap(), "EntityType").get("EntityType"));
    }
  }
  public EntityObjectDataList getEntityObjectDataEntityFromEntityFind() {
    return EntityObjectHelper.fromMapList(outputMap, "EntityList");
  }
  public EntityTypeObjectData getEntityTypeObjectDataEntityTypeFromEntityTypeCreate() {
    return EntityTypeObjectHelper.fromMap(outputMap, "EntityType");
  }
  public EntityTypeObjectData getEntityTypeObjectDataEntityTypeFromEntityTypeDelete() {
    return EntityTypeObjectHelper.fromMap(outputMap, "EntityType");
  }
  public EntityTypeObjectDataList getEntityTypeObjectDataEntityTypeFromEntityTypeFind() {
    return EntityTypeObjectHelper.fromMapList(outputMap, "EntityTypeList");
  }
  public EntityTypeObjectData getEntityTypeObjectDataEntityTypeFromEntityTypeGet() {
    return EntityTypeObjectHelper.fromMap(outputMap, "EntityType");
  }
  public EntityTypeObjectData getEntityTypeObjectDataEntityTypeFromEntityTypeUpdate() {
    return EntityTypeObjectHelper.fromMap(outputMap, "EntityType");
  }
  /**
   @deprecated
   */
  public void setAccountInternalId(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setEffectiveDate(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public EntityObjectDataList getEntityObjectDataList() {
    return EntityObjectHelper.fromMapList(outputMap, "EntityList");
  }
  /**
   @deprecated
   */
  public void setEntityTypeObjectFilter(EntityTypeObjectFilter data) {
    if (data != null) {
      addInput("EntityType", EntityTypeObjectHelper.toMap(data, new HashMap()).get("EntityTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEntityTypeObjectData(EntityTypeObjectData data) {
    if (data != null) {
      addInput("EntityType", EntityTypeObjectHelper.toMap(data, new HashMap()).get("EntityTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEntityTypeObjectKeyData(EntityTypeObjectKeyData data) {
    if (data != null) {
      addInput("EntityType", EntityTypeObjectKeyHelper.toMap(data, new HashMap()).get("EntityTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public EntityTypeObjectDataList getEntityTypeObjectDataList() {
    return EntityTypeObjectHelper.fromMapList(outputMap, "EntityTypeList");
  }
  /**
   @deprecated
   */
  public EntityTypeObjectData getEntityTypeObjectData() {
    return EntityTypeObjectHelper.fromMap(outputMap, "EntityType");
  }
  /**
   @deprecated
   */
  public void setServiceInternalId(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceInternalIdResets(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
}
