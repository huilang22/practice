/*
 * Generated code DO NOT EDIT
 * Generated file: EventQueueRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EventQueueRequestMethod implements UdtMethod {
  private String method = null;
  private EventQueueRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EventQueueFind method */
  public static final EventQueueRequestMethod EVENT_QUEUE_FIND = new EventQueueRequestMethod("EventQueueFind");
  /** Variable representing the EventQueueGet method */
  public static final EventQueueRequestMethod EVENT_QUEUE_GET = new EventQueueRequestMethod("EventQueueGet");
  /** Variable representing the EventQueueReschedule method */
  public static final EventQueueRequestMethod EVENT_QUEUE_RESCHEDULE = new EventQueueRequestMethod("EventQueueReschedule");
}
