/*
 * Generated code DO NOT EDIT
 * Generated file: InvAutoActionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvAutoActionRequestMethod implements UdtMethod {
  private String method = null;
  private InvAutoActionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvAutoActionContigSelectNums method */
  public static final InvAutoActionRequestMethod INV_AUTO_ACTION_CONTIG_SELECT_NUMS = new InvAutoActionRequestMethod("InvAutoActionContigSelectNums");
  /** Variable representing the InvAutoActionDel method */
  public static final InvAutoActionRequestMethod INV_AUTO_ACTION_DEL = new InvAutoActionRequestMethod("InvAutoActionDel");
  /** Variable representing the InvAutoActionFind method */
  public static final InvAutoActionRequestMethod INV_AUTO_ACTION_FIND = new InvAutoActionRequestMethod("InvAutoActionFind");
  /** Variable representing the InvAutoActionSelectNums method */
  public static final InvAutoActionRequestMethod INV_AUTO_ACTION_SELECT_NUMS = new InvAutoActionRequestMethod("InvAutoActionSelectNums");
}
