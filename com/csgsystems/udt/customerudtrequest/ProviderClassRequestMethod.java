/*
 * Generated code DO NOT EDIT
 * Generated file: ProviderClassRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProviderClassRequestMethod implements UdtMethod {
  private String method = null;
  private ProviderClassRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProviderClassCreate method */
  public static final ProviderClassRequestMethod PROVIDER_CLASS_CREATE = new ProviderClassRequestMethod("ProviderClassCreate");
  /** Variable representing the ProviderClassDelete method */
  public static final ProviderClassRequestMethod PROVIDER_CLASS_DELETE = new ProviderClassRequestMethod("ProviderClassDelete");
  /** Variable representing the ProviderClassFind method */
  public static final ProviderClassRequestMethod PROVIDER_CLASS_FIND = new ProviderClassRequestMethod("ProviderClassFind");
  /** Variable representing the ProviderClassGet method */
  public static final ProviderClassRequestMethod PROVIDER_CLASS_GET = new ProviderClassRequestMethod("ProviderClassGet");
  /** Variable representing the ProviderClassUpdate method */
  public static final ProviderClassRequestMethod PROVIDER_CLASS_UPDATE = new ProviderClassRequestMethod("ProviderClassUpdate");
}
