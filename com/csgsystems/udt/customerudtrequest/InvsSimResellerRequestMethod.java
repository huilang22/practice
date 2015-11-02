/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimResellerRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsSimResellerRequestMethod implements UdtMethod {
  private String method = null;
  private InvsSimResellerRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsSimResellerCreate method */
  public static final InvsSimResellerRequestMethod INVS_SIM_RESELLER_CREATE = new InvsSimResellerRequestMethod("InvsSimResellerCreate");
  /** Variable representing the InvsSimResellerFind method */
  public static final InvsSimResellerRequestMethod INVS_SIM_RESELLER_FIND = new InvsSimResellerRequestMethod("InvsSimResellerFind");
  /** Variable representing the InvsSimResellerGet method */
  public static final InvsSimResellerRequestMethod INVS_SIM_RESELLER_GET = new InvsSimResellerRequestMethod("InvsSimResellerGet");
  /** Variable representing the InvsSimResellerUpdate method */
  public static final InvsSimResellerRequestMethod INVS_SIM_RESELLER_UPDATE = new InvsSimResellerRequestMethod("InvsSimResellerUpdate");
}
