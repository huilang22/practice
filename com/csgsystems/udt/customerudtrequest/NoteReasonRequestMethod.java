/*
 * Generated code DO NOT EDIT
 * Generated file: NoteReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NoteReasonRequestMethod implements UdtMethod {
  private String method = null;
  private NoteReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NoteReasonCreate method */
  public static final NoteReasonRequestMethod NOTE_REASON_CREATE = new NoteReasonRequestMethod("NoteReasonCreate");
  /** Variable representing the NoteReasonDelete method */
  public static final NoteReasonRequestMethod NOTE_REASON_DELETE = new NoteReasonRequestMethod("NoteReasonDelete");
  /** Variable representing the NoteReasonFind method */
  public static final NoteReasonRequestMethod NOTE_REASON_FIND = new NoteReasonRequestMethod("NoteReasonFind");
  /** Variable representing the NoteReasonFindByNoteType method */
  public static final NoteReasonRequestMethod NOTE_REASON_FIND_BY_NOTE_TYPE = new NoteReasonRequestMethod("NoteReasonFindByNoteType");
  /** Variable representing the NoteReasonGet method */
  public static final NoteReasonRequestMethod NOTE_REASON_GET = new NoteReasonRequestMethod("NoteReasonGet");
  /** Variable representing the NoteReasonUpdate method */
  public static final NoteReasonRequestMethod NOTE_REASON_UPDATE = new NoteReasonRequestMethod("NoteReasonUpdate");
}
