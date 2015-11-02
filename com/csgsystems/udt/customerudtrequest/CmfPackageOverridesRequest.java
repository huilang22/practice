/*
 * Generated code DO NOT EDIT
 * Generated file: CmfPackageOverridesRequest.java
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
public final class CmfPackageOverridesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CmfPackageOverridesRequest (String request, CmfPackageOverridesRequestMethod method) {
    initialize(request, "CmfPackageOverrides", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CmfPackageOverridesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCmfPackageOverridesForCmfPackageOverridesCreate(PackageOverridesObjectData data) {
    if (data != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(data, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }
  public void setCmfPackageOverridesForCmfPackageOverridesDelete(PackageOverridesObjectKeyData data) {
    if (data != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectKeyHelper.toMap(data, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }
  public void setCmfPackageOverridesForCmfPackageOverridesFind(PackageOverridesObjectFilter data) {
    if (data != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(data, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }
  public void setCmfPackageOverridesForCmfPackageOverridesGet(PackageOverridesObjectKeyData data) {
    if (data != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectKeyHelper.toMap(data, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }
  public void setCmfPackageOverridesForCmfPackageOverridesUpdate(PackageOverridesObjectData data) {
    if (data != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(data, new HashMap(), "CmfPackageOverrides").get("CmfPackageOverrides"));
    }
  }
  public PackageOverridesObjectData getPackageOverridesObjectDataCmfPackageOverridesFromCmfPackageOverridesCreate() {
    return PackageOverridesObjectHelper.fromMap(outputMap, "CmfPackageOverrides");
  }
  public PackageOverridesObjectData getPackageOverridesObjectDataCmfPackageOverridesFromCmfPackageOverridesDelete() {
    return PackageOverridesObjectHelper.fromMap(outputMap, "CmfPackageOverrides");
  }
  public PackageOverridesObjectDataList getPackageOverridesObjectDataCmfPackageOverridesFromCmfPackageOverridesFind() {
    return PackageOverridesObjectHelper.fromMapList(outputMap, "CmfPackageOverridesList");
  }
  public PackageOverridesObjectData getPackageOverridesObjectDataCmfPackageOverridesFromCmfPackageOverridesGet() {
    return PackageOverridesObjectHelper.fromMap(outputMap, "CmfPackageOverrides");
  }
  public PackageOverridesObjectData getPackageOverridesObjectDataCmfPackageOverridesFromCmfPackageOverridesUpdate() {
    return PackageOverridesObjectHelper.fromMap(outputMap, "CmfPackageOverrides");
  }
  /**
   @deprecated
   */
  public void setPackageOverridesObjectFilter(PackageOverridesObjectFilter data) {
    if (data != null) {
      addInput("PackageOverrides", PackageOverridesObjectHelper.toMap(data, new HashMap()).get("PackageOverridesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPackageOverridesObjectData(PackageOverridesObjectData data) {
    if (data != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectHelper.toMap(data, new HashMap()).get("PackageOverridesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPackageOverridesObjectKeyData(PackageOverridesObjectKeyData data) {
    if (data != null) {
      addInput("CmfPackageOverrides", PackageOverridesObjectKeyHelper.toMap(data, new HashMap()).get("PackageOverridesObject"));
    }
  }
  /**
   @deprecated
   */
  public PackageOverridesObjectDataList getPackageOverridesObjectDataList() {
    return PackageOverridesObjectHelper.fromMapList(outputMap, "PackageOverridesList");
  }
  /**
   @deprecated
   */
  public PackageOverridesObjectData getPackageOverridesObjectData() {
    return PackageOverridesObjectHelper.fromMap(outputMap, "CmfPackageOverrides");
  }
}
