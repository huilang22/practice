/*
 * Generated code DO NOT EDIT
 * Generated file: EventQueueRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class EventQueueRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private EventQueueRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the EventQueue_Collectable_Ref relationship */
  public static final EventQueueRequestRelationship EVENT_QUEUE__COLLECTABLE__REF = new EventQueueRequestRelationship("EventQueue_Collectable_Ref");
}
