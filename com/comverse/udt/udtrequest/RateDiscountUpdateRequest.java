/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountUpdateRequest.java
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
 * Class used to create a RateDiscountUpdateRequest Udt Request
 *
 */

public class RateDiscountUpdateRequest extends RateDiscountSubRequestParent {
/**
 *
 * Constructor to create a  RateDiscountUpdateRequest
 * @param id Unique request name
 * @param rdUpdateIn RateDiscountObjectData for RateDiscountUpdateRequest
 * @param rdUpdateFilter RateDiscountObjectFilter for RateDiscountUpdateRequest
 * @param rdUpdateGet RateDiscountObjectData for RateDiscountUpdateRequest
 *
 */
@JsonCreator
  public RateDiscountUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateDiscount")RateDiscountObjectData rdUpdateIn, @JsonProperty("RdUpdateFilter")RateDiscountObjectFilter rdUpdateFilter, @JsonProperty("RdUpdateGet")RateDiscountObjectData rdUpdateGet) {
    super(id, "RateDiscountUpdate");
    if (rdUpdateIn != null) {
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(rdUpdateIn, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
    if (rdUpdateFilter != null) {
      Integer index =  rdUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RdUpdateFilter", RateDiscountObjectHelper.toMap(rdUpdateFilter, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
    if (rdUpdateGet != null) {
      addInput("RdUpdateGet", RateDiscountObjectHelper.toMap(rdUpdateGet, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }

/**
 *
 * Retrieves the RateDiscountObjectData that results from the RateDiscountUpdateRequest call
 * @return RateDiscountObjectData resulting from udt call
 *
 */

  public RateDiscountObjectData getOutput() {
    return RateDiscountObjectHelper.fromMap(outputMap, "RateDiscount");
  }
}
