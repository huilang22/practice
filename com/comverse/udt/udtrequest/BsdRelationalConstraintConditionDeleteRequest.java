/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionDeleteRequest.java
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
 * Class used to create a BsdRelationalConstraintConditionDeleteRequest Udt Request
 *
 */

public class BsdRelationalConstraintConditionDeleteRequest extends BsdRelationalConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionDeleteRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintConditionDeleteIn BsdRelationalConstraintConditionObjectKeyData for BsdRelationalConstraintConditionDeleteRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintConditionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraintCondition")BsdRelationalConstraintConditionObjectKeyData bsdRelationalConstraintConditionDeleteIn) {
    super(id, "BsdRelationalConstraintConditionDelete");
    if (bsdRelationalConstraintConditionDeleteIn != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectKeyHelper.toMap(bsdRelationalConstraintConditionDeleteIn, new HashMap(), "BsdRelationalConstraintConditionObjectKeyData").get("BsdRelationalConstraintConditionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintConditionObjectData that results from the BsdRelationalConstraintConditionDeleteRequest call
 * @return BsdRelationalConstraintConditionObjectData resulting from udt call
 *
 */

  public BsdRelationalConstraintConditionObjectData getOutput() {
    return BsdRelationalConstraintConditionObjectHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
}
