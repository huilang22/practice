/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EventQueueGetRequest.java
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
 * Class used to create a EventQueueGetRequest Udt Request
 *
 */

public class EventQueueGetRequest extends EventQueueSubRequestParent {
/**
 *
 * Constructor to create a  EventQueueGetRequest
 * @param id Unique request name
 * @param getIn EventQueueObjectKeyData for EventQueueGetRequest
 *
 */
@JsonCreator
  public EventQueueGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EventQueue")EventQueueObjectKeyData getIn) {
    super(id, "EventQueueGet");
    if (getIn != null) {
      addInput("EventQueue", EventQueueObjectKeyHelper.toMap(getIn, new HashMap(), "EventQueueObjectKeyData").get("EventQueueObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EventQueueObjectData that results from the EventQueueGetRequest call
 * @return EventQueueObjectData resulting from udt call
 *
 */

  public EventQueueObjectData getOutput() {
    return EventQueueObjectHelper.fromMap(outputMap, "EventQueue");
  }
}
