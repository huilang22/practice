/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeRequest.java
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
public final class NoteTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NoteTypeRequest (String request, NoteTypeRequestMethod method) {
    initialize(request, "NoteType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NoteTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNoteTypeForNoteTypeCreate(NoteTypeObjectData data) {
    if (data != null) {
      addInput("NoteType", NoteTypeObjectHelper.toMap(data, new HashMap(), "NoteType").get("NoteType"));
    }
  }
  public void setNoteTypeForNoteTypeDelete(NoteTypeObjectKeyData data) {
    if (data != null) {
      addInput("NoteType", NoteTypeObjectKeyHelper.toMap(data, new HashMap(), "NoteType").get("NoteType"));
    }
  }
  public void setLanguageCodeForNoteTypeFindByNoteReason(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setNoteReasonIdForNoteTypeFindByNoteReason(Integer data) {
    if (data != null) {
      addInput("NoteReasonId", data);
    }
  }
  public void setNoteTypeForNoteTypeFind(NoteTypeObjectFilter data) {
    if (data != null) {
      addInput("NoteType", NoteTypeObjectHelper.toMap(data, new HashMap(), "NoteType").get("NoteType"));
    }
  }
  public void setNoteTypeForNoteTypeGet(NoteTypeObjectKeyData data) {
    if (data != null) {
      addInput("NoteType", NoteTypeObjectKeyHelper.toMap(data, new HashMap(), "NoteType").get("NoteType"));
    }
  }
  public void setNoteTypeForNoteTypeUpdate(NoteTypeObjectData data) {
    if (data != null) {
      addInput("NoteType", NoteTypeObjectHelper.toMap(data, new HashMap(), "NoteType").get("NoteType"));
    }
  }
  public NoteTypeObjectData getNoteTypeObjectDataNoteTypeFromNoteTypeCreate() {
    return NoteTypeObjectHelper.fromMap(outputMap, "NoteType");
  }
  public NoteTypeObjectData getNoteTypeObjectDataNoteTypeFromNoteTypeDelete() {
    return NoteTypeObjectHelper.fromMap(outputMap, "NoteType");
  }
  public NoteTypeObjectDataList getNoteTypeObjectDataNoteTypeFromNoteTypeFindByNoteReason() {
    return NoteTypeObjectHelper.fromMapList(outputMap, "NoteTypeList");
  }
  public NoteTypeObjectDataList getNoteTypeObjectDataNoteTypeFromNoteTypeFind() {
    return NoteTypeObjectHelper.fromMapList(outputMap, "NoteTypeList");
  }
  public NoteTypeObjectData getNoteTypeObjectDataNoteTypeFromNoteTypeGet() {
    return NoteTypeObjectHelper.fromMap(outputMap, "NoteType");
  }
  public NoteTypeObjectData getNoteTypeObjectDataNoteTypeFromNoteTypeUpdate() {
    return NoteTypeObjectHelper.fromMap(outputMap, "NoteType");
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
  public void setNoteReasonId(Integer data) {
    if (data != null) {
      addInput("NoteReasonId", data);
    }
  }
  /**
   @deprecated
   */
  public void setNoteTypeObjectFilter(NoteTypeObjectFilter data) {
    if (data != null) {
      addInput("NoteType", NoteTypeObjectHelper.toMap(data, new HashMap()).get("NoteTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNoteTypeObjectData(NoteTypeObjectData data) {
    if (data != null) {
      addInput("NoteType", NoteTypeObjectHelper.toMap(data, new HashMap()).get("NoteTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNoteTypeObjectKeyData(NoteTypeObjectKeyData data) {
    if (data != null) {
      addInput("NoteType", NoteTypeObjectKeyHelper.toMap(data, new HashMap()).get("NoteTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public NoteTypeObjectDataList getNoteTypeObjectDataList() {
    return NoteTypeObjectHelper.fromMapList(outputMap, "NoteTypeList");
  }
  /**
   @deprecated
   */
  public NoteTypeObjectData getNoteTypeObjectData() {
    return NoteTypeObjectHelper.fromMap(outputMap, "NoteType");
  }
}
