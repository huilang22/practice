/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParameterRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchRequestParameterRequestMethod implements UdtMethod {
  private String method = null;
  private BatchRequestParameterRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchRequestParameterCreate method */
  public static final BatchRequestParameterRequestMethod BATCH_REQUEST_PARAMETER_CREATE = new BatchRequestParameterRequestMethod("BatchRequestParameterCreate");
  /** Variable representing the BatchRequestParameterDelete method */
  public static final BatchRequestParameterRequestMethod BATCH_REQUEST_PARAMETER_DELETE = new BatchRequestParameterRequestMethod("BatchRequestParameterDelete");
  /** Variable representing the BatchRequestParameterFind method */
  public static final BatchRequestParameterRequestMethod BATCH_REQUEST_PARAMETER_FIND = new BatchRequestParameterRequestMethod("BatchRequestParameterFind");
  /** Variable representing the BatchRequestParameterGet method */
  public static final BatchRequestParameterRequestMethod BATCH_REQUEST_PARAMETER_GET = new BatchRequestParameterRequestMethod("BatchRequestParameterGet");
  /** Variable representing the BatchRequestParameterUpdate method */
  public static final BatchRequestParameterRequestMethod BATCH_REQUEST_PARAMETER_UPDATE = new BatchRequestParameterRequestMethod("BatchRequestParameterUpdate");
}
