/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeRequest.java
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
public final class BsdAttributeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdAttributeRequest (String request, BsdAttributeRequestMethod method) {
    initialize(request, "BsdAttribute", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdAttributeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdAttributeForBsdAttributeCreate(BsdAttributeObjectData data) {
    if (data != null) {
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(data, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }
  public void setBsdAttributeForBsdAttributeDelete(BsdAttributeObjectKeyData data) {
    if (data != null) {
      addInput("BsdAttribute", BsdAttributeObjectKeyHelper.toMap(data, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }
  public void setBsdAttributeForBsdAttributeFind(BsdAttributeObjectFilter data) {
    if (data != null) {
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(data, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }
  public void setBsdAttributeForBsdAttributeGet(BsdAttributeObjectKeyData data) {
    if (data != null) {
      addInput("BsdAttribute", BsdAttributeObjectKeyHelper.toMap(data, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }
  public void setBsdAttributeForBsdAttributeUpdate(BsdAttributeObjectData data) {
    if (data != null) {
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(data, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }
  public BsdAttributeObjectData getBsdAttributeObjectDataBsdAttributeFromBsdAttributeCreate() {
    return BsdAttributeObjectHelper.fromMap(outputMap, "BsdAttribute");
  }
  public BsdAttributeObjectData getBsdAttributeObjectDataBsdAttributeFromBsdAttributeDelete() {
    return BsdAttributeObjectHelper.fromMap(outputMap, "BsdAttribute");
  }
  public BsdAttributeObjectDataList getBsdAttributeObjectDataBsdAttributeFromBsdAttributeFind() {
    return BsdAttributeObjectHelper.fromMapList(outputMap, "BsdAttributeList");
  }
  public BsdAttributeObjectData getBsdAttributeObjectDataBsdAttributeFromBsdAttributeGet() {
    return BsdAttributeObjectHelper.fromMap(outputMap, "BsdAttribute");
  }
  public BsdAttributeObjectKeyData getBsdAttributeObjectKeyDataBsdAttributeFromBsdAttributeSequenceGet() {
    return BsdAttributeObjectKeyHelper.fromMap(outputMap, "BsdAttribute");
  }
  public BsdAttributeObjectData getBsdAttributeObjectDataBsdAttributeFromBsdAttributeUpdate() {
    return BsdAttributeObjectHelper.fromMap(outputMap, "BsdAttribute");
  }
  /**
   @deprecated
   */
  public void setBsdAttributeObjectFilter(BsdAttributeObjectFilter data) {
    if (data != null) {
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(data, new HashMap()).get("BsdAttributeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdAttributeObjectData(BsdAttributeObjectData data) {
    if (data != null) {
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(data, new HashMap()).get("BsdAttributeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdAttributeObjectKeyData(BsdAttributeObjectKeyData data) {
    if (data != null) {
      addInput("BsdAttribute", BsdAttributeObjectKeyHelper.toMap(data, new HashMap()).get("BsdAttributeObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdAttributeObjectDataList getBsdAttributeObjectDataList() {
    return BsdAttributeObjectHelper.fromMapList(outputMap, "BsdAttributeList");
  }
  /**
   @deprecated
   */
  public BsdAttributeObjectKeyData getBsdAttributeObjectKeyData() {
    return BsdAttributeObjectKeyHelper.fromMap(outputMap, "BsdAttribute");
  }
  /**
   @deprecated
   */
  public BsdAttributeObjectData getBsdAttributeObjectData() {
    return BsdAttributeObjectHelper.fromMap(outputMap, "BsdAttribute");
  }
}
