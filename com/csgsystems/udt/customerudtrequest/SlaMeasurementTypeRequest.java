/*
 * Generated code DO NOT EDIT
 * Generated file: SlaMeasurementTypeRequest.java
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
public final class SlaMeasurementTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SlaMeasurementTypeRequest (String request, SlaMeasurementTypeRequestMethod method) {
    initialize(request, "SlaMeasurementType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SlaMeasurementTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSlaMeasurementTypeForSlaMeasurementTypeCreate(SlaMeasurementTypeObjectData data) {
    if (data != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(data, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }
  public void setSlaMeasurementTypeForSlaMeasurementTypeDelete(SlaMeasurementTypeObjectKeyData data) {
    if (data != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectKeyHelper.toMap(data, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }
  public void setSlaMeasurementTypeForSlaMeasurementTypeFind(SlaMeasurementTypeObjectFilter data) {
    if (data != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(data, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }
  public void setSlaMeasurementTypeForSlaMeasurementTypeGet(SlaMeasurementTypeObjectKeyData data) {
    if (data != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectKeyHelper.toMap(data, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }
  public void setSlaMeasurementTypeForSlaMeasurementTypeUpdate(SlaMeasurementTypeObjectData data) {
    if (data != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(data, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }
  public SlaMeasurementTypeObjectData getSlaMeasurementTypeObjectDataSlaMeasurementTypeFromSlaMeasurementTypeCreate() {
    return SlaMeasurementTypeObjectHelper.fromMap(outputMap, "SlaMeasurementType");
  }
  public SlaMeasurementTypeObjectData getSlaMeasurementTypeObjectDataSlaMeasurementTypeFromSlaMeasurementTypeDelete() {
    return SlaMeasurementTypeObjectHelper.fromMap(outputMap, "SlaMeasurementType");
  }
  public SlaMeasurementTypeObjectDataList getSlaMeasurementTypeObjectDataSlaMeasurementTypeFromSlaMeasurementTypeFind() {
    return SlaMeasurementTypeObjectHelper.fromMapList(outputMap, "SlaMeasurementTypeList");
  }
  public SlaMeasurementTypeObjectData getSlaMeasurementTypeObjectDataSlaMeasurementTypeFromSlaMeasurementTypeGet() {
    return SlaMeasurementTypeObjectHelper.fromMap(outputMap, "SlaMeasurementType");
  }
  public SlaMeasurementTypeObjectData getSlaMeasurementTypeObjectDataSlaMeasurementTypeFromSlaMeasurementTypeUpdate() {
    return SlaMeasurementTypeObjectHelper.fromMap(outputMap, "SlaMeasurementType");
  }
  /**
   @deprecated
   */
  public void setSlaMeasurementTypeObjectFilter(SlaMeasurementTypeObjectFilter data) {
    if (data != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(data, new HashMap()).get("SlaMeasurementTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSlaMeasurementTypeObjectData(SlaMeasurementTypeObjectData data) {
    if (data != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(data, new HashMap()).get("SlaMeasurementTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSlaMeasurementTypeObjectKeyData(SlaMeasurementTypeObjectKeyData data) {
    if (data != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectKeyHelper.toMap(data, new HashMap()).get("SlaMeasurementTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public SlaMeasurementTypeObjectDataList getSlaMeasurementTypeObjectDataList() {
    return SlaMeasurementTypeObjectHelper.fromMapList(outputMap, "SlaMeasurementTypeList");
  }
  /**
   @deprecated
   */
  public SlaMeasurementTypeObjectData getSlaMeasurementTypeObjectData() {
    return SlaMeasurementTypeObjectHelper.fromMap(outputMap, "SlaMeasurementType");
  }
}
