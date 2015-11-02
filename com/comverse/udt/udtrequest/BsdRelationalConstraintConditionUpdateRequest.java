/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionUpdateRequest.java
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
 * Class used to create a BsdRelationalConstraintConditionUpdateRequest Udt Request
 *
 */

public class BsdRelationalConstraintConditionUpdateRequest extends BsdRelationalConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionUpdateRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintConditionUpdateIn BsdRelationalConstraintConditionObjectData for BsdRelationalConstraintConditionUpdateRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintConditionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraintCondition")BsdRelationalConstraintConditionObjectData bsdRelationalConstraintConditionUpdateIn) {
    super(id, "BsdRelationalConstraintConditionUpdate");
    if (bsdRelationalConstraintConditionUpdateIn != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(bsdRelationalConstraintConditionUpdateIn, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintConditionObjectData that results from the BsdRelationalConstraintConditionUpdateRequest call
 * @return BsdRelationalConstraintConditionObjectData resulting from udt call
 *
 */

  public BsdRelationalConstraintConditionObjectData getOutput() {
    return BsdRelationalConstraintConditionObjectHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
}
