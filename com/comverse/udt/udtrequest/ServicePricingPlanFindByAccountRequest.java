/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServicePricingPlanFindByAccountRequest.java
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
 * Class used to create a ServicePricingPlanFindByAccountRequest Udt Request
 *
 */

public class ServicePricingPlanFindByAccountRequest extends ServicePricingPlanRequest {
/**
 *
 * Constructor to create a  ServicePricingPlanFindByAccountRequest
 * @param id Unique request name
 * @param account_internal_id Integer for ServicePricingPlanFindByAccountRequest
 * @param language_code Integer for ServicePricingPlanFindByAccountRequest
 *
 */
@JsonCreator
  public ServicePricingPlanFindByAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer account_internal_id, @JsonProperty("LanguageCode")Integer language_code) {
    super(id, "ServicePricingPlanFindByAccount");
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
  }

/**
 *
 * Retrieves the ServicePricingPlanObjectDataList that results from the ServicePricingPlanFindByAccountRequest call
 * @return ServicePricingPlanObjectDataList resulting from udt call
 *
 */

  public ServicePricingPlanObjectDataList getOutput() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
}
