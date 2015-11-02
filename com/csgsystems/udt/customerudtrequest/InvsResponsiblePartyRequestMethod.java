/*
 * Generated code DO NOT EDIT
 * Generated file: InvsResponsiblePartyRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsResponsiblePartyRequestMethod implements UdtMethod {
  private String method = null;
  private InvsResponsiblePartyRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsResponsiblePartyCreate method */
  public static final InvsResponsiblePartyRequestMethod INVS_RESPONSIBLE_PARTY_CREATE = new InvsResponsiblePartyRequestMethod("InvsResponsiblePartyCreate");
  /** Variable representing the InvsResponsiblePartyDelete method */
  public static final InvsResponsiblePartyRequestMethod INVS_RESPONSIBLE_PARTY_DELETE = new InvsResponsiblePartyRequestMethod("InvsResponsiblePartyDelete");
  /** Variable representing the InvsResponsiblePartyFind method */
  public static final InvsResponsiblePartyRequestMethod INVS_RESPONSIBLE_PARTY_FIND = new InvsResponsiblePartyRequestMethod("InvsResponsiblePartyFind");
  /** Variable representing the InvsResponsiblePartyGet method */
  public static final InvsResponsiblePartyRequestMethod INVS_RESPONSIBLE_PARTY_GET = new InvsResponsiblePartyRequestMethod("InvsResponsiblePartyGet");
  /** Variable representing the InvsResponsiblePartyUpdate method */
  public static final InvsResponsiblePartyRequestMethod INVS_RESPONSIBLE_PARTY_UPDATE = new InvsResponsiblePartyRequestMethod("InvsResponsiblePartyUpdate");
}
