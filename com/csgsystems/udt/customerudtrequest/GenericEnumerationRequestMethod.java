/*
 * Generated code DO NOT EDIT
 * Generated file: GenericEnumerationRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GenericEnumerationRequestMethod implements UdtMethod {
  private String method = null;
  private GenericEnumerationRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GenericEnumerationCreate method */
  public static final GenericEnumerationRequestMethod GENERIC_ENUMERATION_CREATE = new GenericEnumerationRequestMethod("GenericEnumerationCreate");
  /** Variable representing the GenericEnumerationDelete method */
  public static final GenericEnumerationRequestMethod GENERIC_ENUMERATION_DELETE = new GenericEnumerationRequestMethod("GenericEnumerationDelete");
  /** Variable representing the GenericEnumerationFind method */
  public static final GenericEnumerationRequestMethod GENERIC_ENUMERATION_FIND = new GenericEnumerationRequestMethod("GenericEnumerationFind");
  /** Variable representing the GenericEnumerationGet method */
  public static final GenericEnumerationRequestMethod GENERIC_ENUMERATION_GET = new GenericEnumerationRequestMethod("GenericEnumerationGet");
  /** Variable representing the GenericEnumerationUpdate method */
  public static final GenericEnumerationRequestMethod GENERIC_ENUMERATION_UPDATE = new GenericEnumerationRequestMethod("GenericEnumerationUpdate");
}
