/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsLocationDetailRequestMethod implements UdtMethod {
  private String method = null;
  private InvsLocationDetailRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsLocationDetailCreate method */
  public static final InvsLocationDetailRequestMethod INVS_LOCATION_DETAIL_CREATE = new InvsLocationDetailRequestMethod("InvsLocationDetailCreate");
  /** Variable representing the InvsLocationDetailDelete method */
  public static final InvsLocationDetailRequestMethod INVS_LOCATION_DETAIL_DELETE = new InvsLocationDetailRequestMethod("InvsLocationDetailDelete");
  /** Variable representing the InvsLocationDetailFind method */
  public static final InvsLocationDetailRequestMethod INVS_LOCATION_DETAIL_FIND = new InvsLocationDetailRequestMethod("InvsLocationDetailFind");
  /** Variable representing the InvsLocationDetailGet method */
  public static final InvsLocationDetailRequestMethod INVS_LOCATION_DETAIL_GET = new InvsLocationDetailRequestMethod("InvsLocationDetailGet");
  /** Variable representing the InvsLocationDetailUpdate method */
  public static final InvsLocationDetailRequestMethod INVS_LOCATION_DETAIL_UPDATE = new InvsLocationDetailRequestMethod("InvsLocationDetailUpdate");
}
