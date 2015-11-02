/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrDefinitionRequest.java
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
public final class UnitCrDefinitionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UnitCrDefinitionRequest (String request, UnitCrDefinitionRequestMethod method) {
    initialize(request, "UnitCrDefinition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UnitCrDefinitionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUnitCrDefinitionForUnitCrDefinitionCreate(UnitCrDefinitionObjectData data) {
    if (data != null) {
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(data, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }
  public void setLanguageCodeForUnitCrDefinitionFindByPlan(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setPlanIdCreditForUnitCrDefinitionFindByPlan(Integer data) {
    if (data != null) {
      addInput("PlanIdCredit", data);
    }
  }
  public void setUnitCrDefinitionForUnitCrDefinitionFind(UnitCrDefinitionObjectFilter data) {
    if (data != null) {
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(data, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }
  public void setUnitCrDefinitionForUnitCrDefinitionGet(UnitCrDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrDefinition", UnitCrDefinitionObjectKeyHelper.toMap(data, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }
  public void setUnitCrDefinitionForUnitCrDefinitionUpdate(UnitCrDefinitionObjectData data) {
    if (data != null) {
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(data, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }
  public UnitCrDefinitionObjectData getUnitCrDefinitionObjectDataUnitCrDefinitionFromUnitCrDefinitionCreate() {
    return UnitCrDefinitionObjectHelper.fromMap(outputMap, "UnitCrDefinition");
  }
  public UnitCrDefinitionObjectDataList getUnitCrDefinitionObjectDataUnitCrDefinitionFromUnitCrDefinitionFindByPlan() {
    return UnitCrDefinitionObjectHelper.fromMapList(outputMap, "UnitCrDefinitionList");
  }
  public UnitCrDefinitionObjectDataList getUnitCrDefinitionObjectDataUnitCrDefinitionFromUnitCrDefinitionFind() {
    return UnitCrDefinitionObjectHelper.fromMapList(outputMap, "UnitCrDefinitionList");
  }
  public UnitCrDefinitionObjectData getUnitCrDefinitionObjectDataUnitCrDefinitionFromUnitCrDefinitionGet() {
    return UnitCrDefinitionObjectHelper.fromMap(outputMap, "UnitCrDefinition");
  }
  public UnitCrDefinitionObjectData getUnitCrDefinitionObjectDataUnitCrDefinitionFromUnitCrDefinitionUpdate() {
    return UnitCrDefinitionObjectHelper.fromMap(outputMap, "UnitCrDefinition");
  }
  /**
   @deprecated
   */
  public void setLanguageCode(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setPlanIdCredit(Integer data) {
    if (data != null) {
      addInput("PlanIdCredit", data);
    }
  }
  /**
   @deprecated
   */
  public void setUnitCrDefinitionObjectFilter(UnitCrDefinitionObjectFilter data) {
    if (data != null) {
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(data, new HashMap()).get("UnitCrDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitCrDefinitionObjectData(UnitCrDefinitionObjectData data) {
    if (data != null) {
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(data, new HashMap()).get("UnitCrDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitCrDefinitionObjectKeyData(UnitCrDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrDefinition", UnitCrDefinitionObjectKeyHelper.toMap(data, new HashMap()).get("UnitCrDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public UnitCrDefinitionObjectDataList getUnitCrDefinitionObjectDataList() {
    return UnitCrDefinitionObjectHelper.fromMapList(outputMap, "UnitCrDefinitionList");
  }
  /**
   @deprecated
   */
  public UnitCrDefinitionObjectData getUnitCrDefinitionObjectData() {
    return UnitCrDefinitionObjectHelper.fromMap(outputMap, "UnitCrDefinition");
  }
}
