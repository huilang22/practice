/*
 * Generated code DO NOT EDIT
 * Generated file: FranchiseCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class FranchiseCodeRequestMethod implements UdtMethod {
  private String method = null;
  private FranchiseCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the FranchiseCodeCreate method */
  public static final FranchiseCodeRequestMethod FRANCHISE_CODE_CREATE = new FranchiseCodeRequestMethod("FranchiseCodeCreate");
  /** Variable representing the FranchiseCodeDelete method */
  public static final FranchiseCodeRequestMethod FRANCHISE_CODE_DELETE = new FranchiseCodeRequestMethod("FranchiseCodeDelete");
  /** Variable representing the FranchiseCodeFind method */
  public static final FranchiseCodeRequestMethod FRANCHISE_CODE_FIND = new FranchiseCodeRequestMethod("FranchiseCodeFind");
  /** Variable representing the FranchiseCodeGet method */
  public static final FranchiseCodeRequestMethod FRANCHISE_CODE_GET = new FranchiseCodeRequestMethod("FranchiseCodeGet");
  /** Variable representing the FranchiseCodeUpdate method */
  public static final FranchiseCodeRequestMethod FRANCHISE_CODE_UPDATE = new FranchiseCodeRequestMethod("FranchiseCodeUpdate");
}
