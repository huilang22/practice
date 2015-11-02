/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationAttributeDefaultRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdApplicationAttributeDefaultRequestMethod implements UdtMethod {
  private String method = null;
  private BsdApplicationAttributeDefaultRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdApplicationAttributeDefaultActionFind method */
  public static final BsdApplicationAttributeDefaultRequestMethod BSD_APPLICATION_ATTRIBUTE_DEFAULT_ACTION_FIND = new BsdApplicationAttributeDefaultRequestMethod("BsdApplicationAttributeDefaultActionFind");
  /** Variable representing the BsdApplicationAttributeDefaultFind method */
  public static final BsdApplicationAttributeDefaultRequestMethod BSD_APPLICATION_ATTRIBUTE_DEFAULT_FIND = new BsdApplicationAttributeDefaultRequestMethod("BsdApplicationAttributeDefaultFind");
  /** Variable representing the BsdApplicationAttributeDefaultGet method */
  public static final BsdApplicationAttributeDefaultRequestMethod BSD_APPLICATION_ATTRIBUTE_DEFAULT_GET = new BsdApplicationAttributeDefaultRequestMethod("BsdApplicationAttributeDefaultGet");
}
