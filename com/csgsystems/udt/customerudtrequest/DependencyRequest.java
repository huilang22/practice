/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyRequest.java
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
public final class DependencyRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DependencyRequest (String request, DependencyRequestMethod method) {
    initialize(request, "Dependency", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DependencyRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountInternalIdForDependencyCheck(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setApplyExclusionsForDependencyCheck(Integer data) {
    if (data != null) {
      addInput("ApplyExclusions", data);
    }
  }
  public void setDependencyTypeForDependencyCheck(Integer data) {
    if (data != null) {
      addInput("DependencyType", data);
    }
  }
  public void setEffectiveDateForDependencyCheck(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForDependencyCheck(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setServiceInternalIdForDependencyCheck(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForDependencyCheck(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setDependencyForDependencyCreate(DependencyObjectData data) {
    if (data != null) {
      addInput("Dependency", DependencyObjectHelper.toMap(data, new HashMap(), "Dependency").get("Dependency"));
    }
  }
  public void setDependencyForDependencyFind(DependencyObjectFilter data) {
    if (data != null) {
      addInput("Dependency", DependencyObjectHelper.toMap(data, new HashMap(), "Dependency").get("Dependency"));
    }
  }
  public void setDependencyForDependencyGet(DependencyObjectKeyData data) {
    if (data != null) {
      addInput("Dependency", DependencyObjectKeyHelper.toMap(data, new HashMap(), "Dependency").get("Dependency"));
    }
  }
  public void setAccountInternalIdForDependencyRetrieve(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setApplyExclusionsForDependencyRetrieve(Integer data) {
    if (data != null) {
      addInput("ApplyExclusions", data);
    }
  }
  public void setDependencyTypeForDependencyRetrieve(Integer data) {
    if (data != null) {
      addInput("DependencyType", data);
    }
  }
  public void setEffectiveDateForDependencyRetrieve(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setEntityForDependencyRetrieve(EntityObjectData data) {
    if (data != null) {
      addInput("Entity", EntityObjectHelper.toMap(data, new HashMap(), "Entity").get("Entity"));
    }
  }
  public void setServiceInternalIdForDependencyRetrieve(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForDependencyRetrieve(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setDependencyForDependencyUpdate(DependencyObjectData data) {
    if (data != null) {
      addInput("Dependency", DependencyObjectHelper.toMap(data, new HashMap(), "Dependency").get("Dependency"));
    }
  }
  public DependencyCheckOutputData getDependencyCheckOutputDataDependencyCheckOutputDataFromDependencyCheck() {
    return DependencyCheckOutputHelper.fromMap(outputMap);
  }
  public DependencyObjectData getDependencyObjectDataDependencyFromDependencyCreate() {
    return DependencyObjectHelper.fromMap(outputMap, "Dependency");
  }
  public DependencyObjectDataList getDependencyObjectDataDependencyFromDependencyFind() {
    return DependencyObjectHelper.fromMapList(outputMap, "DependencyList");
  }
  public DependencyObjectData getDependencyObjectDataDependencyFromDependencyGet() {
    return DependencyObjectHelper.fromMap(outputMap, "Dependency");
  }
  public DependencyObjectDataList getDependencyObjectDataDependencyFromDependencyRetrieve() {
    return DependencyObjectHelper.fromMapList(outputMap, "DependencyList");
  }
  public DependencyObjectData getDependencyObjectDataDependencyFromDependencyUpdate() {
    return DependencyObjectHelper.fromMap(outputMap, "Dependency");
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
  public void setApplyExclusions(Integer data) {
    if (data != null) {
      addInput("ApplyExclusions", data);
    }
  }
  /**
   @deprecated
   */
  public DependencyCheckOutputData getDependencyCheckOutputData() {
    return DependencyCheckOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setDependencyObjectFilter(DependencyObjectFilter data) {
    if (data != null) {
      addInput("Dependency", DependencyObjectHelper.toMap(data, new HashMap()).get("DependencyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDependencyObjectData(DependencyObjectData data) {
    if (data != null) {
      addInput("Dependency", DependencyObjectHelper.toMap(data, new HashMap()).get("DependencyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDependencyObjectKeyData(DependencyObjectKeyData data) {
    if (data != null) {
      addInput("Dependency", DependencyObjectKeyHelper.toMap(data, new HashMap()).get("DependencyObject"));
    }
  }
  /**
   @deprecated
   */
  public DependencyObjectDataList getDependencyObjectDataList() {
    return DependencyObjectHelper.fromMapList(outputMap, "DependencyList");
  }
  /**
   @deprecated
   */
  public DependencyObjectData getDependencyObjectData() {
    return DependencyObjectHelper.fromMap(outputMap, "Dependency");
  }
  /**
   @deprecated
   */
  public void setDependencyType(Integer data) {
    if (data != null) {
      addInput("DependencyType", data);
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
