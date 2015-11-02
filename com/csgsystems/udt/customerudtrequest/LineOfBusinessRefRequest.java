/*
 * Generated code DO NOT EDIT
 * Generated file: LineOfBusinessRefRequest.java
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
public final class LineOfBusinessRefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public LineOfBusinessRefRequest (String request, LineOfBusinessRefRequestMethod method) {
    initialize(request, "LineOfBusinessRef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (LineOfBusinessRefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setLineOfBusinessRefForLineOfBusinessRefFind(LineOfBusinessRefObjectFilter data) {
    if (data != null) {
      addInput("LineOfBusinessRef", LineOfBusinessRefObjectHelper.toMap(data, new HashMap(), "LineOfBusinessRef").get("LineOfBusinessRef"));
    }
  }
  public void setLineOfBusinessRefForLineOfBusinessRefGet(LineOfBusinessRefObjectKeyData data) {
    if (data != null) {
      addInput("LineOfBusinessRef", LineOfBusinessRefObjectKeyHelper.toMap(data, new HashMap(), "LineOfBusinessRef").get("LineOfBusinessRef"));
    }
  }
  public LineOfBusinessRefObjectDataList getLineOfBusinessRefObjectDataLineOfBusinessRefFromLineOfBusinessRefFind() {
    return LineOfBusinessRefObjectHelper.fromMapList(outputMap, "LineOfBusinessRefList");
  }
  public LineOfBusinessRefObjectData getLineOfBusinessRefObjectDataLineOfBusinessRefFromLineOfBusinessRefGet() {
    return LineOfBusinessRefObjectHelper.fromMap(outputMap, "LineOfBusinessRef");
  }
  /**
   @deprecated
   */
  public void setLineOfBusinessRefObjectFilter(LineOfBusinessRefObjectFilter data) {
    if (data != null) {
      addInput("LineOfBusinessRef", LineOfBusinessRefObjectHelper.toMap(data, new HashMap()).get("LineOfBusinessRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLineOfBusinessRefObjectKeyData(LineOfBusinessRefObjectKeyData data) {
    if (data != null) {
      addInput("LineOfBusinessRef", LineOfBusinessRefObjectKeyHelper.toMap(data, new HashMap()).get("LineOfBusinessRefObject"));
    }
  }
  /**
   @deprecated
   */
  public LineOfBusinessRefObjectDataList getLineOfBusinessRefObjectDataList() {
    return LineOfBusinessRefObjectHelper.fromMapList(outputMap, "LineOfBusinessRefList");
  }
  /**
   @deprecated
   */
  public LineOfBusinessRefObjectData getLineOfBusinessRefObjectData() {
    return LineOfBusinessRefObjectHelper.fromMap(outputMap, "LineOfBusinessRef");
  }
}
