/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionCreateRequest.java
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
 * Class used to create a BsdRelationalConstraintConditionCreateRequest Udt Request
 *
 */

public class BsdRelationalConstraintConditionCreateRequest extends BsdRelationalConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionCreateRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintConditionCreateIn BsdRelationalConstraintConditionObjectData for BsdRelationalConstraintConditionCreateRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintConditionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraintCondition")BsdRelationalConstraintConditionObjectData bsdRelationalConstraintConditionCreateIn) {
    super(id, "BsdRelationalConstraintConditionCreate");
    if (bsdRelationalConstraintConditionCreateIn != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(bsdRelationalConstraintConditionCreateIn, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintConditionObjectData that results from the BsdRelationalConstraintConditionCreateRequest call
 * @return BsdRelationalConstraintConditionObjectData resulting from udt call
 *
 */

  public BsdRelationalConstraintConditionObjectData getOutput() {
    return BsdRelationalConstraintConditionObjectHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
}
