/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTemplateRequest.java
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
public final class NoteTemplateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NoteTemplateRequest (String request, NoteTemplateRequestMethod method) {
    initialize(request, "NoteTemplate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NoteTemplateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNoteTemplateForNoteTemplateCreate(NoteTemplateObjectData data) {
    if (data != null) {
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(data, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }
  public void setNoteTemplateForNoteTemplateDelete(NoteTemplateObjectKeyData data) {
    if (data != null) {
      addInput("NoteTemplate", NoteTemplateObjectKeyHelper.toMap(data, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }
  public void setNoteTemplateForNoteTemplateFind(NoteTemplateObjectFilter data) {
    if (data != null) {
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(data, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }
  public void setNoteTemplateForNoteTemplateGet(NoteTemplateObjectKeyData data) {
    if (data != null) {
      addInput("NoteTemplate", NoteTemplateObjectKeyHelper.toMap(data, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }
  public void setNoteTemplateForNoteTemplateUpdate(NoteTemplateObjectData data) {
    if (data != null) {
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(data, new HashMap(), "NoteTemplate").get("NoteTemplate"));
    }
  }
  public NoteTemplateObjectData getNoteTemplateObjectDataNoteTemplateFromNoteTemplateCreate() {
    return NoteTemplateObjectHelper.fromMap(outputMap, "NoteTemplate");
  }
  public NoteTemplateObjectData getNoteTemplateObjectDataNoteTemplateFromNoteTemplateDelete() {
    return NoteTemplateObjectHelper.fromMap(outputMap, "NoteTemplate");
  }
  public NoteTemplateObjectDataList getNoteTemplateObjectDataNoteTemplateFromNoteTemplateFind() {
    return NoteTemplateObjectHelper.fromMapList(outputMap, "NoteTemplateList");
  }
  public NoteTemplateObjectData getNoteTemplateObjectDataNoteTemplateFromNoteTemplateGet() {
    return NoteTemplateObjectHelper.fromMap(outputMap, "NoteTemplate");
  }
  public NoteTemplateObjectData getNoteTemplateObjectDataNoteTemplateFromNoteTemplateUpdate() {
    return NoteTemplateObjectHelper.fromMap(outputMap, "NoteTemplate");
  }
  /**
   @deprecated
   */
  public void setNoteTemplateObjectFilter(NoteTemplateObjectFilter data) {
    if (data != null) {
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(data, new HashMap()).get("NoteTemplateObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNoteTemplateObjectData(NoteTemplateObjectData data) {
    if (data != null) {
      addInput("NoteTemplate", NoteTemplateObjectHelper.toMap(data, new HashMap()).get("NoteTemplateObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNoteTemplateObjectKeyData(NoteTemplateObjectKeyData data) {
    if (data != null) {
      addInput("NoteTemplate", NoteTemplateObjectKeyHelper.toMap(data, new HashMap()).get("NoteTemplateObject"));
    }
  }
  /**
   @deprecated
   */
  public NoteTemplateObjectDataList getNoteTemplateObjectDataList() {
    return NoteTemplateObjectHelper.fromMapList(outputMap, "NoteTemplateList");
  }
  /**
   @deprecated
   */
  public NoteTemplateObjectData getNoteTemplateObjectData() {
    return NoteTemplateObjectHelper.fromMap(outputMap, "NoteTemplate");
  }
}
