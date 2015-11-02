/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefinancePlanGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a RefinancePlanGetRequest Udt Request
 *
 */

public class RefinancePlanGetRequest extends RefinancePlanSubRequestParent {
/**
 *
 * Constructor to create a  RefinancePlanGetRequest
 * @param id Unique request name
 * @param RefinancePlanGetIn RefinancePlanObjectKeyData for RefinancePlanGetRequest
 *
 */
@JsonCreator
  public RefinancePlanGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RefinancePlan")RefinancePlanObjectKeyData RefinancePlanGetIn) {
    super(id, "RefinancePlanGet");
    if (RefinancePlanGetIn != null) {
      addInput("RefinancePlan", RefinancePlanObjectKeyHelper.toMap(RefinancePlanGetIn, new HashMap(), "RefinancePlanObjectKeyData").get("RefinancePlanObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RefinancePlanObjectData that results from the RefinancePlanGetRequest call
 * @return RefinancePlanObjectData resulting from udt call
 *
 */

  public RefinancePlanObjectData getOutput() {
    return RefinancePlanObjectHelper.fromMap(outputMap, "RefinancePlan");
  }
}
