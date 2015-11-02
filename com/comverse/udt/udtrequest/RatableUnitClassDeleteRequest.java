/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatableUnitClassDeleteRequest.java
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
 * Class used to create a RatableUnitClassDeleteRequest Udt Request
 *
 */

public class RatableUnitClassDeleteRequest extends RatableUnitClassSubRequestParent {
/**
 *
 * Constructor to create a  RatableUnitClassDeleteRequest
 * @param id Unique request name
 * @param RUCDeleteIn RUCObjectKeyData for RatableUnitClassDeleteRequest
 *
 */
@JsonCreator
  public RatableUnitClassDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatableUnitClass")RUCObjectKeyData RUCDeleteIn) {
    super(id, "RatableUnitClassDelete");
    if (RUCDeleteIn != null) {
      addInput("RatableUnitClass", RUCObjectKeyHelper.toMap(RUCDeleteIn, new HashMap(), "RUCObjectKeyData").get("RUCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RUCObjectData that results from the RatableUnitClassDeleteRequest call
 * @return RUCObjectData resulting from udt call
 *
 */

  public RUCObjectData getOutput() {
    return RUCObjectHelper.fromMap(outputMap, "RatableUnitClass");
  }
}
