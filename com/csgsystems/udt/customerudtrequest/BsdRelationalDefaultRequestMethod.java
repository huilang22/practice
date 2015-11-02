/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalDefaultRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdRelationalDefaultRequestMethod implements UdtMethod {
  private String method = null;
  private BsdRelationalDefaultRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdRelationalDefaultActionFind method */
  public static final BsdRelationalDefaultRequestMethod BSD_RELATIONAL_DEFAULT_ACTION_FIND = new BsdRelationalDefaultRequestMethod("BsdRelationalDefaultActionFind");
  /** Variable representing the BsdRelationalDefaultCreate method */
  public static final BsdRelationalDefaultRequestMethod BSD_RELATIONAL_DEFAULT_CREATE = new BsdRelationalDefaultRequestMethod("BsdRelationalDefaultCreate");
  /** Variable representing the BsdRelationalDefaultDelete method */
  public static final BsdRelationalDefaultRequestMethod BSD_RELATIONAL_DEFAULT_DELETE = new BsdRelationalDefaultRequestMethod("BsdRelationalDefaultDelete");
  /** Variable representing the BsdRelationalDefaultDeleteAll method */
  public static final BsdRelationalDefaultRequestMethod BSD_RELATIONAL_DEFAULT_DELETE_ALL = new BsdRelationalDefaultRequestMethod("BsdRelationalDefaultDeleteAll");
  /** Variable representing the BsdRelationalDefaultFind method */
  public static final BsdRelationalDefaultRequestMethod BSD_RELATIONAL_DEFAULT_FIND = new BsdRelationalDefaultRequestMethod("BsdRelationalDefaultFind");
  /** Variable representing the BsdRelationalDefaultGet method */
  public static final BsdRelationalDefaultRequestMethod BSD_RELATIONAL_DEFAULT_GET = new BsdRelationalDefaultRequestMethod("BsdRelationalDefaultGet");
  /** Variable representing the BsdRelationalDefaultSequenceGet method */
  public static final BsdRelationalDefaultRequestMethod BSD_RELATIONAL_DEFAULT_SEQUENCE_GET = new BsdRelationalDefaultRequestMethod("BsdRelationalDefaultSequenceGet");
  /** Variable representing the BsdRelationalDefaultUpdate method */
  public static final BsdRelationalDefaultRequestMethod BSD_RELATIONAL_DEFAULT_UPDATE = new BsdRelationalDefaultRequestMethod("BsdRelationalDefaultUpdate");
}
