/*
 * Generated code DO NOT EDIT
 * Generated file: AtmPoplistRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AtmPoplistRequestMethod implements UdtMethod {
  private String method = null;
  private AtmPoplistRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AtmPoplistCreate method */
  public static final AtmPoplistRequestMethod ATM_POPLIST_CREATE = new AtmPoplistRequestMethod("AtmPoplistCreate");
  /** Variable representing the AtmPoplistFind method */
  public static final AtmPoplistRequestMethod ATM_POPLIST_FIND = new AtmPoplistRequestMethod("AtmPoplistFind");
  /** Variable representing the AtmPoplistGet method */
  public static final AtmPoplistRequestMethod ATM_POPLIST_GET = new AtmPoplistRequestMethod("AtmPoplistGet");
  /** Variable representing the AtmPoplistUpdate method */
  public static final AtmPoplistRequestMethod ATM_POPLIST_UPDATE = new AtmPoplistRequestMethod("AtmPoplistUpdate");
}
