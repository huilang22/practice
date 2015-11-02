/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyCreateRequest.java
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
 * Class used to create a UnitCrRateLimitKeyCreateRequest Udt Request
 *
 */

public class UnitCrRateLimitKeyCreateRequest extends UnitCrRateLimitKeySubRequestParent {
/**
 *
 * Constructor to create a  UnitCrRateLimitKeyCreateRequest
 * @param id Unique request name
 * @param UnitCrRateLimitKeyCreateIn UnitCrRateLimitKeysObjectData for UnitCrRateLimitKeyCreateRequest
 *
 */
@JsonCreator
  public UnitCrRateLimitKeyCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRateLimitKey")UnitCrRateLimitKeysObjectData UnitCrRateLimitKeyCreateIn) {
    super(id, "UnitCrRateLimitKeyCreate");
    if (UnitCrRateLimitKeyCreateIn != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(UnitCrRateLimitKeyCreateIn, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }

/**
 *
 * Retrieves the UnitCrRateLimitKeysObjectData that results from the UnitCrRateLimitKeyCreateRequest call
 * @return UnitCrRateLimitKeysObjectData resulting from udt call
 *
 */

  public UnitCrRateLimitKeysObjectData getOutput() {
    return UnitCrRateLimitKeysObjectHelper.fromMap(outputMap, "UnitCrRateLimitKey");
  }
}
