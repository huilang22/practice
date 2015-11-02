/*
 * Generated code DO NOT EDIT
 * Generated file: ServerRequest.java
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
public final class ServerRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServerRequest (String request, ServerRequestMethod method) {
    initialize(request, "Server", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServerRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServerForServerCreate(ServerObjectData data) {
    if (data != null) {
      addInput("Server", ServerObjectHelper.toMap(data, new HashMap(), "Server").get("Server"));
    }
  }
  public void setServerForServerDelete(ServerObjectKeyData data) {
    if (data != null) {
      addInput("Server", ServerObjectKeyHelper.toMap(data, new HashMap(), "Server").get("Server"));
    }
  }
  public void setServerForServerFind(ServerObjectFilter data) {
    if (data != null) {
      addInput("Server", ServerObjectHelper.toMap(data, new HashMap(), "Server").get("Server"));
    }
  }
  public void setServerForServerGet(ServerObjectKeyData data) {
    if (data != null) {
      addInput("Server", ServerObjectKeyHelper.toMap(data, new HashMap(), "Server").get("Server"));
    }
  }
  public void setServerForServerUpdate(ServerObjectData data) {
    if (data != null) {
      addInput("Server", ServerObjectHelper.toMap(data, new HashMap(), "Server").get("Server"));
    }
  }
  public ServerObjectData getServerObjectDataServerFromServerCreate() {
    return ServerObjectHelper.fromMap(outputMap, "Server");
  }
  public ServerObjectData getServerObjectDataServerFromServerDelete() {
    return ServerObjectHelper.fromMap(outputMap, "Server");
  }
  public ServerObjectDataList getServerObjectDataServerFromServerFind() {
    return ServerObjectHelper.fromMapList(outputMap, "ServerList");
  }
  public ServerObjectData getServerObjectDataServerFromServerGet() {
    return ServerObjectHelper.fromMap(outputMap, "Server");
  }
  public ServerObjectData getServerObjectDataServerFromServerUpdate() {
    return ServerObjectHelper.fromMap(outputMap, "Server");
  }
  /**
   @deprecated
   */
  public void setServerObjectFilter(ServerObjectFilter data) {
    if (data != null) {
      addInput("Server", ServerObjectHelper.toMap(data, new HashMap()).get("ServerObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServerObjectData(ServerObjectData data) {
    if (data != null) {
      addInput("Server", ServerObjectHelper.toMap(data, new HashMap()).get("ServerObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServerObjectKeyData(ServerObjectKeyData data) {
    if (data != null) {
      addInput("Server", ServerObjectKeyHelper.toMap(data, new HashMap()).get("ServerObject"));
    }
  }
  /**
   @deprecated
   */
  public ServerObjectDataList getServerObjectDataList() {
    return ServerObjectHelper.fromMapList(outputMap, "ServerList");
  }
  /**
   @deprecated
   */
  public ServerObjectData getServerObjectData() {
    return ServerObjectHelper.fromMap(outputMap, "Server");
  }
}
