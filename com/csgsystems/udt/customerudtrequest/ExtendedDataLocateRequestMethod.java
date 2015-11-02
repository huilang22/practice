/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataLocateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExtendedDataLocateRequestMethod implements UdtMethod {
  private String method = null;
  private ExtendedDataLocateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExtendedDataLocateCreate method */
  public static final ExtendedDataLocateRequestMethod EXTENDED_DATA_LOCATE_CREATE = new ExtendedDataLocateRequestMethod("ExtendedDataLocateCreate");
  /** Variable representing the ExtendedDataLocateDeleteList method */
  public static final ExtendedDataLocateRequestMethod EXTENDED_DATA_LOCATE_DELETE_LIST = new ExtendedDataLocateRequestMethod("ExtendedDataLocateDeleteList");
  /** Variable representing the ExtendedDataLocateFind method */
  public static final ExtendedDataLocateRequestMethod EXTENDED_DATA_LOCATE_FIND = new ExtendedDataLocateRequestMethod("ExtendedDataLocateFind");
}
