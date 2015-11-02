/*
 * Generated code DO NOT EDIT
 * Generated file: TimezoneRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class TimezoneRequestMethod implements UdtMethod {
  private String method = null;
  private TimezoneRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the TimezoneCreate method */
  public static final TimezoneRequestMethod TIMEZONE_CREATE = new TimezoneRequestMethod("TimezoneCreate");
  /** Variable representing the TimezoneDelete method */
  public static final TimezoneRequestMethod TIMEZONE_DELETE = new TimezoneRequestMethod("TimezoneDelete");
  /** Variable representing the TimezoneFind method */
  public static final TimezoneRequestMethod TIMEZONE_FIND = new TimezoneRequestMethod("TimezoneFind");
  /** Variable representing the TimezoneGet method */
  public static final TimezoneRequestMethod TIMEZONE_GET = new TimezoneRequestMethod("TimezoneGet");
  /** Variable representing the TimezoneUpdate method */
  public static final TimezoneRequestMethod TIMEZONE_UPDATE = new TimezoneRequestMethod("TimezoneUpdate");
}
