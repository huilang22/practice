/*
 * Generated code DO NOT EDIT
 * Generated file: CitReasonRequest.java
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
public final class CitReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CitReasonRequest (String request, CitReasonRequestMethod method) {
    initialize(request, "CitReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CitReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCitReasonForCitReasonCreate(CitReasonObjectData data) {
    if (data != null) {
      addInput("CitReason", CitReasonObjectHelper.toMap(data, new HashMap(), "CitReason").get("CitReason"));
    }
  }
  public void setCitReasonForCitReasonDelete(CitReasonObjectKeyData data) {
    if (data != null) {
      addInput("CitReason", CitReasonObjectKeyHelper.toMap(data, new HashMap(), "CitReason").get("CitReason"));
    }
  }
  public void setCitReasonForCitReasonFind(CitReasonObjectFilter data) {
    if (data != null) {
      addInput("CitReason", CitReasonObjectHelper.toMap(data, new HashMap(), "CitReason").get("CitReason"));
    }
  }
  public void setCitReasonForCitReasonGet(CitReasonObjectKeyData data) {
    if (data != null) {
      addInput("CitReason", CitReasonObjectKeyHelper.toMap(data, new HashMap(), "CitReason").get("CitReason"));
    }
  }
  public void setCitReasonForCitReasonUpdate(CitReasonObjectData data) {
    if (data != null) {
      addInput("CitReason", CitReasonObjectHelper.toMap(data, new HashMap(), "CitReason").get("CitReason"));
    }
  }
  public CitReasonObjectData getCitReasonObjectDataCitReasonFromCitReasonCreate() {
    return CitReasonObjectHelper.fromMap(outputMap, "CitReason");
  }
  public CitReasonObjectData getCitReasonObjectDataCitReasonFromCitReasonDelete() {
    return CitReasonObjectHelper.fromMap(outputMap, "CitReason");
  }
  public CitReasonObjectDataList getCitReasonObjectDataCitReasonFromCitReasonFind() {
    return CitReasonObjectHelper.fromMapList(outputMap, "CitReasonList");
  }
  public CitReasonObjectData getCitReasonObjectDataCitReasonFromCitReasonGet() {
    return CitReasonObjectHelper.fromMap(outputMap, "CitReason");
  }
  public CitReasonObjectKeyData getCitReasonObjectKeyDataCitReasonFromCitReasonSequenceGet() {
    return CitReasonObjectKeyHelper.fromMap(outputMap, "CitReason");
  }
  public CitReasonObjectData getCitReasonObjectDataCitReasonFromCitReasonUpdate() {
    return CitReasonObjectHelper.fromMap(outputMap, "CitReason");
  }
  /**
   @deprecated
   */
  public void setCitReasonObjectFilter(CitReasonObjectFilter data) {
    if (data != null) {
      addInput("CitReason", CitReasonObjectHelper.toMap(data, new HashMap()).get("CitReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitReasonObjectData(CitReasonObjectData data) {
    if (data != null) {
      addInput("CitReason", CitReasonObjectHelper.toMap(data, new HashMap()).get("CitReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitReasonObjectKeyData(CitReasonObjectKeyData data) {
    if (data != null) {
      addInput("CitReason", CitReasonObjectKeyHelper.toMap(data, new HashMap()).get("CitReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public CitReasonObjectDataList getCitReasonObjectDataList() {
    return CitReasonObjectHelper.fromMapList(outputMap, "CitReasonList");
  }
  /**
   @deprecated
   */
  public CitReasonObjectKeyData getCitReasonObjectKeyData() {
    return CitReasonObjectKeyHelper.fromMap(outputMap, "CitReason");
  }
  /**
   @deprecated
   */
  public CitReasonObjectData getCitReasonObjectData() {
    return CitReasonObjectHelper.fromMap(outputMap, "CitReason");
  }
}
