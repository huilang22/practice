/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointRateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BonusPointRateRequestMethod implements UdtMethod {
  private String method = null;
  private BonusPointRateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BonusPointRateCreate method */
  public static final BonusPointRateRequestMethod BONUS_POINT_RATE_CREATE = new BonusPointRateRequestMethod("BonusPointRateCreate");
  /** Variable representing the BonusPointRateFind method */
  public static final BonusPointRateRequestMethod BONUS_POINT_RATE_FIND = new BonusPointRateRequestMethod("BonusPointRateFind");
  /** Variable representing the BonusPointRateGet method */
  public static final BonusPointRateRequestMethod BONUS_POINT_RATE_GET = new BonusPointRateRequestMethod("BonusPointRateGet");
}
