/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiFindRequest.java
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
 * Class used to create a RateEpiFindRequest Udt Request
 *
 */

public class RateEpiFindRequest extends RateEpiRequest {
/**
 *
 * Constructor to create a  RateEpiFindRequest
 * @param id Unique request name
 * @param REFindIn RateEpiObjectFilter for RateEpiFindRequest
 *
 */
@JsonCreator
  public RateEpiFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateEpi")RateEpiObjectFilter REFindIn) {
    super(id, "RateEpiFind");
    if (REFindIn != null) {
      Integer index =  REFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateEpi", RateEpiObjectHelper.toMap(REFindIn, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }

/**
 *
 * Retrieves the RateEpiObjectDataList that results from the RateEpiFindRequest call
 * @return RateEpiObjectDataList resulting from udt call
 *
 */

  public RateEpiObjectDataList getOutput() {
    return RateEpiObjectHelper.fromMapList(outputMap, "RateEpiList");
  }
}
