/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatableUnitClassFindRequest.java
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
 * Class used to create a RatableUnitClassFindRequest Udt Request
 *
 */

public class RatableUnitClassFindRequest extends RatableUnitClassRequest {
/**
 *
 * Constructor to create a  RatableUnitClassFindRequest
 * @param id Unique request name
 * @param RUCFindIn RUCObjectFilter for RatableUnitClassFindRequest
 *
 */
@JsonCreator
  public RatableUnitClassFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RatableUnitClass")RUCObjectFilter RUCFindIn) {
    super(id, "RatableUnitClassFind");
    if (RUCFindIn != null) {
      Integer index =  RUCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RatableUnitClass", RUCObjectHelper.toMap(RUCFindIn, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }

/**
 *
 * Retrieves the RUCObjectDataList that results from the RatableUnitClassFindRequest call
 * @return RUCObjectDataList resulting from udt call
 *
 */

  public RUCObjectDataList getOutput() {
    return RUCObjectHelper.fromMapList(outputMap, "RatableUnitClassList");
  }
}
