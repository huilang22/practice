/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerRequest.java
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
public final class InvContainerRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvContainerRequest (String request, InvContainerRequestMethod method) {
    initialize(request, "InvContainer", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvContainerRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvContainerForInvContainerCreate(InvContainerObjectData data) {
    if (data != null) {
      addInput("InvContainer", InvContainerObjectHelper.toMap(data, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }
  public void setInvContainerForInvContainerDelete(InvContainerObjectData data) {
    if (data != null) {
      addInput("InvContainer", InvContainerObjectHelper.toMap(data, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }
  public void setInvContainerForInvContainerExtendedDataFind(InvContainerObjectKeyData data) {
    if (data != null) {
      addInput("InvContainer", InvContainerObjectKeyHelper.toMap(data, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }
  public void setInvContainerForInvContainerGet(InvContainerObjectKeyData data) {
    if (data != null) {
      addInput("InvContainer", InvContainerObjectKeyHelper.toMap(data, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }
  public void setInvContainerForInvContainerRelationsFind(InvContainerObjectFilter data) {
    if (data != null) {
      addInput("InvContainer", InvContainerObjectHelper.toMap(data, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }
  public void setInvContainerForInvContainerUpdate(InvContainerObjectData data) {
    if (data != null) {
      addInput("InvContainer", InvContainerObjectHelper.toMap(data, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }
  public InvContainerObjectData getInvContainerObjectDataInvContainerFromInvContainerCreate() {
    return InvContainerObjectHelper.fromMap(outputMap, "InvContainer");
  }
  public InvContainerEDObjectDataList getInvContainerEDObjectDataInvContainerExtendedDataFromInvContainerExtendedDataFind() {
    return InvContainerEDObjectHelper.fromMapList(outputMap, "InvContainerExtendedDataList");
  }
  public InvContainerObjectData getInvContainerObjectDataInvContainerFromInvContainerGet() {
    return InvContainerObjectHelper.fromMap(outputMap, "InvContainer");
  }
  public InvContainerObjectDataList getInvContainerObjectDataInvContainerFromInvContainerRelationsFind() {
    return InvContainerObjectHelper.fromMapList(outputMap, "InvContainerList");
  }
  /**
   @deprecated
   */
  public InvContainerEDObjectDataList getInvContainerEDObjectDataList() {
    return InvContainerEDObjectHelper.fromMapList(outputMap, "InvContainerList");
  }
  /**
   @deprecated
   */
  public void setInvContainerObjectFilter(InvContainerObjectFilter data) {
    if (data != null) {
      addInput("InvContainer", InvContainerObjectHelper.toMap(data, new HashMap()).get("InvContainerObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvContainerObjectData(InvContainerObjectData data) {
    if (data != null) {
      addInput("InvContainer", InvContainerObjectHelper.toMap(data, new HashMap()).get("InvContainerObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvContainerObjectKeyData(InvContainerObjectKeyData data) {
    if (data != null) {
      addInput("InvContainer", InvContainerObjectKeyHelper.toMap(data, new HashMap()).get("InvContainerObject"));
    }
  }
  /**
   @deprecated
   */
  public InvContainerObjectDataList getInvContainerObjectDataList() {
    return InvContainerObjectHelper.fromMapList(outputMap, "InvContainerList");
  }
  /**
   @deprecated
   */
  public Map  getInvContainerObjectExtendedData() {
    return InvContainerObjectHelper.fromMap(outputMap, "InvContainer").extendedData;
  }
  
  /**
   @deprecated
   */
  public InvContainerObjectData getInvContainerObjectData() {
    return InvContainerObjectHelper.fromMap(outputMap, "InvContainer");
  }
}
