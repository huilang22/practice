/*
 * Generated code DO NOT EDIT
 * Generated file: SupervisorRequest.java
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

import com.csgsystems.we.data.*;
public final class SupervisorRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SupervisorRequest (String request, SupervisorRequestMethod method) {
    initialize(request, "Supervisor", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SupervisorRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSupervisorForSupervisorCreate(SupervisorObjectData data) {
    if (data != null) {
      addInput("Supervisor", SupervisorObjectHelper.toMap(data, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }
  public void setSupervisorForSupervisorFind(SupervisorObjectFilter data) {
    if (data != null) {
      addInput("Supervisor", SupervisorObjectHelper.toMap(data, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }
  public void setSupervisorForSupervisorGet(SupervisorObjectKeyData data) {
    if (data != null) {
      addInput("Supervisor", SupervisorObjectKeyHelper.toMap(data, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }
  public void setSupervisorForSupervisorUpdate(SupervisorObjectData data) {
    if (data != null) {
      addInput("Supervisor", SupervisorObjectHelper.toMap(data, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }
  public SupervisorObjectData getSupervisorObjectDataSupervisorFromSupervisorCreate() {
    return SupervisorObjectHelper.fromMap(outputMap, "Supervisor");
  }
  public SupervisorObjectDataList getSupervisorObjectDataSupervisorFromSupervisorFind() {
    return SupervisorObjectHelper.fromMapList(outputMap, "SupervisorList");
  }
  public SupervisorObjectData getSupervisorObjectDataSupervisorFromSupervisorGet() {
    return SupervisorObjectHelper.fromMap(outputMap, "Supervisor");
  }
  public SupervisorObjectData getSupervisorObjectDataSupervisorFromSupervisorUpdate() {
    return SupervisorObjectHelper.fromMap(outputMap, "Supervisor");
  }
  /**
   @deprecated
   */
  public void setSupervisorObjectFilter(SupervisorObjectFilter data) {
    if (data != null) {
      addInput("Supervisor", SupervisorObjectHelper.toMap(data, new HashMap()).get("SupervisorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSupervisorObjectData(SupervisorObjectData data) {
    if (data != null) {
      addInput("Supervisor", SupervisorObjectHelper.toMap(data, new HashMap()).get("SupervisorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSupervisorObjectKeyData(SupervisorObjectKeyData data) {
    if (data != null) {
      addInput("Supervisor", SupervisorObjectKeyHelper.toMap(data, new HashMap()).get("SupervisorObject"));
    }
  }
  /**
   @deprecated
   */
  public SupervisorObjectDataList getSupervisorObjectDataList() {
    return SupervisorObjectHelper.fromMapList(outputMap, "SupervisorList");
  }
  /**
   @deprecated
   */
  public SupervisorObjectData getSupervisorObjectData() {
    return SupervisorObjectHelper.fromMap(outputMap, "Supervisor");
  }
}
