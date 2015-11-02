/*
 * Generated code DO NOT EDIT
 * Generated file: CtcContentTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcContentTypeRequestMethod implements UdtMethod {
  private String method = null;
  private CtcContentTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcContentTypeCreate method */
  public static final CtcContentTypeRequestMethod CTC_CONTENT_TYPE_CREATE = new CtcContentTypeRequestMethod("CtcContentTypeCreate");
  /** Variable representing the CtcContentTypeDelete method */
  public static final CtcContentTypeRequestMethod CTC_CONTENT_TYPE_DELETE = new CtcContentTypeRequestMethod("CtcContentTypeDelete");
  /** Variable representing the CtcContentTypeFind method */
  public static final CtcContentTypeRequestMethod CTC_CONTENT_TYPE_FIND = new CtcContentTypeRequestMethod("CtcContentTypeFind");
  /** Variable representing the CtcContentTypeGet method */
  public static final CtcContentTypeRequestMethod CTC_CONTENT_TYPE_GET = new CtcContentTypeRequestMethod("CtcContentTypeGet");
  /** Variable representing the CtcContentTypeUpdate method */
  public static final CtcContentTypeRequestMethod CTC_CONTENT_TYPE_UPDATE = new CtcContentTypeRequestMethod("CtcContentTypeUpdate");
}
