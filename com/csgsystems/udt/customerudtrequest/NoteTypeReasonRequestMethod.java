/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTypeReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NoteTypeReasonRequestMethod implements UdtMethod {
  private String method = null;
  private NoteTypeReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NoteTypeReasonCreate method */
  public static final NoteTypeReasonRequestMethod NOTE_TYPE_REASON_CREATE = new NoteTypeReasonRequestMethod("NoteTypeReasonCreate");
  /** Variable representing the NoteTypeReasonDelete method */
  public static final NoteTypeReasonRequestMethod NOTE_TYPE_REASON_DELETE = new NoteTypeReasonRequestMethod("NoteTypeReasonDelete");
  /** Variable representing the NoteTypeReasonFind method */
  public static final NoteTypeReasonRequestMethod NOTE_TYPE_REASON_FIND = new NoteTypeReasonRequestMethod("NoteTypeReasonFind");
  /** Variable representing the NoteTypeReasonGet method */
  public static final NoteTypeReasonRequestMethod NOTE_TYPE_REASON_GET = new NoteTypeReasonRequestMethod("NoteTypeReasonGet");
  /** Variable representing the NoteTypeReasonUpdate method */
  public static final NoteTypeReasonRequestMethod NOTE_TYPE_REASON_UPDATE = new NoteTypeReasonRequestMethod("NoteTypeReasonUpdate");
}
