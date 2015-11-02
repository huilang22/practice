/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintTypeRequest.java
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
public final class BsdAttributeConstraintTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdAttributeConstraintTypeRequest (String request, BsdAttributeConstraintTypeRequestMethod method) {
    initialize(request, "BsdAttributeConstraintType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdAttributeConstraintTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdAttributeConstraintTypeForBsdAttributeConstraintTypeCreate(BsdAttributeConstraintTypeObjectData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(data, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }
  public void setBsdAttributeConstraintTypeForBsdAttributeConstraintTypeDelete(BsdAttributeConstraintTypeObjectKeyData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectKeyHelper.toMap(data, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }
  public void setBsdAttributeConstraintTypeForBsdAttributeConstraintTypeFind(BsdAttributeConstraintTypeObjectFilter data) {
    if (data != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(data, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }
  public void setBsdAttributeConstraintTypeForBsdAttributeConstraintTypeGet(BsdAttributeConstraintTypeObjectKeyData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectKeyHelper.toMap(data, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }
  public void setBsdAttributeConstraintTypeForBsdAttributeConstraintTypeUpdate(BsdAttributeConstraintTypeObjectData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(data, new HashMap(), "BsdAttributeConstraintType").get("BsdAttributeConstraintType"));
    }
  }
  public BsdAttributeConstraintTypeObjectData getBsdAttributeConstraintTypeObjectDataBsdAttributeConstraintTypeFromBsdAttributeConstraintTypeCreate() {
    return BsdAttributeConstraintTypeObjectHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
  public BsdAttributeConstraintTypeObjectData getBsdAttributeConstraintTypeObjectDataBsdAttributeConstraintTypeFromBsdAttributeConstraintTypeDelete() {
    return BsdAttributeConstraintTypeObjectHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
  public BsdAttributeConstraintTypeObjectDataList getBsdAttributeConstraintTypeObjectDataBsdAttributeConstraintTypeFromBsdAttributeConstraintTypeFind() {
    return BsdAttributeConstraintTypeObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintTypeList");
  }
  public BsdAttributeConstraintTypeObjectData getBsdAttributeConstraintTypeObjectDataBsdAttributeConstraintTypeFromBsdAttributeConstraintTypeGet() {
    return BsdAttributeConstraintTypeObjectHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
  public BsdAttributeConstraintTypeObjectKeyData getBsdAttributeConstraintTypeObjectKeyDataBsdAttributeConstraintTypeFromBsdAttributeConstraintTypeSequenceGet() {
    return BsdAttributeConstraintTypeObjectKeyHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
  public BsdAttributeConstraintTypeObjectData getBsdAttributeConstraintTypeObjectDataBsdAttributeConstraintTypeFromBsdAttributeConstraintTypeUpdate() {
    return BsdAttributeConstraintTypeObjectHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
  /**
   @deprecated
   */
  public void setBsdAttributeConstraintTypeObjectFilter(BsdAttributeConstraintTypeObjectFilter data) {
    if (data != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(data, new HashMap()).get("BsdAttributeConstraintTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdAttributeConstraintTypeObjectData(BsdAttributeConstraintTypeObjectData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectHelper.toMap(data, new HashMap()).get("BsdAttributeConstraintTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdAttributeConstraintTypeObjectKeyData(BsdAttributeConstraintTypeObjectKeyData data) {
    if (data != null) {
      addInput("BsdAttributeConstraintType", BsdAttributeConstraintTypeObjectKeyHelper.toMap(data, new HashMap()).get("BsdAttributeConstraintTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdAttributeConstraintTypeObjectDataList getBsdAttributeConstraintTypeObjectDataList() {
    return BsdAttributeConstraintTypeObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintTypeList");
  }
  /**
   @deprecated
   */
  public BsdAttributeConstraintTypeObjectKeyData getBsdAttributeConstraintTypeObjectKeyData() {
    return BsdAttributeConstraintTypeObjectKeyHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
  /**
   @deprecated
   */
  public BsdAttributeConstraintTypeObjectData getBsdAttributeConstraintTypeObjectData() {
    return BsdAttributeConstraintTypeObjectHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
}
