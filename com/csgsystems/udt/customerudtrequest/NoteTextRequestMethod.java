/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTextRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NoteTextRequestMethod implements UdtMethod {
  private String method = null;
  private NoteTextRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NoteTextFind method */
  public static final NoteTextRequestMethod NOTE_TEXT_FIND = new NoteTextRequestMethod("NoteTextFind");
  /** Variable representing the NoteTextGet method */
  public static final NoteTextRequestMethod NOTE_TEXT_GET = new NoteTextRequestMethod("NoteTextGet");
}
