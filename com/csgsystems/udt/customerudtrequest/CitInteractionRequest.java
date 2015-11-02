/*
 * Generated code DO NOT EDIT
 * Generated file: CitInteractionRequest.java
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
public final class CitInteractionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CitInteractionRequest (String request, CitInteractionRequestMethod method) {
    initialize(request, "CitInteraction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CitInteractionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCitInteractionForCitInteractionCreate(CitInteractionObjectData data) {
    if (data != null) {
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(data, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }
  public void setCitInteractionForCitInteractionDelete(CitInteractionObjectKeyData data) {
    if (data != null) {
      addInput("CitInteraction", CitInteractionObjectKeyHelper.toMap(data, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }
  public void setCitInteractionForCitInteractionFind(CitInteractionObjectFilter data) {
    if (data != null) {
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(data, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }
  public void setCitInteractionForCitInteractionGet(CitInteractionObjectKeyData data) {
    if (data != null) {
      addInput("CitInteraction", CitInteractionObjectKeyHelper.toMap(data, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }
  public void setCitInteractionForCitInteractionNoteFind(CitInteractionNoteObjectFilter data) {
    if (data != null) {
      addInput("CitInteraction", CitInteractionNoteObjectHelper.toMap(data, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }
  public void setCitInteractionForCitInteractionUpdate(CitInteractionObjectData data) {
    if (data != null) {
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(data, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }
  public CitInteractionObjectData getCitInteractionObjectDataCitInteractionFromCitInteractionCreate() {
    return CitInteractionObjectHelper.fromMap(outputMap, "CitInteraction");
  }
  public CitInteractionObjectData getCitInteractionObjectDataCitInteractionFromCitInteractionDelete() {
    return CitInteractionObjectHelper.fromMap(outputMap, "CitInteraction");
  }
  public CitInteractionObjectDataList getCitInteractionObjectDataCitInteractionFromCitInteractionFind() {
    return CitInteractionObjectHelper.fromMapList(outputMap, "CitInteractionList");
  }
  public CitInteractionObjectData getCitInteractionObjectDataCitInteractionFromCitInteractionGet() {
    return CitInteractionObjectHelper.fromMap(outputMap, "CitInteraction");
  }
  public CitInteractionNoteObjectDataList getCitInteractionNoteObjectDataCitInteractionFromCitInteractionNoteFind() {
    return CitInteractionNoteObjectHelper.fromMapList(outputMap, "CitInteractionList");
  }
  public CitInteractionObjectKeyData getCitInteractionObjectKeyDataCitInteractionFromCitInteractionSequenceGet() {
    return CitInteractionObjectKeyHelper.fromMap(outputMap, "CitInteraction");
  }
  public CitInteractionObjectData getCitInteractionObjectDataCitInteractionFromCitInteractionUpdate() {
    return CitInteractionObjectHelper.fromMap(outputMap, "CitInteraction");
  }
  /**
   @deprecated
   */
  public void setCitInteractionNoteObjectFilter(CitInteractionNoteObjectFilter data) {
    if (data != null) {
      addInput("CitInteraction", CitInteractionNoteObjectHelper.toMap(data, new HashMap()).get("CitInteractionNoteObject"));
    }
  }
  /**
   @deprecated
   */
  public CitInteractionNoteObjectDataList getCitInteractionNoteObjectDataList() {
    return CitInteractionNoteObjectHelper.fromMapList(outputMap, "CitInteractionList");
  }
  /**
   @deprecated
   */
  public void setCitInteractionObjectFilter(CitInteractionObjectFilter data) {
    if (data != null) {
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(data, new HashMap()).get("CitInteractionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitInteractionObjectData(CitInteractionObjectData data) {
    if (data != null) {
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(data, new HashMap()).get("CitInteractionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitInteractionObjectKeyData(CitInteractionObjectKeyData data) {
    if (data != null) {
      addInput("CitInteraction", CitInteractionObjectKeyHelper.toMap(data, new HashMap()).get("CitInteractionObject"));
    }
  }
  /**
   @deprecated
   */
  public CitInteractionObjectDataList getCitInteractionObjectDataList() {
    return CitInteractionObjectHelper.fromMapList(outputMap, "CitInteractionList");
  }
  /**
   @deprecated
   */
  public CitInteractionObjectKeyData getCitInteractionObjectKeyData() {
    return CitInteractionObjectKeyHelper.fromMap(outputMap, "CitInteraction");
  }
  /**
   @deprecated
   */
  public CitInteractionObjectData getCitInteractionObjectData() {
    return CitInteractionObjectHelper.fromMap(outputMap, "CitInteraction");
  }
}
