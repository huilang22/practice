/*
 * Generated code DO NOT EDIT
 * Generated file: NoteReasonRequest.java
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
public final class NoteReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NoteReasonRequest (String request, NoteReasonRequestMethod method) {
    initialize(request, "NoteReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NoteReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNoteReasonForNoteReasonCreate(NoteReasonObjectData data) {
    if (data != null) {
      addInput("NoteReason", NoteReasonObjectHelper.toMap(data, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }
  public void setNoteReasonForNoteReasonDelete(NoteReasonObjectKeyData data) {
    if (data != null) {
      addInput("NoteReason", NoteReasonObjectKeyHelper.toMap(data, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }
  public void setLanguageCodeForNoteReasonFindByNoteType(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setNoteTypeIdForNoteReasonFindByNoteType(Integer data) {
    if (data != null) {
      addInput("NoteTypeId", data);
    }
  }
  public void setNoteReasonForNoteReasonFind(NoteReasonObjectFilter data) {
    if (data != null) {
      addInput("NoteReason", NoteReasonObjectHelper.toMap(data, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }
  public void setNoteReasonForNoteReasonGet(NoteReasonObjectKeyData data) {
    if (data != null) {
      addInput("NoteReason", NoteReasonObjectKeyHelper.toMap(data, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }
  public void setNoteReasonForNoteReasonUpdate(NoteReasonObjectData data) {
    if (data != null) {
      addInput("NoteReason", NoteReasonObjectHelper.toMap(data, new HashMap(), "NoteReason").get("NoteReason"));
    }
  }
  public NoteReasonObjectData getNoteReasonObjectDataNoteReasonFromNoteReasonCreate() {
    return NoteReasonObjectHelper.fromMap(outputMap, "NoteReason");
  }
  public NoteReasonObjectData getNoteReasonObjectDataNoteReasonFromNoteReasonDelete() {
    return NoteReasonObjectHelper.fromMap(outputMap, "NoteReason");
  }
  public NoteReasonObjectDataList getNoteReasonObjectDataNoteReasonFromNoteReasonFindByNoteType() {
    return NoteReasonObjectHelper.fromMapList(outputMap, "NoteReasonList");
  }
  public NoteReasonObjectDataList getNoteReasonObjectDataNoteReasonFromNoteReasonFind() {
    return NoteReasonObjectHelper.fromMapList(outputMap, "NoteReasonList");
  }
  public NoteReasonObjectData getNoteReasonObjectDataNoteReasonFromNoteReasonGet() {
    return NoteReasonObjectHelper.fromMap(outputMap, "NoteReason");
  }
  public NoteReasonObjectData getNoteReasonObjectDataNoteReasonFromNoteReasonUpdate() {
    return NoteReasonObjectHelper.fromMap(outputMap, "NoteReason");
  }
  /**
   @deprecated
   */
  public void setLanguageCode(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setNoteReasonObjectFilter(NoteReasonObjectFilter data) {
    if (data != null) {
      addInput("NoteReason", NoteReasonObjectHelper.toMap(data, new HashMap()).get("NoteReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNoteReasonObjectData(NoteReasonObjectData data) {
    if (data != null) {
      addInput("NoteReason", NoteReasonObjectHelper.toMap(data, new HashMap()).get("NoteReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNoteReasonObjectKeyData(NoteReasonObjectKeyData data) {
    if (data != null) {
      addInput("NoteReason", NoteReasonObjectKeyHelper.toMap(data, new HashMap()).get("NoteReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public NoteReasonObjectDataList getNoteReasonObjectDataList() {
    return NoteReasonObjectHelper.fromMapList(outputMap, "NoteReasonList");
  }
  /**
   @deprecated
   */
  public NoteReasonObjectData getNoteReasonObjectData() {
    return NoteReasonObjectHelper.fromMap(outputMap, "NoteReason");
  }
  /**
   @deprecated
   */
  public void setNoteTypeId(Integer data) {
    if (data != null) {
      addInput("NoteTypeId", data);
    }
  }
}
