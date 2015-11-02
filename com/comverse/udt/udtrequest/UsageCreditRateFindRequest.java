/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageCreditRateFindRequest.java
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
 * Class used to create a UsageCreditRateFindRequest Udt Request
 *
 */

public class UsageCreditRateFindRequest extends UsageCreditRateRequest {
/**
 *
 * Constructor to create a  UsageCreditRateFindRequest
 * @param id Unique request name
 * @param RUCFindIn RUCreditObjectFilter for UsageCreditRateFindRequest
 *
 */
@JsonCreator
  public UsageCreditRateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageCreditRate")RUCreditObjectFilter RUCFindIn) {
    super(id, "UsageCreditRateFind");
    if (RUCFindIn != null) {
      Integer index =  RUCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageCreditRate", RUCreditObjectHelper.toMap(RUCFindIn, new HashMap(), "UsageCreditRate").get("UsageCreditRate"));
    }
  }

/**
 *
 * Retrieves the RUCreditObjectDataList that results from the UsageCreditRateFindRequest call
 * @return RUCreditObjectDataList resulting from udt call
 *
 */

  public RUCreditObjectDataList getOutput() {
    return RUCreditObjectHelper.fromMapList(outputMap, "UsageCreditRateList");
  }
}
