/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypePriceLookupMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsTypePriceLookupMapRequestMethod implements UdtMethod {
  private String method = null;
  private InvsTypePriceLookupMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsTypePriceLookupMapCreate method */
  public static final InvsTypePriceLookupMapRequestMethod INVS_TYPE_PRICE_LOOKUP_MAP_CREATE = new InvsTypePriceLookupMapRequestMethod("InvsTypePriceLookupMapCreate");
  /** Variable representing the InvsTypePriceLookupMapDelete method */
  public static final InvsTypePriceLookupMapRequestMethod INVS_TYPE_PRICE_LOOKUP_MAP_DELETE = new InvsTypePriceLookupMapRequestMethod("InvsTypePriceLookupMapDelete");
  /** Variable representing the InvsTypePriceLookupMapFind method */
  public static final InvsTypePriceLookupMapRequestMethod INVS_TYPE_PRICE_LOOKUP_MAP_FIND = new InvsTypePriceLookupMapRequestMethod("InvsTypePriceLookupMapFind");
  /** Variable representing the InvsTypePriceLookupMapGet method */
  public static final InvsTypePriceLookupMapRequestMethod INVS_TYPE_PRICE_LOOKUP_MAP_GET = new InvsTypePriceLookupMapRequestMethod("InvsTypePriceLookupMapGet");
  /** Variable representing the InvsTypePriceLookupMapUpdate method */
  public static final InvsTypePriceLookupMapRequestMethod INVS_TYPE_PRICE_LOOKUP_MAP_UPDATE = new InvsTypePriceLookupMapRequestMethod("InvsTypePriceLookupMapUpdate");
}
