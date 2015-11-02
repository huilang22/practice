/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateFindRequest.java
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
 * Class used to create a OverrideUsageCreditRateFindRequest Udt Request
 *
 */

public class OverrideUsageCreditRateFindRequest extends OverrideUsageCreditRateRequest {
/**
 *
 * Constructor to create a  OverrideUsageCreditRateFindRequest
 * @param id Unique request name
 * @param iRUCOFindIn RUCOverrideObjectFilter for OverrideUsageCreditRateFindRequest
 *
 */
@JsonCreator
  public OverrideUsageCreditRateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("OverrideUsageCreditRate")RUCOverrideObjectFilter iRUCOFindIn) {
    super(id, "OverrideUsageCreditRateFind");
    if (iRUCOFindIn != null) {
      Integer index =  iRUCOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(iRUCOFindIn, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }

/**
 *
 * Retrieves the RUCOverrideObjectDataList that results from the OverrideUsageCreditRateFindRequest call
 * @return RUCOverrideObjectDataList resulting from udt call
 *
 */

  public RUCOverrideObjectDataList getOutput() {
    return RUCOverrideObjectHelper.fromMapList(outputMap, "OverrideUsageCreditRateList");
  }
}
