/*
 * Generated code DO NOT EDIT
 * Generated file: CitAutoNoteActionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CitAutoNoteActionRequestMethod implements UdtMethod {
  private String method = null;
  private CitAutoNoteActionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CitAutoNoteActionCreate method */
  public static final CitAutoNoteActionRequestMethod CIT_AUTO_NOTE_ACTION_CREATE = new CitAutoNoteActionRequestMethod("CitAutoNoteActionCreate");
  /** Variable representing the CitAutoNoteActionDelete method */
  public static final CitAutoNoteActionRequestMethod CIT_AUTO_NOTE_ACTION_DELETE = new CitAutoNoteActionRequestMethod("CitAutoNoteActionDelete");
  /** Variable representing the CitAutoNoteActionFind method */
  public static final CitAutoNoteActionRequestMethod CIT_AUTO_NOTE_ACTION_FIND = new CitAutoNoteActionRequestMethod("CitAutoNoteActionFind");
  /** Variable representing the CitAutoNoteActionGet method */
  public static final CitAutoNoteActionRequestMethod CIT_AUTO_NOTE_ACTION_GET = new CitAutoNoteActionRequestMethod("CitAutoNoteActionGet");
  /** Variable representing the CitAutoNoteActionSequenceGet method */
  public static final CitAutoNoteActionRequestMethod CIT_AUTO_NOTE_ACTION_SEQUENCE_GET = new CitAutoNoteActionRequestMethod("CitAutoNoteActionSequenceGet");
  /** Variable representing the CitAutoNoteActionUpdate method */
  public static final CitAutoNoteActionRequestMethod CIT_AUTO_NOTE_ACTION_UPDATE = new CitAutoNoteActionRequestMethod("CitAutoNoteActionUpdate");
}
