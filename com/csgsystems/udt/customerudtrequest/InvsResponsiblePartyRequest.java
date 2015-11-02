/*
 * Generated code DO NOT EDIT
 * Generated file: InvsResponsiblePartyRequest.java
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
public final class InvsResponsiblePartyRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsResponsiblePartyRequest (String request, InvsResponsiblePartyRequestMethod method) {
    initialize(request, "InvsResponsibleParty", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsResponsiblePartyRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsResponsiblePartyForInvsResponsiblePartyCreate(InvsResponsiblePartyObjectData data) {
    if (data != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(data, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }
  public void setInvsResponsiblePartyForInvsResponsiblePartyDelete(InvsResponsiblePartyObjectKeyData data) {
    if (data != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectKeyHelper.toMap(data, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }
  public void setInvsResponsiblePartyForInvsResponsiblePartyFind(InvsResponsiblePartyObjectFilter data) {
    if (data != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(data, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }
  public void setInvsResponsiblePartyForInvsResponsiblePartyGet(InvsResponsiblePartyObjectKeyData data) {
    if (data != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectKeyHelper.toMap(data, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }
  public void setInvsResponsiblePartyForInvsResponsiblePartyUpdate(InvsResponsiblePartyObjectData data) {
    if (data != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(data, new HashMap(), "InvsResponsibleParty").get("InvsResponsibleParty"));
    }
  }
  public InvsResponsiblePartyObjectData getInvsResponsiblePartyObjectDataInvsResponsiblePartyFromInvsResponsiblePartyCreate() {
    return InvsResponsiblePartyObjectHelper.fromMap(outputMap, "InvsResponsibleParty");
  }
  public InvsResponsiblePartyObjectData getInvsResponsiblePartyObjectDataInvsResponsiblePartyFromInvsResponsiblePartyDelete() {
    return InvsResponsiblePartyObjectHelper.fromMap(outputMap, "InvsResponsibleParty");
  }
  public InvsResponsiblePartyObjectDataList getInvsResponsiblePartyObjectDataInvsResponsiblePartyFromInvsResponsiblePartyFind() {
    return InvsResponsiblePartyObjectHelper.fromMapList(outputMap, "InvsResponsiblePartyList");
  }
  public InvsResponsiblePartyObjectData getInvsResponsiblePartyObjectDataInvsResponsiblePartyFromInvsResponsiblePartyGet() {
    return InvsResponsiblePartyObjectHelper.fromMap(outputMap, "InvsResponsibleParty");
  }
  public InvsResponsiblePartyObjectData getInvsResponsiblePartyObjectDataInvsResponsiblePartyFromInvsResponsiblePartyUpdate() {
    return InvsResponsiblePartyObjectHelper.fromMap(outputMap, "InvsResponsibleParty");
  }
  /**
   @deprecated
   */
  public void setInvsResponsiblePartyObjectFilter(InvsResponsiblePartyObjectFilter data) {
    if (data != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(data, new HashMap()).get("InvsResponsiblePartyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsResponsiblePartyObjectData(InvsResponsiblePartyObjectData data) {
    if (data != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectHelper.toMap(data, new HashMap()).get("InvsResponsiblePartyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsResponsiblePartyObjectKeyData(InvsResponsiblePartyObjectKeyData data) {
    if (data != null) {
      addInput("InvsResponsibleParty", InvsResponsiblePartyObjectKeyHelper.toMap(data, new HashMap()).get("InvsResponsiblePartyObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsResponsiblePartyObjectDataList getInvsResponsiblePartyObjectDataList() {
    return InvsResponsiblePartyObjectHelper.fromMapList(outputMap, "InvsResponsiblePartyList");
  }
  /**
   @deprecated
   */
  public InvsResponsiblePartyObjectData getInvsResponsiblePartyObjectData() {
    return InvsResponsiblePartyObjectHelper.fromMap(outputMap, "InvsResponsibleParty");
  }
}
