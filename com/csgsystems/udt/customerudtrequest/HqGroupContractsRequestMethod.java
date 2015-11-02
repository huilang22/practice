/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupContractsRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class HqGroupContractsRequestMethod implements UdtMethod {
  private String method = null;
  private HqGroupContractsRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HqGroupContractsCreate method */
  public static final HqGroupContractsRequestMethod HQ_GROUP_CONTRACTS_CREATE = new HqGroupContractsRequestMethod("HqGroupContractsCreate");
  /** Variable representing the HqGroupContractsDelete method */
  public static final HqGroupContractsRequestMethod HQ_GROUP_CONTRACTS_DELETE = new HqGroupContractsRequestMethod("HqGroupContractsDelete");
  /** Variable representing the HqGroupContractsFind method */
  public static final HqGroupContractsRequestMethod HQ_GROUP_CONTRACTS_FIND = new HqGroupContractsRequestMethod("HqGroupContractsFind");
  /** Variable representing the HqGroupContractsGet method */
  public static final HqGroupContractsRequestMethod HQ_GROUP_CONTRACTS_GET = new HqGroupContractsRequestMethod("HqGroupContractsGet");
  /** Variable representing the HqGroupContractsUpdate method */
  public static final HqGroupContractsRequestMethod HQ_GROUP_CONTRACTS_UPDATE = new HqGroupContractsRequestMethod("HqGroupContractsUpdate");
}
