/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EventQueueRescheduleNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a EventQueueRescheduleNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EventQueueRescheduleNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EventQueueObjectData noOpIn;

/**
 *
 * Constructor to create a   EventQueueRescheduleNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EventQueueRescheduleNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EventQueueObjectData noOpInIn) {
    super(id, context, "EventQueueReschedule");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EventQueue", EventQueueObjectHelper.toMap(noOpIn, new HashMap(), "EventQueue").get("EventQueue"));
    }
  }
/**
 *
 * Sets the  EventQueue
 * @param noOpInIn EventQueueObjectData to set
 *
 */
  public void setEventQueue(EventQueueObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EventQueue passed into the constructor
 * @return Simulated response
 *
 */
  public EventQueueObjectData getEventQueue() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EventQueueObjectHelper.fromMap(inputMap, "EventQueue");
  }
}
