/*
 * Generated code DO NOT EDIT
 * Generated file: ServerDefinitionRequest.java
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
public final class ServerDefinitionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServerDefinitionRequest (String request, ServerDefinitionRequestMethod method) {
    initialize(request, "ServerDefinition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServerDefinitionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServerDefinitionForServerDefinitionCreate(ServerDefinitionObjectData data) {
    if (data != null) {
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(data, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }
  public void setServerDefinitionForServerDefinitionDelete(ServerDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("ServerDefinition", ServerDefinitionObjectKeyHelper.toMap(data, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }
  public void setServerDefinitionForServerDefinitionFind(ServerDefinitionObjectFilter data) {
    if (data != null) {
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(data, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }
  public void setServerDefinitionForServerDefinitionGet(ServerDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("ServerDefinition", ServerDefinitionObjectKeyHelper.toMap(data, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }
  public void setServerDefinitionForServerDefinitionUpdate(ServerDefinitionObjectData data) {
    if (data != null) {
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(data, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }
  public ServerDefinitionObjectData getServerDefinitionObjectDataServerDefinitionFromServerDefinitionCreate() {
    return ServerDefinitionObjectHelper.fromMap(outputMap, "ServerDefinition");
  }
  public ServerDefinitionObjectData getServerDefinitionObjectDataServerDefinitionFromServerDefinitionDelete() {
    return ServerDefinitionObjectHelper.fromMap(outputMap, "ServerDefinition");
  }
  public ServerDefinitionObjectDataList getServerDefinitionObjectDataServerDefinitionFromServerDefinitionFind() {
    return ServerDefinitionObjectHelper.fromMapList(outputMap, "ServerDefinitionList");
  }
  public ServerDefinitionObjectData getServerDefinitionObjectDataServerDefinitionFromServerDefinitionGet() {
    return ServerDefinitionObjectHelper.fromMap(outputMap, "ServerDefinition");
  }
  public ServerDefinitionObjectData getServerDefinitionObjectDataServerDefinitionFromServerDefinitionUpdate() {
    return ServerDefinitionObjectHelper.fromMap(outputMap, "ServerDefinition");
  }
  /**
   @deprecated
   */
  public void setServerDefinitionObjectFilter(ServerDefinitionObjectFilter data) {
    if (data != null) {
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(data, new HashMap()).get("ServerDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServerDefinitionObjectData(ServerDefinitionObjectData data) {
    if (data != null) {
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(data, new HashMap()).get("ServerDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServerDefinitionObjectKeyData(ServerDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("ServerDefinition", ServerDefinitionObjectKeyHelper.toMap(data, new HashMap()).get("ServerDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public ServerDefinitionObjectDataList getServerDefinitionObjectDataList() {
    return ServerDefinitionObjectHelper.fromMapList(outputMap, "ServerDefinitionList");
  }
  /**
   @deprecated
   */
  public ServerDefinitionObjectData getServerDefinitionObjectData() {
    return ServerDefinitionObjectHelper.fromMap(outputMap, "ServerDefinition");
  }
}
