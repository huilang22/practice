/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationRefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsLocationRefRequestMethod implements UdtMethod {
  private String method = null;
  private InvsLocationRefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsLocationRefCreate method */
  public static final InvsLocationRefRequestMethod INVS_LOCATION_REF_CREATE = new InvsLocationRefRequestMethod("InvsLocationRefCreate");
  /** Variable representing the InvsLocationRefFind method */
  public static final InvsLocationRefRequestMethod INVS_LOCATION_REF_FIND = new InvsLocationRefRequestMethod("InvsLocationRefFind");
  /** Variable representing the InvsLocationRefGet method */
  public static final InvsLocationRefRequestMethod INVS_LOCATION_REF_GET = new InvsLocationRefRequestMethod("InvsLocationRefGet");
  /** Variable representing the InvsLocationRefUpdate method */
  public static final InvsLocationRefRequestMethod INVS_LOCATION_REF_UPDATE = new InvsLocationRefRequestMethod("InvsLocationRefUpdate");
}
