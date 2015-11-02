/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultActionFindRequest.java
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
 * Class used to create a BsdRelationalDefaultActionFindRequest Udt Request
 *
 */

public class BsdRelationalDefaultActionFindRequest extends BsdRelationalDefaultRequest {
/**
 *
 * Constructor to create a  BsdRelationalDefaultActionFindRequest
 * @param id Unique request name
 * @param business_unit_name String for BsdRelationalDefaultActionFindRequest
 * @param application_name String for BsdRelationalDefaultActionFindRequest
 * @param source_object_name String for BsdRelationalDefaultActionFindRequest
 * @param target_object_name String for BsdRelationalDefaultActionFindRequest
 * @param action_name String for BsdRelationalDefaultActionFindRequest
 * @param effective_date Date for BsdRelationalDefaultActionFindRequest
 *
 */
@JsonCreator
  public BsdRelationalDefaultActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String business_unit_name, @JsonProperty("ApplicationName")String application_name, @JsonProperty("SourceObjectName")String source_object_name, @JsonProperty("TargetObjectName")String target_object_name, @JsonProperty("ActionName")String action_name, @JsonProperty("EffectiveDate")Date effective_date) {
    super(id, "BsdRelationalDefaultActionFind");
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
 * Retrieves the BsdRelationalDefaultObjectDataList that results from the BsdRelationalDefaultActionFindRequest call
 * @return BsdRelationalDefaultObjectDataList resulting from udt call
 *
 */

  public BsdRelationalDefaultObjectDataList getOutput() {
    return BsdRelationalDefaultObjectHelper.fromMapList(outputMap, "BsdRelationalDefaultList");
  }
}
