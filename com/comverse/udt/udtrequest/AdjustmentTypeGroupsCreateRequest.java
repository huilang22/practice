/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGroupsCreateRequest.java
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
 * Class used to create a AdjustmentTypeGroupsCreateRequest Udt Request
 *
 */

public class AdjustmentTypeGroupsCreateRequest extends AdjustmentTypeGroupsSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentTypeGroupsCreateRequest
 * @param id Unique request name
 * @param AdjustmentTypeGroupsCreateIn AdjustmentTypeGroupsObjectData for AdjustmentTypeGroupsCreateRequest
 *
 */
@JsonCreator
  public AdjustmentTypeGroupsCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentTypeGroups")AdjustmentTypeGroupsObjectData AdjustmentTypeGroupsCreateIn) {
    super(id, "AdjustmentTypeGroupsCreate");
    if (AdjustmentTypeGroupsCreateIn != null) {
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectHelper.toMap(AdjustmentTypeGroupsCreateIn, new HashMap(), "AdjustmentTypeGroups").get("AdjustmentTypeGroups"));
    }
  }

/**
 *
 * Retrieves the AdjustmentTypeGroupsObjectData that results from the AdjustmentTypeGroupsCreateRequest call
 * @return AdjustmentTypeGroupsObjectData resulting from udt call
 *
 */

  public AdjustmentTypeGroupsObjectData getOutput() {
    return AdjustmentTypeGroupsObjectHelper.fromMap(outputMap, "AdjustmentTypeGroups");
  }
}
