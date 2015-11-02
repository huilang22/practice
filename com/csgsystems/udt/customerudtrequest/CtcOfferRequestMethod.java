/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcOfferRequestMethod implements UdtMethod {
  private String method = null;
  private CtcOfferRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcOfferCreate method */
  public static final CtcOfferRequestMethod CTC_OFFER_CREATE = new CtcOfferRequestMethod("CtcOfferCreate");
  /** Variable representing the CtcOfferDelete method */
  public static final CtcOfferRequestMethod CTC_OFFER_DELETE = new CtcOfferRequestMethod("CtcOfferDelete");
  /** Variable representing the CtcOfferDetailFind method */
  public static final CtcOfferRequestMethod CTC_OFFER_DETAIL_FIND = new CtcOfferRequestMethod("CtcOfferDetailFind");
  /** Variable representing the CtcOfferDetailGet method */
  public static final CtcOfferRequestMethod CTC_OFFER_DETAIL_GET = new CtcOfferRequestMethod("CtcOfferDetailGet");
  /** Variable representing the CtcOfferFind method */
  public static final CtcOfferRequestMethod CTC_OFFER_FIND = new CtcOfferRequestMethod("CtcOfferFind");
  /** Variable representing the CtcOfferGet method */
  public static final CtcOfferRequestMethod CTC_OFFER_GET = new CtcOfferRequestMethod("CtcOfferGet");
  /** Variable representing the CtcOfferPpvFind method */
  public static final CtcOfferRequestMethod CTC_OFFER_PPV_FIND = new CtcOfferRequestMethod("CtcOfferPpvFind");
  /** Variable representing the CtcOfferSummaryFind method */
  public static final CtcOfferRequestMethod CTC_OFFER_SUMMARY_FIND = new CtcOfferRequestMethod("CtcOfferSummaryFind");
  /** Variable representing the CtcOfferSummaryGet method */
  public static final CtcOfferRequestMethod CTC_OFFER_SUMMARY_GET = new CtcOfferRequestMethod("CtcOfferSummaryGet");
  /** Variable representing the CtcOfferUpdate method */
  public static final CtcOfferRequestMethod CTC_OFFER_UPDATE = new CtcOfferRequestMethod("CtcOfferUpdate");
}
