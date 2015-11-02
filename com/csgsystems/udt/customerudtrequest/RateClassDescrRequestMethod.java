/*
 * Generated code DO NOT EDIT
 * Generated file: RateClassDescrRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateClassDescrRequestMethod implements UdtMethod {
  private String method = null;
  private RateClassDescrRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateClassDescrCreate method */
  public static final RateClassDescrRequestMethod RATE_CLASS_DESCR_CREATE = new RateClassDescrRequestMethod("RateClassDescrCreate");
  /** Variable representing the RateClassDescrFind method */
  public static final RateClassDescrRequestMethod RATE_CLASS_DESCR_FIND = new RateClassDescrRequestMethod("RateClassDescrFind");
  /** Variable representing the RateClassDescrGet method */
  public static final RateClassDescrRequestMethod RATE_CLASS_DESCR_GET = new RateClassDescrRequestMethod("RateClassDescrGet");
  /** Variable representing the RateClassDescrUpdate method */
  public static final RateClassDescrRequestMethod RATE_CLASS_DESCR_UPDATE = new RateClassDescrRequestMethod("RateClassDescrUpdate");
}
