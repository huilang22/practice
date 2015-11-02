/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcRatingTypeRequestMethod implements UdtMethod {
  private String method = null;
  private CtcRatingTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcRatingTypeCreate method */
  public static final CtcRatingTypeRequestMethod CTC_RATING_TYPE_CREATE = new CtcRatingTypeRequestMethod("CtcRatingTypeCreate");
  /** Variable representing the CtcRatingTypeDelete method */
  public static final CtcRatingTypeRequestMethod CTC_RATING_TYPE_DELETE = new CtcRatingTypeRequestMethod("CtcRatingTypeDelete");
  /** Variable representing the CtcRatingTypeFind method */
  public static final CtcRatingTypeRequestMethod CTC_RATING_TYPE_FIND = new CtcRatingTypeRequestMethod("CtcRatingTypeFind");
  /** Variable representing the CtcRatingTypeGet method */
  public static final CtcRatingTypeRequestMethod CTC_RATING_TYPE_GET = new CtcRatingTypeRequestMethod("CtcRatingTypeGet");
  /** Variable representing the CtcRatingTypeUpdate method */
  public static final CtcRatingTypeRequestMethod CTC_RATING_TYPE_UPDATE = new CtcRatingTypeRequestMethod("CtcRatingTypeUpdate");
}
