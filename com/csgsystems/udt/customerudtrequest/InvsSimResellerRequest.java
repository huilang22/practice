/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimResellerRequest.java
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
public final class InvsSimResellerRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsSimResellerRequest (String request, InvsSimResellerRequestMethod method) {
    initialize(request, "InvsSimReseller", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsSimResellerRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsSimResellerForInvsSimResellerCreate(InvsSimResellerObjectData data) {
    if (data != null) {
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(data, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }
  public void setInvsSimResellerForInvsSimResellerFind(InvsSimResellerObjectFilter data) {
    if (data != null) {
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(data, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }
  public void setInvsSimResellerForInvsSimResellerGet(InvsSimResellerObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimReseller", InvsSimResellerObjectKeyHelper.toMap(data, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }
  public void setInvsSimResellerForInvsSimResellerUpdate(InvsSimResellerObjectData data) {
    if (data != null) {
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(data, new HashMap(), "InvsSimReseller").get("InvsSimReseller"));
    }
  }
  public InvsSimResellerObjectData getInvsSimResellerObjectDataInvsSimResellerFromInvsSimResellerCreate() {
    return InvsSimResellerObjectHelper.fromMap(outputMap, "InvsSimReseller");
  }
  public InvsSimResellerObjectDataList getInvsSimResellerObjectDataInvsSimResellerFromInvsSimResellerFind() {
    return InvsSimResellerObjectHelper.fromMapList(outputMap, "InvsSimResellerList");
  }
  public InvsSimResellerObjectData getInvsSimResellerObjectDataInvsSimResellerFromInvsSimResellerGet() {
    return InvsSimResellerObjectHelper.fromMap(outputMap, "InvsSimReseller");
  }
  public InvsSimResellerObjectData getInvsSimResellerObjectDataInvsSimResellerFromInvsSimResellerUpdate() {
    return InvsSimResellerObjectHelper.fromMap(outputMap, "InvsSimReseller");
  }
  /**
   @deprecated
   */
  public void setInvsSimResellerObjectFilter(InvsSimResellerObjectFilter data) {
    if (data != null) {
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(data, new HashMap()).get("InvsSimResellerObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimResellerObjectData(InvsSimResellerObjectData data) {
    if (data != null) {
      addInput("InvsSimReseller", InvsSimResellerObjectHelper.toMap(data, new HashMap()).get("InvsSimResellerObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimResellerObjectKeyData(InvsSimResellerObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimReseller", InvsSimResellerObjectKeyHelper.toMap(data, new HashMap()).get("InvsSimResellerObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsSimResellerObjectDataList getInvsSimResellerObjectDataList() {
    return InvsSimResellerObjectHelper.fromMapList(outputMap, "InvsSimResellerList");
  }
  /**
   @deprecated
   */
  public InvsSimResellerObjectData getInvsSimResellerObjectData() {
    return InvsSimResellerObjectHelper.fromMap(outputMap, "InvsSimReseller");
  }
}
