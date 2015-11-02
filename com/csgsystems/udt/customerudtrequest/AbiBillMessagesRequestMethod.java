/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillMessagesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AbiBillMessagesRequestMethod implements UdtMethod {
  private String method = null;
  private AbiBillMessagesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AbiBillMessagesFind method */
  public static final AbiBillMessagesRequestMethod ABI_BILL_MESSAGES_FIND = new AbiBillMessagesRequestMethod("AbiBillMessagesFind");
  /** Variable representing the AbiBillMessagesGet method */
  public static final AbiBillMessagesRequestMethod ABI_BILL_MESSAGES_GET = new AbiBillMessagesRequestMethod("AbiBillMessagesGet");
  /** Variable representing the AbiBillMessagesUpdate method */
  public static final AbiBillMessagesRequestMethod ABI_BILL_MESSAGES_UPDATE = new AbiBillMessagesRequestMethod("AbiBillMessagesUpdate");
}
