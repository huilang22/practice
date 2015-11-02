/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleDeleteRequest.java
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
 * Class used to create a CtcScheduleDeleteRequest Udt Request
 *
 */

public class CtcScheduleDeleteRequest extends CtcScheduleSubRequestParent {
/**
 *
 * Constructor to create a  CtcScheduleDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcScheduleObjectKeyData for CtcScheduleDeleteRequest
 *
 */
@JsonCreator
  public CtcScheduleDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcSchedule")CtcScheduleObjectKeyData DeleteIn) {
    super(id, "CtcScheduleDelete");
    if (DeleteIn != null) {
      addInput("CtcSchedule", CtcScheduleObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcScheduleObjectKeyData").get("CtcScheduleObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcScheduleObjectData that results from the CtcScheduleDeleteRequest call
 * @return CtcScheduleObjectData resulting from udt call
 *
 */

  public CtcScheduleObjectData getOutput() {
    return CtcScheduleObjectHelper.fromMap(outputMap, "CtcSchedule");
  }
}
