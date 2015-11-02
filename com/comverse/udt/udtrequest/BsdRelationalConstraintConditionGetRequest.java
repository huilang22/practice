/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionGetRequest.java
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
 * Class used to create a BsdRelationalConstraintConditionGetRequest Udt Request
 *
 */

public class BsdRelationalConstraintConditionGetRequest extends BsdRelationalConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionGetRequest
 * @param id Unique request name
 * @param bsdRelationalConstraintConditionGetIn BsdRelationalConstraintConditionObjectKeyData for BsdRelationalConstraintConditionGetRequest
 *
 */
@JsonCreator
  public BsdRelationalConstraintConditionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdRelationalConstraintCondition")BsdRelationalConstraintConditionObjectKeyData bsdRelationalConstraintConditionGetIn) {
    super(id, "BsdRelationalConstraintConditionGet");
    if (bsdRelationalConstraintConditionGetIn != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectKeyHelper.toMap(bsdRelationalConstraintConditionGetIn, new HashMap(), "BsdRelationalConstraintConditionObjectKeyData").get("BsdRelationalConstraintConditionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdRelationalConstraintConditionObjectData that results from the BsdRelationalConstraintConditionGetRequest call
 * @return BsdRelationalConstraintConditionObjectData resulting from udt call
 *
 */

  public BsdRelationalConstraintConditionObjectData getOutput() {
    return BsdRelationalConstraintConditionObjectHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
}
