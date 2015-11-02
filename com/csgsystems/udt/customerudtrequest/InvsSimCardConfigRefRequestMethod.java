/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimCardConfigRefRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsSimCardConfigRefRequestMethod implements UdtMethod {
  private String method = null;
  private InvsSimCardConfigRefRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsSimCardConfigRefCreate method */
  public static final InvsSimCardConfigRefRequestMethod INVS_SIM_CARD_CONFIG_REF_CREATE = new InvsSimCardConfigRefRequestMethod("InvsSimCardConfigRefCreate");
  /** Variable representing the InvsSimCardConfigRefFind method */
  public static final InvsSimCardConfigRefRequestMethod INVS_SIM_CARD_CONFIG_REF_FIND = new InvsSimCardConfigRefRequestMethod("InvsSimCardConfigRefFind");
  /** Variable representing the InvsSimCardConfigRefGet method */
  public static final InvsSimCardConfigRefRequestMethod INVS_SIM_CARD_CONFIG_REF_GET = new InvsSimCardConfigRefRequestMethod("InvsSimCardConfigRefGet");
  /** Variable representing the InvsSimCardConfigRefUpdate method */
  public static final InvsSimCardConfigRefRequestMethod INVS_SIM_CARD_CONFIG_REF_UPDATE = new InvsSimCardConfigRefRequestMethod("InvsSimCardConfigRefUpdate");
}
