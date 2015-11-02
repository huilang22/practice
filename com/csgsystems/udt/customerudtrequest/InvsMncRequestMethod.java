/*
 * Generated code DO NOT EDIT
 * Generated file: InvsMncRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsMncRequestMethod implements UdtMethod {
  private String method = null;
  private InvsMncRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsMncCreate method */
  public static final InvsMncRequestMethod INVS_MNC_CREATE = new InvsMncRequestMethod("InvsMncCreate");
  /** Variable representing the InvsMncFind method */
  public static final InvsMncRequestMethod INVS_MNC_FIND = new InvsMncRequestMethod("InvsMncFind");
  /** Variable representing the InvsMncGet method */
  public static final InvsMncRequestMethod INVS_MNC_GET = new InvsMncRequestMethod("InvsMncGet");
  /** Variable representing the InvsMncUpdate method */
  public static final InvsMncRequestMethod INVS_MNC_UPDATE = new InvsMncRequestMethod("InvsMncUpdate");
}
