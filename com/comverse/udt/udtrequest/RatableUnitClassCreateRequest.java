/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatableUnitClassCreateRequest.java
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
 * Class used to create a RatableUnitClassCreateRequest Udt Request
 *
 */

public class RatableUnitClassCreateRequest extends RatableUnitClassSubRequestParent {
/**
 *
 * Constructor to create a  RatableUnitClassCreateRequest
 * @param id Unique request name
 * @param RUCCreateIn RUCObjectData for RatableUnitClassCreateRequest
 *
 */
@JsonCreator
  public RatableUnitClassCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatableUnitClass")RUCObjectData RUCCreateIn) {
    super(id, "RatableUnitClassCreate");
    if (RUCCreateIn != null) {
      addInput("RatableUnitClass", RUCObjectHelper.toMap(RUCCreateIn, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }

/**
 *
 * Retrieves the RUCObjectData that results from the RatableUnitClassCreateRequest call
 * @return RUCObjectData resulting from udt call
 *
 */

  public RUCObjectData getOutput() {
    return RUCObjectHelper.fromMap(outputMap, "RatableUnitClass");
  }
}
