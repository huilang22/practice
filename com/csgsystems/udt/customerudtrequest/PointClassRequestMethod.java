/*
 * Generated code DO NOT EDIT
 * Generated file: PointClassRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PointClassRequestMethod implements UdtMethod {
  private String method = null;
  private PointClassRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PointClassCreate method */
  public static final PointClassRequestMethod POINT_CLASS_CREATE = new PointClassRequestMethod("PointClassCreate");
  /** Variable representing the PointClassDelete method */
  public static final PointClassRequestMethod POINT_CLASS_DELETE = new PointClassRequestMethod("PointClassDelete");
  /** Variable representing the PointClassFind method */
  public static final PointClassRequestMethod POINT_CLASS_FIND = new PointClassRequestMethod("PointClassFind");
  /** Variable representing the PointClassGet method */
  public static final PointClassRequestMethod POINT_CLASS_GET = new PointClassRequestMethod("PointClassGet");
  /** Variable representing the PointClassUpdate method */
  public static final PointClassRequestMethod POINT_CLASS_UPDATE = new PointClassRequestMethod("PointClassUpdate");
}
