/*
 * Generated code DO NOT EDIT
 * Generated file: AsyncRequestRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AsyncRequestRequestMethod implements UdtMethod {
  private String method = null;
  private AsyncRequestRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AsyncRequestCreate method */
  public static final AsyncRequestRequestMethod ASYNC_REQUEST_CREATE = new AsyncRequestRequestMethod("AsyncRequestCreate");
}
