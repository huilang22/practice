/*
 * Generated code DO NOT EDIT
 * Generated file: CitAutoNoteActionRequest.java
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
public final class CitAutoNoteActionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CitAutoNoteActionRequest (String request, CitAutoNoteActionRequestMethod method) {
    initialize(request, "CitAutoNoteAction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CitAutoNoteActionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCitAutoNoteActionForCitAutoNoteActionCreate(CitAutoNoteActionObjectData data) {
    if (data != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(data, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }
  public void setCitAutoNoteActionForCitAutoNoteActionDelete(CitAutoNoteActionObjectKeyData data) {
    if (data != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectKeyHelper.toMap(data, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }
  public void setCitAutoNoteActionForCitAutoNoteActionFind(CitAutoNoteActionObjectFilter data) {
    if (data != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(data, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }
  public void setCitAutoNoteActionForCitAutoNoteActionGet(CitAutoNoteActionObjectKeyData data) {
    if (data != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectKeyHelper.toMap(data, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }
  public void setCitAutoNoteActionForCitAutoNoteActionUpdate(CitAutoNoteActionObjectData data) {
    if (data != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(data, new HashMap(), "CitAutoNoteAction").get("CitAutoNoteAction"));
    }
  }
  public CitAutoNoteActionObjectData getCitAutoNoteActionObjectDataCitAutoNoteActionFromCitAutoNoteActionCreate() {
    return CitAutoNoteActionObjectHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
  public CitAutoNoteActionObjectData getCitAutoNoteActionObjectDataCitAutoNoteActionFromCitAutoNoteActionDelete() {
    return CitAutoNoteActionObjectHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
  public CitAutoNoteActionObjectDataList getCitAutoNoteActionObjectDataCitAutoNoteActionFromCitAutoNoteActionFind() {
    return CitAutoNoteActionObjectHelper.fromMapList(outputMap, "CitAutoNoteActionList");
  }
  public CitAutoNoteActionObjectData getCitAutoNoteActionObjectDataCitAutoNoteActionFromCitAutoNoteActionGet() {
    return CitAutoNoteActionObjectHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
  public CitAutoNoteActionObjectKeyData getCitAutoNoteActionObjectKeyDataCitAutoNoteActionFromCitAutoNoteActionSequenceGet() {
    return CitAutoNoteActionObjectKeyHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
  public CitAutoNoteActionObjectData getCitAutoNoteActionObjectDataCitAutoNoteActionFromCitAutoNoteActionUpdate() {
    return CitAutoNoteActionObjectHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
  /**
   @deprecated
   */
  public void setCitAutoNoteActionObjectFilter(CitAutoNoteActionObjectFilter data) {
    if (data != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(data, new HashMap()).get("CitAutoNoteActionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitAutoNoteActionObjectData(CitAutoNoteActionObjectData data) {
    if (data != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectHelper.toMap(data, new HashMap()).get("CitAutoNoteActionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitAutoNoteActionObjectKeyData(CitAutoNoteActionObjectKeyData data) {
    if (data != null) {
      addInput("CitAutoNoteAction", CitAutoNoteActionObjectKeyHelper.toMap(data, new HashMap()).get("CitAutoNoteActionObject"));
    }
  }
  /**
   @deprecated
   */
  public CitAutoNoteActionObjectDataList getCitAutoNoteActionObjectDataList() {
    return CitAutoNoteActionObjectHelper.fromMapList(outputMap, "CitAutoNoteActionList");
  }
  /**
   @deprecated
   */
  public CitAutoNoteActionObjectKeyData getCitAutoNoteActionObjectKeyData() {
    return CitAutoNoteActionObjectKeyHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
  /**
   @deprecated
   */
  public CitAutoNoteActionObjectData getCitAutoNoteActionObjectData() {
    return CitAutoNoteActionObjectHelper.fromMap(outputMap, "CitAutoNoteAction");
  }
}
