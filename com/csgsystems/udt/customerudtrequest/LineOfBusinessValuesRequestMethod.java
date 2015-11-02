/*
 * Generated code DO NOT EDIT
 * Generated file: LineOfBusinessValuesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class LineOfBusinessValuesRequestMethod implements UdtMethod {
  private String method = null;
  private LineOfBusinessValuesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the LineOfBusinessValuesFind method */
  public static final LineOfBusinessValuesRequestMethod LINE_OF_BUSINESS_VALUES_FIND = new LineOfBusinessValuesRequestMethod("LineOfBusinessValuesFind");
  /** Variable representing the LineOfBusinessValuesGet method */
  public static final LineOfBusinessValuesRequestMethod LINE_OF_BUSINESS_VALUES_GET = new LineOfBusinessValuesRequestMethod("LineOfBusinessValuesGet");
}
