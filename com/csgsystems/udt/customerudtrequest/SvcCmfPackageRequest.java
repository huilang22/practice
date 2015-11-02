/*
 * Generated code DO NOT EDIT
 * Generated file: SvcCmfPackageRequest.java
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

import com.csgsystems.om.data.*;
public final class SvcCmfPackageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SvcCmfPackageRequest (String request, SvcCmfPackageRequestMethod method) {
    initialize(request, "SvcCmfPackage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SvcCmfPackageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSvcCmfPackageForSvcCmfPackageFind(SvcCmfPackageObjectFilter data) {
    if (data != null) {
      addInput("SvcCmfPackage", SvcCmfPackageObjectHelper.toMap(data, new HashMap(), "SvcCmfPackage").get("SvcCmfPackage"));
    }
  }
  public SvcCmfPackageObjectDataList getSvcCmfPackageObjectDataSvcCmfPackageFromSvcCmfPackageFind() {
    return SvcCmfPackageObjectHelper.fromMapList(outputMap, "SvcCmfPackageList");
  }
  /**
   @deprecated
   */
  public void setSvcCmfPackageObjectFilter(SvcCmfPackageObjectFilter data) {
    if (data != null) {
      addInput("SvcCmfPackage", SvcCmfPackageObjectHelper.toMap(data, new HashMap()).get("SvcCmfPackageObject"));
    }
  }
  /**
   @deprecated
   */
  public SvcCmfPackageObjectDataList getSvcCmfPackageObjectDataList() {
    return SvcCmfPackageObjectHelper.fromMapList(outputMap, "SvcCmfPackageList");
  }
}
