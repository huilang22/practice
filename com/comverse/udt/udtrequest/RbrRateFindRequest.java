/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateFindRequest.java
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
 * Class used to create a RbrRateFindRequest Udt Request
 *
 */

public class RbrRateFindRequest extends RbrRateRequest {
/**
 *
 * Constructor to create a  RbrRateFindRequest
 * @param id Unique request name
 * @param RbrRatesFindIn RbrRatesObjectFilter for RbrRateFindRequest
 *
 */
@JsonCreator
  public RbrRateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrRate")RbrRatesObjectFilter RbrRatesFindIn) {
    super(id, "RbrRateFind");
    if (RbrRatesFindIn != null) {
      Integer index =  RbrRatesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrRate", RbrRatesObjectHelper.toMap(RbrRatesFindIn, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }

/**
 *
 * Retrieves the RbrRatesObjectDataList that results from the RbrRateFindRequest call
 * @return RbrRatesObjectDataList resulting from udt call
 *
 */

  public RbrRatesObjectDataList getOutput() {
    return RbrRatesObjectHelper.fromMapList(outputMap, "RbrRateList");
  }
}
