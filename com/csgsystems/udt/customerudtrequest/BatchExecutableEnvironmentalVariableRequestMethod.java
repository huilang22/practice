/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableEnvironmentalVariableRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BatchExecutableEnvironmentalVariableRequestMethod implements UdtMethod {
  private String method = null;
  private BatchExecutableEnvironmentalVariableRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BatchExecutableEnvironmentalVariableCreate method */
  public static final BatchExecutableEnvironmentalVariableRequestMethod BATCH_EXECUTABLE_ENVIRONMENTAL_VARIABLE_CREATE = new BatchExecutableEnvironmentalVariableRequestMethod("BatchExecutableEnvironmentalVariableCreate");
  /** Variable representing the BatchExecutableEnvironmentalVariableDelete method */
  public static final BatchExecutableEnvironmentalVariableRequestMethod BATCH_EXECUTABLE_ENVIRONMENTAL_VARIABLE_DELETE = new BatchExecutableEnvironmentalVariableRequestMethod("BatchExecutableEnvironmentalVariableDelete");
  /** Variable representing the BatchExecutableEnvironmentalVariableFind method */
  public static final BatchExecutableEnvironmentalVariableRequestMethod BATCH_EXECUTABLE_ENVIRONMENTAL_VARIABLE_FIND = new BatchExecutableEnvironmentalVariableRequestMethod("BatchExecutableEnvironmentalVariableFind");
  /** Variable representing the BatchExecutableEnvironmentalVariableGet method */
  public static final BatchExecutableEnvironmentalVariableRequestMethod BATCH_EXECUTABLE_ENVIRONMENTAL_VARIABLE_GET = new BatchExecutableEnvironmentalVariableRequestMethod("BatchExecutableEnvironmentalVariableGet");
  /** Variable representing the BatchExecutableEnvironmentalVariableUpdate method */
  public static final BatchExecutableEnvironmentalVariableRequestMethod BATCH_EXECUTABLE_ENVIRONMENTAL_VARIABLE_UPDATE = new BatchExecutableEnvironmentalVariableRequestMethod("BatchExecutableEnvironmentalVariableUpdate");
}
