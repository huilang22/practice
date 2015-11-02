/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageBandFindRequest.java
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
 * Class used to create a RateCorridorUsageBandFindRequest Udt Request
 *
 */

public class RateCorridorUsageBandFindRequest extends RateCorridorUsageBandRequest {
/**
 *
 * Constructor to create a  RateCorridorUsageBandFindRequest
 * @param id Unique request name
 * @param RUBOFindIn RUBOverrideObjectFilter for RateCorridorUsageBandFindRequest
 *
 */
@JsonCreator
  public RateCorridorUsageBandFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateCorridorUsageBand")RUBOverrideObjectFilter RUBOFindIn) {
    super(id, "RateCorridorUsageBandFind");
    if (RUBOFindIn != null) {
      Integer index =  RUBOFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateCorridorUsageBand", RUBOverrideObjectHelper.toMap(RUBOFindIn, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }

/**
 *
 * Retrieves the RUBOverrideObjectDataList that results from the RateCorridorUsageBandFindRequest call
 * @return RUBOverrideObjectDataList resulting from udt call
 *
 */

  public RUBOverrideObjectDataList getOutput() {
    return RUBOverrideObjectHelper.fromMapList(outputMap, "RateCorridorUsageBandList");
  }
}
