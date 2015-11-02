/*
 * Generated code DO NOT EDIT
 * Generated file: LogicalServiceOrderRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class LogicalServiceOrderRequestMethod implements UdtMethod {
  private String method = null;
  private LogicalServiceOrderRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the LogicalServiceOrderDependencyCheck method */
  public static final LogicalServiceOrderRequestMethod LOGICAL_SERVICE_ORDER_DEPENDENCY_CHECK = new LogicalServiceOrderRequestMethod("LogicalServiceOrderDependencyCheck");
  /** Variable representing the LogicalServiceOrderFind method */
  public static final LogicalServiceOrderRequestMethod LOGICAL_SERVICE_ORDER_FIND = new LogicalServiceOrderRequestMethod("LogicalServiceOrderFind");
  /** Variable representing the LogicalServiceOrderFindCount method */
  public static final LogicalServiceOrderRequestMethod LOGICAL_SERVICE_ORDER_FIND_COUNT = new LogicalServiceOrderRequestMethod("LogicalServiceOrderFindCount");
  /** Variable representing the LogicalServiceOrderGet method */
  public static final LogicalServiceOrderRequestMethod LOGICAL_SERVICE_ORDER_GET = new LogicalServiceOrderRequestMethod("LogicalServiceOrderGet");
  /** Variable representing the LogicalServiceOrderPreProcess method */
  public static final LogicalServiceOrderRequestMethod LOGICAL_SERVICE_ORDER_PRE_PROCESS = new LogicalServiceOrderRequestMethod("LogicalServiceOrderPreProcess");
}
