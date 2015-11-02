/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRelationalDefaultRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdApplicationRelationalDefaultRequestMethod implements UdtMethod {
  private String method = null;
  private BsdApplicationRelationalDefaultRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdApplicationRelationalDefaultActionFind method */
  public static final BsdApplicationRelationalDefaultRequestMethod BSD_APPLICATION_RELATIONAL_DEFAULT_ACTION_FIND = new BsdApplicationRelationalDefaultRequestMethod("BsdApplicationRelationalDefaultActionFind");
  /** Variable representing the BsdApplicationRelationalDefaultFind method */
  public static final BsdApplicationRelationalDefaultRequestMethod BSD_APPLICATION_RELATIONAL_DEFAULT_FIND = new BsdApplicationRelationalDefaultRequestMethod("BsdApplicationRelationalDefaultFind");
  /** Variable representing the BsdApplicationRelationalDefaultGet method */
  public static final BsdApplicationRelationalDefaultRequestMethod BSD_APPLICATION_RELATIONAL_DEFAULT_GET = new BsdApplicationRelationalDefaultRequestMethod("BsdApplicationRelationalDefaultGet");
}
