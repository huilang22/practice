/*
 * Generated code DO NOT EDIT
 * Generated file: AIRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AIRequestMethod implements UdtMethod {
  private String method = null;
  private AIRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the Invoke method */
  public static final AIRequestMethod INVOKE = new AIRequestMethod("Invoke");
}
