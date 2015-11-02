/*
 * Generated code DO NOT EDIT
 * Generated file: InvsInterfaceRequest.java
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
public final class InvsInterfaceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsInterfaceRequest (String request, InvsInterfaceRequestMethod method) {
    initialize(request, "InvsInterface", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsInterfaceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsInterfaceForInvsInterfaceCreate(InvsInterfaceObjectData data) {
    if (data != null) {
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(data, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }
  public void setInvsInterfaceForInvsInterfaceFind(InvsInterfaceObjectFilter data) {
    if (data != null) {
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(data, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }
  public void setInvsInterfaceForInvsInterfaceGet(InvsInterfaceObjectKeyData data) {
    if (data != null) {
      addInput("InvsInterface", InvsInterfaceObjectKeyHelper.toMap(data, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }
  public void setInvsInterfaceForInvsInterfaceUpdate(InvsInterfaceObjectData data) {
    if (data != null) {
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(data, new HashMap(), "InvsInterface").get("InvsInterface"));
    }
  }
  public InvsInterfaceObjectData getInvsInterfaceObjectDataInvsInterfaceFromInvsInterfaceCreate() {
    return InvsInterfaceObjectHelper.fromMap(outputMap, "InvsInterface");
  }
  public InvsInterfaceObjectDataList getInvsInterfaceObjectDataInvsInterfaceFromInvsInterfaceFind() {
    return InvsInterfaceObjectHelper.fromMapList(outputMap, "InvsInterfaceList");
  }
  public InvsInterfaceObjectData getInvsInterfaceObjectDataInvsInterfaceFromInvsInterfaceGet() {
    return InvsInterfaceObjectHelper.fromMap(outputMap, "InvsInterface");
  }
  public InvsInterfaceObjectData getInvsInterfaceObjectDataInvsInterfaceFromInvsInterfaceUpdate() {
    return InvsInterfaceObjectHelper.fromMap(outputMap, "InvsInterface");
  }
  /**
   @deprecated
   */
  public void setInvsInterfaceObjectFilter(InvsInterfaceObjectFilter data) {
    if (data != null) {
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(data, new HashMap()).get("InvsInterfaceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsInterfaceObjectData(InvsInterfaceObjectData data) {
    if (data != null) {
      addInput("InvsInterface", InvsInterfaceObjectHelper.toMap(data, new HashMap()).get("InvsInterfaceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsInterfaceObjectKeyData(InvsInterfaceObjectKeyData data) {
    if (data != null) {
      addInput("InvsInterface", InvsInterfaceObjectKeyHelper.toMap(data, new HashMap()).get("InvsInterfaceObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsInterfaceObjectDataList getInvsInterfaceObjectDataList() {
    return InvsInterfaceObjectHelper.fromMapList(outputMap, "InvsInterfaceList");
  }
  /**
   @deprecated
   */
  public InvsInterfaceObjectData getInvsInterfaceObjectData() {
    return InvsInterfaceObjectHelper.fromMap(outputMap, "InvsInterface");
  }
}
