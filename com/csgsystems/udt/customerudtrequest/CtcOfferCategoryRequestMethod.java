/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferCategoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcOfferCategoryRequestMethod implements UdtMethod {
  private String method = null;
  private CtcOfferCategoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcOfferCategoryCreate method */
  public static final CtcOfferCategoryRequestMethod CTC_OFFER_CATEGORY_CREATE = new CtcOfferCategoryRequestMethod("CtcOfferCategoryCreate");
  /** Variable representing the CtcOfferCategoryDelete method */
  public static final CtcOfferCategoryRequestMethod CTC_OFFER_CATEGORY_DELETE = new CtcOfferCategoryRequestMethod("CtcOfferCategoryDelete");
  /** Variable representing the CtcOfferCategoryFind method */
  public static final CtcOfferCategoryRequestMethod CTC_OFFER_CATEGORY_FIND = new CtcOfferCategoryRequestMethod("CtcOfferCategoryFind");
  /** Variable representing the CtcOfferCategoryGet method */
  public static final CtcOfferCategoryRequestMethod CTC_OFFER_CATEGORY_GET = new CtcOfferCategoryRequestMethod("CtcOfferCategoryGet");
  /** Variable representing the CtcOfferCategoryUpdate method */
  public static final CtcOfferCategoryRequestMethod CTC_OFFER_CATEGORY_UPDATE = new CtcOfferCategoryRequestMethod("CtcOfferCategoryUpdate");
}
