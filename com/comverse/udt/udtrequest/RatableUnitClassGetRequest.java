/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatableUnitClassGetRequest.java
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
 * Class used to create a RatableUnitClassGetRequest Udt Request
 *
 */

public class RatableUnitClassGetRequest extends RatableUnitClassSubRequestParent {
/**
 *
 * Constructor to create a  RatableUnitClassGetRequest
 * @param id Unique request name
 * @param RUCGetIn RUCObjectKeyData for RatableUnitClassGetRequest
 *
 */
@JsonCreator
  public RatableUnitClassGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatableUnitClass")RUCObjectKeyData RUCGetIn) {
    super(id, "RatableUnitClassGet");
    if (RUCGetIn != null) {
      addInput("RatableUnitClass", RUCObjectKeyHelper.toMap(RUCGetIn, new HashMap(), "RUCObjectKeyData").get("RUCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RUCObjectData that results from the RatableUnitClassGetRequest call
 * @return RUCObjectData resulting from udt call
 *
 */

  public RUCObjectData getOutput() {
    return RUCObjectHelper.fromMap(outputMap, "RatableUnitClass");
  }
}
