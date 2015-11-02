/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NoteTypeRequestMethod implements UdtMethod {
  private String method = null;
  private NoteTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NoteTypeCreate method */
  public static final NoteTypeRequestMethod NOTE_TYPE_CREATE = new NoteTypeRequestMethod("NoteTypeCreate");
  /** Variable representing the NoteTypeDelete method */
  public static final NoteTypeRequestMethod NOTE_TYPE_DELETE = new NoteTypeRequestMethod("NoteTypeDelete");
  /** Variable representing the NoteTypeFind method */
  public static final NoteTypeRequestMethod NOTE_TYPE_FIND = new NoteTypeRequestMethod("NoteTypeFind");
  /** Variable representing the NoteTypeFindByNoteReason method */
  public static final NoteTypeRequestMethod NOTE_TYPE_FIND_BY_NOTE_REASON = new NoteTypeRequestMethod("NoteTypeFindByNoteReason");
  /** Variable representing the NoteTypeGet method */
  public static final NoteTypeRequestMethod NOTE_TYPE_GET = new NoteTypeRequestMethod("NoteTypeGet");
  /** Variable representing the NoteTypeUpdate method */
  public static final NoteTypeRequestMethod NOTE_TYPE_UPDATE = new NoteTypeRequestMethod("NoteTypeUpdate");
}
