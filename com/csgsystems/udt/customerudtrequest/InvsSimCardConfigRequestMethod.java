/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimCardConfigRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsSimCardConfigRequestMethod implements UdtMethod {
  private String method = null;
  private InvsSimCardConfigRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsSimCardConfigCreate method */
  public static final InvsSimCardConfigRequestMethod INVS_SIM_CARD_CONFIG_CREATE = new InvsSimCardConfigRequestMethod("InvsSimCardConfigCreate");
  /** Variable representing the InvsSimCardConfigFind method */
  public static final InvsSimCardConfigRequestMethod INVS_SIM_CARD_CONFIG_FIND = new InvsSimCardConfigRequestMethod("InvsSimCardConfigFind");
  /** Variable representing the InvsSimCardConfigGet method */
  public static final InvsSimCardConfigRequestMethod INVS_SIM_CARD_CONFIG_GET = new InvsSimCardConfigRequestMethod("InvsSimCardConfigGet");
  /** Variable representing the InvsSimCardConfigUpdate method */
  public static final InvsSimCardConfigRequestMethod INVS_SIM_CARD_CONFIG_UPDATE = new InvsSimCardConfigRequestMethod("InvsSimCardConfigUpdate");
}
