/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRestrictionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UnitCrRestrictionRequestMethod implements UdtMethod {
  private String method = null;
  private UnitCrRestrictionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UnitCrRestrictionCreate method */
  public static final UnitCrRestrictionRequestMethod UNIT_CR_RESTRICTION_CREATE = new UnitCrRestrictionRequestMethod("UnitCrRestrictionCreate");
  /** Variable representing the UnitCrRestrictionFind method */
  public static final UnitCrRestrictionRequestMethod UNIT_CR_RESTRICTION_FIND = new UnitCrRestrictionRequestMethod("UnitCrRestrictionFind");
  /** Variable representing the UnitCrRestrictionGet method */
  public static final UnitCrRestrictionRequestMethod UNIT_CR_RESTRICTION_GET = new UnitCrRestrictionRequestMethod("UnitCrRestrictionGet");
  /** Variable representing the UnitCrRestrictionUpdate method */
  public static final UnitCrRestrictionRequestMethod UNIT_CR_RESTRICTION_UPDATE = new UnitCrRestrictionRequestMethod("UnitCrRestrictionUpdate");
}
