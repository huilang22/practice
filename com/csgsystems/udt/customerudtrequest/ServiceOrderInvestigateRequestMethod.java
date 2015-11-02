/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderInvestigateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceOrderInvestigateRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceOrderInvestigateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceOrderInvestigateErrorConditionFind method */
  public static final ServiceOrderInvestigateRequestMethod SERVICE_ORDER_INVESTIGATE_ERROR_CONDITION_FIND = new ServiceOrderInvestigateRequestMethod("ServiceOrderInvestigateErrorConditionFind");
  /** Variable representing the ServiceOrderInvestigateExceptionFind method */
  public static final ServiceOrderInvestigateRequestMethod SERVICE_ORDER_INVESTIGATE_EXCEPTION_FIND = new ServiceOrderInvestigateRequestMethod("ServiceOrderInvestigateExceptionFind");
  /** Variable representing the ServiceOrderInvestigateSfqExceptionFind method */
  public static final ServiceOrderInvestigateRequestMethod SERVICE_ORDER_INVESTIGATE_SFQ_EXCEPTION_FIND = new ServiceOrderInvestigateRequestMethod("ServiceOrderInvestigateSfqExceptionFind");
  /** Variable representing the ServiceOrderInvestigateWorkflowExceptionFind method */
  public static final ServiceOrderInvestigateRequestMethod SERVICE_ORDER_INVESTIGATE_WORKFLOW_EXCEPTION_FIND = new ServiceOrderInvestigateRequestMethod("ServiceOrderInvestigateWorkflowExceptionFind");
}
