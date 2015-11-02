/*
 * Generated code DO NOT EDIT
 * Generated file: NoteRequest.java
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
public final class NoteRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NoteRequest (String request, NoteRequestMethod method) {
    initialize(request, "Note", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NoteRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNoteForNoteCreate(NoteObjectData data) {
    if (data != null) {
      addInput("Note", NoteObjectHelper.toMap(data, new HashMap(), "Note").get("Note"));
    }
  }
  public void setNoteForNoteFind(NoteObjectFilter data) {
    if (data != null) {
      addInput("Note", NoteObjectHelper.toMap(data, new HashMap(), "Note").get("Note"));
    }
  }
  public NoteObjectDataList getNoteObjectDataNoteFromNoteFind() {
    return NoteObjectHelper.fromMapList(outputMap, "NoteList");
  }
  /**
   @deprecated
   */
  public void setNoteObjectFilter(NoteObjectFilter data) {
    if (data != null) {
      addInput("Note", NoteObjectHelper.toMap(data, new HashMap()).get("NoteObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNoteObjectData(NoteObjectData data) {
    if (data != null) {
      addInput("Note", NoteObjectHelper.toMap(data, new HashMap()).get("NoteObject"));
    }
  }
  /**
   @deprecated
   */
  public NoteObjectDataList getNoteObjectDataList() {
    return NoteObjectHelper.fromMapList(outputMap, "NoteList");
  }
}
