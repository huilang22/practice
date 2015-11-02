/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageDistanceBandGetRequest.java
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
 * Class used to create a UsageDistanceBandGetRequest Udt Request
 *
 */

public class UsageDistanceBandGetRequest extends UsageDistanceBandSubRequestParent {
/**
 *
 * Constructor to create a  UsageDistanceBandGetRequest
 * @param id Unique request name
 * @param UDBGetIn UsageDistBandObjectKeyData for UsageDistanceBandGetRequest
 *
 */
@JsonCreator
  public UsageDistanceBandGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageDistanceBand")UsageDistBandObjectKeyData UDBGetIn) {
    super(id, "UsageDistanceBandGet");
    if (UDBGetIn != null) {
      addInput("UsageDistanceBand", UsageDistBandObjectKeyHelper.toMap(UDBGetIn, new HashMap(), "UsageDistBandObjectKeyData").get("UsageDistBandObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsageDistBandObjectData that results from the UsageDistanceBandGetRequest call
 * @return UsageDistBandObjectData resulting from udt call
 *
 */

  public UsageDistBandObjectData getOutput() {
    return UsageDistBandObjectHelper.fromMap(outputMap, "UsageDistanceBand");
  }
}
