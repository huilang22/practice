/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchNotifyTypeRequestMethod implements UdtMethod {
  private String method = null;
  private BatchNotifyTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchNotifyTypeCreate method */
  public static final BatchNotifyTypeRequestMethod BATCH_NOTIFY_TYPE_CREATE = new BatchNotifyTypeRequestMethod("BatchNotifyTypeCreate");
  /** Variable representing the BatchNotifyTypeDelete method */
  public static final BatchNotifyTypeRequestMethod BATCH_NOTIFY_TYPE_DELETE = new BatchNotifyTypeRequestMethod("BatchNotifyTypeDelete");
  /** Variable representing the BatchNotifyTypeFind method */
  public static final BatchNotifyTypeRequestMethod BATCH_NOTIFY_TYPE_FIND = new BatchNotifyTypeRequestMethod("BatchNotifyTypeFind");
  /** Variable representing the BatchNotifyTypeGet method */
  public static final BatchNotifyTypeRequestMethod BATCH_NOTIFY_TYPE_GET = new BatchNotifyTypeRequestMethod("BatchNotifyTypeGet");
  /** Variable representing the BatchNotifyTypeUpdate method */
  public static final BatchNotifyTypeRequestMethod BATCH_NOTIFY_TYPE_UPDATE = new BatchNotifyTypeRequestMethod("BatchNotifyTypeUpdate");
}
