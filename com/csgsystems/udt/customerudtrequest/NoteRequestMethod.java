/*
 * Generated code DO NOT EDIT
 * Generated file: NoteRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NoteRequestMethod implements UdtMethod {
  private String method = null;
  private NoteRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NoteCreate method */
  public static final NoteRequestMethod NOTE_CREATE = new NoteRequestMethod("NoteCreate");
  /** Variable representing the NoteFind method */
  public static final NoteRequestMethod NOTE_FIND = new NoteRequestMethod("NoteFind");
}
