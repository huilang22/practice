/*
 * Generated code DO NOT EDIT
 * Generated file: GuiVersionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GuiVersionRequestMethod implements UdtMethod {
  private String method = null;
  private GuiVersionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GuiVersionFind method */
  public static final GuiVersionRequestMethod GUI_VERSION_FIND = new GuiVersionRequestMethod("GuiVersionFind");
  /** Variable representing the GuiVersionGet method */
  public static final GuiVersionRequestMethod GUI_VERSION_GET = new GuiVersionRequestMethod("GuiVersionGet");
}
