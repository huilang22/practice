/*
 * Generated code DO NOT EDIT
 * Generated file: InvsMncRequest.java
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
public final class InvsMncRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsMncRequest (String request, InvsMncRequestMethod method) {
    initialize(request, "InvsMnc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsMncRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsMncForInvsMncCreate(InvsMncObjectData data) {
    if (data != null) {
      addInput("InvsMnc", InvsMncObjectHelper.toMap(data, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }
  public void setInvsMncForInvsMncFind(InvsMncObjectFilter data) {
    if (data != null) {
      addInput("InvsMnc", InvsMncObjectHelper.toMap(data, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }
  public void setInvsMncForInvsMncGet(InvsMncObjectKeyData data) {
    if (data != null) {
      addInput("InvsMnc", InvsMncObjectKeyHelper.toMap(data, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }
  public void setInvsMncForInvsMncUpdate(InvsMncObjectData data) {
    if (data != null) {
      addInput("InvsMnc", InvsMncObjectHelper.toMap(data, new HashMap(), "InvsMnc").get("InvsMnc"));
    }
  }
  public InvsMncObjectData getInvsMncObjectDataInvsMncFromInvsMncCreate() {
    return InvsMncObjectHelper.fromMap(outputMap, "InvsMnc");
  }
  public InvsMncObjectDataList getInvsMncObjectDataInvsMncFromInvsMncFind() {
    return InvsMncObjectHelper.fromMapList(outputMap, "InvsMncList");
  }
  public InvsMncObjectData getInvsMncObjectDataInvsMncFromInvsMncGet() {
    return InvsMncObjectHelper.fromMap(outputMap, "InvsMnc");
  }
  public InvsMncObjectData getInvsMncObjectDataInvsMncFromInvsMncUpdate() {
    return InvsMncObjectHelper.fromMap(outputMap, "InvsMnc");
  }
  /**
   @deprecated
   */
  public void setInvsMncObjectFilter(InvsMncObjectFilter data) {
    if (data != null) {
      addInput("InvsMnc", InvsMncObjectHelper.toMap(data, new HashMap()).get("InvsMncObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsMncObjectData(InvsMncObjectData data) {
    if (data != null) {
      addInput("InvsMnc", InvsMncObjectHelper.toMap(data, new HashMap()).get("InvsMncObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsMncObjectKeyData(InvsMncObjectKeyData data) {
    if (data != null) {
      addInput("InvsMnc", InvsMncObjectKeyHelper.toMap(data, new HashMap()).get("InvsMncObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsMncObjectDataList getInvsMncObjectDataList() {
    return InvsMncObjectHelper.fromMapList(outputMap, "InvsMncList");
  }
  /**
   @deprecated
   */
  public InvsMncObjectData getInvsMncObjectData() {
    return InvsMncObjectHelper.fromMap(outputMap, "InvsMnc");
  }
}
