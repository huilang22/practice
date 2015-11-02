/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsLocationRequestMethod implements UdtMethod {
  private String method = null;
  private InvsLocationRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsLocationCreate method */
  public static final InvsLocationRequestMethod INVS_LOCATION_CREATE = new InvsLocationRequestMethod("InvsLocationCreate");
  /** Variable representing the InvsLocationFind method */
  public static final InvsLocationRequestMethod INVS_LOCATION_FIND = new InvsLocationRequestMethod("InvsLocationFind");
  /** Variable representing the InvsLocationGet method */
  public static final InvsLocationRequestMethod INVS_LOCATION_GET = new InvsLocationRequestMethod("InvsLocationGet");
  /** Variable representing the InvsLocationUpdate method */
  public static final InvsLocationRequestMethod INVS_LOCATION_UPDATE = new InvsLocationRequestMethod("InvsLocationUpdate");
}
