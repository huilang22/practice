/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneGetRequest.java
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
 * Class used to create a TimezoneGetRequest Udt Request
 *
 */

public class TimezoneGetRequest extends TimezoneSubRequestParent {
/**
 *
 * Constructor to create a  TimezoneGetRequest
 * @param id Unique request name
 * @param TZGetIn TimezoneObjectKeyData for TimezoneGetRequest
 *
 */
@JsonCreator
  public TimezoneGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Timezone")TimezoneObjectKeyData TZGetIn) {
    super(id, "TimezoneGet");
    if (TZGetIn != null) {
      addInput("Timezone", TimezoneObjectKeyHelper.toMap(TZGetIn, new HashMap(), "TimezoneObjectKeyData").get("TimezoneObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TimezoneObjectData that results from the TimezoneGetRequest call
 * @return TimezoneObjectData resulting from udt call
 *
 */

  public TimezoneObjectData getOutput() {
    return TimezoneObjectHelper.fromMap(outputMap, "Timezone");
  }
}
