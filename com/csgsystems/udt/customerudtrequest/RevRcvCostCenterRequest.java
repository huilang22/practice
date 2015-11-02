/*
 * Generated code DO NOT EDIT
 * Generated file: RevRcvCostCenterRequest.java
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

import com.csgsystems.bp.data.*;
public final class RevRcvCostCenterRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RevRcvCostCenterRequest (String request, RevRcvCostCenterRequestMethod method) {
    initialize(request, "RevRcvCostCenter", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RevRcvCostCenterRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRevRcvCostCenterForRevRcvCostCenterCreate(RevRcvCostCenterObjectData data) {
    if (data != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(data, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }
  public void setRevRcvCostCenterForRevRcvCostCenterDelete(RevRcvCostCenterObjectKeyData data) {
    if (data != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectKeyHelper.toMap(data, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }
  public void setRevRcvCostCenterForRevRcvCostCenterFind(RevRcvCostCenterObjectFilter data) {
    if (data != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(data, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }
  public void setRevRcvCostCenterForRevRcvCostCenterGet(RevRcvCostCenterObjectKeyData data) {
    if (data != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectKeyHelper.toMap(data, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }
  public void setRevRcvCostCenterForRevRcvCostCenterUpdate(RevRcvCostCenterObjectData data) {
    if (data != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(data, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }
  public RevRcvCostCenterObjectData getRevRcvCostCenterObjectDataRevRcvCostCenterFromRevRcvCostCenterCreate() {
    return RevRcvCostCenterObjectHelper.fromMap(outputMap, "RevRcvCostCenter");
  }
  public RevRcvCostCenterObjectData getRevRcvCostCenterObjectDataRevRcvCostCenterFromRevRcvCostCenterDelete() {
    return RevRcvCostCenterObjectHelper.fromMap(outputMap, "RevRcvCostCenter");
  }
  public RevRcvCostCenterObjectDataList getRevRcvCostCenterObjectDataRevRcvCostCenterFromRevRcvCostCenterFind() {
    return RevRcvCostCenterObjectHelper.fromMapList(outputMap, "RevRcvCostCenterList");
  }
  public RevRcvCostCenterObjectData getRevRcvCostCenterObjectDataRevRcvCostCenterFromRevRcvCostCenterGet() {
    return RevRcvCostCenterObjectHelper.fromMap(outputMap, "RevRcvCostCenter");
  }
  public RevRcvCostCenterObjectData getRevRcvCostCenterObjectDataRevRcvCostCenterFromRevRcvCostCenterUpdate() {
    return RevRcvCostCenterObjectHelper.fromMap(outputMap, "RevRcvCostCenter");
  }
  /**
   @deprecated
   */
  public void setRevRcvCostCenterObjectFilter(RevRcvCostCenterObjectFilter data) {
    if (data != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(data, new HashMap()).get("RevRcvCostCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRevRcvCostCenterObjectData(RevRcvCostCenterObjectData data) {
    if (data != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(data, new HashMap()).get("RevRcvCostCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRevRcvCostCenterObjectKeyData(RevRcvCostCenterObjectKeyData data) {
    if (data != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectKeyHelper.toMap(data, new HashMap()).get("RevRcvCostCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public RevRcvCostCenterObjectDataList getRevRcvCostCenterObjectDataList() {
    return RevRcvCostCenterObjectHelper.fromMapList(outputMap, "RevRcvCostCenterList");
  }
  /**
   @deprecated
   */
  public RevRcvCostCenterObjectData getRevRcvCostCenterObjectData() {
    return RevRcvCostCenterObjectHelper.fromMap(outputMap, "RevRcvCostCenter");
  }
}
