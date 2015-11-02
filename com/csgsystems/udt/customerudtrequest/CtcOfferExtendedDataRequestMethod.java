/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferExtendedDataRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcOfferExtendedDataRequestMethod implements UdtMethod {
  private String method = null;
  private CtcOfferExtendedDataRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcOfferExtendedDataCreate method */
  public static final CtcOfferExtendedDataRequestMethod CTC_OFFER_EXTENDED_DATA_CREATE = new CtcOfferExtendedDataRequestMethod("CtcOfferExtendedDataCreate");
  /** Variable representing the CtcOfferExtendedDataDelete method */
  public static final CtcOfferExtendedDataRequestMethod CTC_OFFER_EXTENDED_DATA_DELETE = new CtcOfferExtendedDataRequestMethod("CtcOfferExtendedDataDelete");
  /** Variable representing the CtcOfferExtendedDataFind method */
  public static final CtcOfferExtendedDataRequestMethod CTC_OFFER_EXTENDED_DATA_FIND = new CtcOfferExtendedDataRequestMethod("CtcOfferExtendedDataFind");
  /** Variable representing the CtcOfferExtendedDataGet method */
  public static final CtcOfferExtendedDataRequestMethod CTC_OFFER_EXTENDED_DATA_GET = new CtcOfferExtendedDataRequestMethod("CtcOfferExtendedDataGet");
  /** Variable representing the CtcOfferExtendedDataUpdate method */
  public static final CtcOfferExtendedDataRequestMethod CTC_OFFER_EXTENDED_DATA_UPDATE = new CtcOfferExtendedDataRequestMethod("CtcOfferExtendedDataUpdate");
}
