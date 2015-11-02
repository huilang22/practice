/*
 * Generated code DO NOT EDIT
 * Generated file: RegulatoryIdRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RegulatoryIdRequestMethod implements UdtMethod {
  private String method = null;
  private RegulatoryIdRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RegulatoryIdCreate method */
  public static final RegulatoryIdRequestMethod REGULATORY_ID_CREATE = new RegulatoryIdRequestMethod("RegulatoryIdCreate");
  /** Variable representing the RegulatoryIdDelete method */
  public static final RegulatoryIdRequestMethod REGULATORY_ID_DELETE = new RegulatoryIdRequestMethod("RegulatoryIdDelete");
  /** Variable representing the RegulatoryIdFind method */
  public static final RegulatoryIdRequestMethod REGULATORY_ID_FIND = new RegulatoryIdRequestMethod("RegulatoryIdFind");
  /** Variable representing the RegulatoryIdGet method */
  public static final RegulatoryIdRequestMethod REGULATORY_ID_GET = new RegulatoryIdRequestMethod("RegulatoryIdGet");
  /** Variable representing the RegulatoryIdUpdate method */
  public static final RegulatoryIdRequestMethod REGULATORY_ID_UPDATE = new RegulatoryIdRequestMethod("RegulatoryIdUpdate");
}
