/*
 * Generated code DO NOT EDIT
 * Generated file: EventQueueFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EventQueueFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EventQueueFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EventQueueObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EventQueueFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EventQueueFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EventQueueObjectDataList noOpInIn) {
    super(id, context, "EventQueueFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = EventQueueObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EventQueue", noOpIn);
      }
      addInput("EventQueue", mapList);
    }
  }
/**
 *
 * Sets the  EventQueue
 * @param noOpInIn EventQueueObjectDataList to set
 *
 */
  public void setEventQueue(EventQueueObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EventQueue passed into the constructor
 * @return Simulated response
 *
 */
  public EventQueueObjectDataList getEventQueue() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EventQueueObjectHelper.fromMapList(inputMap, "EventQueueList");
  }
}
