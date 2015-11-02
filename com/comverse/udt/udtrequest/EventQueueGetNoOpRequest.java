/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EventQueueGetNoOpRequest.java
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
 * NoOp class used to simulate a EventQueueGetNoOpRequest Udt Request/Response
 *
 */
public class EventQueueGetNoOpRequest extends EventQueueSubRequestParent {
/**
 *
 * Constructor to create a   EventQueueGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EventQueueGetNoOpRequest(String id, EventQueueObjectData noOpIn) {
    super(id, "EventQueueGetNoOpRequest");
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
