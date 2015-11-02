/*
 * Generated code DO NOT EDIT
 * Generated file: PointCategoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PointCategoryRequestMethod implements UdtMethod {
  private String method = null;
  private PointCategoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PointCategoryCreate method */
  public static final PointCategoryRequestMethod POINT_CATEGORY_CREATE = new PointCategoryRequestMethod("PointCategoryCreate");
  /** Variable representing the PointCategoryDelete method */
  public static final PointCategoryRequestMethod POINT_CATEGORY_DELETE = new PointCategoryRequestMethod("PointCategoryDelete");
  /** Variable representing the PointCategoryFind method */
  public static final PointCategoryRequestMethod POINT_CATEGORY_FIND = new PointCategoryRequestMethod("PointCategoryFind");
  /** Variable representing the PointCategoryGet method */
  public static final PointCategoryRequestMethod POINT_CATEGORY_GET = new PointCategoryRequestMethod("PointCategoryGet");
  /** Variable representing the PointCategoryUpdate method */
  public static final PointCategoryRequestMethod POINT_CATEGORY_UPDATE = new PointCategoryRequestMethod("PointCategoryUpdate");
}
