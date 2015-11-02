/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintTypeRequest.java
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
public final class BsdRelationalConstraintTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdRelationalConstraintTypeRequest (String request, BsdRelationalConstraintTypeRequestMethod method) {
    initialize(request, "BsdRelationalConstraintType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdRelationalConstraintTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdRelationalConstraintTypeForBsdRelationalConstraintTypeCreate(BsdRelationalConstraintTypeObjectData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(data, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }
  public void setBsdRelationalConstraintTypeForBsdRelationalConstraintTypeDelete(BsdRelationalConstraintTypeObjectKeyData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectKeyHelper.toMap(data, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }
  public void setBsdRelationalConstraintTypeForBsdRelationalConstraintTypeFind(BsdRelationalConstraintTypeObjectFilter data) {
    if (data != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(data, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }
  public void setBsdRelationalConstraintTypeForBsdRelationalConstraintTypeGet(BsdRelationalConstraintTypeObjectKeyData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectKeyHelper.toMap(data, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }
  public void setBsdRelationalConstraintTypeForBsdRelationalConstraintTypeUpdate(BsdRelationalConstraintTypeObjectData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(data, new HashMap(), "BsdRelationalConstraintType").get("BsdRelationalConstraintType"));
    }
  }
  public BsdRelationalConstraintTypeObjectData getBsdRelationalConstraintTypeObjectDataBsdRelationalConstraintTypeFromBsdRelationalConstraintTypeCreate() {
    return BsdRelationalConstraintTypeObjectHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
  public BsdRelationalConstraintTypeObjectData getBsdRelationalConstraintTypeObjectDataBsdRelationalConstraintTypeFromBsdRelationalConstraintTypeDelete() {
    return BsdRelationalConstraintTypeObjectHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
  public BsdRelationalConstraintTypeObjectDataList getBsdRelationalConstraintTypeObjectDataBsdRelationalConstraintTypeFromBsdRelationalConstraintTypeFind() {
    return BsdRelationalConstraintTypeObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintTypeList");
  }
  public BsdRelationalConstraintTypeObjectData getBsdRelationalConstraintTypeObjectDataBsdRelationalConstraintTypeFromBsdRelationalConstraintTypeGet() {
    return BsdRelationalConstraintTypeObjectHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
  public BsdRelationalConstraintTypeObjectKeyData getBsdRelationalConstraintTypeObjectKeyDataBsdRelationalConstraintTypeFromBsdRelationalConstraintTypeSequenceGet() {
    return BsdRelationalConstraintTypeObjectKeyHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
  public BsdRelationalConstraintTypeObjectData getBsdRelationalConstraintTypeObjectDataBsdRelationalConstraintTypeFromBsdRelationalConstraintTypeUpdate() {
    return BsdRelationalConstraintTypeObjectHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
  /**
   @deprecated
   */
  public void setBsdRelationalConstraintTypeObjectFilter(BsdRelationalConstraintTypeObjectFilter data) {
    if (data != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(data, new HashMap()).get("BsdRelationalConstraintTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdRelationalConstraintTypeObjectData(BsdRelationalConstraintTypeObjectData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectHelper.toMap(data, new HashMap()).get("BsdRelationalConstraintTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdRelationalConstraintTypeObjectKeyData(BsdRelationalConstraintTypeObjectKeyData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintType", BsdRelationalConstraintTypeObjectKeyHelper.toMap(data, new HashMap()).get("BsdRelationalConstraintTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdRelationalConstraintTypeObjectDataList getBsdRelationalConstraintTypeObjectDataList() {
    return BsdRelationalConstraintTypeObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintTypeList");
  }
  /**
   @deprecated
   */
  public BsdRelationalConstraintTypeObjectKeyData getBsdRelationalConstraintTypeObjectKeyData() {
    return BsdRelationalConstraintTypeObjectKeyHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
  /**
   @deprecated
   */
  public BsdRelationalConstraintTypeObjectData getBsdRelationalConstraintTypeObjectData() {
    return BsdRelationalConstraintTypeObjectHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
}
