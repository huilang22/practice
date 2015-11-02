/*
 * Generated code DO NOT EDIT
 * Generated file: BsdActionRequest.java
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

import com.csgsystems.utl.data.*;
public final class BsdActionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdActionRequest (String request, BsdActionRequestMethod method) {
    initialize(request, "BsdAction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdActionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdActionForBsdActionCreate(BsdActionObjectData data) {
    if (data != null) {
      addInput("BsdAction", BsdActionObjectHelper.toMap(data, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }
  public void setBsdActionForBsdActionDelete(BsdActionObjectKeyData data) {
    if (data != null) {
      addInput("BsdAction", BsdActionObjectKeyHelper.toMap(data, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }
  public void setBsdActionForBsdActionFind(BsdActionObjectFilter data) {
    if (data != null) {
      addInput("BsdAction", BsdActionObjectHelper.toMap(data, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }
  public void setBsdActionForBsdActionGet(BsdActionObjectKeyData data) {
    if (data != null) {
      addInput("BsdAction", BsdActionObjectKeyHelper.toMap(data, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }
  public void setBsdActionForBsdActionUpdate(BsdActionObjectData data) {
    if (data != null) {
      addInput("BsdAction", BsdActionObjectHelper.toMap(data, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }
  public BsdActionObjectData getBsdActionObjectDataBsdActionFromBsdActionCreate() {
    return BsdActionObjectHelper.fromMap(outputMap, "BsdAction");
  }
  public BsdActionObjectData getBsdActionObjectDataBsdActionFromBsdActionDelete() {
    return BsdActionObjectHelper.fromMap(outputMap, "BsdAction");
  }
  public BsdActionObjectDataList getBsdActionObjectDataBsdActionFromBsdActionFind() {
    return BsdActionObjectHelper.fromMapList(outputMap, "BsdActionList");
  }
  public BsdActionObjectData getBsdActionObjectDataBsdActionFromBsdActionGet() {
    return BsdActionObjectHelper.fromMap(outputMap, "BsdAction");
  }
  public BsdActionObjectKeyData getBsdActionObjectKeyDataBsdActionFromBsdActionSequenceGet() {
    return BsdActionObjectKeyHelper.fromMap(outputMap, "BsdAction");
  }
  public BsdActionObjectData getBsdActionObjectDataBsdActionFromBsdActionUpdate() {
    return BsdActionObjectHelper.fromMap(outputMap, "BsdAction");
  }
  /**
   @deprecated
   */
  public void setBsdActionObjectFilter(BsdActionObjectFilter data) {
    if (data != null) {
      addInput("BsdAction", BsdActionObjectHelper.toMap(data, new HashMap()).get("BsdActionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdActionObjectData(BsdActionObjectData data) {
    if (data != null) {
      addInput("BsdAction", BsdActionObjectHelper.toMap(data, new HashMap()).get("BsdActionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdActionObjectKeyData(BsdActionObjectKeyData data) {
    if (data != null) {
      addInput("BsdAction", BsdActionObjectKeyHelper.toMap(data, new HashMap()).get("BsdActionObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdActionObjectDataList getBsdActionObjectDataList() {
    return BsdActionObjectHelper.fromMapList(outputMap, "BsdActionList");
  }
  /**
   @deprecated
   */
  public BsdActionObjectKeyData getBsdActionObjectKeyData() {
    return BsdActionObjectKeyHelper.fromMap(outputMap, "BsdAction");
  }
  /**
   @deprecated
   */
  public BsdActionObjectData getBsdActionObjectData() {
    return BsdActionObjectHelper.fromMap(outputMap, "BsdAction");
  }
}
