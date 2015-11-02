/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskPriorityRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CitTaskPriorityRequestMethod implements UdtMethod {
  private String method = null;
  private CitTaskPriorityRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CitTaskPriorityCreate method */
  public static final CitTaskPriorityRequestMethod CIT_TASK_PRIORITY_CREATE = new CitTaskPriorityRequestMethod("CitTaskPriorityCreate");
  /** Variable representing the CitTaskPriorityDelete method */
  public static final CitTaskPriorityRequestMethod CIT_TASK_PRIORITY_DELETE = new CitTaskPriorityRequestMethod("CitTaskPriorityDelete");
  /** Variable representing the CitTaskPriorityFind method */
  public static final CitTaskPriorityRequestMethod CIT_TASK_PRIORITY_FIND = new CitTaskPriorityRequestMethod("CitTaskPriorityFind");
  /** Variable representing the CitTaskPriorityGet method */
  public static final CitTaskPriorityRequestMethod CIT_TASK_PRIORITY_GET = new CitTaskPriorityRequestMethod("CitTaskPriorityGet");
  /** Variable representing the CitTaskPriorityUpdate method */
  public static final CitTaskPriorityRequestMethod CIT_TASK_PRIORITY_UPDATE = new CitTaskPriorityRequestMethod("CitTaskPriorityUpdate");
}
