/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationInvAssocRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsLocationInvAssocRequestMethod implements UdtMethod {
  private String method = null;
  private InvsLocationInvAssocRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsLocationInvAssocCreate method */
  public static final InvsLocationInvAssocRequestMethod INVS_LOCATION_INV_ASSOC_CREATE = new InvsLocationInvAssocRequestMethod("InvsLocationInvAssocCreate");
  /** Variable representing the InvsLocationInvAssocFind method */
  public static final InvsLocationInvAssocRequestMethod INVS_LOCATION_INV_ASSOC_FIND = new InvsLocationInvAssocRequestMethod("InvsLocationInvAssocFind");
  /** Variable representing the InvsLocationInvAssocGet method */
  public static final InvsLocationInvAssocRequestMethod INVS_LOCATION_INV_ASSOC_GET = new InvsLocationInvAssocRequestMethod("InvsLocationInvAssocGet");
  /** Variable representing the InvsLocationInvAssocUpdate method */
  public static final InvsLocationInvAssocRequestMethod INVS_LOCATION_INV_ASSOC_UPDATE = new InvsLocationInvAssocRequestMethod("InvsLocationInvAssocUpdate");
}
