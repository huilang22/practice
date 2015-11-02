/*
 * Generated code DO NOT EDIT
 * Generated file: DescriptionRequest.java
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
public final class DescriptionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DescriptionRequest (String request, DescriptionRequestMethod method) {
    initialize(request, "Description", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DescriptionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDescriptionForDescriptionCreate(DescriptionObjectData data) {
    if (data != null) {
      addInput("Description", DescriptionObjectHelper.toMap(data, new HashMap(), "Description").get("Description"));
    }
  }
  public void setDescriptionForDescriptionFind(DescriptionObjectFilter data) {
    if (data != null) {
      addInput("Description", DescriptionObjectHelper.toMap(data, new HashMap(), "Description").get("Description"));
    }
  }
  public void setDescriptionForDescriptionGet(DescriptionObjectKeyData data) {
    if (data != null) {
      addInput("Description", DescriptionObjectKeyHelper.toMap(data, new HashMap(), "Description").get("Description"));
    }
  }
  public void setDescriptionForDescriptionUpdate(DescriptionObjectData data) {
    if (data != null) {
      addInput("Description", DescriptionObjectHelper.toMap(data, new HashMap(), "Description").get("Description"));
    }
  }
  public DescriptionObjectData getDescriptionObjectDataDescriptionFromDescriptionCreate() {
    return DescriptionObjectHelper.fromMap(outputMap, "Description");
  }
  public DescriptionObjectDataList getDescriptionObjectDataDescriptionFromDescriptionFind() {
    return DescriptionObjectHelper.fromMapList(outputMap, "DescriptionList");
  }
  public DescriptionObjectData getDescriptionObjectDataDescriptionFromDescriptionGet() {
    return DescriptionObjectHelper.fromMap(outputMap, "Description");
  }
  public DescriptionObjectData getDescriptionObjectDataDescriptionFromDescriptionUpdate() {
    return DescriptionObjectHelper.fromMap(outputMap, "Description");
  }
  /**
   @deprecated
   */
  public void setDescriptionObjectFilter(DescriptionObjectFilter data) {
    if (data != null) {
      addInput("Description", DescriptionObjectHelper.toMap(data, new HashMap()).get("DescriptionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDescriptionObjectData(DescriptionObjectData data) {
    if (data != null) {
      addInput("Description", DescriptionObjectHelper.toMap(data, new HashMap()).get("DescriptionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDescriptionObjectKeyData(DescriptionObjectKeyData data) {
    if (data != null) {
      addInput("Description", DescriptionObjectKeyHelper.toMap(data, new HashMap()).get("DescriptionObject"));
    }
  }
  /**
   @deprecated
   */
  public DescriptionObjectDataList getDescriptionObjectDataList() {
    return DescriptionObjectHelper.fromMapList(outputMap, "DescriptionList");
  }
  /**
   @deprecated
   */
  public DescriptionObjectData getDescriptionObjectData() {
    return DescriptionObjectHelper.fromMap(outputMap, "Description");
  }
}
