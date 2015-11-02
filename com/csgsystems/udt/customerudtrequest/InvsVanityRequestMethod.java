/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVanityRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsVanityRequestMethod implements UdtMethod {
  private String method = null;
  private InvsVanityRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsVanityCreate method */
  public static final InvsVanityRequestMethod INVS_VANITY_CREATE = new InvsVanityRequestMethod("InvsVanityCreate");
  /** Variable representing the InvsVanityFind method */
  public static final InvsVanityRequestMethod INVS_VANITY_FIND = new InvsVanityRequestMethod("InvsVanityFind");
  /** Variable representing the InvsVanityGet method */
  public static final InvsVanityRequestMethod INVS_VANITY_GET = new InvsVanityRequestMethod("InvsVanityGet");
  /** Variable representing the InvsVanityUpdate method */
  public static final InvsVanityRequestMethod INVS_VANITY_UPDATE = new InvsVanityRequestMethod("InvsVanityUpdate");
}
