/*
 * Generated code DO NOT EDIT
 * Generated file: NonWorkDaysRequest.java
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

import com.csgsystems.we.data.*;
public final class NonWorkDaysRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NonWorkDaysRequest (String request, NonWorkDaysRequestMethod method) {
    initialize(request, "NonWorkDays", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NonWorkDaysRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNonWorkDaysForNonWorkDaysCreate(NonWorkDaysObjectData data) {
    if (data != null) {
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(data, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }
  public void setNonWorkDaysForNonWorkDaysFind(NonWorkDaysObjectFilter data) {
    if (data != null) {
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(data, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }
  public void setNonWorkDaysForNonWorkDaysGet(NonWorkDaysObjectKeyData data) {
    if (data != null) {
      addInput("NonWorkDays", NonWorkDaysObjectKeyHelper.toMap(data, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }
  public void setNonWorkDaysForNonWorkDaysUpdate(NonWorkDaysObjectData data) {
    if (data != null) {
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(data, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }
  public NonWorkDaysObjectData getNonWorkDaysObjectDataNonWorkDaysFromNonWorkDaysCreate() {
    return NonWorkDaysObjectHelper.fromMap(outputMap, "NonWorkDays");
  }
  public NonWorkDaysObjectDataList getNonWorkDaysObjectDataNonWorkDaysFromNonWorkDaysFind() {
    return NonWorkDaysObjectHelper.fromMapList(outputMap, "NonWorkDaysList");
  }
  public NonWorkDaysObjectData getNonWorkDaysObjectDataNonWorkDaysFromNonWorkDaysGet() {
    return NonWorkDaysObjectHelper.fromMap(outputMap, "NonWorkDays");
  }
  public NonWorkDaysObjectData getNonWorkDaysObjectDataNonWorkDaysFromNonWorkDaysUpdate() {
    return NonWorkDaysObjectHelper.fromMap(outputMap, "NonWorkDays");
  }
  /**
   @deprecated
   */
  public void setNonWorkDaysObjectFilter(NonWorkDaysObjectFilter data) {
    if (data != null) {
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(data, new HashMap()).get("NonWorkDaysObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNonWorkDaysObjectData(NonWorkDaysObjectData data) {
    if (data != null) {
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(data, new HashMap()).get("NonWorkDaysObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNonWorkDaysObjectKeyData(NonWorkDaysObjectKeyData data) {
    if (data != null) {
      addInput("NonWorkDays", NonWorkDaysObjectKeyHelper.toMap(data, new HashMap()).get("NonWorkDaysObject"));
    }
  }
  /**
   @deprecated
   */
  public NonWorkDaysObjectDataList getNonWorkDaysObjectDataList() {
    return NonWorkDaysObjectHelper.fromMapList(outputMap, "NonWorkDaysList");
  }
  /**
   @deprecated
   */
  public NonWorkDaysObjectData getNonWorkDaysObjectData() {
    return NonWorkDaysObjectHelper.fromMap(outputMap, "NonWorkDays");
  }
}
