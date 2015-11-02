/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountFindRequest.java
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
 * Class used to create a RateDiscountFindRequest Udt Request
 *
 */

public class RateDiscountFindRequest extends RateDiscountRequest {
/**
 *
 * Constructor to create a  RateDiscountFindRequest
 * @param id Unique request name
 * @param rdFindIn RateDiscountObjectFilter for RateDiscountFindRequest
 *
 */
@JsonCreator
  public RateDiscountFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateDiscount")RateDiscountObjectFilter rdFindIn) {
    super(id, "RateDiscountFind");
    if (rdFindIn != null) {
      Integer index =  rdFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(rdFindIn, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }

/**
 *
 * Retrieves the RateDiscountObjectDataList that results from the RateDiscountFindRequest call
 * @return RateDiscountObjectDataList resulting from udt call
 *
 */

  public RateDiscountObjectDataList getOutput() {
    return RateDiscountObjectHelper.fromMapList(outputMap, "RateDiscountList");
  }
}
