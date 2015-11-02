/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentActionRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvsEquipmentActionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsEquipmentActionRequest (String request, InvsEquipmentActionRequestMethod method) {
    initialize(request, "InvsEquipmentAction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsEquipmentActionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsEquipmentActionForInvsEquipmentActionBaseFind(InvsEquipmentActionBaseObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionBaseObjectHelper.toMap(data, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }
  public void setInvsEquipmentActionForInvsEquipmentActionCreate(InvsEquipmentActionObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(data, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }
  public void setInvsEquipmentActionForInvsEquipmentActionDelete(InvsEquipmentActionObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(data, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }
  public void setInvsEquipmentActionForInvsEquipmentActionFind(InvsEquipmentActionObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(data, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }
  public void setInvsEquipmentActionForInvsEquipmentActionGet(InvsEquipmentActionObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectKeyHelper.toMap(data, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }
  public void setInvsEquipmentActionForInvsEquipmentActionUpdate(InvsEquipmentActionObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(data, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }
  public InvsEquipmentActionBaseObjectDataList getInvsEquipmentActionBaseObjectDataInvsEquipmentActionFromInvsEquipmentActionBaseFind() {
    return InvsEquipmentActionBaseObjectHelper.fromMapList(outputMap, "InvsEquipmentActionList");
  }
  public InvsEquipmentActionObjectData getInvsEquipmentActionObjectDataInvsEquipmentActionFromInvsEquipmentActionCreate() {
    return InvsEquipmentActionObjectHelper.fromMap(outputMap, "InvsEquipmentAction");
  }
  public InvsEquipmentActionObjectData getInvsEquipmentActionObjectDataInvsEquipmentActionFromInvsEquipmentActionDelete() {
    return InvsEquipmentActionObjectHelper.fromMap(outputMap, "InvsEquipmentAction");
  }
  public InvsEquipmentActionObjectDataList getInvsEquipmentActionObjectDataInvsEquipmentActionFromInvsEquipmentActionFind() {
    return InvsEquipmentActionObjectHelper.fromMapList(outputMap, "InvsEquipmentActionList");
  }
  public InvsEquipmentActionObjectData getInvsEquipmentActionObjectDataInvsEquipmentActionFromInvsEquipmentActionGet() {
    return InvsEquipmentActionObjectHelper.fromMap(outputMap, "InvsEquipmentAction");
  }
  public InvsEquipmentActionObjectData getInvsEquipmentActionObjectDataInvsEquipmentActionFromInvsEquipmentActionUpdate() {
    return InvsEquipmentActionObjectHelper.fromMap(outputMap, "InvsEquipmentAction");
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentActionBaseObjectFilter(InvsEquipmentActionBaseObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionBaseObjectHelper.toMap(data, new HashMap()).get("InvsEquipmentActionBaseObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsEquipmentActionBaseObjectDataList getInvsEquipmentActionBaseObjectDataList() {
    return InvsEquipmentActionBaseObjectHelper.fromMapList(outputMap, "InvsEquipmentActionList");
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentActionObjectFilter(InvsEquipmentActionObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(data, new HashMap()).get("InvsEquipmentActionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentActionObjectData(InvsEquipmentActionObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(data, new HashMap()).get("InvsEquipmentActionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentActionObjectKeyData(InvsEquipmentActionObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectKeyHelper.toMap(data, new HashMap()).get("InvsEquipmentActionObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsEquipmentActionObjectDataList getInvsEquipmentActionObjectDataList() {
    return InvsEquipmentActionObjectHelper.fromMapList(outputMap, "InvsEquipmentActionList");
  }
  /**
   @deprecated
   */
  public InvsEquipmentActionObjectData getInvsEquipmentActionObjectData() {
    return InvsEquipmentActionObjectHelper.fromMap(outputMap, "InvsEquipmentAction");
  }
}
