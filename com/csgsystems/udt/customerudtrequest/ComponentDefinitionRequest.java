/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDefinitionRequest.java
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
public final class ComponentDefinitionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ComponentDefinitionRequest (String request, ComponentDefinitionRequestMethod method) {
    initialize(request, "ComponentDefinition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ComponentDefinitionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setComponentDefinitionForComponentDefinitionCreate(CDObjectData data) {
    if (data != null) {
      addInput("ComponentDefinition", CDObjectHelper.toMap(data, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }
  public void setComponentDefinitionForComponentDefinitionDelete(CDObjectKeyData data) {
    if (data != null) {
      addInput("ComponentDefinition", CDObjectKeyHelper.toMap(data, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }
  public void setComponentDefinitionForComponentDefinitionFind(CDObjectFilter data) {
    if (data != null) {
      addInput("ComponentDefinition", CDObjectHelper.toMap(data, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }
  public void setComponentDefinitionForComponentDefinitionGet(CDObjectKeyData data) {
    if (data != null) {
      addInput("ComponentDefinition", CDObjectKeyHelper.toMap(data, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }
  public void setComponentForComponentDefinitionPrice(CDObjectKeyData data) {
    if (data != null) {
      addInput("Component", CDObjectKeyHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setRatingKeyForComponentDefinitionPrice(RatingKeyObjectData data) {
    if (data != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(data, new HashMap(), "RatingKey").get("RatingKey"));
    }
  }
  public void setComponentDefinitionForComponentDefinitionUpdate(CDObjectData data) {
    if (data != null) {
      addInput("ComponentDefinition", CDObjectHelper.toMap(data, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }
  public CDObjectData getCDObjectDataComponentDefinitionFromComponentDefinitionCreate() {
    return CDObjectHelper.fromMap(outputMap, "ComponentDefinition");
  }
  public CDObjectData getCDObjectDataComponentDefinitionFromComponentDefinitionDelete() {
    return CDObjectHelper.fromMap(outputMap, "ComponentDefinition");
  }
  public CDObjectDataList getCDObjectDataComponentDefinitionFromComponentDefinitionFind() {
    return CDObjectHelper.fromMapList(outputMap, "ComponentDefinitionList");
  }
  public CDObjectData getCDObjectDataComponentDefinitionFromComponentDefinitionGet() {
    return CDObjectHelper.fromMap(outputMap, "ComponentDefinition");
  }
  public BigInteger getBigIntegerCdPriceFromComponentDefinitionPrice() {
    return (BigInteger)outputMap.get("CdPrice");
  }
  public CDObjectData getCDObjectDataComponentDefinitionFromComponentDefinitionUpdate() {
    return CDObjectHelper.fromMap(outputMap, "ComponentDefinition");
  }
  /**
   @deprecated
   */
  public void setCDObjectFilter(CDObjectFilter data) {
    if (data != null) {
      addInput("CD", CDObjectHelper.toMap(data, new HashMap()).get("CDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCDObjectData(CDObjectData data) {
    if (data != null) {
      addInput("ComponentDefinition", CDObjectHelper.toMap(data, new HashMap()).get("CDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCDObjectKeyData(CDObjectKeyData data) {
    if (data != null) {
      addInput("CD", CDObjectKeyHelper.toMap(data, new HashMap()).get("CDObject"));
    }
  }
  /**
   @deprecated
   */
  public CDObjectDataList getCDObjectDataList() {
    return CDObjectHelper.fromMapList(outputMap, "CDList");
  }
  /**
   @deprecated
   */
  public CDObjectData getCDObjectData() {
    return CDObjectHelper.fromMap(outputMap, "ComponentDefinition");
  }
  /**
   @deprecated
   */
  public void setRatingKeyObjectData(RatingKeyObjectData data) {
    if (data != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(data, new HashMap()).get("RatingKeyObject"));
    }
  }
  /**
   @deprecated
   */
  public BigInteger getCdPrice() {
    return (BigInteger)outputMap.get("CdPrice");
  }
}
