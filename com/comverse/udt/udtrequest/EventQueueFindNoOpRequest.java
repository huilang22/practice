/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EventQueueFindNoOpRequest.java
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
 * NoOp class used to simulate a EventQueueFindNoOpRequest Udt Request/Response
 *
 */
public class EventQueueFindNoOpRequest extends EventQueueRequest {
/**
 *
 * Constructor to create a   EventQueueFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EventQueueFindNoOpRequest(String id, EventQueueObjectDataList noOpIn) {
    super(id, "EventQueueFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EventQueueObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EventQueue", noOpIn);
      }
      addInput("EventQueue", mapList);
    }
  }
/**
 *
 * Retrieves the EventQueueObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EventQueueObjectDataList getOutput() {
    return EventQueueObjectHelper.fromMapList(outputMap, "EventQueueList");
  }
}
