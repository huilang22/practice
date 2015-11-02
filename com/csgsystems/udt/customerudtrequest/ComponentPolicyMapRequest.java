/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentPolicyMapRequest.java
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
public final class ComponentPolicyMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ComponentPolicyMapRequest (String request, ComponentPolicyMapRequestMethod method) {
    initialize(request, "ComponentPolicyMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ComponentPolicyMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setComponentPolicyMapForComponentPolicyMapCreate(ComponentPolicyMapObjectData data) {
    if (data != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(data, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }
  public void setComponentPolicyMapForComponentPolicyMapFind(ComponentPolicyMapObjectFilter data) {
    if (data != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(data, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }
  public void setComponentPolicyMapForComponentPolicyMapGet(ComponentPolicyMapObjectKeyData data) {
    if (data != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectKeyHelper.toMap(data, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }
  public void setComponentPolicyMapForComponentPolicyMapUpdate(ComponentPolicyMapObjectData data) {
    if (data != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(data, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }
  public void setComponentPolicyMapForPolicyTypeFind(ComponentPolicyMapObjectFilter data) {
    if (data != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(data, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }
  public ComponentPolicyMapObjectData getComponentPolicyMapObjectDataComponentPolicyMapFromComponentPolicyMapCreate() {
    return ComponentPolicyMapObjectHelper.fromMap(outputMap, "ComponentPolicyMap");
  }
  public ComponentPolicyMapObjectDataList getComponentPolicyMapObjectDataComponentPolicyMapFromComponentPolicyMapFind() {
    return ComponentPolicyMapObjectHelper.fromMapList(outputMap, "ComponentPolicyMapList");
  }
  public ComponentPolicyMapObjectData getComponentPolicyMapObjectDataComponentPolicyMapFromComponentPolicyMapGet() {
    return ComponentPolicyMapObjectHelper.fromMap(outputMap, "ComponentPolicyMap");
  }
  public ComponentPolicyMapObjectData getComponentPolicyMapObjectDataComponentPolicyMapFromComponentPolicyMapUpdate() {
    return ComponentPolicyMapObjectHelper.fromMap(outputMap, "ComponentPolicyMap");
  }
  public ComponentPolicyMapObjectDataList getComponentPolicyMapObjectDataComponentPolicyMapFromPolicyTypeFind() {
    return ComponentPolicyMapObjectHelper.fromMapList(outputMap, "ComponentPolicyMapList");
  }
  /**
   @deprecated
   */
  public void setComponentPolicyMapObjectFilter(ComponentPolicyMapObjectFilter data) {
    if (data != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(data, new HashMap()).get("ComponentPolicyMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setComponentPolicyMapObjectData(ComponentPolicyMapObjectData data) {
    if (data != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(data, new HashMap()).get("ComponentPolicyMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setComponentPolicyMapObjectKeyData(ComponentPolicyMapObjectKeyData data) {
    if (data != null) {
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectKeyHelper.toMap(data, new HashMap()).get("ComponentPolicyMapObject"));
    }
  }
  /**
   @deprecated
   */
  public ComponentPolicyMapObjectDataList getComponentPolicyMapObjectDataList() {
    return ComponentPolicyMapObjectHelper.fromMapList(outputMap, "ComponentPolicyMapList");
  }
  /**
   @deprecated
   */
  public ComponentPolicyMapObjectData getComponentPolicyMapObjectData() {
    return ComponentPolicyMapObjectHelper.fromMap(outputMap, "ComponentPolicyMap");
  }
}
