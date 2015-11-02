/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineValuesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsLineValuesRequestMethod implements UdtMethod {
  private String method = null;
  private InvsLineValuesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsLineValuesCreate method */
  public static final InvsLineValuesRequestMethod INVS_LINE_VALUES_CREATE = new InvsLineValuesRequestMethod("InvsLineValuesCreate");
  /** Variable representing the InvsLineValuesFind method */
  public static final InvsLineValuesRequestMethod INVS_LINE_VALUES_FIND = new InvsLineValuesRequestMethod("InvsLineValuesFind");
  /** Variable representing the InvsLineValuesGet method */
  public static final InvsLineValuesRequestMethod INVS_LINE_VALUES_GET = new InvsLineValuesRequestMethod("InvsLineValuesGet");
  /** Variable representing the InvsLineValuesUpdate method */
  public static final InvsLineValuesRequestMethod INVS_LINE_VALUES_UPDATE = new InvsLineValuesRequestMethod("InvsLineValuesUpdate");
}
