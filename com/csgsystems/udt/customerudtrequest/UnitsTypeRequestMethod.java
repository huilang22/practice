/*
 * Generated code DO NOT EDIT
 * Generated file: UnitsTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UnitsTypeRequestMethod implements UdtMethod {
  private String method = null;
  private UnitsTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UnitsTypeCreate method */
  public static final UnitsTypeRequestMethod UNITS_TYPE_CREATE = new UnitsTypeRequestMethod("UnitsTypeCreate");
  /** Variable representing the UnitsTypeFind method */
  public static final UnitsTypeRequestMethod UNITS_TYPE_FIND = new UnitsTypeRequestMethod("UnitsTypeFind");
  /** Variable representing the UnitsTypeGet method */
  public static final UnitsTypeRequestMethod UNITS_TYPE_GET = new UnitsTypeRequestMethod("UnitsTypeGet");
  /** Variable representing the UnitsTypeRateRcFind method */
  public static final UnitsTypeRequestMethod UNITS_TYPE_RATE_RC_FIND = new UnitsTypeRequestMethod("UnitsTypeRateRcFind");
  /** Variable representing the UnitsTypeUpdate method */
  public static final UnitsTypeRequestMethod UNITS_TYPE_UPDATE = new UnitsTypeRequestMethod("UnitsTypeUpdate");
}
