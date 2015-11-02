/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimResellerRefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsSimResellerRefRequestMethod implements UdtMethod {
  private String method = null;
  private InvsSimResellerRefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsSimResellerRefCreate method */
  public static final InvsSimResellerRefRequestMethod INVS_SIM_RESELLER_REF_CREATE = new InvsSimResellerRefRequestMethod("InvsSimResellerRefCreate");
  /** Variable representing the InvsSimResellerRefFind method */
  public static final InvsSimResellerRefRequestMethod INVS_SIM_RESELLER_REF_FIND = new InvsSimResellerRefRequestMethod("InvsSimResellerRefFind");
  /** Variable representing the InvsSimResellerRefGet method */
  public static final InvsSimResellerRefRequestMethod INVS_SIM_RESELLER_REF_GET = new InvsSimResellerRefRequestMethod("InvsSimResellerRefGet");
  /** Variable representing the InvsSimResellerRefUpdate method */
  public static final InvsSimResellerRefRequestMethod INVS_SIM_RESELLER_REF_UPDATE = new InvsSimResellerRefRequestMethod("InvsSimResellerRefUpdate");
}
