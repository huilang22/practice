/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyFindRequest.java
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
 * Class used to create a RateCurrencyFindRequest Udt Request
 *
 */

public class RateCurrencyFindRequest extends RateCurrencyRequest {
/**
 *
 * Constructor to create a  RateCurrencyFindRequest
 * @param id Unique request name
 * @param RCFindIn RCObjectFilter for RateCurrencyFindRequest
 *
 */
@JsonCreator
  public RateCurrencyFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCurrency")RCObjectFilter RCFindIn) {
    super(id, "RateCurrencyFind");
    if (RCFindIn != null) {
      Integer index =  RCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateCurrency", RCObjectHelper.toMap(RCFindIn, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }

/**
 *
 * Retrieves the RCObjectDataList that results from the RateCurrencyFindRequest call
 * @return RCObjectDataList resulting from udt call
 *
 */

  public RCObjectDataList getOutput() {
    return RCObjectHelper.fromMapList(outputMap, "RateCurrencyList");
  }
}
