/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationInvAssocRequest.java
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
public final class InvsLocationInvAssocRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsLocationInvAssocRequest (String request, InvsLocationInvAssocRequestMethod method) {
    initialize(request, "InvsLocationInvAssoc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsLocationInvAssocRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsLocationInvAssocForInvsLocationInvAssocCreate(InvsLocationInvAssocObjectData data) {
    if (data != null) {
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(data, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }
  public void setInvsLocationInvAssocForInvsLocationInvAssocFind(InvsLocationInvAssocObjectFilter data) {
    if (data != null) {
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(data, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }
  public void setInvsLocationInvAssocForInvsLocationInvAssocGet(InvsLocationInvAssocObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectKeyHelper.toMap(data, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }
  public void setInvsLocationInvAssocForInvsLocationInvAssocUpdate(InvsLocationInvAssocObjectData data) {
    if (data != null) {
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(data, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }
  public InvsLocationInvAssocObjectData getInvsLocationInvAssocObjectDataInvsLocationInvAssocFromInvsLocationInvAssocCreate() {
    return InvsLocationInvAssocObjectHelper.fromMap(outputMap, "InvsLocationInvAssoc");
  }
  public InvsLocationInvAssocObjectDataList getInvsLocationInvAssocObjectDataInvsLocationInvAssocFromInvsLocationInvAssocFind() {
    return InvsLocationInvAssocObjectHelper.fromMapList(outputMap, "InvsLocationInvAssocList");
  }
  public InvsLocationInvAssocObjectData getInvsLocationInvAssocObjectDataInvsLocationInvAssocFromInvsLocationInvAssocGet() {
    return InvsLocationInvAssocObjectHelper.fromMap(outputMap, "InvsLocationInvAssoc");
  }
  public InvsLocationInvAssocObjectData getInvsLocationInvAssocObjectDataInvsLocationInvAssocFromInvsLocationInvAssocUpdate() {
    return InvsLocationInvAssocObjectHelper.fromMap(outputMap, "InvsLocationInvAssoc");
  }
  /**
   @deprecated
   */
  public void setInvsLocationInvAssocObjectFilter(InvsLocationInvAssocObjectFilter data) {
    if (data != null) {
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(data, new HashMap()).get("InvsLocationInvAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLocationInvAssocObjectData(InvsLocationInvAssocObjectData data) {
    if (data != null) {
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(data, new HashMap()).get("InvsLocationInvAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLocationInvAssocObjectKeyData(InvsLocationInvAssocObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectKeyHelper.toMap(data, new HashMap()).get("InvsLocationInvAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsLocationInvAssocObjectDataList getInvsLocationInvAssocObjectDataList() {
    return InvsLocationInvAssocObjectHelper.fromMapList(outputMap, "InvsLocationInvAssocList");
  }
  /**
   @deprecated
   */
  public InvsLocationInvAssocObjectData getInvsLocationInvAssocObjectData() {
    return InvsLocationInvAssocObjectHelper.fromMap(outputMap, "InvsLocationInvAssoc");
  }
}
