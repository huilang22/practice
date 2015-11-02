/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServicePricingPlanGetBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a ServicePricingPlanGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServicePricingPlanGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServicePricingPlanObjectKeyData ServicePricingPlanGetIn;
/**
 *
 * Constructor to create a  ServicePricingPlanGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServicePricingPlanGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServicePricingPlanObjectKeyData ServicePricingPlanGetInIn) {
    super(id, context, "ServicePricingPlanGet");
    ServicePricingPlanGetIn = ServicePricingPlanGetInIn;
  }

  public void translateToMap() {
    if (ServicePricingPlanGetIn != null) {
      ServicePricingPlanGetIn.resetFlags(true, true);
      addInput("ServicePricingPlan", ServicePricingPlanObjectKeyHelper.toMap(ServicePricingPlanGetIn, new HashMap(), "ServicePricingPlanObjectKeyData").get("ServicePricingPlanObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServicePricingPlan
 * @param ServicePricingPlanGetInIn Value of the ServicePricingPlanGetIn
 *
 */

  public void setServicePricingPlan(ServicePricingPlanObjectKeyData ServicePricingPlanGetInIn) {
    ServicePricingPlanGetIn = ServicePricingPlanGetInIn;
  }

  public void translateFromMap() {
    ServicePricingPlanGetIn = ServicePricingPlanObjectKeyHelper.fromMap(inputMap, "ServicePricingPlan");
  }

/**
 *
 * Gets the ServicePricingPlan
 * @return Value of the ServicePricingPlan
 *
 */

  public ServicePricingPlanObjectKeyData getServicePricingPlan( ) {
    return ServicePricingPlanGetIn;
  }

}
