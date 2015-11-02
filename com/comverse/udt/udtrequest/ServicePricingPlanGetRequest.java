/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServicePricingPlanGetRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServicePricingPlanGetRequest Udt Request
 *
 */

public class ServicePricingPlanGetRequest extends ServicePricingPlanSubRequestParent {
/**
 *
 * Constructor to create a  ServicePricingPlanGetRequest
 * @param id Unique request name
 * @param ServicePricingPlanGetIn ServicePricingPlanObjectKeyData for ServicePricingPlanGetRequest
 *
 */
@JsonCreator
  public ServicePricingPlanGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServicePricingPlan")ServicePricingPlanObjectKeyData ServicePricingPlanGetIn) {
    super(id, "ServicePricingPlanGet");
    if (ServicePricingPlanGetIn != null) {
      addInput("ServicePricingPlan", ServicePricingPlanObjectKeyHelper.toMap(ServicePricingPlanGetIn, new HashMap(), "ServicePricingPlanObjectKeyData").get("ServicePricingPlanObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ServicePricingPlanObjectData that results from the ServicePricingPlanGetRequest call
 * @return ServicePricingPlanObjectData resulting from udt call
 *
 */

  public ServicePricingPlanObjectData getOutput() {
    return ServicePricingPlanObjectHelper.fromMap(outputMap, "ServicePricingPlan");
  }
}
