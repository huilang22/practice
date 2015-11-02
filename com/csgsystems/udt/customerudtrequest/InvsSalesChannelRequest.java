/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSalesChannelRequest.java
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
public final class InvsSalesChannelRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsSalesChannelRequest (String request, InvsSalesChannelRequestMethod method) {
    initialize(request, "InvsSalesChannel", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsSalesChannelRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsSalesChannelForInvsSalesChannelCreate(InvsSalesChannelObjectData data) {
    if (data != null) {
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(data, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }
  public void setInvsSalesChannelForInvsSalesChannelFind(InvsSalesChannelObjectFilter data) {
    if (data != null) {
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(data, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }
  public void setInvsSalesChannelForInvsSalesChannelGet(InvsSalesChannelObjectKeyData data) {
    if (data != null) {
      addInput("InvsSalesChannel", InvsSalesChannelObjectKeyHelper.toMap(data, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }
  public void setInvsSalesChannelForInvsSalesChannelUpdate(InvsSalesChannelObjectData data) {
    if (data != null) {
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(data, new HashMap(), "InvsSalesChannel").get("InvsSalesChannel"));
    }
  }
  public InvsSalesChannelObjectData getInvsSalesChannelObjectDataInvsSalesChannelFromInvsSalesChannelCreate() {
    return InvsSalesChannelObjectHelper.fromMap(outputMap, "InvsSalesChannel");
  }
  public InvsSalesChannelObjectDataList getInvsSalesChannelObjectDataInvsSalesChannelFromInvsSalesChannelFind() {
    return InvsSalesChannelObjectHelper.fromMapList(outputMap, "InvsSalesChannelList");
  }
  public InvsSalesChannelObjectData getInvsSalesChannelObjectDataInvsSalesChannelFromInvsSalesChannelGet() {
    return InvsSalesChannelObjectHelper.fromMap(outputMap, "InvsSalesChannel");
  }
  public InvsSalesChannelObjectData getInvsSalesChannelObjectDataInvsSalesChannelFromInvsSalesChannelUpdate() {
    return InvsSalesChannelObjectHelper.fromMap(outputMap, "InvsSalesChannel");
  }
  /**
   @deprecated
   */
  public void setInvsSalesChannelObjectFilter(InvsSalesChannelObjectFilter data) {
    if (data != null) {
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(data, new HashMap()).get("InvsSalesChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSalesChannelObjectData(InvsSalesChannelObjectData data) {
    if (data != null) {
      addInput("InvsSalesChannel", InvsSalesChannelObjectHelper.toMap(data, new HashMap()).get("InvsSalesChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSalesChannelObjectKeyData(InvsSalesChannelObjectKeyData data) {
    if (data != null) {
      addInput("InvsSalesChannel", InvsSalesChannelObjectKeyHelper.toMap(data, new HashMap()).get("InvsSalesChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsSalesChannelObjectDataList getInvsSalesChannelObjectDataList() {
    return InvsSalesChannelObjectHelper.fromMapList(outputMap, "InvsSalesChannelList");
  }
  /**
   @deprecated
   */
  public InvsSalesChannelObjectData getInvsSalesChannelObjectData() {
    return InvsSalesChannelObjectHelper.fromMap(outputMap, "InvsSalesChannel");
  }
}
