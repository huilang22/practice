/*
 * Generated code DO NOT EDIT
 * Generated file: BusinessDayDefinitionRequest.java
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
public final class BusinessDayDefinitionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BusinessDayDefinitionRequest (String request, BusinessDayDefinitionRequestMethod method) {
    initialize(request, "BusinessDayDefinition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BusinessDayDefinitionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBDDcheckInForBusinessDayDefinitionCheck(Date data) {
    if (data != null) {
      addInput("BDDcheckIn", data);
    }
  }
  public void setBusinessDayDefinitionForBusinessDayDefinitionCreate(BusinessDayDefinitionObjectData data) {
    if (data != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(data, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }
  public void setBusinessDayDefinitionForBusinessDayDefinitionDelete(BusinessDayDefinitionObjectData data) {
    if (data != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(data, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }
  public void setBusinessDayDefinitionForBusinessDayDefinitionFind(BusinessDayDefinitionObjectFilter data) {
    if (data != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(data, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }
  public void setBusinessDayDefinitionForBusinessDayDefinitionGet(BusinessDayDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }
  public void setBusinessDayDefinitionForBusinessDayDefinitionUpdate(BusinessDayDefinitionObjectData data) {
    if (data != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(data, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }
  public String getStringBDDcheckOutFromBusinessDayDefinitionCheck() {
    return (String)outputMap.get("BDDcheckOut");
  }
  public BusinessDayDefinitionObjectData getBusinessDayDefinitionObjectDataBusinessDayDefinitionFromBusinessDayDefinitionCreate() {
    return BusinessDayDefinitionObjectHelper.fromMap(outputMap, "BusinessDayDefinition");
  }
  public BusinessDayDefinitionObjectData getBusinessDayDefinitionObjectDataBusinessDayDefinitionFromBusinessDayDefinitionDelete() {
    return BusinessDayDefinitionObjectHelper.fromMap(outputMap, "BusinessDayDefinition");
  }
  public BusinessDayDefinitionObjectDataList getBusinessDayDefinitionObjectDataBusinessDayDefinitionFromBusinessDayDefinitionFind() {
    return BusinessDayDefinitionObjectHelper.fromMapList(outputMap, "BusinessDayDefinitionList");
  }
  public BusinessDayDefinitionObjectData getBusinessDayDefinitionObjectDataBusinessDayDefinitionFromBusinessDayDefinitionGet() {
    return BusinessDayDefinitionObjectHelper.fromMap(outputMap, "BusinessDayDefinition");
  }
  public BusinessDayDefinitionObjectData getBusinessDayDefinitionObjectDataBusinessDayDefinitionFromBusinessDayDefinitionUpdate() {
    return BusinessDayDefinitionObjectHelper.fromMap(outputMap, "BusinessDayDefinition");
  }
  /**
   @deprecated
   */
  public void setBDDcheckIn(Date data) {
    if (data != null) {
      addInput("BDDcheckIn", data);
    }
  }
  /**
   @deprecated
   */
  public String getBDDcheckOut() {
    return (String)outputMap.get("BDDcheckOut");
  }
  /**
   @deprecated
   */
  public void setBusinessDayDefinitionObjectFilter(BusinessDayDefinitionObjectFilter data) {
    if (data != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(data, new HashMap()).get("BusinessDayDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBusinessDayDefinitionObjectData(BusinessDayDefinitionObjectData data) {
    if (data != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(data, new HashMap()).get("BusinessDayDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBusinessDayDefinitionObjectKeyData(BusinessDayDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectKeyHelper.toMap(data, new HashMap()).get("BusinessDayDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public BusinessDayDefinitionObjectDataList getBusinessDayDefinitionObjectDataList() {
    return BusinessDayDefinitionObjectHelper.fromMapList(outputMap, "BusinessDayDefinitionList");
  }
  /**
   @deprecated
   */
  public BusinessDayDefinitionObjectData getBusinessDayDefinitionObjectData() {
    return BusinessDayDefinitionObjectHelper.fromMap(outputMap, "BusinessDayDefinition");
  }
}
