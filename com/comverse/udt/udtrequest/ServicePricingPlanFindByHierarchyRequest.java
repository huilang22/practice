/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServicePricingPlanFindByHierarchyRequest.java
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
 * Class used to create a ServicePricingPlanFindByHierarchyRequest Udt Request
 *
 */

public class ServicePricingPlanFindByHierarchyRequest extends ServicePricingPlanRequest {
/**
 *
 * Constructor to create a  ServicePricingPlanFindByHierarchyRequest
 * @param id Unique request name
 * @param hierarchy_id Integer for ServicePricingPlanFindByHierarchyRequest
 * @param _language_code Integer for ServicePricingPlanFindByHierarchyRequest
 *
 */
@JsonCreator
  public ServicePricingPlanFindByHierarchyRequest(@JsonProperty("RequestId") String id, @JsonProperty("HierarchyId")Integer hierarchy_id, @JsonProperty("LanguageCode")Integer _language_code) {
    super(id, "ServicePricingPlanFindByHierarchy");
    if (hierarchy_id != null) {
      addInput("HierarchyId", hierarchy_id);
    }
    if (_language_code != null) {
      addInput("LanguageCode", _language_code);
    }
  }

/**
 *
 * Retrieves the ServicePricingPlanObjectDataList that results from the ServicePricingPlanFindByHierarchyRequest call
 * @return ServicePricingPlanObjectDataList resulting from udt call
 *
 */

  public ServicePricingPlanObjectDataList getOutput() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
}
