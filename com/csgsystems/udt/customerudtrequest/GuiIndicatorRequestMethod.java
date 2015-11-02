/*
 * Generated code DO NOT EDIT
 * Generated file: GuiIndicatorRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GuiIndicatorRequestMethod implements UdtMethod {
  private String method = null;
  private GuiIndicatorRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GuiIndicatorCreate method */
  public static final GuiIndicatorRequestMethod GUI_INDICATOR_CREATE = new GuiIndicatorRequestMethod("GuiIndicatorCreate");
  /** Variable representing the GuiIndicatorDelete method */
  public static final GuiIndicatorRequestMethod GUI_INDICATOR_DELETE = new GuiIndicatorRequestMethod("GuiIndicatorDelete");
  /** Variable representing the GuiIndicatorFind method */
  public static final GuiIndicatorRequestMethod GUI_INDICATOR_FIND = new GuiIndicatorRequestMethod("GuiIndicatorFind");
  /** Variable representing the GuiIndicatorGet method */
  public static final GuiIndicatorRequestMethod GUI_INDICATOR_GET = new GuiIndicatorRequestMethod("GuiIndicatorGet");
  /** Variable representing the GuiIndicatorUpdate method */
  public static final GuiIndicatorRequestMethod GUI_INDICATOR_UPDATE = new GuiIndicatorRequestMethod("GuiIndicatorUpdate");
}
