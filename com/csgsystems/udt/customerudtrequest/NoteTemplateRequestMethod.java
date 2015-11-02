/*
 * Generated code DO NOT EDIT
 * Generated file: NoteTemplateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NoteTemplateRequestMethod implements UdtMethod {
  private String method = null;
  private NoteTemplateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NoteTemplateCreate method */
  public static final NoteTemplateRequestMethod NOTE_TEMPLATE_CREATE = new NoteTemplateRequestMethod("NoteTemplateCreate");
  /** Variable representing the NoteTemplateDelete method */
  public static final NoteTemplateRequestMethod NOTE_TEMPLATE_DELETE = new NoteTemplateRequestMethod("NoteTemplateDelete");
  /** Variable representing the NoteTemplateFind method */
  public static final NoteTemplateRequestMethod NOTE_TEMPLATE_FIND = new NoteTemplateRequestMethod("NoteTemplateFind");
  /** Variable representing the NoteTemplateGet method */
  public static final NoteTemplateRequestMethod NOTE_TEMPLATE_GET = new NoteTemplateRequestMethod("NoteTemplateGet");
  /** Variable representing the NoteTemplateUpdate method */
  public static final NoteTemplateRequestMethod NOTE_TEMPLATE_UPDATE = new NoteTemplateRequestMethod("NoteTemplateUpdate");
}
