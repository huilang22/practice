/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcRatingRequestMethod implements UdtMethod {
  private String method = null;
  private CtcRatingRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcRatingCreate method */
  public static final CtcRatingRequestMethod CTC_RATING_CREATE = new CtcRatingRequestMethod("CtcRatingCreate");
  /** Variable representing the CtcRatingDelete method */
  public static final CtcRatingRequestMethod CTC_RATING_DELETE = new CtcRatingRequestMethod("CtcRatingDelete");
  /** Variable representing the CtcRatingFind method */
  public static final CtcRatingRequestMethod CTC_RATING_FIND = new CtcRatingRequestMethod("CtcRatingFind");
  /** Variable representing the CtcRatingGet method */
  public static final CtcRatingRequestMethod CTC_RATING_GET = new CtcRatingRequestMethod("CtcRatingGet");
  /** Variable representing the CtcRatingUpdate method */
  public static final CtcRatingRequestMethod CTC_RATING_UPDATE = new CtcRatingRequestMethod("CtcRatingUpdate");
}
