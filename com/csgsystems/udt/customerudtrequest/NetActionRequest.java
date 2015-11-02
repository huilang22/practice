/*
 * Generated code DO NOT EDIT
 * Generated file: NetActionRequest.java
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

import com.csgsystems.bp.data.*;
public final class NetActionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NetActionRequest (String request, NetActionRequestMethod method) {
    initialize(request, "NetAction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NetActionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNetActionForNetActionFind(NetActionObjectFilter data) {
    if (data != null) {
      addInput("NetAction", NetActionObjectHelper.toMap(data, new HashMap(), "NetAction").get("NetAction"));
    }
  }
  public void setNetActionForNetActionGet(NetActionObjectKeyData data) {
    if (data != null) {
      addInput("NetAction", NetActionObjectKeyHelper.toMap(data, new HashMap(), "NetAction").get("NetAction"));
    }
  }
  public NetActionObjectDataList getNetActionObjectDataNetActionFromNetActionFind() {
    return NetActionObjectHelper.fromMapList(outputMap, "NetActionList");
  }
  public NetActionObjectData getNetActionObjectDataNetActionFromNetActionGet() {
    return NetActionObjectHelper.fromMap(outputMap, "NetAction");
  }
  /**
   @deprecated
   */
  public void setNetActionObjectFilter(NetActionObjectFilter data) {
    if (data != null) {
      addInput("NetAction", NetActionObjectHelper.toMap(data, new HashMap()).get("NetActionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNetActionObjectKeyData(NetActionObjectKeyData data) {
    if (data != null) {
      addInput("NetAction", NetActionObjectKeyHelper.toMap(data, new HashMap()).get("NetActionObject"));
    }
  }
  /**
   @deprecated
   */
  public NetActionObjectDataList getNetActionObjectDataList() {
    return NetActionObjectHelper.fromMapList(outputMap, "NetActionList");
  }
  /**
   @deprecated
   */
  public NetActionObjectData getNetActionObjectData() {
    return NetActionObjectHelper.fromMap(outputMap, "NetAction");
  }
}
