/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CitTaskRequestMethod implements UdtMethod {
  private String method = null;
  private CitTaskRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CitTaskCreate method */
  public static final CitTaskRequestMethod CIT_TASK_CREATE = new CitTaskRequestMethod("CitTaskCreate");
  /** Variable representing the CitTaskDelete method */
  public static final CitTaskRequestMethod CIT_TASK_DELETE = new CitTaskRequestMethod("CitTaskDelete");
  /** Variable representing the CitTaskFind method */
  public static final CitTaskRequestMethod CIT_TASK_FIND = new CitTaskRequestMethod("CitTaskFind");
  /** Variable representing the CitTaskFindByUser method */
  public static final CitTaskRequestMethod CIT_TASK_FIND_BY_USER = new CitTaskRequestMethod("CitTaskFindByUser");
  /** Variable representing the CitTaskFindForInvalidUser method */
  public static final CitTaskRequestMethod CIT_TASK_FIND_FOR_INVALID_USER = new CitTaskRequestMethod("CitTaskFindForInvalidUser");
  /** Variable representing the CitTaskGet method */
  public static final CitTaskRequestMethod CIT_TASK_GET = new CitTaskRequestMethod("CitTaskGet");
  /** Variable representing the CitTaskSequenceGet method */
  public static final CitTaskRequestMethod CIT_TASK_SEQUENCE_GET = new CitTaskRequestMethod("CitTaskSequenceGet");
  /** Variable representing the CitTaskUpdate method */
  public static final CitTaskRequestMethod CIT_TASK_UPDATE = new CitTaskRequestMethod("CitTaskUpdate");
}
