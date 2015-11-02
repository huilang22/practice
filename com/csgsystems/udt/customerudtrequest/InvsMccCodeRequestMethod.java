/*
 * Generated code DO NOT EDIT
 * Generated file: InvsMccCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsMccCodeRequestMethod implements UdtMethod {
  private String method = null;
  private InvsMccCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsMccCodeFind method */
  public static final InvsMccCodeRequestMethod INVS_MCC_CODE_FIND = new InvsMccCodeRequestMethod("InvsMccCodeFind");
  /** Variable representing the InvsMccCodeGet method */
  public static final InvsMccCodeRequestMethod INVS_MCC_CODE_GET = new InvsMccCodeRequestMethod("InvsMccCodeGet");
  /** Variable representing the InvsMccCodeUpdate method */
  public static final InvsMccCodeRequestMethod INVS_MCC_CODE_UPDATE = new InvsMccCodeRequestMethod("InvsMccCodeUpdate");
}
