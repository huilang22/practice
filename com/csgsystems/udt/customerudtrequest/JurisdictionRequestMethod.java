/*
 * Generated code DO NOT EDIT
 * Generated file: JurisdictionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class JurisdictionRequestMethod implements UdtMethod {
  private String method = null;
  private JurisdictionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the JurisdictionFind method */
  public static final JurisdictionRequestMethod JURISDICTION_FIND = new JurisdictionRequestMethod("JurisdictionFind");
  /** Variable representing the JurisdictionGet method */
  public static final JurisdictionRequestMethod JURISDICTION_GET = new JurisdictionRequestMethod("JurisdictionGet");
}
