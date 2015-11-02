/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionGetRequest.java
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
 * Class used to create a BsdAttributeConstraintConditionGetRequest Udt Request
 *
 */

public class BsdAttributeConstraintConditionGetRequest extends BsdAttributeConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionGetRequest
 * @param id Unique request name
 * @param bsdAttributeConstraintConditionGetIn BsdAttributeConstraintConditionObjectKeyData for BsdAttributeConstraintConditionGetRequest
 *
 */
@JsonCreator
  public BsdAttributeConstraintConditionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BsdAttributeConstraintCondition")BsdAttributeConstraintConditionObjectKeyData bsdAttributeConstraintConditionGetIn) {
    super(id, "BsdAttributeConstraintConditionGet");
    if (bsdAttributeConstraintConditionGetIn != null) {
      addInput("BsdAttributeConstraintCondition", BsdAttributeConstraintConditionObjectKeyHelper.toMap(bsdAttributeConstraintConditionGetIn, new HashMap(), "BsdAttributeConstraintConditionObjectKeyData").get("BsdAttributeConstraintConditionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BsdAttributeConstraintConditionObjectData that results from the BsdAttributeConstraintConditionGetRequest call
 * @return BsdAttributeConstraintConditionObjectData resulting from udt call
 *
 */

  public BsdAttributeConstraintConditionObjectData getOutput() {
    return BsdAttributeConstraintConditionObjectHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
}
