/*
 * Generated code DO NOT EDIT
 * Generated file: CitImportanceRequest.java
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

import com.csgsystems.cit.data.*;
public final class CitImportanceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CitImportanceRequest (String request, CitImportanceRequestMethod method) {
    initialize(request, "CitImportance", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CitImportanceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCitImportanceForCitImportanceCreate(CitImportanceObjectData data) {
    if (data != null) {
      addInput("CitImportance", CitImportanceObjectHelper.toMap(data, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }
  public void setCitImportanceForCitImportanceDelete(CitImportanceObjectKeyData data) {
    if (data != null) {
      addInput("CitImportance", CitImportanceObjectKeyHelper.toMap(data, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }
  public void setCitImportanceForCitImportanceFind(CitImportanceObjectFilter data) {
    if (data != null) {
      addInput("CitImportance", CitImportanceObjectHelper.toMap(data, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }
  public void setCitImportanceForCitImportanceGet(CitImportanceObjectKeyData data) {
    if (data != null) {
      addInput("CitImportance", CitImportanceObjectKeyHelper.toMap(data, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }
  public void setCitImportanceForCitImportanceUpdate(CitImportanceObjectData data) {
    if (data != null) {
      addInput("CitImportance", CitImportanceObjectHelper.toMap(data, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }
  public CitImportanceObjectData getCitImportanceObjectDataCitImportanceFromCitImportanceCreate() {
    return CitImportanceObjectHelper.fromMap(outputMap, "CitImportance");
  }
  public CitImportanceObjectData getCitImportanceObjectDataCitImportanceFromCitImportanceDelete() {
    return CitImportanceObjectHelper.fromMap(outputMap, "CitImportance");
  }
  public CitImportanceObjectDataList getCitImportanceObjectDataCitImportanceFromCitImportanceFind() {
    return CitImportanceObjectHelper.fromMapList(outputMap, "CitImportanceList");
  }
  public CitImportanceObjectData getCitImportanceObjectDataCitImportanceFromCitImportanceGet() {
    return CitImportanceObjectHelper.fromMap(outputMap, "CitImportance");
  }
  public CitImportanceObjectKeyData getCitImportanceObjectKeyDataCitImportanceFromCitImportanceSequenceGet() {
    return CitImportanceObjectKeyHelper.fromMap(outputMap, "CitImportance");
  }
  public CitImportanceObjectData getCitImportanceObjectDataCitImportanceFromCitImportanceUpdate() {
    return CitImportanceObjectHelper.fromMap(outputMap, "CitImportance");
  }
  /**
   @deprecated
   */
  public void setCitImportanceObjectFilter(CitImportanceObjectFilter data) {
    if (data != null) {
      addInput("CitImportance", CitImportanceObjectHelper.toMap(data, new HashMap()).get("CitImportanceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitImportanceObjectData(CitImportanceObjectData data) {
    if (data != null) {
      addInput("CitImportance", CitImportanceObjectHelper.toMap(data, new HashMap()).get("CitImportanceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitImportanceObjectKeyData(CitImportanceObjectKeyData data) {
    if (data != null) {
      addInput("CitImportance", CitImportanceObjectKeyHelper.toMap(data, new HashMap()).get("CitImportanceObject"));
    }
  }
  /**
   @deprecated
   */
  public CitImportanceObjectDataList getCitImportanceObjectDataList() {
    return CitImportanceObjectHelper.fromMapList(outputMap, "CitImportanceList");
  }
  /**
   @deprecated
   */
  public CitImportanceObjectKeyData getCitImportanceObjectKeyData() {
    return CitImportanceObjectKeyHelper.fromMap(outputMap, "CitImportance");
  }
  /**
   @deprecated
   */
  public CitImportanceObjectData getCitImportanceObjectData() {
    return CitImportanceObjectHelper.fromMap(outputMap, "CitImportance");
  }
}
