/*
 * Generated code DO NOT EDIT
 * Generated file: CitInteractionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CitInteractionRequestMethod implements UdtMethod {
  private String method = null;
  private CitInteractionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CitInteractionCreate method */
  public static final CitInteractionRequestMethod CIT_INTERACTION_CREATE = new CitInteractionRequestMethod("CitInteractionCreate");
  /** Variable representing the CitInteractionDelete method */
  public static final CitInteractionRequestMethod CIT_INTERACTION_DELETE = new CitInteractionRequestMethod("CitInteractionDelete");
  /** Variable representing the CitInteractionFind method */
  public static final CitInteractionRequestMethod CIT_INTERACTION_FIND = new CitInteractionRequestMethod("CitInteractionFind");
  /** Variable representing the CitInteractionGet method */
  public static final CitInteractionRequestMethod CIT_INTERACTION_GET = new CitInteractionRequestMethod("CitInteractionGet");
  /** Variable representing the CitInteractionNoteFind method */
  public static final CitInteractionRequestMethod CIT_INTERACTION_NOTE_FIND = new CitInteractionRequestMethod("CitInteractionNoteFind");
  /** Variable representing the CitInteractionSequenceGet method */
  public static final CitInteractionRequestMethod CIT_INTERACTION_SEQUENCE_GET = new CitInteractionRequestMethod("CitInteractionSequenceGet");
  /** Variable representing the CitInteractionUpdate method */
  public static final CitInteractionRequestMethod CIT_INTERACTION_UPDATE = new CitInteractionRequestMethod("CitInteractionUpdate");
}
