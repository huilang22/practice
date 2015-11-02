/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysCreateRequest.java
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
 * Class used to create a NonWorkDaysCreateRequest Udt Request
 *
 */

public class NonWorkDaysCreateRequest extends NonWorkDaysSubRequestParent {
/**
 *
 * Constructor to create a  NonWorkDaysCreateRequest
 * @param id Unique request name
 * @param NonWorkDaysCreateIn NonWorkDaysObjectData for NonWorkDaysCreateRequest
 *
 */
@JsonCreator
  public NonWorkDaysCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NonWorkDays")NonWorkDaysObjectData NonWorkDaysCreateIn) {
    super(id, "NonWorkDaysCreate");
    if (NonWorkDaysCreateIn != null) {
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(NonWorkDaysCreateIn, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }

/**
 *
 * Retrieves the NonWorkDaysObjectData that results from the NonWorkDaysCreateRequest call
 * @return NonWorkDaysObjectData resulting from udt call
 *
 */

  public NonWorkDaysObjectData getOutput() {
    return NonWorkDaysObjectHelper.fromMap(outputMap, "NonWorkDays");
  }
}
