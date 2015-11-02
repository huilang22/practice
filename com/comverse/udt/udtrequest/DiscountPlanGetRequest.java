/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountPlanGetRequest.java
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
 * Class used to create a DiscountPlanGetRequest Udt Request
 *
 */

public class DiscountPlanGetRequest extends DiscountPlanSubRequestParent {
/**
 *
 * Constructor to create a  DiscountPlanGetRequest
 * @param id Unique request name
 * @param DPGetIn DPObjectKeyData for DiscountPlanGetRequest
 *
 */
@JsonCreator
  public DiscountPlanGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountPlan")DPObjectKeyData DPGetIn) {
    super(id, "DiscountPlanGet");
    if (DPGetIn != null) {
      addInput("DiscountPlan", DPObjectKeyHelper.toMap(DPGetIn, new HashMap(), "DPObjectKeyData").get("DPObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DPObjectData that results from the DiscountPlanGetRequest call
 * @return DPObjectData resulting from udt call
 *
 */

  public DPObjectData getOutput() {
    return DPObjectHelper.fromMap(outputMap, "DiscountPlan");
  }
}
