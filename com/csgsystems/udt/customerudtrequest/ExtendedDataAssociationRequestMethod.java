/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataAssociationRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExtendedDataAssociationRequestMethod implements UdtMethod {
  private String method = null;
  private ExtendedDataAssociationRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExtendedDataAssociationCreate method */
  public static final ExtendedDataAssociationRequestMethod EXTENDED_DATA_ASSOCIATION_CREATE = new ExtendedDataAssociationRequestMethod("ExtendedDataAssociationCreate");
  /** Variable representing the ExtendedDataAssociationDelete method */
  public static final ExtendedDataAssociationRequestMethod EXTENDED_DATA_ASSOCIATION_DELETE = new ExtendedDataAssociationRequestMethod("ExtendedDataAssociationDelete");
  /** Variable representing the ExtendedDataAssociationFind method */
  public static final ExtendedDataAssociationRequestMethod EXTENDED_DATA_ASSOCIATION_FIND = new ExtendedDataAssociationRequestMethod("ExtendedDataAssociationFind");
  /** Variable representing the ExtendedDataAssociationGet method */
  public static final ExtendedDataAssociationRequestMethod EXTENDED_DATA_ASSOCIATION_GET = new ExtendedDataAssociationRequestMethod("ExtendedDataAssociationGet");
  /** Variable representing the ExtendedDataAssociationUpdate method */
  public static final ExtendedDataAssociationRequestMethod EXTENDED_DATA_ASSOCIATION_UPDATE = new ExtendedDataAssociationRequestMethod("ExtendedDataAssociationUpdate");
}
