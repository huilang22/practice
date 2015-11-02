/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeParameterRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchTypeParameterRequestMethod implements UdtMethod {
  private String method = null;
  private BatchTypeParameterRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchTypeParameterCreate method */
  public static final BatchTypeParameterRequestMethod BATCH_TYPE_PARAMETER_CREATE = new BatchTypeParameterRequestMethod("BatchTypeParameterCreate");
  /** Variable representing the BatchTypeParameterDelete method */
  public static final BatchTypeParameterRequestMethod BATCH_TYPE_PARAMETER_DELETE = new BatchTypeParameterRequestMethod("BatchTypeParameterDelete");
  /** Variable representing the BatchTypeParameterFind method */
  public static final BatchTypeParameterRequestMethod BATCH_TYPE_PARAMETER_FIND = new BatchTypeParameterRequestMethod("BatchTypeParameterFind");
  /** Variable representing the BatchTypeParameterGet method */
  public static final BatchTypeParameterRequestMethod BATCH_TYPE_PARAMETER_GET = new BatchTypeParameterRequestMethod("BatchTypeParameterGet");
  /** Variable representing the BatchTypeParameterSequenceGet method */
  public static final BatchTypeParameterRequestMethod BATCH_TYPE_PARAMETER_SEQUENCE_GET = new BatchTypeParameterRequestMethod("BatchTypeParameterSequenceGet");
  /** Variable representing the BatchTypeParameterUpdate method */
  public static final BatchTypeParameterRequestMethod BATCH_TYPE_PARAMETER_UPDATE = new BatchTypeParameterRequestMethod("BatchTypeParameterUpdate");
}
