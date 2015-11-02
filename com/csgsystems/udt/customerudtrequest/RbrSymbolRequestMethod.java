/*
 * Generated code DO NOT EDIT
 * Generated file: RbrSymbolRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RbrSymbolRequestMethod implements UdtMethod {
  private String method = null;
  private RbrSymbolRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RbrSymbolCreate method */
  public static final RbrSymbolRequestMethod RBR_SYMBOL_CREATE = new RbrSymbolRequestMethod("RbrSymbolCreate");
  /** Variable representing the RbrSymbolDelete method */
  public static final RbrSymbolRequestMethod RBR_SYMBOL_DELETE = new RbrSymbolRequestMethod("RbrSymbolDelete");
  /** Variable representing the RbrSymbolFind method */
  public static final RbrSymbolRequestMethod RBR_SYMBOL_FIND = new RbrSymbolRequestMethod("RbrSymbolFind");
  /** Variable representing the RbrSymbolGet method */
  public static final RbrSymbolRequestMethod RBR_SYMBOL_GET = new RbrSymbolRequestMethod("RbrSymbolGet");
  /** Variable representing the RbrSymbolUpdate method */
  public static final RbrSymbolRequestMethod RBR_SYMBOL_UPDATE = new RbrSymbolRequestMethod("RbrSymbolUpdate");
}
