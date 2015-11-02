/*
 * Generated code DO NOT EDIT
 * Generated file: PackageGroupRequest.java
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

import com.csgsystems.cf.data.*;
public final class PackageGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PackageGroupRequest (String request, PackageGroupRequestMethod method) {
    initialize(request, "PackageGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PackageGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPackageGroupForPackageGroupCreate(PGObjectData data) {
    if (data != null) {
      addInput("PackageGroup", PGObjectHelper.toMap(data, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }
  public void setPackageGroupForPackageGroupDelete(PGObjectKeyData data) {
    if (data != null) {
      addInput("PackageGroup", PGObjectKeyHelper.toMap(data, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }
  public void setPackageGroupForPackageGroupFind(PGObjectFilter data) {
    if (data != null) {
      addInput("PackageGroup", PGObjectHelper.toMap(data, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }
  public void setPackageGroupForPackageGroupGet(PGObjectKeyData data) {
    if (data != null) {
      addInput("PackageGroup", PGObjectKeyHelper.toMap(data, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }
  public void setPackageGroupForPackageGroupUpdate(PGObjectData data) {
    if (data != null) {
      addInput("PackageGroup", PGObjectHelper.toMap(data, new HashMap(), "PackageGroup").get("PackageGroup"));
    }
  }
  public PGObjectData getPGObjectDataPackageGroupFromPackageGroupCreate() {
    return PGObjectHelper.fromMap(outputMap, "PackageGroup");
  }
  public PGObjectData getPGObjectDataPackageGroupFromPackageGroupDelete() {
    return PGObjectHelper.fromMap(outputMap, "PackageGroup");
  }
  public PGObjectDataList getPGObjectDataPackageGroupFromPackageGroupFind() {
    return PGObjectHelper.fromMapList(outputMap, "PackageGroupList");
  }
  public PGObjectData getPGObjectDataPackageGroupFromPackageGroupGet() {
    return PGObjectHelper.fromMap(outputMap, "PackageGroup");
  }
  public PGObjectData getPGObjectDataPackageGroupFromPackageGroupUpdate() {
    return PGObjectHelper.fromMap(outputMap, "PackageGroup");
  }
  /**
   @deprecated
   */
  public void setPGObjectFilter(PGObjectFilter data) {
    if (data != null) {
      addInput("PG", PGObjectHelper.toMap(data, new HashMap()).get("PGObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPGObjectData(PGObjectData data) {
    if (data != null) {
      addInput("PackageGroup", PGObjectHelper.toMap(data, new HashMap()).get("PGObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPGObjectKeyData(PGObjectKeyData data) {
    if (data != null) {
      addInput("PackageGroup", PGObjectKeyHelper.toMap(data, new HashMap()).get("PGObject"));
    }
  }
  /**
   @deprecated
   */
  public PGObjectDataList getPGObjectDataList() {
    return PGObjectHelper.fromMapList(outputMap, "PGList");
  }
  /**
   @deprecated
   */
  public PGObjectData getPGObjectData() {
    return PGObjectHelper.fromMap(outputMap, "PackageGroup");
  }
}
