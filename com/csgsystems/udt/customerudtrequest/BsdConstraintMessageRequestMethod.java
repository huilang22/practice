/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintMessageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdConstraintMessageRequestMethod implements UdtMethod {
  private String method = null;
  private BsdConstraintMessageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdConstraintMessageCreate method */
  public static final BsdConstraintMessageRequestMethod BSD_CONSTRAINT_MESSAGE_CREATE = new BsdConstraintMessageRequestMethod("BsdConstraintMessageCreate");
  /** Variable representing the BsdConstraintMessageDelete method */
  public static final BsdConstraintMessageRequestMethod BSD_CONSTRAINT_MESSAGE_DELETE = new BsdConstraintMessageRequestMethod("BsdConstraintMessageDelete");
  /** Variable representing the BsdConstraintMessageDeleteAll method */
  public static final BsdConstraintMessageRequestMethod BSD_CONSTRAINT_MESSAGE_DELETE_ALL = new BsdConstraintMessageRequestMethod("BsdConstraintMessageDeleteAll");
  /** Variable representing the BsdConstraintMessageFind method */
  public static final BsdConstraintMessageRequestMethod BSD_CONSTRAINT_MESSAGE_FIND = new BsdConstraintMessageRequestMethod("BsdConstraintMessageFind");
  /** Variable representing the BsdConstraintMessageGet method */
  public static final BsdConstraintMessageRequestMethod BSD_CONSTRAINT_MESSAGE_GET = new BsdConstraintMessageRequestMethod("BsdConstraintMessageGet");
  /** Variable representing the BsdConstraintMessageSequenceGet method */
  public static final BsdConstraintMessageRequestMethod BSD_CONSTRAINT_MESSAGE_SEQUENCE_GET = new BsdConstraintMessageRequestMethod("BsdConstraintMessageSequenceGet");
  /** Variable representing the BsdConstraintMessageUpdate method */
  public static final BsdConstraintMessageRequestMethod BSD_CONSTRAINT_MESSAGE_UPDATE = new BsdConstraintMessageRequestMethod("BsdConstraintMessageUpdate");
}
