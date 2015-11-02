/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintActionFindRequest.java
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
 * Class used to create a BsdRelationalConstraintActionFindRequest Udt Request
 *
 */

public class BsdRelationalConstraintActionFindRequest extends BsdRelationalConstraintRequest {
/**
 *
 * Constructor to create a  BsdRelationalConstraintActionFindRequest
 * @param id Unique request name
 * @param business_unit_name String for BsdRelationalConstraintActionFindRequest
 * @param application_name String for BsdRelationalConstraintActionFindRequest
 * @param source_object_name String for BsdRelationalConstraintActionFindRequest
 * @param target_object_name String for BsdRelationalConstraintActionFindRequest
 * @param action_name String for BsdRelationalConstraintActionFindRequest
 * @param effective_date Date for BsdRelationalConstraintActionFindRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String business_unit_name, @JsonProperty("ApplicationName")String application_name, @JsonProperty("SourceObjectName")String source_object_name, @JsonProperty("TargetObjectName")String target_object_name, @JsonProperty("ActionName")String action_name, @JsonProperty("EffectiveDate")Date effective_date) {
    super(id, "BsdRelationalConstraintActionFind");
    if (business_unit_name != null) {
      addInput("BusinessUnitName", business_unit_name);
    }
    if (application_name != null) {
      addInput("ApplicationName", application_name);
    }
    if (source_object_name != null) {
      addInput("SourceObjectName", source_object_name);
    }
    if (target_object_name != null) {
      addInput("TargetObjectName", target_object_name);
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
 * Retrieves the BsdRelationalConstraintObjectDataList that results from the BsdRelationalConstraintActionFindRequest call
 * @return BsdRelationalConstraintObjectDataList resulting from udt call
 *
 */

  public BsdRelationalConstraintObjectDataList getOutput() {
    return BsdRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintList");
  }
}
