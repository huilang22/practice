/*
 * Generated code DO NOT EDIT
 * Generated file: ExclusionRequest.java
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
public final class ExclusionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExclusionRequest (String request, ExclusionRequestMethod method) {
    initialize(request, "Exclusion", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExclusionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountInternalIdForExclusionCheck(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setEffectiveDateForExclusionCheck(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForExclusionCheck(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setServiceInternalIdForExclusionCheck(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForExclusionCheck(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setExclusionForExclusionCreate(ExclusionObjectData data) {
    if (data != null) {
      addInput("Exclusion", ExclusionObjectHelper.toMap(data, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }
  public void setExclusionForExclusionFind(ExclusionObjectFilter data) {
    if (data != null) {
      addInput("Exclusion", ExclusionObjectHelper.toMap(data, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }
  public void setExclusionForExclusionGet(ExclusionObjectKeyData data) {
    if (data != null) {
      addInput("Exclusion", ExclusionObjectKeyHelper.toMap(data, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }
  public void setAccountInternalIdForExclusionRetrieve(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setEffectiveDateForExclusionRetrieve(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForExclusionRetrieve(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setServiceInternalIdForExclusionRetrieve(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForExclusionRetrieve(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setExclusionForExclusionUpdate(ExclusionObjectData data) {
    if (data != null) {
      addInput("Exclusion", ExclusionObjectHelper.toMap(data, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }
  public ExclusionObjectDataList getExclusionObjectDataExclusionFromExclusionCheck() {
    return ExclusionObjectHelper.fromMapList(outputMap, "ExclusionList");
  }
  public ExclusionObjectData getExclusionObjectDataExclusionFromExclusionCreate() {
    return ExclusionObjectHelper.fromMap(outputMap, "Exclusion");
  }
  public ExclusionObjectDataList getExclusionObjectDataExclusionFromExclusionFind() {
    return ExclusionObjectHelper.fromMapList(outputMap, "ExclusionList");
  }
  public ExclusionObjectData getExclusionObjectDataExclusionFromExclusionGet() {
    return ExclusionObjectHelper.fromMap(outputMap, "Exclusion");
  }
  public ExclusionObjectDataList getExclusionObjectDataExclusionFromExclusionRetrieve() {
    return ExclusionObjectHelper.fromMapList(outputMap, "ExclusionList");
  }
  public ExclusionObjectData getExclusionObjectDataExclusionFromExclusionUpdate() {
    return ExclusionObjectHelper.fromMap(outputMap, "Exclusion");
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
  public void setEntityObjectDataArray(EntityObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = EntityObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "Entity");
      }
      addInput("EntityList", list);
    }
  }
  /**
   @deprecated
   */
  public void setExclusionObjectFilter(ExclusionObjectFilter data) {
    if (data != null) {
      addInput("Exclusion", ExclusionObjectHelper.toMap(data, new HashMap()).get("ExclusionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setExclusionObjectData(ExclusionObjectData data) {
    if (data != null) {
      addInput("Exclusion", ExclusionObjectHelper.toMap(data, new HashMap()).get("ExclusionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setExclusionObjectKeyData(ExclusionObjectKeyData data) {
    if (data != null) {
      addInput("Exclusion", ExclusionObjectKeyHelper.toMap(data, new HashMap()).get("ExclusionObject"));
    }
  }
  /**
   @deprecated
   */
  public ExclusionObjectDataList getExclusionObjectDataList() {
    return ExclusionObjectHelper.fromMapList(outputMap, "ExclusionList");
  }
  /**
   @deprecated
   */
  public ExclusionObjectData getExclusionObjectData() {
    return ExclusionObjectHelper.fromMap(outputMap, "Exclusion");
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
