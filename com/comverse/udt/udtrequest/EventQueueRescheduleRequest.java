/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EventQueueRescheduleRequest.java
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

import com.csgsystems.ar.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a EventQueueRescheduleRequest Udt Request
 *
 */

public class EventQueueRescheduleRequest extends EventQueueSubRequestParent {
/**
 *
 * Constructor to create a  EventQueueRescheduleRequest
 * @param id Unique request name
 * @param rescheduleIn EventQueueObjectKeyData for EventQueueRescheduleRequest
 * @param rescheduleDate Date for EventQueueRescheduleRequest
 *
 */
@JsonCreator
  public EventQueueRescheduleRequest(@JsonProperty("RequestId") String id, @JsonProperty("EventQueue")EventQueueObjectKeyData rescheduleIn, @JsonProperty("RescheduleDate")Date rescheduleDate) {
    super(id, "EventQueueReschedule");
    if (rescheduleIn != null) {
      addInput("EventQueue", EventQueueObjectKeyHelper.toMap(rescheduleIn, new HashMap(), "EventQueueObjectKeyData").get("EventQueueObjectKeyData"));
    }
    if (rescheduleDate != null) {
      addInput("RescheduleDate", rescheduleDate);
    }
  }

/**
 *
 * Retrieves the EventQueueObjectData that results from the EventQueueRescheduleRequest call
 * @return EventQueueObjectData resulting from udt call
 *
 */

  public EventQueueObjectData getOutput() {
    return EventQueueObjectHelper.fromMap(outputMap, "EventQueue");
  }
}
