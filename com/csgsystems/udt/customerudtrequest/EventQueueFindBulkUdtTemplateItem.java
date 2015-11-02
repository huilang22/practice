/*
 * Generated code DO NOT EDIT
 * Generated file: EventQueueFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a EventQueueFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EventQueueFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EventQueueObjectFilter findIn;
/**
 *
 * Constructor to create a  EventQueueFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EventQueueFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EventQueueObjectFilter findInIn) {
    super(id, context, "EventQueueFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EventQueue", EventQueueObjectHelper.toMap(findIn, new HashMap(), "EventQueue").get("EventQueue"));
    }
  }


/**
 *
 * Sets the EventQueue
 * @param findInIn Value of the findIn
 *
 */

  public void setEventQueue(EventQueueObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = EventQueueObjectHelper.fromMapFilter(inputMap, "EventQueue");
  }

/**
 *
 * Gets the EventQueue
 * @return Value of the EventQueue
 *
 */

  public EventQueueObjectFilter getEventQueue( ) {
    return findIn;
  }

}
