/*
 * Generated code DO NOT EDIT
 * Generated file: CollectableRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CollectableRequestMethod implements UdtMethod {
  private String method = null;
  private CollectableRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CollectableFind method */
  public static final CollectableRequestMethod COLLECTABLE_FIND = new CollectableRequestMethod("CollectableFind");
  /** Variable representing the CollectableGet method */
  public static final CollectableRequestMethod COLLECTABLE_GET = new CollectableRequestMethod("CollectableGet");
}
