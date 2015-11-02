/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleGetRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcScheduleGetRequest Udt Request
 *
 */

public class CtcScheduleGetRequest extends CtcScheduleSubRequestParent {
/**
 *
 * Constructor to create a  CtcScheduleGetRequest
 * @param id Unique request name
 * @param GetIn CtcScheduleObjectKeyData for CtcScheduleGetRequest
 *
 */
@JsonCreator
  public CtcScheduleGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcSchedule")CtcScheduleObjectKeyData GetIn) {
    super(id, "CtcScheduleGet");
    if (GetIn != null) {
      addInput("CtcSchedule", CtcScheduleObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcScheduleObjectKeyData").get("CtcScheduleObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcScheduleObjectData that results from the CtcScheduleGetRequest call
 * @return CtcScheduleObjectData resulting from udt call
 *
 */

  public CtcScheduleObjectData getOutput() {
    return CtcScheduleObjectHelper.fromMap(outputMap, "CtcSchedule");
  }
}
