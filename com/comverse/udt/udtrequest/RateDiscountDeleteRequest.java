/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountDeleteRequest.java
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
 * Class used to create a RateDiscountDeleteRequest Udt Request
 *
 */

public class RateDiscountDeleteRequest extends RateDiscountRequest {
/**
 *
 * Constructor to create a  RateDiscountDeleteRequest
 * @param id Unique request name
 * @param rdDeleteIn RateDiscountObjectKeyData for RateDiscountDeleteRequest
 *
 */
@JsonCreator
  public RateDiscountDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateDiscount")RateDiscountObjectKeyData rdDeleteIn) {
    super(id, "RateDiscountDelete");
    if (rdDeleteIn != null) {
      addInput("RateDiscount", RateDiscountObjectKeyHelper.toMap(rdDeleteIn, new HashMap(), "RateDiscountObjectKeyData").get("RateDiscountObjectKeyData"));
    }
  }

}
