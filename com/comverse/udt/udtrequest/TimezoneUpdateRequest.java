/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneUpdateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a TimezoneUpdateRequest Udt Request
 *
 */

public class TimezoneUpdateRequest extends TimezoneSubRequestParent {
/**
 *
 * Constructor to create a  TimezoneUpdateRequest
 * @param id Unique request name
 * @param TZUpdateIn TimezoneObjectData for TimezoneUpdateRequest
 *
 */
@JsonCreator
  public TimezoneUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Timezone")TimezoneObjectData TZUpdateIn) {
    super(id, "TimezoneUpdate");
    if (TZUpdateIn != null) {
      addInput("Timezone", TimezoneObjectHelper.toMap(TZUpdateIn, new HashMap(), "Timezone").get("Timezone"));
    }
  }

/**
 *
 * Retrieves the TimezoneObjectData that results from the TimezoneUpdateRequest call
 * @return TimezoneObjectData resulting from udt call
 *
 */

  public TimezoneObjectData getOutput() {
    return TimezoneObjectHelper.fromMap(outputMap, "Timezone");
  }
}
