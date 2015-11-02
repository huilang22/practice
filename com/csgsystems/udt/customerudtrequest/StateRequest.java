/*
 * Generated code DO NOT EDIT
 * Generated file: StateRequest.java
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

import com.csgsystems.cf.data.*;
public final class StateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public StateRequest (String request, StateRequestMethod method) {
    initialize(request, "State", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (StateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setStateForStateCreate(StateObjectData data) {
    if (data != null) {
      addInput("State", StateObjectHelper.toMap(data, new HashMap(), "State").get("State"));
    }
  }
  public void setStateForStateDelete(StateObjectKeyData data) {
    if (data != null) {
      addInput("State", StateObjectKeyHelper.toMap(data, new HashMap(), "State").get("State"));
    }
  }
  public void setStateForStateFind(StateObjectFilter data) {
    if (data != null) {
      addInput("State", StateObjectHelper.toMap(data, new HashMap(), "State").get("State"));
    }
  }
  public void setStateForStateGet(StateObjectKeyData data) {
    if (data != null) {
      addInput("State", StateObjectKeyHelper.toMap(data, new HashMap(), "State").get("State"));
    }
  }
  public void setSTUpdateFilterForStateUpdate(StateObjectFilter data) {
    if (data != null) {
      addInput("STUpdateFilter", StateObjectHelper.toMap(data, new HashMap(), "STUpdateFilter").get("STUpdateFilter"));
    }
  }
  public void setSTUpdateGetForStateUpdate(StateObjectData data) {
    if (data != null) {
      addInput("STUpdateGet", StateObjectHelper.toMap(data, new HashMap(), "STUpdateGet").get("STUpdateGet"));
    }
  }
  public void setStateForStateUpdate(StateObjectData data) {
    if (data != null) {
      addInput("State", StateObjectHelper.toMap(data, new HashMap(), "State").get("State"));
    }
  }
  public StateObjectData getStateObjectDataStateFromStateCreate() {
    return StateObjectHelper.fromMap(outputMap, "State");
  }
  public StateObjectData getStateObjectDataStateFromStateDelete() {
    return StateObjectHelper.fromMap(outputMap, "State");
  }
  public StateObjectDataList getStateObjectDataStateFromStateFind() {
    return StateObjectHelper.fromMapList(outputMap, "StateList");
  }
  public StateObjectData getStateObjectDataStateFromStateGet() {
    return StateObjectHelper.fromMap(outputMap, "State");
  }
  public StateObjectData getStateObjectDataStateFromStateUpdate() {
    return StateObjectHelper.fromMap(outputMap, "State");
  }
  /**
   @deprecated
   */
  public void setStateObjectFilter(StateObjectFilter data) {
    if (data != null) {
      addInput("State", StateObjectHelper.toMap(data, new HashMap()).get("StateObject"));
    }
  }
  /**
   @deprecated
   */
  public void setStateObjectData(StateObjectData data) {
    if (data != null) {
      addInput("State", StateObjectHelper.toMap(data, new HashMap()).get("StateObject"));
    }
  }
  /**
   @deprecated
   */
  public void setStateObjectKeyData(StateObjectKeyData data) {
    if (data != null) {
      addInput("State", StateObjectKeyHelper.toMap(data, new HashMap()).get("StateObject"));
    }
  }
  /**
   @deprecated
   */
  public StateObjectDataList getStateObjectDataList() {
    return StateObjectHelper.fromMapList(outputMap, "StateList");
  }
  /**
   @deprecated
   */
  public StateObjectData getStateObjectData() {
    return StateObjectHelper.fromMap(outputMap, "State");
  }
}
