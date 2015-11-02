/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ComponentRequestMethod implements UdtMethod {
  private String method = null;
  private ComponentRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ComponentActivate method */
  public static final ComponentRequestMethod COMPONENT_ACTIVATE = new ComponentRequestMethod("ComponentActivate");
  /** Variable representing the ComponentCancel method */
  public static final ComponentRequestMethod COMPONENT_CANCEL = new ComponentRequestMethod("ComponentCancel");
  /** Variable representing the ComponentCreate method */
  public static final ComponentRequestMethod COMPONENT_CREATE = new ComponentRequestMethod("ComponentCreate");
  /** Variable representing the ComponentDelete method */
  public static final ComponentRequestMethod COMPONENT_DELETE = new ComponentRequestMethod("ComponentDelete");
  /** Variable representing the ComponentDeleteList method */
  public static final ComponentRequestMethod COMPONENT_DELETE_LIST = new ComponentRequestMethod("ComponentDeleteList");
  /** Variable representing the ComponentDisconnectValidate method */
  public static final ComponentRequestMethod COMPONENT_DISCONNECT_VALIDATE = new ComponentRequestMethod("ComponentDisconnectValidate");
  /** Variable representing the ComponentExternalFind method */
  public static final ComponentRequestMethod COMPONENT_EXTERNAL_FIND = new ComponentRequestMethod("ComponentExternalFind");
  /** Variable representing the ComponentFind method */
  public static final ComponentRequestMethod COMPONENT_FIND = new ComponentRequestMethod("ComponentFind");
  /** Variable representing the ComponentFindByServiceOrder method */
  public static final ComponentRequestMethod COMPONENT_FIND_BY_SERVICE_ORDER = new ComponentRequestMethod("ComponentFindByServiceOrder");
  /** Variable representing the ComponentFindCount method */
  public static final ComponentRequestMethod COMPONENT_FIND_COUNT = new ComponentRequestMethod("ComponentFindCount");
  /** Variable representing the ComponentGet method */
  public static final ComponentRequestMethod COMPONENT_GET = new ComponentRequestMethod("ComponentGet");
  /** Variable representing the ComponentRemove method */
  public static final ComponentRequestMethod COMPONENT_REMOVE = new ComponentRequestMethod("ComponentRemove");
  /** Variable representing the ComponentUpdate method */
  public static final ComponentRequestMethod COMPONENT_UPDATE = new ComponentRequestMethod("ComponentUpdate");
}
