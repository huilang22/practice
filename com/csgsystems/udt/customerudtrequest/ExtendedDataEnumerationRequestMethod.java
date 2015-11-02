/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataEnumerationRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExtendedDataEnumerationRequestMethod implements UdtMethod {
  private String method = null;
  private ExtendedDataEnumerationRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExtendedDataEnumerationCreate method */
  public static final ExtendedDataEnumerationRequestMethod EXTENDED_DATA_ENUMERATION_CREATE = new ExtendedDataEnumerationRequestMethod("ExtendedDataEnumerationCreate");
  /** Variable representing the ExtendedDataEnumerationDelete method */
  public static final ExtendedDataEnumerationRequestMethod EXTENDED_DATA_ENUMERATION_DELETE = new ExtendedDataEnumerationRequestMethod("ExtendedDataEnumerationDelete");
  /** Variable representing the ExtendedDataEnumerationFind method */
  public static final ExtendedDataEnumerationRequestMethod EXTENDED_DATA_ENUMERATION_FIND = new ExtendedDataEnumerationRequestMethod("ExtendedDataEnumerationFind");
  /** Variable representing the ExtendedDataEnumerationGet method */
  public static final ExtendedDataEnumerationRequestMethod EXTENDED_DATA_ENUMERATION_GET = new ExtendedDataEnumerationRequestMethod("ExtendedDataEnumerationGet");
  /** Variable representing the ExtendedDataEnumerationUpdate method */
  public static final ExtendedDataEnumerationRequestMethod EXTENDED_DATA_ENUMERATION_UPDATE = new ExtendedDataEnumerationRequestMethod("ExtendedDataEnumerationUpdate");
}
