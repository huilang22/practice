/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EventQueueGetBulkUdtTemplateItem.java
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
 * Class used to create a EventQueueGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EventQueueGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EventQueueObjectKeyData getIn;
/**
 *
 * Constructor to create a  EventQueueGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EventQueueGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EventQueueObjectKeyData getInIn) {
    super(id, context, "EventQueueGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("EventQueue", EventQueueObjectKeyHelper.toMap(getIn, new HashMap(), "EventQueueObjectKeyData").get("EventQueueObjectKeyData"));
    }
  }


/**
 *
 * Sets the EventQueue
 * @param getInIn Value of the getIn
 *
 */

  public void setEventQueue(EventQueueObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = EventQueueObjectKeyHelper.fromMap(inputMap, "EventQueue");
  }

/**
 *
 * Gets the EventQueue
 * @return Value of the EventQueue
 *
 */

  public EventQueueObjectKeyData getEventQueue( ) {
    return getIn;
  }

}
