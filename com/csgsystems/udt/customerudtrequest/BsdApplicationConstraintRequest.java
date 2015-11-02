/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationConstraintRequest.java
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
public final class BsdApplicationConstraintRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdApplicationConstraintRequest (String request, BsdApplicationConstraintRequestMethod method) {
    initialize(request, "BsdApplicationConstraint", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdApplicationConstraintRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdApplicationConstraintForBsdApplicationConstraintCreate(BsdApplicationConstraintObjectData data) {
    if (data != null) {
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectHelper.toMap(data, new HashMap(), "BsdApplicationConstraint").get("BsdApplicationConstraint"));
    }
  }
  public void setBsdApplicationConstraintForBsdApplicationConstraintDelete(BsdApplicationConstraintObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectKeyHelper.toMap(data, new HashMap(), "BsdApplicationConstraint").get("BsdApplicationConstraint"));
    }
  }
  public void setBsdApplicationConstraintForBsdApplicationConstraintFind(BsdApplicationConstraintObjectFilter data) {
    if (data != null) {
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectHelper.toMap(data, new HashMap(), "BsdApplicationConstraint").get("BsdApplicationConstraint"));
    }
  }
  public void setBsdApplicationConstraintForBsdApplicationConstraintGet(BsdApplicationConstraintObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectKeyHelper.toMap(data, new HashMap(), "BsdApplicationConstraint").get("BsdApplicationConstraint"));
    }
  }
  public BsdApplicationConstraintObjectData getBsdApplicationConstraintObjectDataBsdApplicationConstraintFromBsdApplicationConstraintCreate() {
    return BsdApplicationConstraintObjectHelper.fromMap(outputMap, "BsdApplicationConstraint");
  }
  public BsdApplicationConstraintObjectData getBsdApplicationConstraintObjectDataBsdApplicationConstraintFromBsdApplicationConstraintDelete() {
    return BsdApplicationConstraintObjectHelper.fromMap(outputMap, "BsdApplicationConstraint");
  }
  public BsdApplicationConstraintObjectDataList getBsdApplicationConstraintObjectDataBsdApplicationConstraintFromBsdApplicationConstraintFind() {
    return BsdApplicationConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationConstraintList");
  }
  public BsdApplicationConstraintObjectData getBsdApplicationConstraintObjectDataBsdApplicationConstraintFromBsdApplicationConstraintGet() {
    return BsdApplicationConstraintObjectHelper.fromMap(outputMap, "BsdApplicationConstraint");
  }
  /**
   @deprecated
   */
  public void setBsdApplicationConstraintObjectFilter(BsdApplicationConstraintObjectFilter data) {
    if (data != null) {
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectHelper.toMap(data, new HashMap()).get("BsdApplicationConstraintObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdApplicationConstraintObjectData(BsdApplicationConstraintObjectData data) {
    if (data != null) {
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectHelper.toMap(data, new HashMap()).get("BsdApplicationConstraintObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdApplicationConstraintObjectKeyData(BsdApplicationConstraintObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationConstraint", BsdApplicationConstraintObjectKeyHelper.toMap(data, new HashMap()).get("BsdApplicationConstraintObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdApplicationConstraintObjectDataList getBsdApplicationConstraintObjectDataList() {
    return BsdApplicationConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationConstraintList");
  }
  /**
   @deprecated
   */
  public BsdApplicationConstraintObjectData getBsdApplicationConstraintObjectData() {
    return BsdApplicationConstraintObjectHelper.fromMap(outputMap, "BsdApplicationConstraint");
  }
}
