/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentDefinitionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ComponentDefinitionRequestMethod implements UdtMethod {
  private String method = null;
  private ComponentDefinitionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ComponentDefinitionCreate method */
  public static final ComponentDefinitionRequestMethod COMPONENT_DEFINITION_CREATE = new ComponentDefinitionRequestMethod("ComponentDefinitionCreate");
  /** Variable representing the ComponentDefinitionDelete method */
  public static final ComponentDefinitionRequestMethod COMPONENT_DEFINITION_DELETE = new ComponentDefinitionRequestMethod("ComponentDefinitionDelete");
  /** Variable representing the ComponentDefinitionFind method */
  public static final ComponentDefinitionRequestMethod COMPONENT_DEFINITION_FIND = new ComponentDefinitionRequestMethod("ComponentDefinitionFind");
  /** Variable representing the ComponentDefinitionGet method */
  public static final ComponentDefinitionRequestMethod COMPONENT_DEFINITION_GET = new ComponentDefinitionRequestMethod("ComponentDefinitionGet");
  /** Variable representing the ComponentDefinitionPrice method */
  public static final ComponentDefinitionRequestMethod COMPONENT_DEFINITION_PRICE = new ComponentDefinitionRequestMethod("ComponentDefinitionPrice");
  /** Variable representing the ComponentDefinitionUpdate method */
  public static final ComponentDefinitionRequestMethod COMPONENT_DEFINITION_UPDATE = new ComponentDefinitionRequestMethod("ComponentDefinitionUpdate");
}
