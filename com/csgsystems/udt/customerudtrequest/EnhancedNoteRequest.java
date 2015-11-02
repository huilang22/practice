/*
 * Generated code DO NOT EDIT
 * Generated file: EnhancedNoteRequest.java
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
public final class EnhancedNoteRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EnhancedNoteRequest (String request, EnhancedNoteRequestMethod method) {
    initialize(request, "EnhancedNote", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EnhancedNoteRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setEnhancedNoteForEnhancedNoteCreate(EnhancedNoteObjectData data) {
    if (data != null) {
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(data, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }
  public void setEnhancedNoteForEnhancedNoteDelete(EnhancedNoteObjectKeyData data) {
    if (data != null) {
      addInput("EnhancedNote", EnhancedNoteObjectKeyHelper.toMap(data, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }
  public void setEnhancedNoteForEnhancedNoteFind(EnhancedNoteObjectFilter data) {
    if (data != null) {
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(data, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }
  public void setEnhancedNoteForEnhancedNoteGet(EnhancedNoteObjectKeyData data) {
    if (data != null) {
      addInput("EnhancedNote", EnhancedNoteObjectKeyHelper.toMap(data, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }
  public void setDelimiterForEnhancedNoteGroupedFind(String data) {
    if (data != null) {
      addInput("Delimiter", data);
    }
  }
  public void setEnhancedNoteForEnhancedNoteGroupedFind(EnhancedNoteObjectFilter data) {
    if (data != null) {
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(data, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }
  public void setEnhancedNoteForEnhancedNoteUpdate(EnhancedNoteObjectData data) {
    if (data != null) {
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(data, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }
  public EnhancedNoteObjectData getEnhancedNoteObjectDataEnhancedNoteFromEnhancedNoteCreate() {
    return EnhancedNoteObjectHelper.fromMap(outputMap, "EnhancedNote");
  }
  public EnhancedNoteObjectData getEnhancedNoteObjectDataEnhancedNoteFromEnhancedNoteDelete() {
    return EnhancedNoteObjectHelper.fromMap(outputMap, "EnhancedNote");
  }
  public EnhancedNoteObjectDataList getEnhancedNoteObjectDataEnhancedNoteFromEnhancedNoteFind() {
    return EnhancedNoteObjectHelper.fromMapList(outputMap, "EnhancedNoteList");
  }
  public EnhancedNoteObjectData getEnhancedNoteObjectDataEnhancedNoteFromEnhancedNoteGet() {
    return EnhancedNoteObjectHelper.fromMap(outputMap, "EnhancedNote");
  }
  public EnhancedNoteObjectDataList getEnhancedNoteObjectDataEnhancedNoteFromEnhancedNoteGroupedFind() {
    return EnhancedNoteObjectHelper.fromMapList(outputMap, "EnhancedNoteList");
  }
  public EnhancedNoteObjectKeyData getEnhancedNoteObjectKeyDataEnhancedNoteFromEnhancedNoteSequenceGet() {
    return EnhancedNoteObjectKeyHelper.fromMap(outputMap, "EnhancedNote");
  }
  public EnhancedNoteObjectData getEnhancedNoteObjectDataEnhancedNoteFromEnhancedNoteUpdate() {
    return EnhancedNoteObjectHelper.fromMap(outputMap, "EnhancedNote");
  }
  /**
   @deprecated
   */
  public void setDelimiter(String data) {
    if (data != null) {
      addInput("Delimiter", data);
    }
  }
  /**
   @deprecated
   */
  public void setEnhancedNoteObjectFilter(EnhancedNoteObjectFilter data) {
    if (data != null) {
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(data, new HashMap()).get("EnhancedNoteObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEnhancedNoteObjectData(EnhancedNoteObjectData data) {
    if (data != null) {
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(data, new HashMap()).get("EnhancedNoteObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEnhancedNoteObjectKeyData(EnhancedNoteObjectKeyData data) {
    if (data != null) {
      addInput("EnhancedNote", EnhancedNoteObjectKeyHelper.toMap(data, new HashMap()).get("EnhancedNoteObject"));
    }
  }
  /**
   @deprecated
   */
  public EnhancedNoteObjectDataList getEnhancedNoteObjectDataList() {
    return EnhancedNoteObjectHelper.fromMapList(outputMap, "EnhancedNoteList");
  }
  /**
   @deprecated
   */
  public EnhancedNoteObjectKeyData getEnhancedNoteObjectKeyData() {
    return EnhancedNoteObjectKeyHelper.fromMap(outputMap, "EnhancedNote");
  }
  /**
   @deprecated
   */
  public EnhancedNoteObjectData getEnhancedNoteObjectData() {
    return EnhancedNoteObjectHelper.fromMap(outputMap, "EnhancedNote");
  }
}
