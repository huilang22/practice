/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionActionFindRequest.java
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

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdAttributeConstraintConditionActionFindRequest Udt Request
 *
 */

public class BsdAttributeConstraintConditionActionFindRequest extends BsdAttributeConstraintConditionRequest {
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionActionFindRequest
 * @param id Unique request name
 * @param business_unit_name String for BsdAttributeConstraintConditionActionFindRequest
 * @param application_name String for BsdAttributeConstraintConditionActionFindRequest
 * @param object_name String for BsdAttributeConstraintConditionActionFindRequest
 * @param action_name String for BsdAttributeConstraintConditionActionFindRequest
 * @param effective_date Date for BsdAttributeConstraintConditionActionFindRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintConditionActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String business_unit_name, @JsonProperty("ApplicationName")String application_name, @JsonProperty("ObjectName")String object_name, @JsonProperty("ActionName")String action_name, @JsonProperty("EffectiveDate")Date effective_date) {
    super(id, "BsdAttributeConstraintConditionActionFind");
    if (business_unit_name != null) {
      addInput("BusinessUnitName", business_unit_name);
    }
    if (application_name != null) {
      addInput("ApplicationName", application_name);
    }
    if (object_name != null) {
      addInput("ObjectName", object_name);
    }
    if (action_name != null) {
      addInput("ActionName", action_name);
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintConditionDescObjectDataList that results from the BsdAttributeConstraintConditionActionFindRequest call
 * @return BsdAttributeConstraintConditionDescObjectDataList resulting from udt call
 *
 */

  public BsdAttributeConstraintConditionDescObjectDataList getOutput() {
    return BsdAttributeConstraintConditionDescObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintConditionList");
  }
}
