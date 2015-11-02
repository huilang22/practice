/*
 * Generated code DO NOT EDIT
 * Generated file: CollectorRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CollectorRequestMethod implements UdtMethod {
  private String method = null;
  private CollectorRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CollectorFind method */
  public static final CollectorRequestMethod COLLECTOR_FIND = new CollectorRequestMethod("CollectorFind");
  /** Variable representing the CollectorGet method */
  public static final CollectorRequestMethod COLLECTOR_GET = new CollectorRequestMethod("CollectorGet");
}
