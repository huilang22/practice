/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupProductRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class HqGroupProductRequestMethod implements UdtMethod {
  private String method = null;
  private HqGroupProductRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HqGroupProductCreate method */
  public static final HqGroupProductRequestMethod HQ_GROUP_PRODUCT_CREATE = new HqGroupProductRequestMethod("HqGroupProductCreate");
  /** Variable representing the HqGroupProductDelete method */
  public static final HqGroupProductRequestMethod HQ_GROUP_PRODUCT_DELETE = new HqGroupProductRequestMethod("HqGroupProductDelete");
  /** Variable representing the HqGroupProductDeleteList method */
  public static final HqGroupProductRequestMethod HQ_GROUP_PRODUCT_DELETE_LIST = new HqGroupProductRequestMethod("HqGroupProductDeleteList");
  /** Variable representing the HqGroupProductFind method */
  public static final HqGroupProductRequestMethod HQ_GROUP_PRODUCT_FIND = new HqGroupProductRequestMethod("HqGroupProductFind");
  /** Variable representing the HqGroupProductGet method */
  public static final HqGroupProductRequestMethod HQ_GROUP_PRODUCT_GET = new HqGroupProductRequestMethod("HqGroupProductGet");
  /** Variable representing the HqGroupProductUpdate method */
  public static final HqGroupProductRequestMethod HQ_GROUP_PRODUCT_UPDATE = new HqGroupProductRequestMethod("HqGroupProductUpdate");
}
