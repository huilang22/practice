/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleCreateRequest.java
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
 * Class used to create a CtcScheduleCreateRequest Udt Request
 *
 */

public class CtcScheduleCreateRequest extends CtcScheduleSubRequestParent {
/**
 *
 * Constructor to create a  CtcScheduleCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcScheduleObjectData for CtcScheduleCreateRequest
 *
 */
@JsonCreator
  public CtcScheduleCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcSchedule")CtcScheduleObjectData CreateIn) {
    super(id, "CtcScheduleCreate");
    if (CreateIn != null) {
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(CreateIn, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }

/**
 *
 * Retrieves the CtcScheduleObjectData that results from the CtcScheduleCreateRequest call
 * @return CtcScheduleObjectData resulting from udt call
 *
 */

  public CtcScheduleObjectData getOutput() {
    return CtcScheduleObjectHelper.fromMap(outputMap, "CtcSchedule");
  }
}
