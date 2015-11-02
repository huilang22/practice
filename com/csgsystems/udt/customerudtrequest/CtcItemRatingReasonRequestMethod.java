/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemRatingReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcItemRatingReasonRequestMethod implements UdtMethod {
  private String method = null;
  private CtcItemRatingReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcItemRatingReasonCreate method */
  public static final CtcItemRatingReasonRequestMethod CTC_ITEM_RATING_REASON_CREATE = new CtcItemRatingReasonRequestMethod("CtcItemRatingReasonCreate");
  /** Variable representing the CtcItemRatingReasonDelete method */
  public static final CtcItemRatingReasonRequestMethod CTC_ITEM_RATING_REASON_DELETE = new CtcItemRatingReasonRequestMethod("CtcItemRatingReasonDelete");
  /** Variable representing the CtcItemRatingReasonFind method */
  public static final CtcItemRatingReasonRequestMethod CTC_ITEM_RATING_REASON_FIND = new CtcItemRatingReasonRequestMethod("CtcItemRatingReasonFind");
  /** Variable representing the CtcItemRatingReasonGet method */
  public static final CtcItemRatingReasonRequestMethod CTC_ITEM_RATING_REASON_GET = new CtcItemRatingReasonRequestMethod("CtcItemRatingReasonGet");
}
