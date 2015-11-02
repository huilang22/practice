/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountCreateRequest.java
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
 * Class used to create a RateDiscountCreateRequest Udt Request
 *
 */

public class RateDiscountCreateRequest extends RateDiscountSubRequestParent {
/**
 *
 * Constructor to create a  RateDiscountCreateRequest
 * @param id Unique request name
 * @param rdCrIn RateDiscountObjectData for RateDiscountCreateRequest
 *
 */
@JsonCreator
  public RateDiscountCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateDiscount")RateDiscountObjectData rdCrIn) {
    super(id, "RateDiscountCreate");
    if (rdCrIn != null) {
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(rdCrIn, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }

/**
 *
 * Retrieves the RateDiscountObjectData that results from the RateDiscountCreateRequest call
 * @return RateDiscountObjectData resulting from udt call
 *
 */

  public RateDiscountObjectData getOutput() {
    return RateDiscountObjectHelper.fromMap(outputMap, "RateDiscount");
  }
}
