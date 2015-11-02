/*
 * Generated code DO NOT EDIT
 * Generated file: InvAutoAssocRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvAutoAssocRequestMethod implements UdtMethod {
  private String method = null;
  private InvAutoAssocRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GeoAreaInventoryAutoAssociate method */
  public static final InvAutoAssocRequestMethod GEO_AREA_INVENTORY_AUTO_ASSOCIATE = new InvAutoAssocRequestMethod("GeoAreaInventoryAutoAssociate");
}
