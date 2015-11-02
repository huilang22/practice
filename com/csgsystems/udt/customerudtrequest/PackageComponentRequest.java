/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentRequest.java
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
public final class PackageComponentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PackageComponentRequest (String request, PackageComponentRequestMethod method) {
    initialize(request, "PackageComponent", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PackageComponentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPackageComponentForPackageComponentCreate(PCObjectData data) {
    if (data != null) {
      addInput("PackageComponent", PCObjectHelper.toMap(data, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }
  public void setPackageComponentForPackageComponentDelete(PCObjectKeyData data) {
    if (data != null) {
      addInput("PackageComponent", PCObjectKeyHelper.toMap(data, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }
  public void setPackageComponentForPackageComponentFind(PCObjectFilter data) {
    if (data != null) {
      addInput("PackageComponent", PCObjectHelper.toMap(data, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }
  public void setPackageComponentForPackageComponentGet(PCObjectKeyData data) {
    if (data != null) {
      addInput("PackageComponent", PCObjectKeyHelper.toMap(data, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }
  public void setPCUpdateFilterForPackageComponentUpdate(PCObjectFilter data) {
    if (data != null) {
      addInput("PCUpdateFilter", PCObjectHelper.toMap(data, new HashMap(), "PCUpdateFilter").get("PCUpdateFilter"));
    }
  }
  public void setPCUpdateGetForPackageComponentUpdate(PCObjectData data) {
    if (data != null) {
      addInput("PCUpdateGet", PCObjectHelper.toMap(data, new HashMap(), "PCUpdateGet").get("PCUpdateGet"));
    }
  }
  public void setPackageComponentForPackageComponentUpdate(PCObjectData data) {
    if (data != null) {
      addInput("PackageComponent", PCObjectHelper.toMap(data, new HashMap(), "PackageComponent").get("PackageComponent"));
    }
  }
  public PCObjectData getPCObjectDataPackageComponentFromPackageComponentCreate() {
    return PCObjectHelper.fromMap(outputMap, "PackageComponent");
  }
  public PCObjectData getPCObjectDataPackageComponentFromPackageComponentDelete() {
    return PCObjectHelper.fromMap(outputMap, "PackageComponent");
  }
  public PCObjectDataList getPCObjectDataPackageComponentFromPackageComponentFind() {
    return PCObjectHelper.fromMapList(outputMap, "PackageComponentList");
  }
  public PCObjectData getPCObjectDataPackageComponentFromPackageComponentGet() {
    return PCObjectHelper.fromMap(outputMap, "PackageComponent");
  }
  public PCObjectData getPCObjectDataPackageComponentFromPackageComponentUpdate() {
    return PCObjectHelper.fromMap(outputMap, "PackageComponent");
  }
  /**
   @deprecated
   */
  public void setPCObjectFilter(PCObjectFilter data) {
    if (data != null) {
      addInput("PC", PCObjectHelper.toMap(data, new HashMap()).get("PCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPCObjectData(PCObjectData data) {
    if (data != null) {
      addInput("PC", PCObjectHelper.toMap(data, new HashMap()).get("PCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPCObjectKeyData(PCObjectKeyData data) {
    if (data != null) {
      addInput("PackageComponent", PCObjectKeyHelper.toMap(data, new HashMap()).get("PCObject"));
    }
  }
  /**
   @deprecated
   */
  public PCObjectDataList getPCObjectDataList() {
    return PCObjectHelper.fromMapList(outputMap, "PCList");
  }
  /**
   @deprecated
   */
  public PCObjectData getPCObjectData() {
    return PCObjectHelper.fromMap(outputMap, "PackageComponent");
  }
}
