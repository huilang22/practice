/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalContractRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GlobalContractRequestMethod implements UdtMethod {
  private String method = null;
  private GlobalContractRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GlobalContractCreate method */
  public static final GlobalContractRequestMethod GLOBAL_CONTRACT_CREATE = new GlobalContractRequestMethod("GlobalContractCreate");
  /** Variable representing the GlobalContractFind method */
  public static final GlobalContractRequestMethod GLOBAL_CONTRACT_FIND = new GlobalContractRequestMethod("GlobalContractFind");
  /** Variable representing the GlobalContractGet method */
  public static final GlobalContractRequestMethod GLOBAL_CONTRACT_GET = new GlobalContractRequestMethod("GlobalContractGet");
  /** Variable representing the GlobalContractUpdate method */
  public static final GlobalContractRequestMethod GLOBAL_CONTRACT_UPDATE = new GlobalContractRequestMethod("GlobalContractUpdate");
}
