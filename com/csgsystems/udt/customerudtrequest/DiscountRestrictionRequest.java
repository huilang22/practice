/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountRestrictionRequest.java
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
public final class DiscountRestrictionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DiscountRestrictionRequest (String request, DiscountRestrictionRequestMethod method) {
    initialize(request, "DiscountRestriction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DiscountRestrictionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDiscountRestrictionForDiscountRestrictionCreate(DRObjectData data) {
    if (data != null) {
      addInput("DiscountRestriction", DRObjectHelper.toMap(data, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }
  public void setDiscountRestrictionForDiscountRestrictionDelete(DRObjectKeyData data) {
    if (data != null) {
      addInput("DiscountRestriction", DRObjectKeyHelper.toMap(data, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }
  public void setDiscountRestrictionForDiscountRestrictionFind(DRObjectFilter data) {
    if (data != null) {
      addInput("DiscountRestriction", DRObjectHelper.toMap(data, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }
  public void setDiscountRestrictionForDiscountRestrictionGet(DRObjectKeyData data) {
    if (data != null) {
      addInput("DiscountRestriction", DRObjectKeyHelper.toMap(data, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }
  public void setDRUpdateFilterForDiscountRestrictionUpdate(DRObjectFilter data) {
    if (data != null) {
      addInput("DRUpdateFilter", DRObjectHelper.toMap(data, new HashMap(), "DRUpdateFilter").get("DRUpdateFilter"));
    }
  }
  public void setDRUpdateGetForDiscountRestrictionUpdate(DRObjectData data) {
    if (data != null) {
      addInput("DRUpdateGet", DRObjectHelper.toMap(data, new HashMap(), "DRUpdateGet").get("DRUpdateGet"));
    }
  }
  public void setDiscountRestrictionForDiscountRestrictionUpdate(DRObjectData data) {
    if (data != null) {
      addInput("DiscountRestriction", DRObjectHelper.toMap(data, new HashMap(), "DiscountRestriction").get("DiscountRestriction"));
    }
  }
  public DRObjectData getDRObjectDataDiscountRestrictionFromDiscountRestrictionCreate() {
    return DRObjectHelper.fromMap(outputMap, "DiscountRestriction");
  }
  public DRObjectData getDRObjectDataDiscountRestrictionFromDiscountRestrictionDelete() {
    return DRObjectHelper.fromMap(outputMap, "DiscountRestriction");
  }
  public DRObjectDataList getDRObjectDataDiscountRestrictionFromDiscountRestrictionFind() {
    return DRObjectHelper.fromMapList(outputMap, "DiscountRestrictionList");
  }
  public DRObjectData getDRObjectDataDiscountRestrictionFromDiscountRestrictionGet() {
    return DRObjectHelper.fromMap(outputMap, "DiscountRestriction");
  }
  public DRObjectData getDRObjectDataDiscountRestrictionFromDiscountRestrictionUpdate() {
    return DRObjectHelper.fromMap(outputMap, "DiscountRestriction");
  }
  /**
   @deprecated
   */
  public void setDRObjectFilter(DRObjectFilter data) {
    if (data != null) {
      addInput("DR", DRObjectHelper.toMap(data, new HashMap()).get("DRObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDRObjectData(DRObjectData data) {
    if (data != null) {
      addInput("DR", DRObjectHelper.toMap(data, new HashMap()).get("DRObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDRObjectKeyData(DRObjectKeyData data) {
    if (data != null) {
      addInput("DiscountRestriction", DRObjectKeyHelper.toMap(data, new HashMap()).get("DRObject"));
    }
  }
  /**
   @deprecated
   */
  public DRObjectDataList getDRObjectDataList() {
    return DRObjectHelper.fromMapList(outputMap, "DRList");
  }
  /**
   @deprecated
   */
  public DRObjectData getDRObjectData() {
    return DRObjectHelper.fromMap(outputMap, "DiscountRestriction");
  }
}
