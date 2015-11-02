/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdAttributeRequestMethod implements UdtMethod {
  private String method = null;
  private BsdAttributeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdAttributeCreate method */
  public static final BsdAttributeRequestMethod BSD_ATTRIBUTE_CREATE = new BsdAttributeRequestMethod("BsdAttributeCreate");
  /** Variable representing the BsdAttributeDelete method */
  public static final BsdAttributeRequestMethod BSD_ATTRIBUTE_DELETE = new BsdAttributeRequestMethod("BsdAttributeDelete");
  /** Variable representing the BsdAttributeDeleteAll method */
  public static final BsdAttributeRequestMethod BSD_ATTRIBUTE_DELETE_ALL = new BsdAttributeRequestMethod("BsdAttributeDeleteAll");
  /** Variable representing the BsdAttributeFind method */
  public static final BsdAttributeRequestMethod BSD_ATTRIBUTE_FIND = new BsdAttributeRequestMethod("BsdAttributeFind");
  /** Variable representing the BsdAttributeGet method */
  public static final BsdAttributeRequestMethod BSD_ATTRIBUTE_GET = new BsdAttributeRequestMethod("BsdAttributeGet");
  /** Variable representing the BsdAttributeSequenceGet method */
  public static final BsdAttributeRequestMethod BSD_ATTRIBUTE_SEQUENCE_GET = new BsdAttributeRequestMethod("BsdAttributeSequenceGet");
  /** Variable representing the BsdAttributeUpdate method */
  public static final BsdAttributeRequestMethod BSD_ATTRIBUTE_UPDATE = new BsdAttributeRequestMethod("BsdAttributeUpdate");
}
