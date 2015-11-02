/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionDeleteRequest.java
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
 * Class used to create a BsdAttributeConstraintConditionDeleteRequest Udt Request
 *
 */

public class BsdAttributeConstraintConditionDeleteRequest extends BsdAttributeConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionDeleteRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintConditionDeleteIn BsdAttributeConstraintConditionObjectKeyData for BsdAttributeConstraintConditionDeleteRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintConditionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraintCondition")BsdAttributeConstraintConditionObjectKeyData bsdAttributeConstraintConditionDeleteIn) {
    super(id, "BsdAttributeConstraintConditionDelete");
    if (bsdAttributeConstraintConditionDeleteIn != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectKeyHelper.toMap(bsdAttributeConstraintConditionDeleteIn, new HashMap(), "BsdAttributeConstraintConditionObjectKeyData").get("BsdAttributeConstraintConditionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintConditionObjectData that results from the BsdAttributeConstraintConditionDeleteRequest call
 * @return BsdAttributeConstraintConditionObjectData resulting from udt call
 *
 */

  public BsdAttributeConstraintConditionObjectData getOutput() {
    return BsdAttributeConstraintConditionObjectHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
}
