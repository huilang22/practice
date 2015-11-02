/*
 * Generated code DO NOT EDIT
 * Generated file: CtmEnumerationRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtmEnumerationRequestMethod implements UdtMethod {
  private String method = null;
  private CtmEnumerationRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtmEnumerationCreate method */
  public static final CtmEnumerationRequestMethod CTM_ENUMERATION_CREATE = new CtmEnumerationRequestMethod("CtmEnumerationCreate");
  /** Variable representing the CtmEnumerationFind method */
  public static final CtmEnumerationRequestMethod CTM_ENUMERATION_FIND = new CtmEnumerationRequestMethod("CtmEnumerationFind");
  /** Variable representing the CtmEnumerationGet method */
  public static final CtmEnumerationRequestMethod CTM_ENUMERATION_GET = new CtmEnumerationRequestMethod("CtmEnumerationGet");
  /** Variable representing the CtmEnumerationUpdate method */
  public static final CtmEnumerationRequestMethod CTM_ENUMERATION_UPDATE = new CtmEnumerationRequestMethod("CtmEnumerationUpdate");
}
