/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EventQueueFindRequest.java
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
 * Class used to create a EventQueueFindRequest Udt Request
 *
 */

public class EventQueueFindRequest extends EventQueueRequest {
/**
 *
 * Constructor to create a  EventQueueFindRequest
 * @param id Unique request name
 * @param findIn EventQueueObjectFilter for EventQueueFindRequest
 *
 */
@JsonCreator
  public EventQueueFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EventQueue")EventQueueObjectFilter findIn) {
    super(id, "EventQueueFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EventQueue", EventQueueObjectHelper.toMap(findIn, new HashMap(), "EventQueue").get("EventQueue"));
    }
  }

/**
 *
 * Retrieves the EventQueueObjectDataList that results from the EventQueueFindRequest call
 * @return EventQueueObjectDataList resulting from udt call
 *
 */

  public EventQueueObjectDataList getOutput() {
    return EventQueueObjectHelper.fromMapList(outputMap, "EventQueueList");
  }
}
