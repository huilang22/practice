/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EventQueueRescheduleBulkUdtTemplateItem.java
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
 * Class used to create a EventQueueRescheduleBulkUdtTemplateItem Bulk Template
 *
 */

public class EventQueueRescheduleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EventQueueObjectKeyData rescheduleIn;
  protected Date rescheduleDate;
/**
 *
 * Constructor to create a  EventQueueRescheduleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EventQueueRescheduleBulkUdtTemplateItem(String id, BSDMSessionContext context, EventQueueObjectKeyData rescheduleInIn, Date rescheduleDateIn) {
    super(id, context, "EventQueueReschedule");
    rescheduleIn = rescheduleInIn;
    rescheduleDate = rescheduleDateIn;
  }

  public void translateToMap() {
    if (rescheduleIn != null) {
      rescheduleIn.resetFlags(true, true);
      addInput("EventQueue", EventQueueObjectKeyHelper.toMap(rescheduleIn, new HashMap(), "EventQueueObjectKeyData").get("EventQueueObjectKeyData"));
    }
    if (rescheduleDate != null) {
      addInput("RescheduleDate", rescheduleDate);
    }
  }


/**
 *
 * Sets the EventQueue
 * @param rescheduleInIn Value of the rescheduleIn
 *
 */

  public void setEventQueue(EventQueueObjectKeyData rescheduleInIn) {
    rescheduleIn = rescheduleInIn;
  }

/**
 *
 * Sets the RescheduleDate
 * @param rescheduleDateIn Value of the rescheduleDate
 *
 */

  public void setRescheduleDate(Date rescheduleDateIn) {
    rescheduleDate = rescheduleDateIn;
  }

  public void translateFromMap() {
    rescheduleIn = EventQueueObjectKeyHelper.fromMap(inputMap, "EventQueue");
    rescheduleDate = (Date)inputMap.get("RescheduleDate");
  }

/**
 *
 * Gets the EventQueue
 * @return Value of the EventQueue
 *
 */

  public EventQueueObjectKeyData getEventQueue( ) {
    return rescheduleIn;
  }

/**
 *
 * Gets the RescheduleDate
 * @return Value of the RescheduleDate
 *
 */

  public Date getRescheduleDate( ) {
    return rescheduleDate;
  }

}
