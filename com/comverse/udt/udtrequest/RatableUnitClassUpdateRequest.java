/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatableUnitClassUpdateRequest.java
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
 * Class used to create a RatableUnitClassUpdateRequest Udt Request
 *
 */

public class RatableUnitClassUpdateRequest extends RatableUnitClassSubRequestParent {
/**
 *
 * Constructor to create a  RatableUnitClassUpdateRequest
 * @param id Unique request name
 * @param RUCUpdateIn RUCObjectData for RatableUnitClassUpdateRequest
 *
 */
@JsonCreator
  public RatableUnitClassUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatableUnitClass")RUCObjectData RUCUpdateIn) {
    super(id, "RatableUnitClassUpdate");
    if (RUCUpdateIn != null) {
      addInput("RatableUnitClass", RUCObjectHelper.toMap(RUCUpdateIn, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }

/**
 *
 * Retrieves the RUCObjectData that results from the RatableUnitClassUpdateRequest call
 * @return RUCObjectData resulting from udt call
 *
 */

  public RUCObjectData getOutput() {
    return RUCObjectHelper.fromMap(outputMap, "RatableUnitClass");
  }
}
