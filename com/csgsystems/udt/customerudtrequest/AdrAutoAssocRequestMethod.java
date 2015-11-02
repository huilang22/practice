/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAutoAssocRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AdrAutoAssocRequestMethod implements UdtMethod {
  private String method = null;
  private AdrAutoAssocRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GeoAreaAddressAutoAssociate method */
  public static final AdrAutoAssocRequestMethod GEO_AREA_ADDRESS_AUTO_ASSOCIATE = new AdrAutoAssocRequestMethod("GeoAreaAddressAutoAssociate");
}
