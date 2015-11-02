/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionCreateRequest.java
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
 * Class used to create a BsdAttributeConstraintConditionCreateRequest Udt Request
 *
 */

public class BsdAttributeConstraintConditionCreateRequest extends BsdAttributeConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionCreateRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintConditionCreateIn BsdAttributeConstraintConditionObjectData for BsdAttributeConstraintConditionCreateRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintConditionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraintCondition")BsdAttributeConstraintConditionObjectData bsdAttributeConstraintConditionCreateIn) {
    super(id, "BsdAttributeConstraintConditionCreate");
    if (bsdAttributeConstraintConditionCreateIn != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectHelper.toMap(bsdAttributeConstraintConditionCreateIn, new HashMap(), "BsdAttributeConstraintCondition").get("BsdAttributeConstraintCondition"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintConditionObjectData that results from the BsdAttributeConstraintConditionCreateRequest call
 * @return BsdAttributeConstraintConditionObjectData resulting from udt call
 *
 */

  public BsdAttributeConstraintConditionObjectData getOutput() {
    return BsdAttributeConstraintConditionObjectHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
}
