/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyMethodRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcOfferBuyMethodRequestMethod implements UdtMethod {
  private String method = null;
  private CtcOfferBuyMethodRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcOfferBuyMethodCreate method */
  public static final CtcOfferBuyMethodRequestMethod CTC_OFFER_BUY_METHOD_CREATE = new CtcOfferBuyMethodRequestMethod("CtcOfferBuyMethodCreate");
  /** Variable representing the CtcOfferBuyMethodDelete method */
  public static final CtcOfferBuyMethodRequestMethod CTC_OFFER_BUY_METHOD_DELETE = new CtcOfferBuyMethodRequestMethod("CtcOfferBuyMethodDelete");
  /** Variable representing the CtcOfferBuyMethodFind method */
  public static final CtcOfferBuyMethodRequestMethod CTC_OFFER_BUY_METHOD_FIND = new CtcOfferBuyMethodRequestMethod("CtcOfferBuyMethodFind");
  /** Variable representing the CtcOfferBuyMethodGet method */
  public static final CtcOfferBuyMethodRequestMethod CTC_OFFER_BUY_METHOD_GET = new CtcOfferBuyMethodRequestMethod("CtcOfferBuyMethodGet");
}
