/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageDistanceBandCreateRequest.java
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
 * Class used to create a UsageDistanceBandCreateRequest Udt Request
 *
 */

public class UsageDistanceBandCreateRequest extends UsageDistanceBandSubRequestParent {
/**
 *
 * Constructor to create a  UsageDistanceBandCreateRequest
 * @param id Unique request name
 * @param UDBCreateIn UsageDistBandObjectData for UsageDistanceBandCreateRequest
 *
 */
@JsonCreator
  public UsageDistanceBandCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageDistanceBand")UsageDistBandObjectData UDBCreateIn) {
    super(id, "UsageDistanceBandCreate");
    if (UDBCreateIn != null) {
      addInput("UsageDistanceBand", UsageDistBandObjectHelper.toMap(UDBCreateIn, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }

/**
 *
 * Retrieves the UsageDistBandObjectData that results from the UsageDistanceBandCreateRequest call
 * @return UsageDistBandObjectData resulting from udt call
 *
 */

  public UsageDistBandObjectData getOutput() {
    return UsageDistBandObjectHelper.fromMap(outputMap, "UsageDistanceBand");
  }
}
