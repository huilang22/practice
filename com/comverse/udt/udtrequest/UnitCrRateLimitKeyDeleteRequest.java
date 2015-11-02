/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyDeleteRequest.java
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
 * Class used to create a UnitCrRateLimitKeyDeleteRequest Udt Request
 *
 */

public class UnitCrRateLimitKeyDeleteRequest extends UnitCrRateLimitKeySubRequestParent {
/**
 *
 * Constructor to create a  UnitCrRateLimitKeyDeleteRequest
 * @param id Unique request name
 * @param UnitCrRateLimitKeysDeleteIn UnitCrRateLimitKeysObjectKeyData for UnitCrRateLimitKeyDeleteRequest
 *
 */
@JsonCreator
  public UnitCrRateLimitKeyDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrRateLimitKey")UnitCrRateLimitKeysObjectKeyData UnitCrRateLimitKeysDeleteIn) {
    super(id, "UnitCrRateLimitKeyDelete");
    if (UnitCrRateLimitKeysDeleteIn != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectKeyHelper.toMap(UnitCrRateLimitKeysDeleteIn, new HashMap(), "UnitCrRateLimitKeysObjectKeyData").get("UnitCrRateLimitKeysObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnitCrRateLimitKeysObjectData that results from the UnitCrRateLimitKeyDeleteRequest call
 * @return UnitCrRateLimitKeysObjectData resulting from udt call
 *
 */

  public UnitCrRateLimitKeysObjectData getOutput() {
    return UnitCrRateLimitKeysObjectHelper.fromMap(outputMap, "UnitCrRateLimitKey");
  }
}
