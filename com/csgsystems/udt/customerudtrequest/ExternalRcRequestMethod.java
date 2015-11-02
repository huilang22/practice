/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalRcRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ExternalRcRequestMethod implements UdtMethod {
  private String method = null;
  private ExternalRcRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ExternalRcFind method */
  public static final ExternalRcRequestMethod EXTERNAL_RC_FIND = new ExternalRcRequestMethod("ExternalRcFind");
  /** Variable representing the ExternalRcGet method */
  public static final ExternalRcRequestMethod EXTERNAL_RC_GET = new ExternalRcRequestMethod("ExternalRcGet");
  /** Variable representing the ExternalRcUpdate method */
  public static final ExternalRcRequestMethod EXTERNAL_RC_UPDATE = new ExternalRcRequestMethod("ExternalRcUpdate");
}
