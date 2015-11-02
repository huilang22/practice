/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimSalesChannelRequest.java
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
public final class InvsSimSalesChannelRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsSimSalesChannelRequest (String request, InvsSimSalesChannelRequestMethod method) {
    initialize(request, "InvsSimSalesChannel", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsSimSalesChannelRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsSimSalesChannelForInvsSimSalesChannelCreate(InvsSimSalesChannelObjectData data) {
    if (data != null) {
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(data, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }
  public void setInvsSimSalesChannelForInvsSimSalesChannelFind(InvsSimSalesChannelObjectFilter data) {
    if (data != null) {
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(data, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }
  public void setInvsSimSalesChannelForInvsSimSalesChannelGet(InvsSimSalesChannelObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectKeyHelper.toMap(data, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }
  public void setInvsSimSalesChannelForInvsSimSalesChannelUpdate(InvsSimSalesChannelObjectData data) {
    if (data != null) {
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(data, new HashMap(), "InvsSimSalesChannel").get("InvsSimSalesChannel"));
    }
  }
  public InvsSimSalesChannelObjectData getInvsSimSalesChannelObjectDataInvsSimSalesChannelFromInvsSimSalesChannelCreate() {
    return InvsSimSalesChannelObjectHelper.fromMap(outputMap, "InvsSimSalesChannel");
  }
  public InvsSimSalesChannelObjectDataList getInvsSimSalesChannelObjectDataInvsSimSalesChannelFromInvsSimSalesChannelFind() {
    return InvsSimSalesChannelObjectHelper.fromMapList(outputMap, "InvsSimSalesChannelList");
  }
  public InvsSimSalesChannelObjectData getInvsSimSalesChannelObjectDataInvsSimSalesChannelFromInvsSimSalesChannelGet() {
    return InvsSimSalesChannelObjectHelper.fromMap(outputMap, "InvsSimSalesChannel");
  }
  public InvsSimSalesChannelObjectData getInvsSimSalesChannelObjectDataInvsSimSalesChannelFromInvsSimSalesChannelUpdate() {
    return InvsSimSalesChannelObjectHelper.fromMap(outputMap, "InvsSimSalesChannel");
  }
  /**
   @deprecated
   */
  public void setInvsSimSalesChannelObjectFilter(InvsSimSalesChannelObjectFilter data) {
    if (data != null) {
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(data, new HashMap()).get("InvsSimSalesChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimSalesChannelObjectData(InvsSimSalesChannelObjectData data) {
    if (data != null) {
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectHelper.toMap(data, new HashMap()).get("InvsSimSalesChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimSalesChannelObjectKeyData(InvsSimSalesChannelObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimSalesChannel", InvsSimSalesChannelObjectKeyHelper.toMap(data, new HashMap()).get("InvsSimSalesChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsSimSalesChannelObjectDataList getInvsSimSalesChannelObjectDataList() {
    return InvsSimSalesChannelObjectHelper.fromMapList(outputMap, "InvsSimSalesChannelList");
  }
  /**
   @deprecated
   */
  public InvsSimSalesChannelObjectData getInvsSimSalesChannelObjectData() {
    return InvsSimSalesChannelObjectHelper.fromMap(outputMap, "InvsSimSalesChannel");
  }
}
