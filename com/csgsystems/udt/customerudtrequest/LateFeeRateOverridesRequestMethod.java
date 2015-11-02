/*
 * Generated code DO NOT EDIT
 * Generated file: LateFeeRateOverridesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class LateFeeRateOverridesRequestMethod implements UdtMethod {
  private String method = null;
  private LateFeeRateOverridesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the LateFeeRateOverridesCreate method */
  public static final LateFeeRateOverridesRequestMethod LATE_FEE_RATE_OVERRIDES_CREATE = new LateFeeRateOverridesRequestMethod("LateFeeRateOverridesCreate");
  /** Variable representing the LateFeeRateOverridesDelete method */
  public static final LateFeeRateOverridesRequestMethod LATE_FEE_RATE_OVERRIDES_DELETE = new LateFeeRateOverridesRequestMethod("LateFeeRateOverridesDelete");
  /** Variable representing the LateFeeRateOverridesFind method */
  public static final LateFeeRateOverridesRequestMethod LATE_FEE_RATE_OVERRIDES_FIND = new LateFeeRateOverridesRequestMethod("LateFeeRateOverridesFind");
  /** Variable representing the LateFeeRateOverridesGet method */
  public static final LateFeeRateOverridesRequestMethod LATE_FEE_RATE_OVERRIDES_GET = new LateFeeRateOverridesRequestMethod("LateFeeRateOverridesGet");
  /** Variable representing the LateFeeRateOverridesUpdate method */
  public static final LateFeeRateOverridesRequestMethod LATE_FEE_RATE_OVERRIDES_UPDATE = new LateFeeRateOverridesRequestMethod("LateFeeRateOverridesUpdate");
}
