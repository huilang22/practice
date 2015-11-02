/*
 * Generated code DO NOT EDIT
 * Generated file: TicklerRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TicklerRequestMethod implements UdtMethod {
  private String method = null;
  private TicklerRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TicklerCreate method */
  public static final TicklerRequestMethod TICKLER_CREATE = new TicklerRequestMethod("TicklerCreate");
  /** Variable representing the TicklerFind method */
  public static final TicklerRequestMethod TICKLER_FIND = new TicklerRequestMethod("TicklerFind");
  /** Variable representing the TicklerGet method */
  public static final TicklerRequestMethod TICKLER_GET = new TicklerRequestMethod("TicklerGet");
}
