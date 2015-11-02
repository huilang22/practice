/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemExtendedDataRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcItemExtendedDataRequestMethod implements UdtMethod {
  private String method = null;
  private CtcItemExtendedDataRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcItemExtendedDataCreate method */
  public static final CtcItemExtendedDataRequestMethod CTC_ITEM_EXTENDED_DATA_CREATE = new CtcItemExtendedDataRequestMethod("CtcItemExtendedDataCreate");
  /** Variable representing the CtcItemExtendedDataDelete method */
  public static final CtcItemExtendedDataRequestMethod CTC_ITEM_EXTENDED_DATA_DELETE = new CtcItemExtendedDataRequestMethod("CtcItemExtendedDataDelete");
  /** Variable representing the CtcItemExtendedDataFind method */
  public static final CtcItemExtendedDataRequestMethod CTC_ITEM_EXTENDED_DATA_FIND = new CtcItemExtendedDataRequestMethod("CtcItemExtendedDataFind");
  /** Variable representing the CtcItemExtendedDataGet method */
  public static final CtcItemExtendedDataRequestMethod CTC_ITEM_EXTENDED_DATA_GET = new CtcItemExtendedDataRequestMethod("CtcItemExtendedDataGet");
  /** Variable representing the CtcItemExtendedDataUpdate method */
  public static final CtcItemExtendedDataRequestMethod CTC_ITEM_EXTENDED_DATA_UPDATE = new CtcItemExtendedDataRequestMethod("CtcItemExtendedDataUpdate");
}
