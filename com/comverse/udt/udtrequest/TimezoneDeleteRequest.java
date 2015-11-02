/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneDeleteRequest.java
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
 * Class used to create a TimezoneDeleteRequest Udt Request
 *
 */

public class TimezoneDeleteRequest extends TimezoneSubRequestParent {
/**
 *
 * Constructor to create a  TimezoneDeleteRequest
 * @param id Unique request name
 * @param TZDeleteIn TimezoneObjectKeyData for TimezoneDeleteRequest
 *
 */
@JsonCreator
  public TimezoneDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Timezone")TimezoneObjectKeyData TZDeleteIn) {
    super(id, "TimezoneDelete");
    if (TZDeleteIn != null) {
      addInput("Timezone", TimezoneObjectKeyHelper.toMap(TZDeleteIn, new HashMap(), "TimezoneObjectKeyData").get("TimezoneObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the TimezoneObjectData that results from the TimezoneDeleteRequest call
 * @return TimezoneObjectData resulting from udt call
 *
 */

  public TimezoneObjectData getOutput() {
    return TimezoneObjectHelper.fromMap(outputMap, "Timezone");
  }
}
