/*
 * Generated code DO NOT EDIT
 * Generated file: NoteCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NoteCodeRequestMethod implements UdtMethod {
  private String method = null;
  private NoteCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NoteCodeFind method */
  public static final NoteCodeRequestMethod NOTE_CODE_FIND = new NoteCodeRequestMethod("NoteCodeFind");
  /** Variable representing the NoteCodeGet method */
  public static final NoteCodeRequestMethod NOTE_CODE_GET = new NoteCodeRequestMethod("NoteCodeGet");
}
