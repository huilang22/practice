/*
 * Generated code DO NOT EDIT
 * Generated file: EventQueueRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.ar.data.*;
public final class EventQueueRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EventQueueRequest (String request, EventQueueRequestMethod method) {
    initialize(request, "EventQueue", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EventQueueRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CollectableRequest request, EventQueueRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CollectableRequest request, EventQueueRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setEventQueueForEventQueueFind(EventQueueObjectFilter data) {
    if (data != null) {
      addInput("EventQueue", EventQueueObjectHelper.toMap(data, new HashMap(), "EventQueue").get("EventQueue"));
    }
  }
  public void setEventQueueForEventQueueGet(EventQueueObjectKeyData data) {
    if (data != null) {
      addInput("EventQueue", EventQueueObjectKeyHelper.toMap(data, new HashMap(), "EventQueue").get("EventQueue"));
    }
  }
  public void setEventQueueForEventQueueReschedule(EventQueueObjectKeyData data) {
    if (data != null) {
      addInput("EventQueue", EventQueueObjectKeyHelper.toMap(data, new HashMap(), "EventQueue").get("EventQueue"));
    }
  }
  public void setRescheduleDateForEventQueueReschedule(Date data) {
    if (data != null) {
      addInput("RescheduleDate", data);
    }
  }
  public EventQueueObjectDataList getEventQueueObjectDataEventQueueFromEventQueueFind() {
    return EventQueueObjectHelper.fromMapList(outputMap, "EventQueueList");
  }
  public EventQueueObjectData getEventQueueObjectDataEventQueueFromEventQueueGet() {
    return EventQueueObjectHelper.fromMap(outputMap, "EventQueue");
  }
  public EventQueueObjectData getEventQueueObjectDataEventQueueFromEventQueueReschedule() {
    return EventQueueObjectHelper.fromMap(outputMap, "EventQueue");
  }
  /**
   @deprecated
   */
  public void setEventQueueObjectFilter(EventQueueObjectFilter data) {
    if (data != null) {
      addInput("EventQueue", EventQueueObjectHelper.toMap(data, new HashMap()).get("EventQueueObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEventQueueObjectKeyData(EventQueueObjectKeyData data) {
    if (data != null) {
      addInput("EventQueue", EventQueueObjectKeyHelper.toMap(data, new HashMap()).get("EventQueueObject"));
    }
  }
  /**
   @deprecated
   */
  public EventQueueObjectDataList getEventQueueObjectDataList() {
    return EventQueueObjectHelper.fromMapList(outputMap, "EventQueueList");
  }
  /**
   @deprecated
   */
  public EventQueueObjectData getEventQueueObjectData() {
    return EventQueueObjectHelper.fromMap(outputMap, "EventQueue");
  }
  /**
   @deprecated
   */
  public void setRescheduleDate(Date data) {
    if (data != null) {
      addInput("RescheduleDate", data);
    }
  }
}
