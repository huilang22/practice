/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentElementRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ComponentElementRequestMethod implements UdtMethod {
  private String method = null;
  private ComponentElementRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ComponentElementCreate method */
  public static final ComponentElementRequestMethod COMPONENT_ELEMENT_CREATE = new ComponentElementRequestMethod("ComponentElementCreate");
  /** Variable representing the ComponentElementDelete method */
  public static final ComponentElementRequestMethod COMPONENT_ELEMENT_DELETE = new ComponentElementRequestMethod("ComponentElementDelete");
  /** Variable representing the ComponentElementFind method */
  public static final ComponentElementRequestMethod COMPONENT_ELEMENT_FIND = new ComponentElementRequestMethod("ComponentElementFind");
  /** Variable representing the ComponentElementGet method */
  public static final ComponentElementRequestMethod COMPONENT_ELEMENT_GET = new ComponentElementRequestMethod("ComponentElementGet");
  /** Variable representing the ComponentElementUpdate method */
  public static final ComponentElementRequestMethod COMPONENT_ELEMENT_UPDATE = new ComponentElementRequestMethod("ComponentElementUpdate");
}
