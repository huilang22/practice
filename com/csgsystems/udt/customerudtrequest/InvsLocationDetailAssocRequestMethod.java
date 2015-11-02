/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailAssocRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsLocationDetailAssocRequestMethod implements UdtMethod {
  private String method = null;
  private InvsLocationDetailAssocRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsLocationDetailAssocCreate method */
  public static final InvsLocationDetailAssocRequestMethod INVS_LOCATION_DETAIL_ASSOC_CREATE = new InvsLocationDetailAssocRequestMethod("InvsLocationDetailAssocCreate");
  /** Variable representing the InvsLocationDetailAssocDelete method */
  public static final InvsLocationDetailAssocRequestMethod INVS_LOCATION_DETAIL_ASSOC_DELETE = new InvsLocationDetailAssocRequestMethod("InvsLocationDetailAssocDelete");
  /** Variable representing the InvsLocationDetailAssocFind method */
  public static final InvsLocationDetailAssocRequestMethod INVS_LOCATION_DETAIL_ASSOC_FIND = new InvsLocationDetailAssocRequestMethod("InvsLocationDetailAssocFind");
  /** Variable representing the InvsLocationDetailAssocGet method */
  public static final InvsLocationDetailAssocRequestMethod INVS_LOCATION_DETAIL_ASSOC_GET = new InvsLocationDetailAssocRequestMethod("InvsLocationDetailAssocGet");
}
