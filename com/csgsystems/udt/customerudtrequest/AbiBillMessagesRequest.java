/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillMessagesRequest.java
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
public final class AbiBillMessagesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AbiBillMessagesRequest (String request, AbiBillMessagesRequestMethod method) {
    initialize(request, "AbiBillMessages", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AbiBillMessagesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAbiBillMessagesForAbiBillMessagesFind(AbiBillMessagesObjectFilter data) {
    if (data != null) {
      addInput("AbiBillMessages", AbiBillMessagesObjectHelper.toMap(data, new HashMap(), "AbiBillMessages").get("AbiBillMessages"));
    }
  }
  public void setAbiBillMessagesForAbiBillMessagesGet(AbiBillMessagesObjectKeyData data) {
    if (data != null) {
      addInput("AbiBillMessages", AbiBillMessagesObjectKeyHelper.toMap(data, new HashMap(), "AbiBillMessages").get("AbiBillMessages"));
    }
  }
  public void setAbiBillMessagesForAbiBillMessagesUpdate(AbiBillMessagesObjectData data) {
    if (data != null) {
      addInput("AbiBillMessages", AbiBillMessagesObjectHelper.toMap(data, new HashMap(), "AbiBillMessages").get("AbiBillMessages"));
    }
  }
  public AbiBillMessagesObjectDataList getAbiBillMessagesObjectDataAbiBillMessagesFromAbiBillMessagesFind() {
    return AbiBillMessagesObjectHelper.fromMapList(outputMap, "AbiBillMessagesList");
  }
  public AbiBillMessagesObjectData getAbiBillMessagesObjectDataAbiBillMessagesFromAbiBillMessagesGet() {
    return AbiBillMessagesObjectHelper.fromMap(outputMap, "AbiBillMessages");
  }
  public AbiBillMessagesObjectData getAbiBillMessagesObjectDataAbiBillMessagesFromAbiBillMessagesUpdate() {
    return AbiBillMessagesObjectHelper.fromMap(outputMap, "AbiBillMessages");
  }
  /**
   @deprecated
   */
  public void setAbiBillMessagesObjectFilter(AbiBillMessagesObjectFilter data) {
    if (data != null) {
      addInput("AbiBillMessages", AbiBillMessagesObjectHelper.toMap(data, new HashMap()).get("AbiBillMessagesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAbiBillMessagesObjectData(AbiBillMessagesObjectData data) {
    if (data != null) {
      addInput("AbiBillMessages", AbiBillMessagesObjectHelper.toMap(data, new HashMap()).get("AbiBillMessagesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAbiBillMessagesObjectKeyData(AbiBillMessagesObjectKeyData data) {
    if (data != null) {
      addInput("AbiBillMessages", AbiBillMessagesObjectKeyHelper.toMap(data, new HashMap()).get("AbiBillMessagesObject"));
    }
  }
  /**
   @deprecated
   */
  public AbiBillMessagesObjectDataList getAbiBillMessagesObjectDataList() {
    return AbiBillMessagesObjectHelper.fromMapList(outputMap, "AbiBillMessagesList");
  }
  /**
   @deprecated
   */
  public AbiBillMessagesObjectData getAbiBillMessagesObjectData() {
    return AbiBillMessagesObjectHelper.fromMap(outputMap, "AbiBillMessages");
  }
}
