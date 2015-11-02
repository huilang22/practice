/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementPlusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvElementPlusRequestMethod implements UdtMethod {
  private String method = null;
  private InvElementPlusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvElementPlusAuto method */
  public static final InvElementPlusRequestMethod INV_ELEMENT_PLUS_AUTO = new InvElementPlusRequestMethod("InvElementPlusAuto");
  /** Variable representing the InvElementPlusAutoCont method */
  public static final InvElementPlusRequestMethod INV_ELEMENT_PLUS_AUTO_CONT = new InvElementPlusRequestMethod("InvElementPlusAutoCont");
  /** Variable representing the InvElementPlusContFind method */
  public static final InvElementPlusRequestMethod INV_ELEMENT_PLUS_CONT_FIND = new InvElementPlusRequestMethod("InvElementPlusContFind");
  /** Variable representing the InvElementPlusGet method */
  public static final InvElementPlusRequestMethod INV_ELEMENT_PLUS_GET = new InvElementPlusRequestMethod("InvElementPlusGet");
  /** Variable representing the InvElementPlusIdFind method */
  public static final InvElementPlusRequestMethod INV_ELEMENT_PLUS_ID_FIND = new InvElementPlusRequestMethod("InvElementPlusIdFind");
}
