/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintActionFindRequest.java
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
 * Class used to create a BsdAttributeConstraintActionFindRequest Udt Request
 *
 */

public class BsdAttributeConstraintActionFindRequest extends BsdAttributeConstraintRequest {
/**
 *
 * Constructor to create a  BsdAttributeConstraintActionFindRequest
 * @param id Unique request name
 * @param business_unit_name String for BsdAttributeConstraintActionFindRequest
 * @param application_name String for BsdAttributeConstraintActionFindRequest
 * @param object_name String for BsdAttributeConstraintActionFindRequest
 * @param action_name String for BsdAttributeConstraintActionFindRequest
 * @param effective_date Date for BsdAttributeConstraintActionFindRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessUnitName")String business_unit_name, @JsonProperty("ApplicationName")String application_name, @JsonProperty("ObjectName")String object_name, @JsonProperty("ActionName")String action_name, @JsonProperty("EffectiveDate")Date effective_date) {
    super(id, "BsdAttributeConstraintActionFind");
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
 * Retrieves the BsdAttributeConstraintObjectDataList that results from the BsdAttributeConstraintActionFindRequest call
 * @return BsdAttributeConstraintObjectDataList resulting from udt call
 *
 */

  public BsdAttributeConstraintObjectDataList getOutput() {
    return BsdAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdAttributeConstraintList");
  }
}
