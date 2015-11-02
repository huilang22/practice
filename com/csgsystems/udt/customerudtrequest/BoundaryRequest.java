/*
 * Generated code DO NOT EDIT
 * Generated file: BoundaryRequest.java
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

import com.csgsystems.svbl.data.*;
public final class BoundaryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BoundaryRequest (String request, BoundaryRequestMethod method) {
    initialize(request, "Boundary", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BoundaryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBoundaryForBoundaryGet(BoundaryObjectKeyData data) {
    if (data != null) {
      addInput("Boundary", BoundaryObjectKeyHelper.toMap(data, new HashMap(), "Boundary").get("Boundary"));
    }
  }
  public void setBoundaryIdIForBoundaryListActive(Integer data) {
    if (data != null) {
      addInput("BoundaryIdI", data);
    }
  }
  public void setObjectTypeIForBoundaryListActive(Integer data) {
    if (data != null) {
      addInput("ObjectTypeI", data);
    }
  }
  public BoundaryObjectData getBoundaryObjectDataBoundaryFromBoundaryGet() {
    return BoundaryObjectHelper.fromMap(outputMap, "Boundary");
  }
  public BoundaryObjectDataList getBoundaryObjectDataBoundaryFromBoundaryListActive() {
    return BoundaryObjectHelper.fromMapList(outputMap, "BoundaryList");
  }
  /**
   @deprecated
   */
  public void setBoundaryIdI(Integer data) {
    if (data != null) {
      addInput("BoundaryIdI", data);
    }
  }
  /**
   @deprecated
   */
  public void setBoundaryObjectKeyData(BoundaryObjectKeyData data) {
    if (data != null) {
      addInput("Boundary", BoundaryObjectKeyHelper.toMap(data, new HashMap()).get("BoundaryObject"));
    }
  }
  /**
   @deprecated
   */
  public BoundaryObjectDataList getBoundaryObjectDataList() {
    return BoundaryObjectHelper.fromMapList(outputMap, "BoundaryList");
  }
  /**
   @deprecated
   */
  public BoundaryObjectData getBoundaryObjectData() {
    return BoundaryObjectHelper.fromMap(outputMap, "Boundary");
  }
  /**
   @deprecated
   */
  public void setObjectTypeI(Integer data) {
    if (data != null) {
      addInput("ObjectTypeI", data);
    }
  }
}
