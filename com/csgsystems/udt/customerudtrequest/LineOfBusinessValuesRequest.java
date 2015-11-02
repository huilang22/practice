/*
 * Generated code DO NOT EDIT
 * Generated file: LineOfBusinessValuesRequest.java
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
public final class LineOfBusinessValuesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public LineOfBusinessValuesRequest (String request, LineOfBusinessValuesRequestMethod method) {
    initialize(request, "LineOfBusinessValues", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (LineOfBusinessValuesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setLineOfBusinessValuesForLineOfBusinessValuesFind(LineOfBusinessValuesObjectFilter data) {
    if (data != null) {
      addInput("LineOfBusinessValues", LineOfBusinessValuesObjectHelper.toMap(data, new HashMap(), "LineOfBusinessValues").get("LineOfBusinessValues"));
    }
  }
  public void setLineOfBusinessValuesForLineOfBusinessValuesGet(LineOfBusinessValuesObjectKeyData data) {
    if (data != null) {
      addInput("LineOfBusinessValues", LineOfBusinessValuesObjectKeyHelper.toMap(data, new HashMap(), "LineOfBusinessValues").get("LineOfBusinessValues"));
    }
  }
  public LineOfBusinessValuesObjectDataList getLineOfBusinessValuesObjectDataLineOfBusinessValuesFromLineOfBusinessValuesFind() {
    return LineOfBusinessValuesObjectHelper.fromMapList(outputMap, "LineOfBusinessValuesList");
  }
  public LineOfBusinessValuesObjectData getLineOfBusinessValuesObjectDataLineOfBusinessValuesFromLineOfBusinessValuesGet() {
    return LineOfBusinessValuesObjectHelper.fromMap(outputMap, "LineOfBusinessValues");
  }
  /**
   @deprecated
   */
  public void setLineOfBusinessValuesObjectFilter(LineOfBusinessValuesObjectFilter data) {
    if (data != null) {
      addInput("LineOfBusinessValues", LineOfBusinessValuesObjectHelper.toMap(data, new HashMap()).get("LineOfBusinessValuesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLineOfBusinessValuesObjectKeyData(LineOfBusinessValuesObjectKeyData data) {
    if (data != null) {
      addInput("LineOfBusinessValues", LineOfBusinessValuesObjectKeyHelper.toMap(data, new HashMap()).get("LineOfBusinessValuesObject"));
    }
  }
  /**
   @deprecated
   */
  public LineOfBusinessValuesObjectDataList getLineOfBusinessValuesObjectDataList() {
    return LineOfBusinessValuesObjectHelper.fromMapList(outputMap, "LineOfBusinessValuesList");
  }
  /**
   @deprecated
   */
  public LineOfBusinessValuesObjectData getLineOfBusinessValuesObjectData() {
    return LineOfBusinessValuesObjectHelper.fromMap(outputMap, "LineOfBusinessValues");
  }
}
