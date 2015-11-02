/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemFormatRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcItemFormatRequestMethod implements UdtMethod {
  private String method = null;
  private CtcItemFormatRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcItemFormatCreate method */
  public static final CtcItemFormatRequestMethod CTC_ITEM_FORMAT_CREATE = new CtcItemFormatRequestMethod("CtcItemFormatCreate");
  /** Variable representing the CtcItemFormatDelete method */
  public static final CtcItemFormatRequestMethod CTC_ITEM_FORMAT_DELETE = new CtcItemFormatRequestMethod("CtcItemFormatDelete");
  /** Variable representing the CtcItemFormatFind method */
  public static final CtcItemFormatRequestMethod CTC_ITEM_FORMAT_FIND = new CtcItemFormatRequestMethod("CtcItemFormatFind");
  /** Variable representing the CtcItemFormatGet method */
  public static final CtcItemFormatRequestMethod CTC_ITEM_FORMAT_GET = new CtcItemFormatRequestMethod("CtcItemFormatGet");
}
