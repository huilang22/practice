/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingReasonRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcRatingReasonRequestMethod implements UdtMethod {
  private String method = null;
  private CtcRatingReasonRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcRatingReasonCreate method */
  public static final CtcRatingReasonRequestMethod CTC_RATING_REASON_CREATE = new CtcRatingReasonRequestMethod("CtcRatingReasonCreate");
  /** Variable representing the CtcRatingReasonDelete method */
  public static final CtcRatingReasonRequestMethod CTC_RATING_REASON_DELETE = new CtcRatingReasonRequestMethod("CtcRatingReasonDelete");
  /** Variable representing the CtcRatingReasonFind method */
  public static final CtcRatingReasonRequestMethod CTC_RATING_REASON_FIND = new CtcRatingReasonRequestMethod("CtcRatingReasonFind");
  /** Variable representing the CtcRatingReasonGet method */
  public static final CtcRatingReasonRequestMethod CTC_RATING_REASON_GET = new CtcRatingReasonRequestMethod("CtcRatingReasonGet");
  /** Variable representing the CtcRatingReasonUpdate method */
  public static final CtcRatingReasonRequestMethod CTC_RATING_REASON_UPDATE = new CtcRatingReasonRequestMethod("CtcRatingReasonUpdate");
}
