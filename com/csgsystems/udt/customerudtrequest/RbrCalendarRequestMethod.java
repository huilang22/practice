/*
 * Generated code DO NOT EDIT
 * Generated file: RbrCalendarRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrCalendarRequestMethod implements UdtMethod {
  private String method = null;
  private RbrCalendarRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrCalendarCreate method */
  public static final RbrCalendarRequestMethod RBR_CALENDAR_CREATE = new RbrCalendarRequestMethod("RbrCalendarCreate");
  /** Variable representing the RbrCalendarFind method */
  public static final RbrCalendarRequestMethod RBR_CALENDAR_FIND = new RbrCalendarRequestMethod("RbrCalendarFind");
  /** Variable representing the RbrCalendarGet method */
  public static final RbrCalendarRequestMethod RBR_CALENDAR_GET = new RbrCalendarRequestMethod("RbrCalendarGet");
  /** Variable representing the RbrCalendarUpdate method */
  public static final RbrCalendarRequestMethod RBR_CALENDAR_UPDATE = new RbrCalendarRequestMethod("RbrCalendarUpdate");
}
