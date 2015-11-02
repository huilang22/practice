/*
 * Generated code DO NOT EDIT
 * Generated file: TicklerRequest.java
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
public final class TicklerRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TicklerRequest (String request, TicklerRequestMethod method) {
    initialize(request, "Tickler", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TicklerRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setTicklerForTicklerCreate(TicklerObjectData data) {
    if (data != null) {
      addInput("Tickler", TicklerObjectHelper.toMap(data, new HashMap(), "Tickler").get("Tickler"));
    }
  }
  public void setTicklerForTicklerFind(TicklerObjectFilter data) {
    if (data != null) {
      addInput("Tickler", TicklerObjectHelper.toMap(data, new HashMap(), "Tickler").get("Tickler"));
    }
  }
  public void setTicklerForTicklerGet(TicklerObjectKeyData data) {
    if (data != null) {
      addInput("Tickler", TicklerObjectKeyHelper.toMap(data, new HashMap(), "Tickler").get("Tickler"));
    }
  }
  public TicklerObjectData getTicklerObjectDataTicklerFromTicklerCreate() {
    return TicklerObjectHelper.fromMap(outputMap, "Tickler");
  }
  public TicklerObjectDataList getTicklerObjectDataTicklerFromTicklerFind() {
    return TicklerObjectHelper.fromMapList(outputMap, "TicklerList");
  }
  public TicklerObjectData getTicklerObjectDataTicklerFromTicklerGet() {
    return TicklerObjectHelper.fromMap(outputMap, "Tickler");
  }
  /**
   @deprecated
   */
  public void setTicklerObjectFilter(TicklerObjectFilter data) {
    if (data != null) {
      addInput("Tickler", TicklerObjectHelper.toMap(data, new HashMap()).get("TicklerObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTicklerObjectData(TicklerObjectData data) {
    if (data != null) {
      addInput("Tickler", TicklerObjectHelper.toMap(data, new HashMap()).get("TicklerObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTicklerObjectKeyData(TicklerObjectKeyData data) {
    if (data != null) {
      addInput("Tickler", TicklerObjectKeyHelper.toMap(data, new HashMap()).get("TicklerObject"));
    }
  }
  /**
   @deprecated
   */
  public TicklerObjectDataList getTicklerObjectDataList() {
    return TicklerObjectHelper.fromMapList(outputMap, "TicklerList");
  }
  /**
   @deprecated
   */
  public TicklerObjectData getTicklerObjectData() {
    return TicklerObjectHelper.fromMap(outputMap, "Tickler");
  }
}
