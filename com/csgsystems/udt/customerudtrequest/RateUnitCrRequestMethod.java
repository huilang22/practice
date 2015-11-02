/*
 * Generated code DO NOT EDIT
 * Generated file: RateUnitCrRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateUnitCrRequestMethod implements UdtMethod {
  private String method = null;
  private RateUnitCrRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateUnitCrCreate method */
  public static final RateUnitCrRequestMethod RATE_UNIT_CR_CREATE = new RateUnitCrRequestMethod("RateUnitCrCreate");
  /** Variable representing the RateUnitCrFind method */
  public static final RateUnitCrRequestMethod RATE_UNIT_CR_FIND = new RateUnitCrRequestMethod("RateUnitCrFind");
  /** Variable representing the RateUnitCrGet method */
  public static final RateUnitCrRequestMethod RATE_UNIT_CR_GET = new RateUnitCrRequestMethod("RateUnitCrGet");
  /** Variable representing the RateUnitCrUpdate method */
  public static final RateUnitCrRequestMethod RATE_UNIT_CR_UPDATE = new RateUnitCrRequestMethod("RateUnitCrUpdate");
}
