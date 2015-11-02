/*
 * Generated code DO NOT EDIT
 * Generated file: AbiNrcDucRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AbiNrcDucRequestMethod implements UdtMethod {
  private String method = null;
  private AbiNrcDucRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AbiNrcDucFind method */
  public static final AbiNrcDucRequestMethod ABI_NRC_DUC_FIND = new AbiNrcDucRequestMethod("AbiNrcDucFind");
  /** Variable representing the AbiNrcDucGet method */
  public static final AbiNrcDucRequestMethod ABI_NRC_DUC_GET = new AbiNrcDucRequestMethod("AbiNrcDucGet");
  /** Variable representing the AbiNrcDucUpdate method */
  public static final AbiNrcDucRequestMethod ABI_NRC_DUC_UPDATE = new AbiNrcDucRequestMethod("AbiNrcDucUpdate");
}
