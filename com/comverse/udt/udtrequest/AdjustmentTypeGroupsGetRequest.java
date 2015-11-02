/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGroupsGetRequest.java
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
 * Class used to create a AdjustmentTypeGroupsGetRequest Udt Request
 *
 */

public class AdjustmentTypeGroupsGetRequest extends AdjustmentTypeGroupsSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentTypeGroupsGetRequest
 * @param id Unique request name
 * @param AdjustmentTypeGroupsGetIn AdjustmentTypeGroupsObjectKeyData for AdjustmentTypeGroupsGetRequest
 *
 */
@JsonCreator
  public AdjustmentTypeGroupsGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentTypeGroups")AdjustmentTypeGroupsObjectKeyData AdjustmentTypeGroupsGetIn) {
    super(id, "AdjustmentTypeGroupsGet");
    if (AdjustmentTypeGroupsGetIn != null) {
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectKeyHelper.toMap(AdjustmentTypeGroupsGetIn, new HashMap(), "AdjustmentTypeGroupsObjectKeyData").get("AdjustmentTypeGroupsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AdjustmentTypeGroupsObjectData that results from the AdjustmentTypeGroupsGetRequest call
 * @return AdjustmentTypeGroupsObjectData resulting from udt call
 *
 */

  public AdjustmentTypeGroupsObjectData getOutput() {
    return AdjustmentTypeGroupsObjectHelper.fromMap(outputMap, "AdjustmentTypeGroups");
  }
}
