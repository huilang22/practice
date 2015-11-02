/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyUpdateRequest.java
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
 * Class used to create a UnitCrRateLimitKeyUpdateRequest Udt Request
 *
 */

public class UnitCrRateLimitKeyUpdateRequest extends UnitCrRateLimitKeySubRequestParent {
/**
 *
 * Constructor to create a  UnitCrRateLimitKeyUpdateRequest
 * @param id Unique request name
 * @param UnitCrRateLimitKeyUpdateIn UnitCrRateLimitKeysObjectData for UnitCrRateLimitKeyUpdateRequest
 *
 */
@JsonCreator
  public UnitCrRateLimitKeyUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRateLimitKey")UnitCrRateLimitKeysObjectData UnitCrRateLimitKeyUpdateIn) {
    super(id, "UnitCrRateLimitKeyUpdate");
    if (UnitCrRateLimitKeyUpdateIn != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(UnitCrRateLimitKeyUpdateIn, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }

/**
 *
 * Retrieves the UnitCrRateLimitKeysObjectData that results from the UnitCrRateLimitKeyUpdateRequest call
 * @return UnitCrRateLimitKeysObjectData resulting from udt call
 *
 */

  public UnitCrRateLimitKeysObjectData getOutput() {
    return UnitCrRateLimitKeysObjectHelper.fromMap(outputMap, "UnitCrRateLimitKey");
  }
}
