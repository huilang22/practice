/*
 * Generated code DO NOT EDIT
 * Generated file: CitChannelRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CitChannelRequestMethod implements UdtMethod {
  private String method = null;
  private CitChannelRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CitChannelCreate method */
  public static final CitChannelRequestMethod CIT_CHANNEL_CREATE = new CitChannelRequestMethod("CitChannelCreate");
  /** Variable representing the CitChannelDelete method */
  public static final CitChannelRequestMethod CIT_CHANNEL_DELETE = new CitChannelRequestMethod("CitChannelDelete");
  /** Variable representing the CitChannelFind method */
  public static final CitChannelRequestMethod CIT_CHANNEL_FIND = new CitChannelRequestMethod("CitChannelFind");
  /** Variable representing the CitChannelGet method */
  public static final CitChannelRequestMethod CIT_CHANNEL_GET = new CitChannelRequestMethod("CitChannelGet");
  /** Variable representing the CitChannelSequenceGet method */
  public static final CitChannelRequestMethod CIT_CHANNEL_SEQUENCE_GET = new CitChannelRequestMethod("CitChannelSequenceGet");
  /** Variable representing the CitChannelUpdate method */
  public static final CitChannelRequestMethod CIT_CHANNEL_UPDATE = new CitChannelRequestMethod("CitChannelUpdate");
}
