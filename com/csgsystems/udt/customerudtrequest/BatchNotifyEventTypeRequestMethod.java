/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyEventTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchNotifyEventTypeRequestMethod implements UdtMethod {
  private String method = null;
  private BatchNotifyEventTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchNotifyEventTypeCreate method */
  public static final BatchNotifyEventTypeRequestMethod BATCH_NOTIFY_EVENT_TYPE_CREATE = new BatchNotifyEventTypeRequestMethod("BatchNotifyEventTypeCreate");
  /** Variable representing the BatchNotifyEventTypeDelete method */
  public static final BatchNotifyEventTypeRequestMethod BATCH_NOTIFY_EVENT_TYPE_DELETE = new BatchNotifyEventTypeRequestMethod("BatchNotifyEventTypeDelete");
  /** Variable representing the BatchNotifyEventTypeFind method */
  public static final BatchNotifyEventTypeRequestMethod BATCH_NOTIFY_EVENT_TYPE_FIND = new BatchNotifyEventTypeRequestMethod("BatchNotifyEventTypeFind");
  /** Variable representing the BatchNotifyEventTypeGet method */
  public static final BatchNotifyEventTypeRequestMethod BATCH_NOTIFY_EVENT_TYPE_GET = new BatchNotifyEventTypeRequestMethod("BatchNotifyEventTypeGet");
  /** Variable representing the BatchNotifyEventTypeUpdate method */
  public static final BatchNotifyEventTypeRequestMethod BATCH_NOTIFY_EVENT_TYPE_UPDATE = new BatchNotifyEventTypeRequestMethod("BatchNotifyEventTypeUpdate");
}
