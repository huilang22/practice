/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EventQueueRescheduleNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a EventQueueRescheduleNoOpRequest Udt Request/Response
 *
 */
public class EventQueueRescheduleNoOpRequest extends EventQueueSubRequestParent {
/**
 *
 * Constructor to create a   EventQueueRescheduleNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EventQueueRescheduleNoOpRequest(String id, EventQueueObjectData noOpIn) {
    super(id, "EventQueueRescheduleNoOpRequest");
    if (noOpIn != null) {
      addInput("EventQueue", EventQueueObjectHelper.toMap(noOpIn, new HashMap(), "EventQueue").get("EventQueue"));
    }
  }
/**
 *
 * Retrieves the EventQueueObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EventQueueObjectData getOutput() {
    return EventQueueObjectHelper.fromMap(outputMap, "EventQueue");
  }
}
