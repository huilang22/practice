/*
 * Generated code DO NOT EDIT
 * Generated file: CitReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CitReasonRequestMethod implements UdtMethod {
  private String method = null;
  private CitReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CitReasonCreate method */
  public static final CitReasonRequestMethod CIT_REASON_CREATE = new CitReasonRequestMethod("CitReasonCreate");
  /** Variable representing the CitReasonDelete method */
  public static final CitReasonRequestMethod CIT_REASON_DELETE = new CitReasonRequestMethod("CitReasonDelete");
  /** Variable representing the CitReasonFind method */
  public static final CitReasonRequestMethod CIT_REASON_FIND = new CitReasonRequestMethod("CitReasonFind");
  /** Variable representing the CitReasonGet method */
  public static final CitReasonRequestMethod CIT_REASON_GET = new CitReasonRequestMethod("CitReasonGet");
  /** Variable representing the CitReasonSequenceGet method */
  public static final CitReasonRequestMethod CIT_REASON_SEQUENCE_GET = new CitReasonRequestMethod("CitReasonSequenceGet");
  /** Variable representing the CitReasonUpdate method */
  public static final CitReasonRequestMethod CIT_REASON_UPDATE = new CitReasonRequestMethod("CitReasonUpdate");
}
