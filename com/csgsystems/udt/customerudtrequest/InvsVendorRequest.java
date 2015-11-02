/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvsVendorRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsVendorRequest (String request, InvsVendorRequestMethod method) {
    initialize(request, "InvsVendor", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsVendorRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsVendorForInvsVendorCreate(InvsVendorObjectData data) {
    if (data != null) {
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(data, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }
  public void setInvsVendorForInvsVendorFind(InvsVendorObjectFilter data) {
    if (data != null) {
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(data, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }
  public void setInvsVendorForInvsVendorGet(InvsVendorObjectKeyData data) {
    if (data != null) {
      addInput("InvsVendor", InvsVendorObjectKeyHelper.toMap(data, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }
  public void setInvsVendorForInvsVendorUpdate(InvsVendorObjectData data) {
    if (data != null) {
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(data, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }
  public InvsVendorObjectData getInvsVendorObjectDataInvsVendorFromInvsVendorCreate() {
    return InvsVendorObjectHelper.fromMap(outputMap, "InvsVendor");
  }
  public InvsVendorObjectDataList getInvsVendorObjectDataInvsVendorFromInvsVendorFind() {
    return InvsVendorObjectHelper.fromMapList(outputMap, "InvsVendorList");
  }
  public InvsVendorObjectData getInvsVendorObjectDataInvsVendorFromInvsVendorGet() {
    return InvsVendorObjectHelper.fromMap(outputMap, "InvsVendor");
  }
  public InvsVendorObjectData getInvsVendorObjectDataInvsVendorFromInvsVendorUpdate() {
    return InvsVendorObjectHelper.fromMap(outputMap, "InvsVendor");
  }
  /**
   @deprecated
   */
  public void setInvsVendorObjectFilter(InvsVendorObjectFilter data) {
    if (data != null) {
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(data, new HashMap()).get("InvsVendorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsVendorObjectData(InvsVendorObjectData data) {
    if (data != null) {
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(data, new HashMap()).get("InvsVendorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsVendorObjectKeyData(InvsVendorObjectKeyData data) {
    if (data != null) {
      addInput("InvsVendor", InvsVendorObjectKeyHelper.toMap(data, new HashMap()).get("InvsVendorObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsVendorObjectDataList getInvsVendorObjectDataList() {
    return InvsVendorObjectHelper.fromMapList(outputMap, "InvsVendorList");
  }
  /**
   @deprecated
   */
  public InvsVendorObjectData getInvsVendorObjectData() {
    return InvsVendorObjectHelper.fromMap(outputMap, "InvsVendor");
  }
}
