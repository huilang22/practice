/*
 * Generated code DO NOT EDIT
 * Generated file: InvsBlacklistRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsBlacklistRequestMethod implements UdtMethod {
  private String method = null;
  private InvsBlacklistRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsBlacklistCreate method */
  public static final InvsBlacklistRequestMethod INVS_BLACKLIST_CREATE = new InvsBlacklistRequestMethod("InvsBlacklistCreate");
  /** Variable representing the InvsBlacklistFind method */
  public static final InvsBlacklistRequestMethod INVS_BLACKLIST_FIND = new InvsBlacklistRequestMethod("InvsBlacklistFind");
  /** Variable representing the InvsBlacklistGet method */
  public static final InvsBlacklistRequestMethod INVS_BLACKLIST_GET = new InvsBlacklistRequestMethod("InvsBlacklistGet");
  /** Variable representing the InvsBlacklistUpdate method */
  public static final InvsBlacklistRequestMethod INVS_BLACKLIST_UPDATE = new InvsBlacklistRequestMethod("InvsBlacklistUpdate");
}
