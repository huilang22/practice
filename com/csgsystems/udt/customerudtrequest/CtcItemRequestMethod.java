/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcItemRequestMethod implements UdtMethod {
  private String method = null;
  private CtcItemRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcItemCreate method */
  public static final CtcItemRequestMethod CTC_ITEM_CREATE = new CtcItemRequestMethod("CtcItemCreate");
  /** Variable representing the CtcItemDelete method */
  public static final CtcItemRequestMethod CTC_ITEM_DELETE = new CtcItemRequestMethod("CtcItemDelete");
  /** Variable representing the CtcItemFind method */
  public static final CtcItemRequestMethod CTC_ITEM_FIND = new CtcItemRequestMethod("CtcItemFind");
  /** Variable representing the CtcItemGet method */
  public static final CtcItemRequestMethod CTC_ITEM_GET = new CtcItemRequestMethod("CtcItemGet");
  /** Variable representing the CtcItemUpdate method */
  public static final CtcItemRequestMethod CTC_ITEM_UPDATE = new CtcItemRequestMethod("CtcItemUpdate");
}
