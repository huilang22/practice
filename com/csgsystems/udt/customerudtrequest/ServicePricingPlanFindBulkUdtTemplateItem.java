/*
 * Generated code DO NOT EDIT
 * Generated file: ServicePricingPlanFindBulkUdtTemplateItem.java
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
 * Class used to create a ServicePricingPlanFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServicePricingPlanFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServicePricingPlanObjectFilter ServicePricingPlanFindIn;
/**
 *
 * Constructor to create a  ServicePricingPlanFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServicePricingPlanFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServicePricingPlanObjectFilter ServicePricingPlanFindInIn) {
    super(id, context, "ServicePricingPlanFind");
    ServicePricingPlanFindIn = ServicePricingPlanFindInIn;
  }

  public void translateToMap() {
    if (ServicePricingPlanFindIn != null) {
      Integer index =  ServicePricingPlanFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServicePricingPlan", ServicePricingPlanObjectHelper.toMap(ServicePricingPlanFindIn, new HashMap(), "ServicePricingPlan").get("ServicePricingPlan"));
    }
  }


/**
 *
 * Sets the ServicePricingPlan
 * @param ServicePricingPlanFindInIn Value of the ServicePricingPlanFindIn
 *
 */

  public void setServicePricingPlan(ServicePricingPlanObjectFilter ServicePricingPlanFindInIn) {
    ServicePricingPlanFindIn = ServicePricingPlanFindInIn;
  }

  public void translateFromMap() {
    ServicePricingPlanFindIn = ServicePricingPlanObjectHelper.fromMapFilter(inputMap, "ServicePricingPlan");
  }

/**
 *
 * Gets the ServicePricingPlan
 * @return Value of the ServicePricingPlan
 *
 */

  public ServicePricingPlanObjectFilter getServicePricingPlan( ) {
    return ServicePricingPlanFindIn;
  }

}
