/*
 * Generated code DO NOT EDIT
 * Generated file: BsdObjectRequest.java
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
public final class BsdObjectRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdObjectRequest (String request, BsdObjectRequestMethod method) {
    initialize(request, "BsdObject", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdObjectRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdObjectForBsdObjectCreate(BsdObjectObjectData data) {
    if (data != null) {
      addInput("BsdObject", BsdObjectObjectHelper.toMap(data, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }
  public void setBsdObjectForBsdObjectDelete(BsdObjectObjectKeyData data) {
    if (data != null) {
      addInput("BsdObject", BsdObjectObjectKeyHelper.toMap(data, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }
  public void setBsdObjectForBsdObjectFind(BsdObjectObjectFilter data) {
    if (data != null) {
      addInput("BsdObject", BsdObjectObjectHelper.toMap(data, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }
  public void setBsdObjectForBsdObjectGet(BsdObjectObjectKeyData data) {
    if (data != null) {
      addInput("BsdObject", BsdObjectObjectKeyHelper.toMap(data, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }
  public void setBsdObjectForBsdObjectUpdate(BsdObjectObjectData data) {
    if (data != null) {
      addInput("BsdObject", BsdObjectObjectHelper.toMap(data, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }
  public BsdObjectObjectData getBsdObjectObjectDataBsdObjectFromBsdObjectCreate() {
    return BsdObjectObjectHelper.fromMap(outputMap, "BsdObject");
  }
  public BsdObjectObjectData getBsdObjectObjectDataBsdObjectFromBsdObjectDelete() {
    return BsdObjectObjectHelper.fromMap(outputMap, "BsdObject");
  }
  public BsdObjectObjectDataList getBsdObjectObjectDataBsdObjectFromBsdObjectFind() {
    return BsdObjectObjectHelper.fromMapList(outputMap, "BsdObjectList");
  }
  public BsdObjectObjectData getBsdObjectObjectDataBsdObjectFromBsdObjectGet() {
    return BsdObjectObjectHelper.fromMap(outputMap, "BsdObject");
  }
  public BsdObjectObjectKeyData getBsdObjectObjectKeyDataBsdObjectFromBsdObjectSequenceGet() {
    return BsdObjectObjectKeyHelper.fromMap(outputMap, "BsdObject");
  }
  public BsdObjectObjectData getBsdObjectObjectDataBsdObjectFromBsdObjectUpdate() {
    return BsdObjectObjectHelper.fromMap(outputMap, "BsdObject");
  }
  /**
   @deprecated
   */
  public void setBsdObjectObjectFilter(BsdObjectObjectFilter data) {
    if (data != null) {
      addInput("BsdObject", BsdObjectObjectHelper.toMap(data, new HashMap()).get("BsdObjectObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdObjectObjectData(BsdObjectObjectData data) {
    if (data != null) {
      addInput("Bsd", BsdObjectObjectHelper.toMap(data, new HashMap()).get("BsdObjectObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdObjectObjectKeyData(BsdObjectObjectKeyData data) {
    if (data != null) {
      addInput("Bsd", BsdObjectObjectKeyHelper.toMap(data, new HashMap()).get("BsdObjectObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdObjectObjectDataList getBsdObjectObjectDataList() {
    return BsdObjectObjectHelper.fromMapList(outputMap, "BsdObjectList");
  }
  /**
   @deprecated
   */
  public BsdObjectObjectKeyData getBsdObjectObjectKeyData() {
    return BsdObjectObjectKeyHelper.fromMap(outputMap, "Bsd");
  }
  /**
   @deprecated
   */
  public BsdObjectObjectData getBsdObjectObjectData() {
    return BsdObjectObjectHelper.fromMap(outputMap, "Bsd");
  }
}
