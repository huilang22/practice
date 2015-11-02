/*
 * Generated code DO NOT EDIT
 * Generated file: ServicePricingPlanGetNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ServicePricingPlanGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServicePricingPlanGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServicePricingPlanObjectData noOpIn;

/**
 *
 * Constructor to create a   ServicePricingPlanGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServicePricingPlanGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServicePricingPlanObjectData noOpInIn) {
    super(id, context, "ServicePricingPlanGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServicePricingPlan", ServicePricingPlanObjectHelper.toMap(noOpIn, new HashMap(), "ServicePricingPlan").get("ServicePricingPlan"));
    }
  }
/**
 *
 * Sets the  ServicePricingPlan
 * @param noOpInIn ServicePricingPlanObjectData to set
 *
 */
  public void setServicePricingPlan(ServicePricingPlanObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServicePricingPlan passed into the constructor
 * @return Simulated response
 *
 */
  public ServicePricingPlanObjectData getServicePricingPlan() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServicePricingPlanObjectHelper.fromMap(inputMap, "ServicePricingPlan");
  }
}
