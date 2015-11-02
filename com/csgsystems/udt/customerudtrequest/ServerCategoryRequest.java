/*
 * Generated code DO NOT EDIT
 * Generated file: ServerCategoryRequest.java
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
public final class ServerCategoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServerCategoryRequest (String request, ServerCategoryRequestMethod method) {
    initialize(request, "ServerCategory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServerCategoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServerCategoryForServerCategoryFind(SCObjectFilter data) {
    if (data != null) {
      addInput("ServerCategory", SCObjectHelper.toMap(data, new HashMap(), "ServerCategory").get("ServerCategory"));
    }
  }
  public void setServerCategoryForServerCategoryGet(SCObjectKeyData data) {
    if (data != null) {
      addInput("ServerCategory", SCObjectKeyHelper.toMap(data, new HashMap(), "ServerCategory").get("ServerCategory"));
    }
  }
  public SCObjectDataList getSCObjectDataServerCategoryFromServerCategoryFind() {
    return SCObjectHelper.fromMapList(outputMap, "ServerCategoryList");
  }
  public SCObjectData getSCObjectDataServerCategoryFromServerCategoryGet() {
    return SCObjectHelper.fromMap(outputMap, "ServerCategory");
  }
  /**
   @deprecated
   */
  public void setSCObjectFilter(SCObjectFilter data) {
    if (data != null) {
      addInput("SC", SCObjectHelper.toMap(data, new HashMap()).get("SCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSCObjectKeyData(SCObjectKeyData data) {
    if (data != null) {
      addInput("ServerCategory", SCObjectKeyHelper.toMap(data, new HashMap()).get("SCObject"));
    }
  }
  /**
   @deprecated
   */
  public SCObjectDataList getSCObjectDataList() {
    return SCObjectHelper.fromMapList(outputMap, "SCList");
  }
  /**
   @deprecated
   */
  public SCObjectData getSCObjectData() {
    return SCObjectHelper.fromMap(outputMap, "ServerCategory");
  }
}
