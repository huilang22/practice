/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionFindByPlanRequest.java
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
 * Class used to create a UnitCrDefinitionFindByPlanRequest Udt Request
 *
 */

public class UnitCrDefinitionFindByPlanRequest extends UnitCrDefinitionRequest {
/**
 *
 * Constructor to create a  UnitCrDefinitionFindByPlanRequest
 * @param id Unique request name
 * @param PlanIdCredit Integer for UnitCrDefinitionFindByPlanRequest
 * @param LanguageCode Integer for UnitCrDefinitionFindByPlanRequest
 *
 */
@JsonCreator
  public UnitCrDefinitionFindByPlanRequest(@JsonProperty("RequestId") String id, @JsonProperty("PlanIdCredit")Integer PlanIdCredit, @JsonProperty("LanguageCode")Integer LanguageCode) {
    super(id, "UnitCrDefinitionFindByPlan");
    if (PlanIdCredit != null) {
      addInput("PlanIdCredit", PlanIdCredit);
    }
    if (LanguageCode != null) {
      addInput("LanguageCode", LanguageCode);
    }
  }

/**
 *
 * Retrieves the UnitCrDefinitionObjectDataList that results from the UnitCrDefinitionFindByPlanRequest call
 * @return UnitCrDefinitionObjectDataList resulting from udt call
 *
 */

  public UnitCrDefinitionObjectDataList getOutput() {
    return UnitCrDefinitionObjectHelper.fromMapList(outputMap, "UnitCrDefinitionList");
  }
}
