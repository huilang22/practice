/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemUrlRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcItemUrlRequestMethod implements UdtMethod {
  private String method = null;
  private CtcItemUrlRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcItemUrlCreate method */
  public static final CtcItemUrlRequestMethod CTC_ITEM_URL_CREATE = new CtcItemUrlRequestMethod("CtcItemUrlCreate");
  /** Variable representing the CtcItemUrlDelete method */
  public static final CtcItemUrlRequestMethod CTC_ITEM_URL_DELETE = new CtcItemUrlRequestMethod("CtcItemUrlDelete");
  /** Variable representing the CtcItemUrlFind method */
  public static final CtcItemUrlRequestMethod CTC_ITEM_URL_FIND = new CtcItemUrlRequestMethod("CtcItemUrlFind");
  /** Variable representing the CtcItemUrlGet method */
  public static final CtcItemUrlRequestMethod CTC_ITEM_URL_GET = new CtcItemUrlRequestMethod("CtcItemUrlGet");
  /** Variable representing the CtcItemUrlUpdate method */
  public static final CtcItemUrlRequestMethod CTC_ITEM_URL_UPDATE = new CtcItemUrlRequestMethod("CtcItemUrlUpdate");
}
