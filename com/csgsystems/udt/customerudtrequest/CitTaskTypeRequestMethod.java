/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CitTaskTypeRequestMethod implements UdtMethod {
  private String method = null;
  private CitTaskTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CitTaskTypeCreate method */
  public static final CitTaskTypeRequestMethod CIT_TASK_TYPE_CREATE = new CitTaskTypeRequestMethod("CitTaskTypeCreate");
  /** Variable representing the CitTaskTypeDelete method */
  public static final CitTaskTypeRequestMethod CIT_TASK_TYPE_DELETE = new CitTaskTypeRequestMethod("CitTaskTypeDelete");
  /** Variable representing the CitTaskTypeFind method */
  public static final CitTaskTypeRequestMethod CIT_TASK_TYPE_FIND = new CitTaskTypeRequestMethod("CitTaskTypeFind");
  /** Variable representing the CitTaskTypeGet method */
  public static final CitTaskTypeRequestMethod CIT_TASK_TYPE_GET = new CitTaskTypeRequestMethod("CitTaskTypeGet");
  /** Variable representing the CitTaskTypeSequenceGet method */
  public static final CitTaskTypeRequestMethod CIT_TASK_TYPE_SEQUENCE_GET = new CitTaskTypeRequestMethod("CitTaskTypeSequenceGet");
  /** Variable representing the CitTaskTypeUpdate method */
  public static final CitTaskTypeRequestMethod CIT_TASK_TYPE_UPDATE = new CitTaskTypeRequestMethod("CitTaskTypeUpdate");
}
