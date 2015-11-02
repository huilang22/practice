/*
 * Generated code DO NOT EDIT
 * Generated file: InvdViewsRequest.java
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
public final class InvdViewsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvdViewsRequest (String request, InvdViewsRequestMethod method) {
    initialize(request, "InvdViews", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvdViewsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvdViewsForInvdViewsCreate(InvdViewsObjectData data) {
    if (data != null) {
      addInput("InvdViews", InvdViewsObjectHelper.toMap(data, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }
  public void setInvdViewsForInvdViewsDelete(InvdViewsObjectKeyData data) {
    if (data != null) {
      addInput("InvdViews", InvdViewsObjectKeyHelper.toMap(data, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }
  public void setInvdViewsForInvdViewsFind(InvdViewsObjectFilter data) {
    if (data != null) {
      addInput("InvdViews", InvdViewsObjectHelper.toMap(data, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }
  public void setInvdViewsForInvdViewsGet(InvdViewsObjectKeyData data) {
    if (data != null) {
      addInput("InvdViews", InvdViewsObjectKeyHelper.toMap(data, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }
  public void setInvdViewsForInvdViewsGetLatest(InvdViewsObjectData data) {
    if (data != null) {
      addInput("InvdViews", InvdViewsObjectHelper.toMap(data, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }
  public void setInvdViewsForInvdViewsUpdate(InvdViewsObjectData data) {
    if (data != null) {
      addInput("InvdViews", InvdViewsObjectHelper.toMap(data, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }
  public InvdViewsObjectData getInvdViewsObjectDataInvdViewsFromInvdViewsCreate() {
    return InvdViewsObjectHelper.fromMap(outputMap, "InvdViews");
  }
  public InvdViewsObjectDataList getInvdViewsObjectDataInvdViewsFromInvdViewsFind() {
    return InvdViewsObjectHelper.fromMapList(outputMap, "InvdViewsList");
  }
  public InvdViewsObjectData getInvdViewsObjectDataInvdViewsFromInvdViewsGet() {
    return InvdViewsObjectHelper.fromMap(outputMap, "InvdViews");
  }
  public InvdViewsObjectData getInvdViewsObjectDataInvdViewsFromInvdViewsGetLatest() {
    return InvdViewsObjectHelper.fromMap(outputMap, "InvdViews");
  }
  public InvdViewsObjectData getInvdViewsObjectDataInvdViewsFromInvdViewsUpdate() {
    return InvdViewsObjectHelper.fromMap(outputMap, "InvdViews");
  }
  /**
   @deprecated
   */
  public void setInvdViewsObjectFilter(InvdViewsObjectFilter data) {
    if (data != null) {
      addInput("InvdViews", InvdViewsObjectHelper.toMap(data, new HashMap()).get("InvdViewsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdViewsObjectData(InvdViewsObjectData data) {
    if (data != null) {
      addInput("InvdViews", InvdViewsObjectHelper.toMap(data, new HashMap()).get("InvdViewsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdViewsObjectKeyData(InvdViewsObjectKeyData data) {
    if (data != null) {
      addInput("InvdViews", InvdViewsObjectKeyHelper.toMap(data, new HashMap()).get("InvdViewsObject"));
    }
  }
  /**
   @deprecated
   */
  public InvdViewsObjectDataList getInvdViewsObjectDataList() {
    return InvdViewsObjectHelper.fromMapList(outputMap, "InvdViewsList");
  }
  /**
   @deprecated
   */
  public InvdViewsObjectData getInvdViewsObjectData() {
    return InvdViewsObjectHelper.fromMap(outputMap, "InvdViews");
  }
}
