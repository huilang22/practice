/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDistribPercentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ChargeDistribPercentRequestMethod implements UdtMethod {
  private String method = null;
  private ChargeDistribPercentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ChargeDistribPercentCreate method */
  public static final ChargeDistribPercentRequestMethod CHARGE_DISTRIB_PERCENT_CREATE = new ChargeDistribPercentRequestMethod("ChargeDistribPercentCreate");
  /** Variable representing the ChargeDistribPercentFind method */
  public static final ChargeDistribPercentRequestMethod CHARGE_DISTRIB_PERCENT_FIND = new ChargeDistribPercentRequestMethod("ChargeDistribPercentFind");
  /** Variable representing the ChargeDistribPercentGet method */
  public static final ChargeDistribPercentRequestMethod CHARGE_DISTRIB_PERCENT_GET = new ChargeDistribPercentRequestMethod("ChargeDistribPercentGet");
  /** Variable representing the ChargeDistribPercentUpdate method */
  public static final ChargeDistribPercentRequestMethod CHARGE_DISTRIB_PERCENT_UPDATE = new ChargeDistribPercentRequestMethod("ChargeDistribPercentUpdate");
}
