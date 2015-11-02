/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrCreateRequest.java
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
 * Class used to create a RateUnitCrCreateRequest Udt Request
 *
 */

public class RateUnitCrCreateRequest extends RateUnitCrSubRequestParent {
/**
 *
 * Constructor to create a  RateUnitCrCreateRequest
 * @param id Unique request name
 * @param rucCrIn RateUnitCrObjectData for RateUnitCrCreateRequest
 *
 */
@JsonCreator
  public RateUnitCrCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateUnitCr")RateUnitCrObjectData rucCrIn) {
    super(id, "RateUnitCrCreate");
    if (rucCrIn != null) {
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(rucCrIn, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }

/**
 *
 * Retrieves the RateUnitCrObjectData that results from the RateUnitCrCreateRequest call
 * @return RateUnitCrObjectData resulting from udt call
 *
 */

  public RateUnitCrObjectData getOutput() {
    return RateUnitCrObjectHelper.fromMap(outputMap, "RateUnitCr");
  }
}
