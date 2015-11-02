/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServicePricingPlanGetNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ServicePricingPlanGetNoOpRequest Udt Request/Response
 *
 */
public class ServicePricingPlanGetNoOpRequest extends ServicePricingPlanSubRequestParent {
/**
 *
 * Constructor to create a   ServicePricingPlanGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServicePricingPlanGetNoOpRequest(String id, ServicePricingPlanObjectData noOpIn) {
    super(id, "ServicePricingPlanGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ServicePricingPlan", ServicePricingPlanObjectHelper.toMap(noOpIn, new HashMap(), "ServicePricingPlan").get("ServicePricingPlan"));
    }
  }
/**
 *
 * Retrieves the ServicePricingPlanObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ServicePricingPlanObjectData getOutput() {
    return ServicePricingPlanObjectHelper.fromMap(outputMap, "ServicePricingPlan");
  }
}
