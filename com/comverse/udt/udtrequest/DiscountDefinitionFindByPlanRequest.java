/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionFindByPlanRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DiscountDefinitionFindByPlanRequest Udt Request
 *
 */

public class DiscountDefinitionFindByPlanRequest extends DiscountDefinitionRequest {
/**
 *
 * Constructor to create a  DiscountDefinitionFindByPlanRequest
 * @param id Unique request name
 * @param PlanIdDiscount Integer for DiscountDefinitionFindByPlanRequest
 * @param LanguageCode Integer for DiscountDefinitionFindByPlanRequest
 *
 */
@JsonCreator
  public DiscountDefinitionFindByPlanRequest(@JsonProperty("RequestId") String id, @JsonProperty("PlanIdDiscount")Integer PlanIdDiscount, @JsonProperty("LanguageCode")Integer LanguageCode) {
    super(id, "DiscountDefinitionFindByPlan");
    if (PlanIdDiscount != null) {
      addInput("PlanIdDiscount", PlanIdDiscount);
    }
    if (LanguageCode != null) {
      addInput("LanguageCode", LanguageCode);
    }
  }

/**
 *
 * Retrieves the DiscountDefinitionObjectDataList that results from the DiscountDefinitionFindByPlanRequest call
 * @return DiscountDefinitionObjectDataList resulting from udt call
 *
 */

  public DiscountDefinitionObjectDataList getOutput() {
    return DiscountDefinitionObjectHelper.fromMapList(outputMap, "DiscountDefinitionList");
  }
}
