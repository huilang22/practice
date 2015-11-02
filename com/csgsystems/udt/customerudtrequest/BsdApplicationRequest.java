/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRequest.java
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
public final class BsdApplicationRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdApplicationRequest (String request, BsdApplicationRequestMethod method) {
    initialize(request, "BsdApplication", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdApplicationRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdApplicationForBsdApplicationCreate(BsdApplicationObjectData data) {
    if (data != null) {
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(data, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }
  public void setBsdApplicationForBsdApplicationDelete(BsdApplicationObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplication", BsdApplicationObjectKeyHelper.toMap(data, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }
  public void setBsdApplicationForBsdApplicationFind(BsdApplicationObjectFilter data) {
    if (data != null) {
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(data, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }
  public void setBsdApplicationForBsdApplicationGet(BsdApplicationObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplication", BsdApplicationObjectKeyHelper.toMap(data, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }
  public void setBsdApplicationForBsdApplicationUpdate(BsdApplicationObjectData data) {
    if (data != null) {
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(data, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }
  public BsdApplicationObjectData getBsdApplicationObjectDataBsdApplicationFromBsdApplicationCreate() {
    return BsdApplicationObjectHelper.fromMap(outputMap, "BsdApplication");
  }
  public BsdApplicationObjectData getBsdApplicationObjectDataBsdApplicationFromBsdApplicationDelete() {
    return BsdApplicationObjectHelper.fromMap(outputMap, "BsdApplication");
  }
  public BsdApplicationObjectDataList getBsdApplicationObjectDataBsdApplicationFromBsdApplicationFind() {
    return BsdApplicationObjectHelper.fromMapList(outputMap, "BsdApplicationList");
  }
  public BsdApplicationObjectData getBsdApplicationObjectDataBsdApplicationFromBsdApplicationGet() {
    return BsdApplicationObjectHelper.fromMap(outputMap, "BsdApplication");
  }
  public BsdApplicationObjectKeyData getBsdApplicationObjectKeyDataBsdApplicationFromBsdApplicationSequenceGet() {
    return BsdApplicationObjectKeyHelper.fromMap(outputMap, "BsdApplication");
  }
  public BsdApplicationObjectData getBsdApplicationObjectDataBsdApplicationFromBsdApplicationUpdate() {
    return BsdApplicationObjectHelper.fromMap(outputMap, "BsdApplication");
  }
  /**
   @deprecated
   */
  public void setBsdApplicationObjectFilter(BsdApplicationObjectFilter data) {
    if (data != null) {
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(data, new HashMap()).get("BsdApplicationObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdApplicationObjectData(BsdApplicationObjectData data) {
    if (data != null) {
      addInput("BsdApplication", BsdApplicationObjectHelper.toMap(data, new HashMap()).get("BsdApplicationObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdApplicationObjectKeyData(BsdApplicationObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplication", BsdApplicationObjectKeyHelper.toMap(data, new HashMap()).get("BsdApplicationObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdApplicationObjectDataList getBsdApplicationObjectDataList() {
    return BsdApplicationObjectHelper.fromMapList(outputMap, "BsdApplicationList");
  }
  /**
   @deprecated
   */
  public BsdApplicationObjectKeyData getBsdApplicationObjectKeyData() {
    return BsdApplicationObjectKeyHelper.fromMap(outputMap, "BsdApplication");
  }
  /**
   @deprecated
   */
  public BsdApplicationObjectData getBsdApplicationObjectData() {
    return BsdApplicationObjectHelper.fromMap(outputMap, "BsdApplication");
  }
}
