/*
 * Generated code DO NOT EDIT
 * Generated file: UsaRestrictionsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UsaRestrictionsRequestMethod implements UdtMethod {
  private String method = null;
  private UsaRestrictionsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UsaRestrictionsCreate method */
  public static final UsaRestrictionsRequestMethod USA_RESTRICTIONS_CREATE = new UsaRestrictionsRequestMethod("UsaRestrictionsCreate");
  /** Variable representing the UsaRestrictionsDelete method */
  public static final UsaRestrictionsRequestMethod USA_RESTRICTIONS_DELETE = new UsaRestrictionsRequestMethod("UsaRestrictionsDelete");
  /** Variable representing the UsaRestrictionsFind method */
  public static final UsaRestrictionsRequestMethod USA_RESTRICTIONS_FIND = new UsaRestrictionsRequestMethod("UsaRestrictionsFind");
  /** Variable representing the UsaRestrictionsGet method */
  public static final UsaRestrictionsRequestMethod USA_RESTRICTIONS_GET = new UsaRestrictionsRequestMethod("UsaRestrictionsGet");
  /** Variable representing the UsaRestrictionsUpdate method */
  public static final UsaRestrictionsRequestMethod USA_RESTRICTIONS_UPDATE = new UsaRestrictionsRequestMethod("UsaRestrictionsUpdate");
}
