/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodFindRequest.java
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
 * Class used to create a RatePeriodFindRequest Udt Request
 *
 */

public class RatePeriodFindRequest extends RatePeriodRequest {
/**
 *
 * Constructor to create a  RatePeriodFindRequest
 * @param id Unique request name
 * @param RPFindIn RPObjectFilter for RatePeriodFindRequest
 *
 */
@JsonCreator
  public RatePeriodFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatePeriod")RPObjectFilter RPFindIn) {
    super(id, "RatePeriodFind");
    if (RPFindIn != null) {
      Integer index =  RPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RatePeriod", RPObjectHelper.toMap(RPFindIn, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }

/**
 *
 * Retrieves the RPObjectDataList that results from the RatePeriodFindRequest call
 * @return RPObjectDataList resulting from udt call
 *
 */

  public RPObjectDataList getOutput() {
    return RPObjectHelper.fromMapList(outputMap, "RatePeriodList");
  }
}
