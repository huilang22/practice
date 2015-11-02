/*
 * Generated code DO NOT EDIT
 * Generated file: SlaMeasurementDataRequest.java
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

import com.csgsystems.bp.data.*;
public final class SlaMeasurementDataRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SlaMeasurementDataRequest (String request, SlaMeasurementDataRequestMethod method) {
    initialize(request, "SlaMeasurementData", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SlaMeasurementDataRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSlaMeasurementDataForSlaMeasurementDataFind(SlaMeasurementDataObjectFilter data) {
    if (data != null) {
      addInput("SlaMeasurementData", SlaMeasurementDataObjectHelper.toMap(data, new HashMap(), "SlaMeasurementData").get("SlaMeasurementData"));
    }
  }
  public void setSlaMeasurementDataForSlaMeasurementDataGet(SlaMeasurementDataObjectKeyData data) {
    if (data != null) {
      addInput("SlaMeasurementData", SlaMeasurementDataObjectKeyHelper.toMap(data, new HashMap(), "SlaMeasurementData").get("SlaMeasurementData"));
    }
  }
  public SlaMeasurementDataObjectDataList getSlaMeasurementDataObjectDataSlaMeasurementDataFromSlaMeasurementDataFind() {
    return SlaMeasurementDataObjectHelper.fromMapList(outputMap, "SlaMeasurementDataList");
  }
  public SlaMeasurementDataObjectData getSlaMeasurementDataObjectDataSlaMeasurementDataFromSlaMeasurementDataGet() {
    return SlaMeasurementDataObjectHelper.fromMap(outputMap, "SlaMeasurementData");
  }
  /**
   @deprecated
   */
  public void setSlaMeasurementDataObjectFilter(SlaMeasurementDataObjectFilter data) {
    if (data != null) {
      addInput("SlaMeasurementData", SlaMeasurementDataObjectHelper.toMap(data, new HashMap()).get("SlaMeasurementDataObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSlaMeasurementDataObjectKeyData(SlaMeasurementDataObjectKeyData data) {
    if (data != null) {
      addInput("SlaMeasurementData", SlaMeasurementDataObjectKeyHelper.toMap(data, new HashMap()).get("SlaMeasurementDataObject"));
    }
  }
  /**
   @deprecated
   */
  public SlaMeasurementDataObjectDataList getSlaMeasurementDataObjectDataList() {
    return SlaMeasurementDataObjectHelper.fromMapList(outputMap, "SlaMeasurementDataList");
  }
  /**
   @deprecated
   */
  public SlaMeasurementDataObjectData getSlaMeasurementDataObjectData() {
    return SlaMeasurementDataObjectHelper.fromMap(outputMap, "SlaMeasurementData");
  }
}
