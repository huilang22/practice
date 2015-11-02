/*
 * Generated code DO NOT EDIT
 * Generated file: LineOfBusinessRefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class LineOfBusinessRefRequestMethod implements UdtMethod {
  private String method = null;
  private LineOfBusinessRefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the LineOfBusinessRefFind method */
  public static final LineOfBusinessRefRequestMethod LINE_OF_BUSINESS_REF_FIND = new LineOfBusinessRefRequestMethod("LineOfBusinessRefFind");
  /** Variable representing the LineOfBusinessRefGet method */
  public static final LineOfBusinessRefRequestMethod LINE_OF_BUSINESS_REF_GET = new LineOfBusinessRefRequestMethod("LineOfBusinessRefGet");
}
