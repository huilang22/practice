/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderWorkflowMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceOrderWorkflowMapRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceOrderWorkflowMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceOrderWorkflowMapFind method */
  public static final ServiceOrderWorkflowMapRequestMethod SERVICE_ORDER_WORKFLOW_MAP_FIND = new ServiceOrderWorkflowMapRequestMethod("ServiceOrderWorkflowMapFind");
  /** Variable representing the ServiceOrderWorkflowMapGet method */
  public static final ServiceOrderWorkflowMapRequestMethod SERVICE_ORDER_WORKFLOW_MAP_GET = new ServiceOrderWorkflowMapRequestMethod("ServiceOrderWorkflowMapGet");
}
