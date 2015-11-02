/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountTargetRequest.java
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
public final class DiscountTargetRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DiscountTargetRequest (String request, DiscountTargetRequestMethod method) {
    initialize(request, "DiscountTarget", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DiscountTargetRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDiscountTargetForDiscountTargetCreate(DTObjectData data) {
    if (data != null) {
      addInput("DiscountTarget", DTObjectHelper.toMap(data, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }
  public void setDiscountTargetForDiscountTargetDelete(DTObjectKeyData data) {
    if (data != null) {
      addInput("DiscountTarget", DTObjectKeyHelper.toMap(data, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }
  public void setDiscountTargetForDiscountTargetFind(DTObjectFilter data) {
    if (data != null) {
      addInput("DiscountTarget", DTObjectHelper.toMap(data, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }
  public void setDiscountTargetForDiscountTargetGet(DTObjectKeyData data) {
    if (data != null) {
      addInput("DiscountTarget", DTObjectKeyHelper.toMap(data, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }
  public void setDTUpdateFilterForDiscountTargetUpdate(DTObjectFilter data) {
    if (data != null) {
      addInput("DTUpdateFilter", DTObjectHelper.toMap(data, new HashMap(), "DTUpdateFilter").get("DTUpdateFilter"));
    }
  }
  public void setDTUpdateGetForDiscountTargetUpdate(DTObjectData data) {
    if (data != null) {
      addInput("DTUpdateGet", DTObjectHelper.toMap(data, new HashMap(), "DTUpdateGet").get("DTUpdateGet"));
    }
  }
  public void setDiscountTargetForDiscountTargetUpdate(DTObjectData data) {
    if (data != null) {
      addInput("DiscountTarget", DTObjectHelper.toMap(data, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }
  public DTObjectData getDTObjectDataDiscountTargetFromDiscountTargetCreate() {
    return DTObjectHelper.fromMap(outputMap, "DiscountTarget");
  }
  public DTObjectData getDTObjectDataDiscountTargetFromDiscountTargetDelete() {
    return DTObjectHelper.fromMap(outputMap, "DiscountTarget");
  }
  public DTObjectDataList getDTObjectDataDiscountTargetFromDiscountTargetFind() {
    return DTObjectHelper.fromMapList(outputMap, "DiscountTargetList");
  }
  public DTObjectData getDTObjectDataDiscountTargetFromDiscountTargetGet() {
    return DTObjectHelper.fromMap(outputMap, "DiscountTarget");
  }
  public DTObjectData getDTObjectDataDiscountTargetFromDiscountTargetUpdate() {
    return DTObjectHelper.fromMap(outputMap, "DiscountTarget");
  }
  /**
   @deprecated
   */
  public void setDTObjectFilter(DTObjectFilter data) {
    if (data != null) {
      addInput("DT", DTObjectHelper.toMap(data, new HashMap()).get("DTObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDTObjectData(DTObjectData data) {
    if (data != null) {
      addInput("DT", DTObjectHelper.toMap(data, new HashMap()).get("DTObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDTObjectKeyData(DTObjectKeyData data) {
    if (data != null) {
      addInput("DiscountTarget", DTObjectKeyHelper.toMap(data, new HashMap()).get("DTObject"));
    }
  }
  /**
   @deprecated
   */
  public DTObjectDataList getDTObjectDataList() {
    return DTObjectHelper.fromMapList(outputMap, "DTList");
  }
  /**
   @deprecated
   */
  public DTObjectData getDTObjectData() {
    return DTObjectHelper.fromMap(outputMap, "DiscountTarget");
  }
}
