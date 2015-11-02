/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServicePricingPlanFindRequest.java
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
 * Class used to create a ServicePricingPlanFindRequest Udt Request
 *
 */

public class ServicePricingPlanFindRequest extends ServicePricingPlanRequest {
/**
 *
 * Constructor to create a  ServicePricingPlanFindRequest
 * @param id Unique request name
 * @param ServicePricingPlanFindIn ServicePricingPlanObjectFilter for ServicePricingPlanFindRequest
 *
 */
@JsonCreator
  public ServicePricingPlanFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServicePricingPlan")ServicePricingPlanObjectFilter ServicePricingPlanFindIn) {
    super(id, "ServicePricingPlanFind");
    if (ServicePricingPlanFindIn != null) {
      Integer index =  ServicePricingPlanFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServicePricingPlan", ServicePricingPlanObjectHelper.toMap(ServicePricingPlanFindIn, new HashMap(), "ServicePricingPlan").get("ServicePricingPlan"));
    }
  }

/**
 *
 * Retrieves the ServicePricingPlanObjectDataList that results from the ServicePricingPlanFindRequest call
 * @return ServicePricingPlanObjectDataList resulting from udt call
 *
 */

  public ServicePricingPlanObjectDataList getOutput() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
}
