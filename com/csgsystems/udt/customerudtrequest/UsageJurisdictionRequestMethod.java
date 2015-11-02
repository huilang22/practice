/*
 * Generated code DO NOT EDIT
 * Generated file: UsageJurisdictionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsageJurisdictionRequestMethod implements UdtMethod {
  private String method = null;
  private UsageJurisdictionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsageJurisdictionCreate method */
  public static final UsageJurisdictionRequestMethod USAGE_JURISDICTION_CREATE = new UsageJurisdictionRequestMethod("UsageJurisdictionCreate");
  /** Variable representing the UsageJurisdictionFind method */
  public static final UsageJurisdictionRequestMethod USAGE_JURISDICTION_FIND = new UsageJurisdictionRequestMethod("UsageJurisdictionFind");
  /** Variable representing the UsageJurisdictionGet method */
  public static final UsageJurisdictionRequestMethod USAGE_JURISDICTION_GET = new UsageJurisdictionRequestMethod("UsageJurisdictionGet");
  /** Variable representing the UsageJurisdictionUpdate method */
  public static final UsageJurisdictionRequestMethod USAGE_JURISDICTION_UPDATE = new UsageJurisdictionRequestMethod("UsageJurisdictionUpdate");
}
