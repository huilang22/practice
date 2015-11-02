/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysUpdateRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NonWorkDaysUpdateRequest Udt Request
 *
 */

public class NonWorkDaysUpdateRequest extends NonWorkDaysSubRequestParent {
/**
 *
 * Constructor to create a  NonWorkDaysUpdateRequest
 * @param id Unique request name
 * @param NonWorkDaysUpdateIn NonWorkDaysObjectData for NonWorkDaysUpdateRequest
 *
 */
@JsonCreator
  public NonWorkDaysUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NonWorkDays")NonWorkDaysObjectData NonWorkDaysUpdateIn) {
    super(id, "NonWorkDaysUpdate");
    if (NonWorkDaysUpdateIn != null) {
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(NonWorkDaysUpdateIn, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }

/**
 *
 * Retrieves the NonWorkDaysObjectData that results from the NonWorkDaysUpdateRequest call
 * @return NonWorkDaysObjectData resulting from udt call
 *
 */

  public NonWorkDaysObjectData getOutput() {
    return NonWorkDaysObjectHelper.fromMap(outputMap, "NonWorkDays");
  }
}
