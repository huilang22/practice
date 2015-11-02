/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRestrictionRequest.java
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
public final class UnitCrRestrictionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UnitCrRestrictionRequest (String request, UnitCrRestrictionRequestMethod method) {
    initialize(request, "UnitCrRestriction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UnitCrRestrictionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUnitCrRestrictionForUnitCrRestrictionCreate(UnitCrRestrictionObjectData data) {
    if (data != null) {
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(data, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }
  public void setUnitCrRestrictionForUnitCrRestrictionFind(UnitCrRestrictionObjectFilter data) {
    if (data != null) {
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(data, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }
  public void setUnitCrRestrictionForUnitCrRestrictionGet(UnitCrRestrictionObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrRestriction", UnitCrRestrictionObjectKeyHelper.toMap(data, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }
  public void setUnitCrRestrictionForUnitCrRestrictionUpdate(UnitCrRestrictionObjectData data) {
    if (data != null) {
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(data, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }
  public void setUnitCrRestrictionUpdateFilterForUnitCrRestrictionUpdate(UnitCrRestrictionObjectFilter data) {
    if (data != null) {
      addInput("UnitCrRestrictionUpdateFilter", UnitCrRestrictionObjectHelper.toMap(data, new HashMap(), "UnitCrRestrictionUpdateFilter").get("UnitCrRestrictionUpdateFilter"));
    }
  }
  public void setUnitCrRestrictionUpdateGetForUnitCrRestrictionUpdate(UnitCrRestrictionObjectData data) {
    if (data != null) {
      addInput("UnitCrRestrictionUpdateGet", UnitCrRestrictionObjectHelper.toMap(data, new HashMap(), "UnitCrRestrictionUpdateGet").get("UnitCrRestrictionUpdateGet"));
    }
  }
  public UnitCrRestrictionObjectData getUnitCrRestrictionObjectDataUnitCrRestrictionFromUnitCrRestrictionCreate() {
    return UnitCrRestrictionObjectHelper.fromMap(outputMap, "UnitCrRestriction");
  }
  public UnitCrRestrictionObjectDataList getUnitCrRestrictionObjectDataUnitCrRestrictionFromUnitCrRestrictionFind() {
    return UnitCrRestrictionObjectHelper.fromMapList(outputMap, "UnitCrRestrictionList");
  }
  public UnitCrRestrictionObjectData getUnitCrRestrictionObjectDataUnitCrRestrictionFromUnitCrRestrictionGet() {
    return UnitCrRestrictionObjectHelper.fromMap(outputMap, "UnitCrRestriction");
  }
  public UnitCrRestrictionObjectData getUnitCrRestrictionObjectDataUnitCrRestrictionFromUnitCrRestrictionUpdate() {
    return UnitCrRestrictionObjectHelper.fromMap(outputMap, "UnitCrRestriction");
  }
  /**
   @deprecated
   */
  public void setUnitCrRestrictionObjectFilter(UnitCrRestrictionObjectFilter data) {
    if (data != null) {
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(data, new HashMap()).get("UnitCrRestrictionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitCrRestrictionObjectData(UnitCrRestrictionObjectData data) {
    if (data != null) {
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(data, new HashMap()).get("UnitCrRestrictionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitCrRestrictionObjectKeyData(UnitCrRestrictionObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrRestriction", UnitCrRestrictionObjectKeyHelper.toMap(data, new HashMap()).get("UnitCrRestrictionObject"));
    }
  }
  /**
   @deprecated
   */
  public UnitCrRestrictionObjectDataList getUnitCrRestrictionObjectDataList() {
    return UnitCrRestrictionObjectHelper.fromMapList(outputMap, "UnitCrRestrictionList");
  }
  /**
   @deprecated
   */
  public UnitCrRestrictionObjectData getUnitCrRestrictionObjectData() {
    return UnitCrRestrictionObjectHelper.fromMap(outputMap, "UnitCrRestriction");
  }
}
