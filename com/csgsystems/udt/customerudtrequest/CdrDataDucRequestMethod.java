/*
 * Generated code DO NOT EDIT
 * Generated file: CdrDataDucRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CdrDataDucRequestMethod implements UdtMethod {
  private String method = null;
  private CdrDataDucRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CdrDataDucFind method */
  public static final CdrDataDucRequestMethod CDR_DATA_DUC_FIND = new CdrDataDucRequestMethod("CdrDataDucFind");
}
