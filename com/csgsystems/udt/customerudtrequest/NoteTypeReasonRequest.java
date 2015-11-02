/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeReasonRequest.java
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
public final class NoteTypeReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NoteTypeReasonRequest (String request, NoteTypeReasonRequestMethod method) {
    initialize(request, "NoteTypeReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NoteTypeReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNoteTypeReasonForNoteTypeReasonCreate(NoteTypeReasonObjectData data) {
    if (data != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(data, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }
  public void setNoteTypeReasonForNoteTypeReasonDelete(NoteTypeReasonObjectKeyData data) {
    if (data != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectKeyHelper.toMap(data, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }
  public void setNoteTypeReasonForNoteTypeReasonFind(NoteTypeReasonObjectFilter data) {
    if (data != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(data, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }
  public void setNoteTypeReasonForNoteTypeReasonGet(NoteTypeReasonObjectKeyData data) {
    if (data != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectKeyHelper.toMap(data, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }
  public void setNoteTypeReasonForNoteTypeReasonUpdate(NoteTypeReasonObjectData data) {
    if (data != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(data, new HashMap(), "NoteTypeReason").get("NoteTypeReason"));
    }
  }
  public NoteTypeReasonObjectData getNoteTypeReasonObjectDataNoteTypeReasonFromNoteTypeReasonCreate() {
    return NoteTypeReasonObjectHelper.fromMap(outputMap, "NoteTypeReason");
  }
  public NoteTypeReasonObjectData getNoteTypeReasonObjectDataNoteTypeReasonFromNoteTypeReasonDelete() {
    return NoteTypeReasonObjectHelper.fromMap(outputMap, "NoteTypeReason");
  }
  public NoteTypeReasonObjectDataList getNoteTypeReasonObjectDataNoteTypeReasonFromNoteTypeReasonFind() {
    return NoteTypeReasonObjectHelper.fromMapList(outputMap, "NoteTypeReasonList");
  }
  public NoteTypeReasonObjectData getNoteTypeReasonObjectDataNoteTypeReasonFromNoteTypeReasonGet() {
    return NoteTypeReasonObjectHelper.fromMap(outputMap, "NoteTypeReason");
  }
  public NoteTypeReasonObjectData getNoteTypeReasonObjectDataNoteTypeReasonFromNoteTypeReasonUpdate() {
    return NoteTypeReasonObjectHelper.fromMap(outputMap, "NoteTypeReason");
  }
  /**
   @deprecated
   */
  public void setNoteTypeReasonObjectFilter(NoteTypeReasonObjectFilter data) {
    if (data != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(data, new HashMap()).get("NoteTypeReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNoteTypeReasonObjectData(NoteTypeReasonObjectData data) {
    if (data != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectHelper.toMap(data, new HashMap()).get("NoteTypeReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNoteTypeReasonObjectKeyData(NoteTypeReasonObjectKeyData data) {
    if (data != null) {
      addInput("NoteTypeReason", NoteTypeReasonObjectKeyHelper.toMap(data, new HashMap()).get("NoteTypeReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public NoteTypeReasonObjectDataList getNoteTypeReasonObjectDataList() {
    return NoteTypeReasonObjectHelper.fromMapList(outputMap, "NoteTypeReasonList");
  }
  /**
   @deprecated
   */
  public NoteTypeReasonObjectData getNoteTypeReasonObjectData() {
    return NoteTypeReasonObjectHelper.fromMap(outputMap, "NoteTypeReason");
  }
}
