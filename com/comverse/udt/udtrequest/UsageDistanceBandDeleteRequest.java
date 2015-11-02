/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageDistanceBandDeleteRequest.java
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
 * Class used to create a UsageDistanceBandDeleteRequest Udt Request
 *
 */

public class UsageDistanceBandDeleteRequest extends UsageDistanceBandSubRequestParent {
/**
 *
 * Constructor to create a  UsageDistanceBandDeleteRequest
 * @param id Unique request name
 * @param UDBDeleteIn UsageDistBandObjectKeyData for UsageDistanceBandDeleteRequest
 *
 */
@JsonCreator
  public UsageDistanceBandDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageDistanceBand")UsageDistBandObjectKeyData UDBDeleteIn) {
    super(id, "UsageDistanceBandDelete");
    if (UDBDeleteIn != null) {
      addInput("UsageDistanceBand", UsageDistBandObjectKeyHelper.toMap(UDBDeleteIn, new HashMap(), "UsageDistBandObjectKeyData").get("UsageDistBandObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsageDistBandObjectData that results from the UsageDistanceBandDeleteRequest call
 * @return UsageDistBandObjectData resulting from udt call
 *
 */

  public UsageDistBandObjectData getOutput() {
    return UsageDistBandObjectHelper.fromMap(outputMap, "UsageDistanceBand");
  }
}
