/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGroupsDeleteRequest.java
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
 * Class used to create a AdjustmentTypeGroupsDeleteRequest Udt Request
 *
 */

public class AdjustmentTypeGroupsDeleteRequest extends AdjustmentTypeGroupsSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentTypeGroupsDeleteRequest
 * @param id Unique request name
 * @param AdjustmentTypeGroupsDeleteIn AdjustmentTypeGroupsObjectKeyData for AdjustmentTypeGroupsDeleteRequest
 *
 */
@JsonCreator
  public AdjustmentTypeGroupsDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentTypeGroups")AdjustmentTypeGroupsObjectKeyData AdjustmentTypeGroupsDeleteIn) {
    super(id, "AdjustmentTypeGroupsDelete");
    if (AdjustmentTypeGroupsDeleteIn != null) {
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectKeyHelper.toMap(AdjustmentTypeGroupsDeleteIn, new HashMap(), "AdjustmentTypeGroupsObjectKeyData").get("AdjustmentTypeGroupsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AdjustmentTypeGroupsObjectData that results from the AdjustmentTypeGroupsDeleteRequest call
 * @return AdjustmentTypeGroupsObjectData resulting from udt call
 *
 */

  public AdjustmentTypeGroupsObjectData getOutput() {
    return AdjustmentTypeGroupsObjectHelper.fromMap(outputMap, "AdjustmentTypeGroups");
  }
}
