/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferBuyRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcOfferBuyRequestMethod implements UdtMethod {
  private String method = null;
  private CtcOfferBuyRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcOfferBuyCreate method */
  public static final CtcOfferBuyRequestMethod CTC_OFFER_BUY_CREATE = new CtcOfferBuyRequestMethod("CtcOfferBuyCreate");
  /** Variable representing the CtcOfferBuyDelete method */
  public static final CtcOfferBuyRequestMethod CTC_OFFER_BUY_DELETE = new CtcOfferBuyRequestMethod("CtcOfferBuyDelete");
  /** Variable representing the CtcOfferBuyDetailCreate method */
  public static final CtcOfferBuyRequestMethod CTC_OFFER_BUY_DETAIL_CREATE = new CtcOfferBuyRequestMethod("CtcOfferBuyDetailCreate");
  /** Variable representing the CtcOfferBuyDetailDelete method */
  public static final CtcOfferBuyRequestMethod CTC_OFFER_BUY_DETAIL_DELETE = new CtcOfferBuyRequestMethod("CtcOfferBuyDetailDelete");
  /** Variable representing the CtcOfferBuyDetailFind method */
  public static final CtcOfferBuyRequestMethod CTC_OFFER_BUY_DETAIL_FIND = new CtcOfferBuyRequestMethod("CtcOfferBuyDetailFind");
  /** Variable representing the CtcOfferBuyDetailGet method */
  public static final CtcOfferBuyRequestMethod CTC_OFFER_BUY_DETAIL_GET = new CtcOfferBuyRequestMethod("CtcOfferBuyDetailGet");
  /** Variable representing the CtcOfferBuyDetailUpdate method */
  public static final CtcOfferBuyRequestMethod CTC_OFFER_BUY_DETAIL_UPDATE = new CtcOfferBuyRequestMethod("CtcOfferBuyDetailUpdate");
  /** Variable representing the CtcOfferBuyFind method */
  public static final CtcOfferBuyRequestMethod CTC_OFFER_BUY_FIND = new CtcOfferBuyRequestMethod("CtcOfferBuyFind");
  /** Variable representing the CtcOfferBuyGet method */
  public static final CtcOfferBuyRequestMethod CTC_OFFER_BUY_GET = new CtcOfferBuyRequestMethod("CtcOfferBuyGet");
  /** Variable representing the CtcOfferBuyUpdate method */
  public static final CtcOfferBuyRequestMethod CTC_OFFER_BUY_UPDATE = new CtcOfferBuyRequestMethod("CtcOfferBuyUpdate");
}
