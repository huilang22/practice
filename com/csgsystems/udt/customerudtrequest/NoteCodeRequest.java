/*
 * Generated code DO NOT EDIT
 * Generated file: NoteCodeRequest.java
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
public final class NoteCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NoteCodeRequest (String request, NoteCodeRequestMethod method) {
    initialize(request, "NoteCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NoteCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNoteCodeForNoteCodeFind(NoteCodeObjectFilter data) {
    if (data != null) {
      addInput("NoteCode", NoteCodeObjectHelper.toMap(data, new HashMap(), "NoteCode").get("NoteCode"));
    }
  }
  public void setNoteCodeForNoteCodeGet(NoteCodeObjectKeyData data) {
    if (data != null) {
      addInput("NoteCode", NoteCodeObjectKeyHelper.toMap(data, new HashMap(), "NoteCode").get("NoteCode"));
    }
  }
  public NoteCodeObjectDataList getNoteCodeObjectDataNoteCodeFromNoteCodeFind() {
    return NoteCodeObjectHelper.fromMapList(outputMap, "NoteCodeList");
  }
  public NoteCodeObjectData getNoteCodeObjectDataNoteCodeFromNoteCodeGet() {
    return NoteCodeObjectHelper.fromMap(outputMap, "NoteCode");
  }
  /**
   @deprecated
   */
  public void setNoteCodeObjectFilter(NoteCodeObjectFilter data) {
    if (data != null) {
      addInput("NoteCode", NoteCodeObjectHelper.toMap(data, new HashMap()).get("NoteCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNoteCodeObjectKeyData(NoteCodeObjectKeyData data) {
    if (data != null) {
      addInput("NoteCode", NoteCodeObjectKeyHelper.toMap(data, new HashMap()).get("NoteCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public NoteCodeObjectDataList getNoteCodeObjectDataList() {
    return NoteCodeObjectHelper.fromMapList(outputMap, "NoteCodeList");
  }
  /**
   @deprecated
   */
  public NoteCodeObjectData getNoteCodeObjectData() {
    return NoteCodeObjectHelper.fromMap(outputMap, "NoteCode");
  }
}
