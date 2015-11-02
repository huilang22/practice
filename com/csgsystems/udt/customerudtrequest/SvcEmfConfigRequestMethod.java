/*
 * Generated code DO NOT EDIT
 * Generated file: SvcEmfConfigRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SvcEmfConfigRequestMethod implements UdtMethod {
  private String method = null;
  private SvcEmfConfigRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SvcEmfConfigFind method */
  public static final SvcEmfConfigRequestMethod SVC_EMF_CONFIG_FIND = new SvcEmfConfigRequestMethod("SvcEmfConfigFind");
}
