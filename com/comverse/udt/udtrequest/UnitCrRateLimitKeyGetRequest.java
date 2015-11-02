/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyGetRequest.java
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
 * Class used to create a UnitCrRateLimitKeyGetRequest Udt Request
 *
 */

public class UnitCrRateLimitKeyGetRequest extends UnitCrRateLimitKeySubRequestParent {
/**
 *
 * Constructor to create a  UnitCrRateLimitKeyGetRequest
 * @param id Unique request name
 * @param UnitCrRateLimitKeysGetIn UnitCrRateLimitKeysObjectKeyData for UnitCrRateLimitKeyGetRequest
 *
 */
@JsonCreator
  public UnitCrRateLimitKeyGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRateLimitKey")UnitCrRateLimitKeysObjectKeyData UnitCrRateLimitKeysGetIn) {
    super(id, "UnitCrRateLimitKeyGet");
    if (UnitCrRateLimitKeysGetIn != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectKeyHelper.toMap(UnitCrRateLimitKeysGetIn, new HashMap(), "UnitCrRateLimitKeysObjectKeyData").get("UnitCrRateLimitKeysObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnitCrRateLimitKeysObjectData that results from the UnitCrRateLimitKeyGetRequest call
 * @return UnitCrRateLimitKeysObjectData resulting from udt call
 *
 */

  public UnitCrRateLimitKeysObjectData getOutput() {
    return UnitCrRateLimitKeysObjectHelper.fromMap(outputMap, "UnitCrRateLimitKey");
  }
}
