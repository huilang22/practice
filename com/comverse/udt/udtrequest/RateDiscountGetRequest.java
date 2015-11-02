/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountGetRequest.java
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
 * Class used to create a RateDiscountGetRequest Udt Request
 *
 */

public class RateDiscountGetRequest extends RateDiscountSubRequestParent {
/**
 *
 * Constructor to create a  RateDiscountGetRequest
 * @param id Unique request name
 * @param rdGetIn RateDiscountObjectKeyData for RateDiscountGetRequest
 *
 */
@JsonCreator
  public RateDiscountGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateDiscount")RateDiscountObjectKeyData rdGetIn) {
    super(id, "RateDiscountGet");
    if (rdGetIn != null) {
      addInput("RateDiscount", RateDiscountObjectKeyHelper.toMap(rdGetIn, new HashMap(), "RateDiscountObjectKeyData").get("RateDiscountObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RateDiscountObjectData that results from the RateDiscountGetRequest call
 * @return RateDiscountObjectData resulting from udt call
 *
 */

  public RateDiscountObjectData getOutput() {
    return RateDiscountObjectHelper.fromMap(outputMap, "RateDiscount");
  }
}
