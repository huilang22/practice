/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFeedFileRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcFeedFileRequestMethod implements UdtMethod {
  private String method = null;
  private CtcFeedFileRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcFeedFileCreate method */
  public static final CtcFeedFileRequestMethod CTC_FEED_FILE_CREATE = new CtcFeedFileRequestMethod("CtcFeedFileCreate");
  /** Variable representing the CtcFeedFileDelete method */
  public static final CtcFeedFileRequestMethod CTC_FEED_FILE_DELETE = new CtcFeedFileRequestMethod("CtcFeedFileDelete");
  /** Variable representing the CtcFeedFileFind method */
  public static final CtcFeedFileRequestMethod CTC_FEED_FILE_FIND = new CtcFeedFileRequestMethod("CtcFeedFileFind");
  /** Variable representing the CtcFeedFileGet method */
  public static final CtcFeedFileRequestMethod CTC_FEED_FILE_GET = new CtcFeedFileRequestMethod("CtcFeedFileGet");
  /** Variable representing the CtcFeedFileUpdate method */
  public static final CtcFeedFileRequestMethod CTC_FEED_FILE_UPDATE = new CtcFeedFileRequestMethod("CtcFeedFileUpdate");
}
