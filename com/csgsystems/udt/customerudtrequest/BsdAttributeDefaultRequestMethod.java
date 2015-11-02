/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeDefaultRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdAttributeDefaultRequestMethod implements UdtMethod {
  private String method = null;
  private BsdAttributeDefaultRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdAttributeDefaultActionFind method */
  public static final BsdAttributeDefaultRequestMethod BSD_ATTRIBUTE_DEFAULT_ACTION_FIND = new BsdAttributeDefaultRequestMethod("BsdAttributeDefaultActionFind");
  /** Variable representing the BsdAttributeDefaultCreate method */
  public static final BsdAttributeDefaultRequestMethod BSD_ATTRIBUTE_DEFAULT_CREATE = new BsdAttributeDefaultRequestMethod("BsdAttributeDefaultCreate");
  /** Variable representing the BsdAttributeDefaultDelete method */
  public static final BsdAttributeDefaultRequestMethod BSD_ATTRIBUTE_DEFAULT_DELETE = new BsdAttributeDefaultRequestMethod("BsdAttributeDefaultDelete");
  /** Variable representing the BsdAttributeDefaultDeleteAll method */
  public static final BsdAttributeDefaultRequestMethod BSD_ATTRIBUTE_DEFAULT_DELETE_ALL = new BsdAttributeDefaultRequestMethod("BsdAttributeDefaultDeleteAll");
  /** Variable representing the BsdAttributeDefaultFind method */
  public static final BsdAttributeDefaultRequestMethod BSD_ATTRIBUTE_DEFAULT_FIND = new BsdAttributeDefaultRequestMethod("BsdAttributeDefaultFind");
  /** Variable representing the BsdAttributeDefaultGet method */
  public static final BsdAttributeDefaultRequestMethod BSD_ATTRIBUTE_DEFAULT_GET = new BsdAttributeDefaultRequestMethod("BsdAttributeDefaultGet");
  /** Variable representing the BsdAttributeDefaultSequenceGet method */
  public static final BsdAttributeDefaultRequestMethod BSD_ATTRIBUTE_DEFAULT_SEQUENCE_GET = new BsdAttributeDefaultRequestMethod("BsdAttributeDefaultSequenceGet");
  /** Variable representing the BsdAttributeDefaultUpdate method */
  public static final BsdAttributeDefaultRequestMethod BSD_ATTRIBUTE_DEFAULT_UPDATE = new BsdAttributeDefaultRequestMethod("BsdAttributeDefaultUpdate");
}
