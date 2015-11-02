/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdAcctMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExternalIdAcctMapRequestMethod implements UdtMethod {
  private String method = null;
  private ExternalIdAcctMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExternalIdAcctMapFind method */
  public static final ExternalIdAcctMapRequestMethod EXTERNAL_ID_ACCT_MAP_FIND = new ExternalIdAcctMapRequestMethod("ExternalIdAcctMapFind");
  /** Variable representing the ExternalIdAcctMapGet method */
  public static final ExternalIdAcctMapRequestMethod EXTERNAL_ID_ACCT_MAP_GET = new ExternalIdAcctMapRequestMethod("ExternalIdAcctMapGet");
}
