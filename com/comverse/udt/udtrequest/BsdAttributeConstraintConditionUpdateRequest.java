/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionUpdateRequest.java
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
 * Class used to create a BsdAttributeConstraintConditionUpdateRequest Udt Request
 *
 */

public class BsdAttributeConstraintConditionUpdateRequest extends BsdAttributeConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionUpdateRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintConditionUpdateIn BsdAttributeConstraintConditionObjectData for BsdAttributeConstraintConditionUpdateRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintConditionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraintCondition")BsdAttributeConstraintConditionObjectData bsdAttributeConstraintConditionUpdateIn) {
    super(id, "BsdAttributeConstraintConditionUpdate");
    if (bsdAttributeConstraintConditionUpdateIn != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(bsdAttributeConstraintConditionUpdateIn, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintConditionObjectData that results from the BsdAttributeConstraintConditionUpdateRequest call
 * @return BsdAttributeConstraintConditionObjectData resulting from udt call
 *
 */

  public BsdAttributeConstraintConditionObjectData getOutput() {
    return BsdAttributeConstraintConditionObjectHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
}
