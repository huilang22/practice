/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueAutoRetryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdQueueAutoRetryRequestMethod implements UdtMethod {
  private String method = null;
  private BsdQueueAutoRetryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdQueueAutoRetryCreate method */
  public static final BsdQueueAutoRetryRequestMethod BSD_QUEUE_AUTO_RETRY_CREATE = new BsdQueueAutoRetryRequestMethod("BsdQueueAutoRetryCreate");
  /** Variable representing the BsdQueueAutoRetryDelete method */
  public static final BsdQueueAutoRetryRequestMethod BSD_QUEUE_AUTO_RETRY_DELETE = new BsdQueueAutoRetryRequestMethod("BsdQueueAutoRetryDelete");
  /** Variable representing the BsdQueueAutoRetryFind method */
  public static final BsdQueueAutoRetryRequestMethod BSD_QUEUE_AUTO_RETRY_FIND = new BsdQueueAutoRetryRequestMethod("BsdQueueAutoRetryFind");
  /** Variable representing the BsdQueueAutoRetryGet method */
  public static final BsdQueueAutoRetryRequestMethod BSD_QUEUE_AUTO_RETRY_GET = new BsdQueueAutoRetryRequestMethod("BsdQueueAutoRetryGet");
  /** Variable representing the BsdQueueAutoRetryUpdate method */
  public static final BsdQueueAutoRetryRequestMethod BSD_QUEUE_AUTO_RETRY_UPDATE = new BsdQueueAutoRetryRequestMethod("BsdQueueAutoRetryUpdate");
}
