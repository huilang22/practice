/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysGetRequest.java
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
 * Class used to create a NonWorkDaysGetRequest Udt Request
 *
 */

public class NonWorkDaysGetRequest extends NonWorkDaysSubRequestParent {
/**
 *
 * Constructor to create a  NonWorkDaysGetRequest
 * @param id Unique request name
 * @param NonWorkDaysGetIn NonWorkDaysObjectKeyData for NonWorkDaysGetRequest
 *
 */
@JsonCreator
  public NonWorkDaysGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NonWorkDays")NonWorkDaysObjectKeyData NonWorkDaysGetIn) {
    super(id, "NonWorkDaysGet");
    if (NonWorkDaysGetIn != null) {
      addInput("NonWorkDays", NonWorkDaysObjectKeyHelper.toMap(NonWorkDaysGetIn, new HashMap(), "NonWorkDaysObjectKeyData").get("NonWorkDaysObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NonWorkDaysObjectData that results from the NonWorkDaysGetRequest call
 * @return NonWorkDaysObjectData resulting from udt call
 *
 */

  public NonWorkDaysObjectData getOutput() {
    return NonWorkDaysObjectHelper.fromMap(outputMap, "NonWorkDays");
  }
}
