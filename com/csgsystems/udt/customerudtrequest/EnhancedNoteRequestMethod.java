/*
 * Generated code DO NOT EDIT
 * Generated file: EnhancedNoteRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EnhancedNoteRequestMethod implements UdtMethod {
  private String method = null;
  private EnhancedNoteRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EnhancedNoteCreate method */
  public static final EnhancedNoteRequestMethod ENHANCED_NOTE_CREATE = new EnhancedNoteRequestMethod("EnhancedNoteCreate");
  /** Variable representing the EnhancedNoteDelete method */
  public static final EnhancedNoteRequestMethod ENHANCED_NOTE_DELETE = new EnhancedNoteRequestMethod("EnhancedNoteDelete");
  /** Variable representing the EnhancedNoteFind method */
  public static final EnhancedNoteRequestMethod ENHANCED_NOTE_FIND = new EnhancedNoteRequestMethod("EnhancedNoteFind");
  /** Variable representing the EnhancedNoteGet method */
  public static final EnhancedNoteRequestMethod ENHANCED_NOTE_GET = new EnhancedNoteRequestMethod("EnhancedNoteGet");
  /** Variable representing the EnhancedNoteGroupedFind method */
  public static final EnhancedNoteRequestMethod ENHANCED_NOTE_GROUPED_FIND = new EnhancedNoteRequestMethod("EnhancedNoteGroupedFind");
  /** Variable representing the EnhancedNoteSequenceGet method */
  public static final EnhancedNoteRequestMethod ENHANCED_NOTE_SEQUENCE_GET = new EnhancedNoteRequestMethod("EnhancedNoteSequenceGet");
  /** Variable representing the EnhancedNoteUpdate method */
  public static final EnhancedNoteRequestMethod ENHANCED_NOTE_UPDATE = new EnhancedNoteRequestMethod("EnhancedNoteUpdate");
}
