/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemRatingRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcItemRatingRequestMethod implements UdtMethod {
  private String method = null;
  private CtcItemRatingRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcItemRatingCreate method */
  public static final CtcItemRatingRequestMethod CTC_ITEM_RATING_CREATE = new CtcItemRatingRequestMethod("CtcItemRatingCreate");
  /** Variable representing the CtcItemRatingDelete method */
  public static final CtcItemRatingRequestMethod CTC_ITEM_RATING_DELETE = new CtcItemRatingRequestMethod("CtcItemRatingDelete");
  /** Variable representing the CtcItemRatingFind method */
  public static final CtcItemRatingRequestMethod CTC_ITEM_RATING_FIND = new CtcItemRatingRequestMethod("CtcItemRatingFind");
  /** Variable representing the CtcItemRatingGet method */
  public static final CtcItemRatingRequestMethod CTC_ITEM_RATING_GET = new CtcItemRatingRequestMethod("CtcItemRatingGet");
}
