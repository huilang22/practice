/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimePeriodFindRequest.java
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
 * Class used to create a RbrTimePeriodFindRequest Udt Request
 *
 */

public class RbrTimePeriodFindRequest extends RbrTimePeriodRequest {
/**
 *
 * Constructor to create a  RbrTimePeriodFindRequest
 * @param id Unique request name
 * @param RbrTmPrdFndIn RbrTimePeriodObjectFilter for RbrTimePeriodFindRequest
 *
 */
@JsonCreator
  public RbrTimePeriodFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrTimePeriod")RbrTimePeriodObjectFilter RbrTmPrdFndIn) {
    super(id, "RbrTimePeriodFind");
    if (RbrTmPrdFndIn != null) {
      Integer index =  RbrTmPrdFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(RbrTmPrdFndIn, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }

/**
 *
 * Retrieves the RbrTimePeriodObjectDataList that results from the RbrTimePeriodFindRequest call
 * @return RbrTimePeriodObjectDataList resulting from udt call
 *
 */

  public RbrTimePeriodObjectDataList getOutput() {
    return RbrTimePeriodObjectHelper.fromMapList(outputMap, "RbrTimePeriodList");
  }
}
