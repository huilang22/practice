/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneCreateRequest.java
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
 * Class used to create a TimezoneCreateRequest Udt Request
 *
 */

public class TimezoneCreateRequest extends TimezoneSubRequestParent {
/**
 *
 * Constructor to create a  TimezoneCreateRequest
 * @param id Unique request name
 * @param TZCreateIn TimezoneObjectData for TimezoneCreateRequest
 *
 */
@JsonCreator
  public TimezoneCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Timezone")TimezoneObjectData TZCreateIn) {
    super(id, "TimezoneCreate");
    if (TZCreateIn != null) {
      addInput("Timezone", TimezoneObjectHelper.toMap(TZCreateIn, new HashMap(), "Timezone").get("Timezone"));
    }
  }

/**
 *
 * Retrieves the TimezoneObjectData that results from the TimezoneCreateRequest call
 * @return TimezoneObjectData resulting from udt call
 *
 */

  public TimezoneObjectData getOutput() {
    return TimezoneObjectHelper.fromMap(outputMap, "Timezone");
  }
}
