/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BsdQueueRequestMethod implements UdtMethod {
  private String method = null;
  private BsdQueueRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BsdQueueAdd method */
  public static final BsdQueueRequestMethod BSD_QUEUE_ADD = new BsdQueueRequestMethod("BsdQueueAdd");
  /** Variable representing the BsdQueueCreate method */
  public static final BsdQueueRequestMethod BSD_QUEUE_CREATE = new BsdQueueRequestMethod("BsdQueueCreate");
  /** Variable representing the BsdQueueDelete method */
  public static final BsdQueueRequestMethod BSD_QUEUE_DELETE = new BsdQueueRequestMethod("BsdQueueDelete");
  /** Variable representing the BsdQueueDeleteInternal method */
  public static final BsdQueueRequestMethod BSD_QUEUE_DELETE_INTERNAL = new BsdQueueRequestMethod("BsdQueueDeleteInternal");
  /** Variable representing the BsdQueueFind method */
  public static final BsdQueueRequestMethod BSD_QUEUE_FIND = new BsdQueueRequestMethod("BsdQueueFind");
  /** Variable representing the BsdQueueFindInternal method */
  public static final BsdQueueRequestMethod BSD_QUEUE_FIND_INTERNAL = new BsdQueueRequestMethod("BsdQueueFindInternal");
  /** Variable representing the BsdQueueGet method */
  public static final BsdQueueRequestMethod BSD_QUEUE_GET = new BsdQueueRequestMethod("BsdQueueGet");
  /** Variable representing the BsdQueueGetRecovery method */
  public static final BsdQueueRequestMethod BSD_QUEUE_GET_RECOVERY = new BsdQueueRequestMethod("BsdQueueGetRecovery");
  /** Variable representing the BsdQueueResume method */
  public static final BsdQueueRequestMethod BSD_QUEUE_RESUME = new BsdQueueRequestMethod("BsdQueueResume");
  /** Variable representing the BsdQueueRetry method */
  public static final BsdQueueRequestMethod BSD_QUEUE_RETRY = new BsdQueueRequestMethod("BsdQueueRetry");
  /** Variable representing the BsdQueueSuspend method */
  public static final BsdQueueRequestMethod BSD_QUEUE_SUSPEND = new BsdQueueRequestMethod("BsdQueueSuspend");
  /** Variable representing the BsdQueueUpdate method */
  public static final BsdQueueRequestMethod BSD_QUEUE_UPDATE = new BsdQueueRequestMethod("BsdQueueUpdate");
}
