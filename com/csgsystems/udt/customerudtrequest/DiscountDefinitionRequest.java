/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountDefinitionRequest.java
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
public final class DiscountDefinitionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DiscountDefinitionRequest (String request, DiscountDefinitionRequestMethod method) {
    initialize(request, "DiscountDefinition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DiscountDefinitionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDiscountDefinitionForDiscountDefinitionCreate(DiscountDefinitionObjectData data) {
    if (data != null) {
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(data, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }
  public void setLanguageCodeForDiscountDefinitionFindByPlan(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setPlanIdDiscountForDiscountDefinitionFindByPlan(Integer data) {
    if (data != null) {
      addInput("PlanIdDiscount", data);
    }
  }
  public void setDiscountDefinitionForDiscountDefinitionFind(DiscountDefinitionObjectFilter data) {
    if (data != null) {
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(data, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }
  public void setDiscountDefinitionForDiscountDefinitionGet(DiscountDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("DiscountDefinition", DiscountDefinitionObjectKeyHelper.toMap(data, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }
  public void setDiscountDefinitionForDiscountDefinitionUpdate(DiscountDefinitionObjectData data) {
    if (data != null) {
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(data, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }
  public DiscountDefinitionObjectData getDiscountDefinitionObjectDataDiscountDefinitionFromDiscountDefinitionCreate() {
    return DiscountDefinitionObjectHelper.fromMap(outputMap, "DiscountDefinition");
  }
  public DiscountDefinitionObjectDataList getDiscountDefinitionObjectDataDiscountDefinitionFromDiscountDefinitionFindByPlan() {
    return DiscountDefinitionObjectHelper.fromMapList(outputMap, "DiscountDefinitionList");
  }
  public DiscountDefinitionObjectDataList getDiscountDefinitionObjectDataDiscountDefinitionFromDiscountDefinitionFind() {
    return DiscountDefinitionObjectHelper.fromMapList(outputMap, "DiscountDefinitionList");
  }
  public DiscountDefinitionObjectData getDiscountDefinitionObjectDataDiscountDefinitionFromDiscountDefinitionGet() {
    return DiscountDefinitionObjectHelper.fromMap(outputMap, "DiscountDefinition");
  }
  public DiscountDefinitionObjectData getDiscountDefinitionObjectDataDiscountDefinitionFromDiscountDefinitionUpdate() {
    return DiscountDefinitionObjectHelper.fromMap(outputMap, "DiscountDefinition");
  }
  /**
   @deprecated
   */
  public void setDiscountDefinitionObjectFilter(DiscountDefinitionObjectFilter data) {
    if (data != null) {
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(data, new HashMap()).get("DiscountDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDiscountDefinitionObjectData(DiscountDefinitionObjectData data) {
    if (data != null) {
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(data, new HashMap()).get("DiscountDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDiscountDefinitionObjectKeyData(DiscountDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("DiscountDefinition", DiscountDefinitionObjectKeyHelper.toMap(data, new HashMap()).get("DiscountDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public DiscountDefinitionObjectDataList getDiscountDefinitionObjectDataList() {
    return DiscountDefinitionObjectHelper.fromMapList(outputMap, "DiscountDefinitionList");
  }
  /**
   @deprecated
   */
  public DiscountDefinitionObjectData getDiscountDefinitionObjectData() {
    return DiscountDefinitionObjectHelper.fromMap(outputMap, "DiscountDefinition");
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
  public void setPlanIdDiscount(Integer data) {
    if (data != null) {
      addInput("PlanIdDiscount", data);
    }
  }
}
