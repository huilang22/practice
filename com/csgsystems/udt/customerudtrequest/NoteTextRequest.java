/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTextRequest.java
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
public final class NoteTextRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public NoteTextRequest (String request, NoteTextRequestMethod method) {
    initialize(request, "NoteText", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (NoteTextRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setNoteTextForNoteTextFind(NoteTextObjectFilter data) {
    if (data != null) {
      addInput("NoteText", NoteTextObjectHelper.toMap(data, new HashMap(), "NoteText").get("NoteText"));
    }
  }
  public void setNoteTextForNoteTextGet(NoteTextObjectKeyData data) {
    if (data != null) {
      addInput("NoteText", NoteTextObjectKeyHelper.toMap(data, new HashMap(), "NoteText").get("NoteText"));
    }
  }
  public NoteTextObjectDataList getNoteTextObjectDataNoteTextFromNoteTextFind() {
    return NoteTextObjectHelper.fromMapList(outputMap, "NoteTextList");
  }
  public NoteTextObjectData getNoteTextObjectDataNoteTextFromNoteTextGet() {
    return NoteTextObjectHelper.fromMap(outputMap, "NoteText");
  }
  /**
   @deprecated
   */
  public void setNoteTextObjectFilter(NoteTextObjectFilter data) {
    if (data != null) {
      addInput("NoteText", NoteTextObjectHelper.toMap(data, new HashMap()).get("NoteTextObject"));
    }
  }
  /**
   @deprecated
   */
  public void setNoteTextObjectKeyData(NoteTextObjectKeyData data) {
    if (data != null) {
      addInput("NoteText", NoteTextObjectKeyHelper.toMap(data, new HashMap()).get("NoteTextObject"));
    }
  }
  /**
   @deprecated
   */
  public NoteTextObjectDataList getNoteTextObjectDataList() {
    return NoteTextObjectHelper.fromMapList(outputMap, "NoteTextList");
  }
  /**
   @deprecated
   */
  public NoteTextObjectData getNoteTextObjectData() {
    return NoteTextObjectHelper.fromMap(outputMap, "NoteText");
  }
}
