/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyParameterRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchRequestNotifyParameterRequestMethod implements UdtMethod {
  private String method = null;
  private BatchRequestNotifyParameterRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchRequestNotifyParameterCreate method */
  public static final BatchRequestNotifyParameterRequestMethod BATCH_REQUEST_NOTIFY_PARAMETER_CREATE = new BatchRequestNotifyParameterRequestMethod("BatchRequestNotifyParameterCreate");
  /** Variable representing the BatchRequestNotifyParameterDelete method */
  public static final BatchRequestNotifyParameterRequestMethod BATCH_REQUEST_NOTIFY_PARAMETER_DELETE = new BatchRequestNotifyParameterRequestMethod("BatchRequestNotifyParameterDelete");
  /** Variable representing the BatchRequestNotifyParameterFind method */
  public static final BatchRequestNotifyParameterRequestMethod BATCH_REQUEST_NOTIFY_PARAMETER_FIND = new BatchRequestNotifyParameterRequestMethod("BatchRequestNotifyParameterFind");
  /** Variable representing the BatchRequestNotifyParameterFindCount method */
  public static final BatchRequestNotifyParameterRequestMethod BATCH_REQUEST_NOTIFY_PARAMETER_FIND_COUNT = new BatchRequestNotifyParameterRequestMethod("BatchRequestNotifyParameterFindCount");
  /** Variable representing the BatchRequestNotifyParameterGet method */
  public static final BatchRequestNotifyParameterRequestMethod BATCH_REQUEST_NOTIFY_PARAMETER_GET = new BatchRequestNotifyParameterRequestMethod("BatchRequestNotifyParameterGet");
  /** Variable representing the BatchRequestNotifyParameterUpdate method */
  public static final BatchRequestNotifyParameterRequestMethod BATCH_REQUEST_NOTIFY_PARAMETER_UPDATE = new BatchRequestNotifyParameterRequestMethod("BatchRequestNotifyParameterUpdate");
}
