/*
 * Generated code DO NOT EDIT
 * Generated file: ServicePricingPlanRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServicePricingPlanRequestMethod implements UdtMethod {
  private String method = null;
  private ServicePricingPlanRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServicePricingPlanFind method */
  public static final ServicePricingPlanRequestMethod SERVICE_PRICING_PLAN_FIND = new ServicePricingPlanRequestMethod("ServicePricingPlanFind");
  /** Variable representing the ServicePricingPlanFindByAccount method */
  public static final ServicePricingPlanRequestMethod SERVICE_PRICING_PLAN_FIND_BY_ACCOUNT = new ServicePricingPlanRequestMethod("ServicePricingPlanFindByAccount");
  /** Variable representing the ServicePricingPlanFindByHierarchy method */
  public static final ServicePricingPlanRequestMethod SERVICE_PRICING_PLAN_FIND_BY_HIERARCHY = new ServicePricingPlanRequestMethod("ServicePricingPlanFindByHierarchy");
  /** Variable representing the ServicePricingPlanGet method */
  public static final ServicePricingPlanRequestMethod SERVICE_PRICING_PLAN_GET = new ServicePricingPlanRequestMethod("ServicePricingPlanGet");
}
