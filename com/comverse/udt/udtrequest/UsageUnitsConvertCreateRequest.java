/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageUnitsConvertCreateRequest.java
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
 * Class used to create a UsageUnitsConvertCreateRequest Udt Request
 *
 */

public class UsageUnitsConvertCreateRequest extends UsageUnitsConvertSubRequestParent {
/**
 *
 * Constructor to create a  UsageUnitsConvertCreateRequest
 * @param id Unique request name
 * @param UsageUnitsConvertCreateIn UsageUnitsConvertObjectData for UsageUnitsConvertCreateRequest
 *
 */
@JsonCreator
  public UsageUnitsConvertCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageUnitsConvert")UsageUnitsConvertObjectData UsageUnitsConvertCreateIn) {
    super(id, "UsageUnitsConvertCreate");
    if (UsageUnitsConvertCreateIn != null) {
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(UsageUnitsConvertCreateIn, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }

/**
 *
 * Retrieves the UsageUnitsConvertObjectData that results from the UsageUnitsConvertCreateRequest call
 * @return UsageUnitsConvertObjectData resulting from udt call
 *
 */

  public UsageUnitsConvertObjectData getOutput() {
    return UsageUnitsConvertObjectHelper.fromMap(outputMap, "UsageUnitsConvert");
  }
}
